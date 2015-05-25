/**
 * PacienteSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public interface PacienteSOAPService extends javax.xml.rpc.Service {
    public java.lang.String getPacienteSOAPAddress();

    public cl.ufro.srhm.soap.PacienteSOAP getPacienteSOAP() throws javax.xml.rpc.ServiceException;

    public cl.ufro.srhm.soap.PacienteSOAP getPacienteSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
