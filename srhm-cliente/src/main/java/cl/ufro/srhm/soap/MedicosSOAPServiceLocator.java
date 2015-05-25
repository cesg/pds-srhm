/**
 * MedicosSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public class MedicosSOAPServiceLocator extends org.apache.axis.client.Service implements cl.ufro.srhm.soap.MedicosSOAPService {

    public MedicosSOAPServiceLocator() {
    }


    public MedicosSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MedicosSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MedicosSOAP
    private java.lang.String MedicosSOAP_address = "http://localhost:8080/srhm-soap/services/MedicosSOAP";

    public java.lang.String getMedicosSOAPAddress() {
        return MedicosSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MedicosSOAPWSDDServiceName = "MedicosSOAP";

    public java.lang.String getMedicosSOAPWSDDServiceName() {
        return MedicosSOAPWSDDServiceName;
    }

    public void setMedicosSOAPWSDDServiceName(java.lang.String name) {
        MedicosSOAPWSDDServiceName = name;
    }

    public cl.ufro.srhm.soap.MedicosSOAP getMedicosSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MedicosSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMedicosSOAP(endpoint);
    }

    public cl.ufro.srhm.soap.MedicosSOAP getMedicosSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.ufro.srhm.soap.MedicosSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.MedicosSOAPSoapBindingStub(portAddress, this);
            _stub.setPortName(getMedicosSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMedicosSOAPEndpointAddress(java.lang.String address) {
        MedicosSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.ufro.srhm.soap.MedicosSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.ufro.srhm.soap.MedicosSOAPSoapBindingStub _stub = new cl.ufro.srhm.soap.MedicosSOAPSoapBindingStub(new java.net.URL(MedicosSOAP_address), this);
                _stub.setPortName(getMedicosSOAPWSDDServiceName());
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
        if ("MedicosSOAP".equals(inputPortName)) {
            return getMedicosSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "MedicosSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.srhm.ufro.cl", "MedicosSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MedicosSOAP".equals(portName)) {
            setMedicosSOAPEndpointAddress(address);
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
