
package com.forkexec.hub.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidCreditCardFault", targetNamespace = "http://ws.hub.forkexec.com/")
public class InvalidCreditCardFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidCreditCardFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidCreditCardFault_Exception(String message, InvalidCreditCardFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidCreditCardFault_Exception(String message, InvalidCreditCardFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.forkexec.hub.ws.InvalidCreditCardFault
     */
    public InvalidCreditCardFault getFaultInfo() {
        return faultInfo;
    }

}
