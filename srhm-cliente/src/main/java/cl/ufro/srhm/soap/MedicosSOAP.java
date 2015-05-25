/**
 * MedicosSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public interface MedicosSOAP extends java.rmi.Remote {
    public java.lang.String obtenerMedico(int id) throws java.rmi.RemoteException;
    public int obtenerOcupacionMedico(int medicoId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerMedicoMasSolicitado(java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException;
    public java.lang.String buscarSuDisponibilidad(int medicoId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerMedicosDeEspecialidad(int especialidadId) throws java.rmi.RemoteException;
}
