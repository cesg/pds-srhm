/**
 * BoxSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public class BoxSOAPServiceLocator extends org.apache.axis.client.Service implements cl.ufro.srhm.soap.BoxSOAPService {

    public BoxSOAPServiceLocator() {
    }


    public BoxSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BoxSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BoxSOAP
    private java.lang.String BoxSOAP_address = "http://localhost:8080/srhm-soap/services/BoxSOAP";

    public java.lang.String getBoxSOAPAddress() {
        return BoxSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BoxSOAPWSDDServiceName = "BoxSOAP";

    public java.lang.String getBoxSOAPWSDDServiceName() {
        return BoxSOAPWSDDServiceName;
    }

    public void setBoxSOAPWSDDServiceName(java.lang.String name) {
        BoxSOAPWSDDServiceName = name;
    }

    public cl.ufro.srhm.soap.BoxSOAP getBoxSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BoxSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBoxSOAP(endpoint);
    }

    public cl.ufro.srhm.soap.BoxSOAP getBoxSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.ufro.srhm.soap.BoxSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.BoxSOAPSoapBindingStub(portAddress, this);
            _stub.setPortName(getBoxSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBoxSOAPEndpointAddress(java.lang.String address) {
        BoxSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.ufro.srhm.soap.BoxSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.ufro.srhm.soap.BoxSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.BoxSOAPSoapBindingStub(new java.net.URL(BoxSOAP_address), this);
                _stub.setPortName(getBoxSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BoxSOAP".equals(inputPortName)) {
            return getBoxSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "BoxSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "BoxSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BoxSOAP".equals(portName)) {
            setBoxSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
