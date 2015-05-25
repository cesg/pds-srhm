/**
 * EspecialidadSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public class EspecialidadSOAPServiceLocator extends org.apache.axis.client.Service implements cl.ufro.srhm.soap.EspecialidadSOAPService {

    public EspecialidadSOAPServiceLocator() {
    }


    public EspecialidadSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EspecialidadSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EspecialidadSOAP
    private java.lang.String EspecialidadSOAP_address = "http://localhost:8080/srhm-soap/services/EspecialidadSOAP";

    public java.lang.String getEspecialidadSOAPAddress() {
        return EspecialidadSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EspecialidadSOAPWSDDServiceName = "EspecialidadSOAP";

    public java.lang.String getEspecialidadSOAPWSDDServiceName() {
        return EspecialidadSOAPWSDDServiceName;
    }

    public void setEspecialidadSOAPWSDDServiceName(java.lang.String name) {
        EspecialidadSOAPWSDDServiceName = name;
    }

    public cl.ufro.srhm.soap.EspecialidadSOAP getEspecialidadSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EspecialidadSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEspecialidadSOAP(endpoint);
    }

    public cl.ufro.srhm.soap.EspecialidadSOAP getEspecialidadSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.ufro.srhm.soap.EspecialidadSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.EspecialidadSOAPSoapBindingStub(portAddress, this);
            _stub.setPortName(getEspecialidadSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEspecialidadSOAPEndpointAddress(java.lang.String address) {
        EspecialidadSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.ufro.srhm.soap.EspecialidadSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.ufro.srhm.soap.EspecialidadSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.EspecialidadSOAPSoapBindingStub(new java.net.URL(EspecialidadSOAP_address), this);
                _stub.setPortName(getEspecialidadSOAPWSDDServiceName());
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
        if ("EspecialidadSOAP".equals(inputPortName)) {
            return getEspecialidadSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "EspecialidadSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "EspecialidadSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EspecialidadSOAP".equals(portName)) {
            setEspecialidadSOAPEndpointAddress(address);
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
