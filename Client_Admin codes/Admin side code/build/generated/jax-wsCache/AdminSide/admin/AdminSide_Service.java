
package admin;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AdminSide", targetNamespace = "http://Admin/", wsdlLocation = "http://datamanipulation-rohatgisanat.rhcloud.com/MIS/AdminSide?wsdl")
public class AdminSide_Service
    extends Service
{

    private final static URL ADMINSIDE_WSDL_LOCATION;
    private final static WebServiceException ADMINSIDE_EXCEPTION;
    private final static QName ADMINSIDE_QNAME = new QName("http://Admin/", "AdminSide");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://datamanipulation-rohatgisanat.rhcloud.com/MIS/AdminSide?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINSIDE_WSDL_LOCATION = url;
        ADMINSIDE_EXCEPTION = e;
    }

    public AdminSide_Service() {
        super(__getWsdlLocation(), ADMINSIDE_QNAME);
    }

    public AdminSide_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINSIDE_QNAME, features);
    }

    public AdminSide_Service(URL wsdlLocation) {
        super(wsdlLocation, ADMINSIDE_QNAME);
    }

    public AdminSide_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINSIDE_QNAME, features);
    }

    public AdminSide_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminSide_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdminSide
     */
    @WebEndpoint(name = "AdminSidePort")
    public AdminSide getAdminSidePort() {
        return super.getPort(new QName("http://Admin/", "AdminSidePort"), AdminSide.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminSide
     */
    @WebEndpoint(name = "AdminSidePort")
    public AdminSide getAdminSidePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Admin/", "AdminSidePort"), AdminSide.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINSIDE_EXCEPTION!= null) {
            throw ADMINSIDE_EXCEPTION;
        }
        return ADMINSIDE_WSDL_LOCATION;
    }

}
