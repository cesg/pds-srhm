/**
 * MedicosSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public interface MedicosSOAPService extends javax.xml.rpc.Service {
    public java.lang.String getMedicosSOAPAddress();

    public cl.ufro.srhm.soap.MedicosSOAP getMedicosSOAP() throws javax.xml.rpc.ServiceException;

    public cl.ufro.srhm.soap.MedicosSOAP getMedicosSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
