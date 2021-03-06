
package com.forkexec.hub.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HubPortType", targetNamespace = "http://ws.hub.forkexec.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HubPortType {


    /**
     * 
     * @param userId
     * @return
     *     returns com.forkexec.hub.ws.FoodOrder
     * @throws InvalidUserIdFault_Exception
     * @throws NotEnoughPointsFault_Exception
     * @throws EmptyCartFault_Exception
     * @throws InvalidFoodQuantityFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "orderCart", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.OrderCart")
    @ResponseWrapper(localName = "orderCartResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.OrderCartResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/orderCartRequest", output = "http://ws.hub.forkexec.com/HubPortType/orderCartResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/orderCart/Fault/InvalidUserIdFault"),
        @FaultAction(className = EmptyCartFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/orderCart/Fault/EmptyCartFault"),
        @FaultAction(className = NotEnoughPointsFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/orderCart/Fault/NotEnoughPointsFault"),
        @FaultAction(className = InvalidFoodQuantityFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/orderCart/Fault/InvalidFoodQuantityFault")
    })
    public FoodOrder orderCart(
        @WebParam(name = "userId", targetNamespace = "")
        String userId)
        throws EmptyCartFault_Exception, InvalidFoodQuantityFault_Exception, InvalidUserIdFault_Exception, NotEnoughPointsFault_Exception
    ;

    /**
     * 
     * @param foodId
     * @return
     *     returns com.forkexec.hub.ws.Food
     * @throws InvalidFoodIdFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFood", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.GetFood")
    @ResponseWrapper(localName = "getFoodResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.GetFoodResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/getFoodRequest", output = "http://ws.hub.forkexec.com/HubPortType/getFoodResponse", fault = {
        @FaultAction(className = InvalidFoodIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/getFood/Fault/InvalidFoodIdFault")
    })
    public Food getFood(
        @WebParam(name = "foodId", targetNamespace = "")
        FoodId foodId)
        throws InvalidFoodIdFault_Exception
    ;

    /**
     * 
     * @param input
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ctrlPing", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlPing")
    @ResponseWrapper(localName = "ctrlPingResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlPingResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/ctrlPingRequest", output = "http://ws.hub.forkexec.com/HubPortType/ctrlPingResponse")
    public String ctrlPing(
        @WebParam(name = "input", targetNamespace = "")
        String input);

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<com.forkexec.hub.ws.FoodOrderItem>
     * @throws InvalidUserIdFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cartContents", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CartContents")
    @ResponseWrapper(localName = "cartContentsResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CartContentsResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/cartContentsRequest", output = "http://ws.hub.forkexec.com/HubPortType/cartContentsResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/cartContents/Fault/InvalidUserIdFault")
    })
    public List<FoodOrderItem> cartContents(
        @WebParam(name = "userId", targetNamespace = "")
        String userId)
        throws InvalidUserIdFault_Exception
    ;

    /**
     * 
     * @param description
     * @return
     *     returns java.util.List<com.forkexec.hub.ws.Food>
     * @throws InvalidTextFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchHungry", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.SearchHungry")
    @ResponseWrapper(localName = "searchHungryResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.SearchHungryResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/searchHungryRequest", output = "http://ws.hub.forkexec.com/HubPortType/searchHungryResponse", fault = {
        @FaultAction(className = InvalidTextFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/searchHungry/Fault/InvalidTextFault")
    })
    public List<Food> searchHungry(
        @WebParam(name = "description", targetNamespace = "")
        String description)
        throws InvalidTextFault_Exception
    ;

    /**
     * 
     * @param description
     * @return
     *     returns java.util.List<com.forkexec.hub.ws.Food>
     * @throws InvalidTextFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchDeal", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.SearchDeal")
    @ResponseWrapper(localName = "searchDealResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.SearchDealResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/searchDealRequest", output = "http://ws.hub.forkexec.com/HubPortType/searchDealResponse", fault = {
        @FaultAction(className = InvalidTextFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/searchDeal/Fault/InvalidTextFault")
    })
    public List<Food> searchDeal(
        @WebParam(name = "description", targetNamespace = "")
        String description)
        throws InvalidTextFault_Exception
    ;

    /**
     * 
     * @param foodId
     * @param userId
     * @param foodQuantity
     * @throws InvalidUserIdFault_Exception
     * @throws InvalidFoodIdFault_Exception
     * @throws InvalidFoodQuantityFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addFoodToCart", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.AddFoodToCart")
    @ResponseWrapper(localName = "addFoodToCartResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.AddFoodToCartResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/addFoodToCartRequest", output = "http://ws.hub.forkexec.com/HubPortType/addFoodToCartResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/addFoodToCart/Fault/InvalidUserIdFault"),
        @FaultAction(className = InvalidFoodIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/addFoodToCart/Fault/InvalidFoodIdFault"),
        @FaultAction(className = InvalidFoodQuantityFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/addFoodToCart/Fault/InvalidFoodQuantityFault")
    })
    public void addFoodToCart(
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "foodId", targetNamespace = "")
        FoodId foodId,
        @WebParam(name = "foodQuantity", targetNamespace = "")
        int foodQuantity)
        throws InvalidFoodIdFault_Exception, InvalidFoodQuantityFault_Exception, InvalidUserIdFault_Exception
    ;

    /**
     * 
     * @param userId
     * @throws InvalidUserIdFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "activateAccount", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.ActivateAccount")
    @ResponseWrapper(localName = "activateAccountResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.ActivateAccountResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/activateAccountRequest", output = "http://ws.hub.forkexec.com/HubPortType/activateAccountResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/activateAccount/Fault/InvalidUserIdFault")
    })
    public void activateAccount(
        @WebParam(name = "userId", targetNamespace = "")
        String userId)
        throws InvalidUserIdFault_Exception
    ;

    /**
     * 
     * @param moneyToAdd
     * @param creditCardNumber
     * @param userId
     * @throws InvalidUserIdFault_Exception
     * @throws InvalidMoneyFault_Exception
     * @throws InvalidCreditCardFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "loadAccount", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.LoadAccount")
    @ResponseWrapper(localName = "loadAccountResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.LoadAccountResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/loadAccountRequest", output = "http://ws.hub.forkexec.com/HubPortType/loadAccountResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/loadAccount/Fault/InvalidUserIdFault"),
        @FaultAction(className = InvalidMoneyFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/loadAccount/Fault/InvalidMoneyFault"),
        @FaultAction(className = InvalidCreditCardFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/loadAccount/Fault/InvalidCreditCardFault")
    })
    public void loadAccount(
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "moneyToAdd", targetNamespace = "")
        int moneyToAdd,
        @WebParam(name = "creditCardNumber", targetNamespace = "")
        String creditCardNumber)
        throws InvalidCreditCardFault_Exception, InvalidMoneyFault_Exception, InvalidUserIdFault_Exception
    ;

    /**
     * 
     * @param userId
     * @throws InvalidUserIdFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "clearCart", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.ClearCart")
    @ResponseWrapper(localName = "clearCartResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.ClearCartResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/clearCartRequest", output = "http://ws.hub.forkexec.com/HubPortType/clearCartResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/clearCart/Fault/InvalidUserIdFault")
    })
    public void clearCart(
        @WebParam(name = "userId", targetNamespace = "")
        String userId)
        throws InvalidUserIdFault_Exception
    ;

    /**
     * 
     * @param initialFoods
     * @throws InvalidInitFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "ctrlInitFood", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlInitFood")
    @ResponseWrapper(localName = "ctrlInitFoodResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlInitFoodResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/ctrlInitFoodRequest", output = "http://ws.hub.forkexec.com/HubPortType/ctrlInitFoodResponse", fault = {
        @FaultAction(className = InvalidInitFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/ctrlInitFood/Fault/InvalidInitFault")
    })
    public void ctrlInitFood(
        @WebParam(name = "initialFoods", targetNamespace = "")
        List<FoodInit> initialFoods)
        throws InvalidInitFault_Exception
    ;

    /**
     * 
     * @param userId
     * @return
     *     returns int
     * @throws InvalidUserIdFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "accountBalance", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.AccountBalance")
    @ResponseWrapper(localName = "accountBalanceResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.AccountBalanceResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/accountBalanceRequest", output = "http://ws.hub.forkexec.com/HubPortType/accountBalanceResponse", fault = {
        @FaultAction(className = InvalidUserIdFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/accountBalance/Fault/InvalidUserIdFault")
    })
    public int accountBalance(
        @WebParam(name = "userId", targetNamespace = "")
        String userId)
        throws InvalidUserIdFault_Exception
    ;

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "ctrlClear", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlClear")
    @ResponseWrapper(localName = "ctrlClearResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlClearResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/ctrlClearRequest", output = "http://ws.hub.forkexec.com/HubPortType/ctrlClearResponse")
    public void ctrlClear();

    /**
     * 
     * @param startPoints
     * @throws InvalidInitFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "ctrlInitUserPoints", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlInitUserPoints")
    @ResponseWrapper(localName = "ctrlInitUserPointsResponse", targetNamespace = "http://ws.hub.forkexec.com/", className = "com.forkexec.hub.ws.CtrlInitUserPointsResponse")
    @Action(input = "http://ws.hub.forkexec.com/HubPortType/ctrlInitUserPointsRequest", output = "http://ws.hub.forkexec.com/HubPortType/ctrlInitUserPointsResponse", fault = {
        @FaultAction(className = InvalidInitFault_Exception.class, value = "http://ws.hub.forkexec.com/HubPortType/ctrlInitUserPoints/Fault/InvalidInitFault")
    })
    public void ctrlInitUserPoints(
        @WebParam(name = "startPoints", targetNamespace = "")
        int startPoints)
        throws InvalidInitFault_Exception
    ;

}
