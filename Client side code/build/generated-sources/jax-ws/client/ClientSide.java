
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClientSide", targetNamespace = "http://Client/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClientSide {


    /**
     * 
     * @param name
     * @return
     *     returns int
     */
    @WebMethod(operationName = "NoOfPeople")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "NoOfPeople", targetNamespace = "http://Client/", className = "client.NoOfPeople")
    @ResponseWrapper(localName = "NoOfPeopleResponse", targetNamespace = "http://Client/", className = "client.NoOfPeopleResponse")
    @Action(input = "http://Client/ClientSide/NoOfPeopleRequest", output = "http://Client/ClientSide/NoOfPeopleResponse")
    public int noOfPeople(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "count", targetNamespace = "http://Client/", className = "client.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://Client/", className = "client.CountResponse")
    @Action(input = "http://Client/ClientSide/countRequest", output = "http://Client/ClientSide/countResponse")
    public int count();

}
