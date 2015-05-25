/**
 * HoraApsSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public class HoraApsSOAPServiceLocator extends org.apache.axis.client.Service implements cl.ufro.srhm.soap.HoraApsSOAPService {

    public HoraApsSOAPServiceLocator() {
    }


    public HoraApsSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HoraApsSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HoraApsSOAP
    private java.lang.String HoraApsSOAP_address = "http://localhost:8080/srhm-soap/services/HoraApsSOAP";

    public java.lang.String getHoraApsSOAPAddress() {
        return HoraApsSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HoraApsSOAPWSDDServiceName = "HoraApsSOAP";

    public java.lang.String getHoraApsSOAPWSDDServiceName() {
        return HoraApsSOAPWSDDServiceName;
    }

    public void setHoraApsSOAPWSDDServiceName(java.lang.String name) {
        HoraApsSOAPWSDDServiceName = name;
    }

    public cl.ufro.srhm.soap.HoraApsSOAP getHoraApsSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HoraApsSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHoraApsSOAP(endpoint);
    }

    public cl.ufro.srhm.soap.HoraApsSOAP getHoraApsSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.ufro.srhm.soap.HoraApsSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.HoraApsSOAPSoapBindingStub(portAddress, this);
            _stub.setPortName(getHoraApsSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHoraApsSOAPEndpointAddress(java.lang.String address) {
        HoraApsSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.ufro.srhm.soap.HoraApsSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.ufro.srhm.soap.HoraApsSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.HoraApsSOAPSoapBindingStub(new java.net.URL(HoraApsSOAP_address), this);
                _stub.setPortName(getHoraApsSOAPWSDDServiceName());
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
        if ("HoraApsSOAP".equals(inputPortName)) {
            return getHoraApsSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "HoraApsSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "HoraApsSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HoraApsSOAP".equals(portName)) {
            setHoraApsSOAPEndpointAddress(address);
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
