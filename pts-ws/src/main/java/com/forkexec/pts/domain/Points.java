package com.forkexec.pts.domain;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

import com.forkexec.pts.domain.exception.EmailAlreadyExistsFaultException;
import com.forkexec.pts.domain.exception.InvalidEmailFaultException;
import com.forkexec.pts.domain.exception.InvalidPointsFaultException;
import com.forkexec.pts.domain.exception.NotEnoughBalanceFaultException;

/**
 * Points
 * <p>
 * A points server.
 */
public class Points {

	/**
	 * Constant representing the default initial balance for every new client
	 */
	private static final int DEFAULT_INITIAL_BALANCE = 100;

	/**
	 * Global with the current value for the initial balance of every new client
	 */
	private final AtomicInteger initialBalance = new AtomicInteger(DEFAULT_INITIAL_BALANCE);

	/**
	 * Accounts. Associates the user's email with a points balance. The collection
	 * uses a hash table supporting full concurrency of retrievals and updates. Each
	 * item is an AtomicInteger, a lock-free thread-safe single variable. This means
	 * that multiple threads can update this variable concurrently with correct
	 * synchronization.
	 */
	private Map<String, PointsData> accounts = new ConcurrentHashMap<>();

	// Singleton -------------------------------------------------------------

	/**
	 * SingletonHolder is loaded on the first execution of Singleton.getInstance()
	 * or the first access to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		private static final Points INSTANCE = new Points();
	}

	/**
	 * Retrieve single instance of class. Only method where 'synchronized' is used.
	 */
	public static synchronized Points getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * Private constructor prevents instantiation from other classes.
	 */
	private Points() {
		// initialization with default values
		reset();
	}

	/**
	 * Reset accounts. Synchronized is not required because we are using concurrent
	 * map and atomic integer.
	 */
	public void reset() {
		// clear current hash map
		accounts.clear();
		// set initial balance to default
		initialBalance.set(DEFAULT_INITIAL_BALANCE);
	}

	/**
	 * Set initial Reset accounts. Synchronized is not required because we are using
	 * atomic integer.
	 */
	public void setInitialBalance(int newInitialBalance) {
		initialBalance.set(newInitialBalance);
	}

	/**
	 * Access points for account. Throws exception if email is invalid or account
	 * does not exist.
	 */
	public PointsData getAccountPoints(final String accountId) {
		//checkValidEmail(accountId);
		PointsData pointsData = accounts.get(accountId);

		// create new account
		if (pointsData == null) {
			initAccount(accountId, 0);
			pointsData = accounts.get(accountId);
		}

		return pointsData;
	}

	public void setAccountPoints(final String accountId, final int pointsToAdd, final int tag) {
		//checkValidEmail(accountId);
		PointsData pointsData = accounts.get(accountId);

		// create new account
		if (pointsData == null) {
			initAccount(accountId, pointsToAdd, 0);
			pointsData = accounts.get(accountId);
		}

		pointsData.setPoints(pointsToAdd);
		pointsData.setTag(tag);
	}

	/** Email address validation. */
	private void checkValidEmail(final String emailAddress) throws InvalidEmailFaultException {
		final String message;
		if (emailAddress == null) {
			message = "Null email is not valid";
		} else if (!Pattern.matches("(\\w\\.?)*\\w+@\\w+(\\.?\\w)*", emailAddress)) {
			message = String.format("Email: %s is not valid", emailAddress);
		} else {
			return;
		}
		throw new InvalidEmailFaultException(message);
	}

	/** Initialize account. */
	public void initAccount(final String accountId, int tag) {
		//checkValidEmail(accountId);
		/*if (accounts.containsKey(accountId)) {
			final String message = String.format("Account with email: %s already exists", accountId);
			throw new EmailAlreadyExistsFaultException(message);
		}*/
		PointsData pointsData = accounts.get(accountId);
		if (pointsData == null) {
			pointsData = new PointsData(new AtomicInteger(initialBalance.get()), tag);
			accounts.put(accountId, pointsData);
		}
	}

	public void initAccount(final String accountId, final int balance, final int tag) {
		//checkValidEmail(accountId);
		/*if (accounts.containsKey(accountId)) {
			final String message = String.format("Account with email: %s already exists", accountId);
			throw new EmailAlreadyExistsFaultException(message);
		}*/
		PointsData pointsData = accounts.get(accountId);
		if (pointsData == null) {
			pointsData = new PointsData(new AtomicInteger(balance), tag);
			accounts.put(accountId, pointsData);
		}
	}

	/*
	public void addPoints(final String accountId, final int pointsToAdd, int tag)
			throws InvalidPointsFaultException, InvalidEmailFaultException {
		checkValidEmail(accountId);
		if (pointsToAdd <= 0) {
			throw new InvalidPointsFaultException("Value cannot be negative or zero!");
		}
		final AtomicInteger points = getPoints(accountId);
		points.addAndGet(pointsToAdd);
	}

	public void removePoints(final String accountId, final int pointsToSpend)
			throws InvalidEmailFaultException, NotEnoughBalanceFaultException, InvalidPointsFaultException {
		checkValidEmail(accountId);
		final AtomicInteger points = getPoints(accountId);
		if (pointsToSpend <= 0) {
			throw new InvalidPointsFaultException("Value cannot be negative or zero!");
		}
		
		// use atomic compare and set to make sure that 
		// between the read and the update the value has not changed.
		// if it changed, try again
		int balance, updatedBalance;
		do {
			balance = points.get();
			updatedBalance = balance - pointsToSpend;
			if (updatedBalance < 0)
				throw new NotEnoughBalanceFaultException();
		} while(!points.compareAndSet(balance, updatedBalance));
				// compareAndSet atomically sets the value to the given updated value 
				// if the current value == the expected value.
				// returns true if successful, so we negate to exit loop
	}*/

}
