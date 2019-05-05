
package com.forkexec.rst.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RestaurantService", targetNamespace = "http://ws.rst.forkexec.com/", wsdlLocation = "file:/C:/Users/Utilizador/Desktop/projSD/A51-ForkExec/rst-ws-cli/../rst-contract/RestaurantService.wsdl")
public class RestaurantService
    extends Service
{

    private final static URL RESTAURANTSERVICE_WSDL_LOCATION;
    private final static WebServiceException RESTAURANTSERVICE_EXCEPTION;
    private final static QName RESTAURANTSERVICE_QNAME = new QName("http://ws.rst.forkexec.com/", "RestaurantService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Utilizador/Desktop/projSD/A51-ForkExec/rst-ws-cli/../rst-contract/RestaurantService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESTAURANTSERVICE_WSDL_LOCATION = url;
        RESTAURANTSERVICE_EXCEPTION = e;
    }

    public RestaurantService() {
        super(__getWsdlLocation(), RESTAURANTSERVICE_QNAME);
    }

    public RestaurantService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESTAURANTSERVICE_QNAME, features);
    }

    public RestaurantService(URL wsdlLocation) {
        super(wsdlLocation, RESTAURANTSERVICE_QNAME);
    }

    public RestaurantService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESTAURANTSERVICE_QNAME, features);
    }

    public RestaurantService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RestaurantPortType
     */
    @WebEndpoint(name = "RestaurantPort")
    public RestaurantPortType getRestaurantPort() {
        return super.getPort(new QName("http://ws.rst.forkexec.com/", "RestaurantPort"), RestaurantPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RestaurantPortType
     */
    @WebEndpoint(name = "RestaurantPort")
    public RestaurantPortType getRestaurantPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.rst.forkexec.com/", "RestaurantPort"), RestaurantPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESTAURANTSERVICE_EXCEPTION!= null) {
            throw RESTAURANTSERVICE_EXCEPTION;
        }
        return RESTAURANTSERVICE_WSDL_LOCATION;
    }

}
