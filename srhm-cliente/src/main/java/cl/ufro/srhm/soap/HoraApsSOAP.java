/**
 * HoraApsSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.ufro.srhm.soap;

public interface HoraApsSOAP extends java.rmi.Remote {
    public java.lang.String buscarHoraAPS(int medicoId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException;
    public java.lang.String reservarHoraAps(int horaMedicaId, int pacienteId) throws java.rmi.RemoteException;
    public java.lang.String reservarHoraMedicaControl(int[] horasMedicasIds, int pacienteId) throws java.rmi.RemoteException;
}
