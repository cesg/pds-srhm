package cl.ufro.srhm.soap;

public class HoraApsSOAPProxy implements cl.ufro.srhm.soap.HoraApsSOAP {
  private String _endpoint = null;
  private cl.ufro.srhm.soap.HoraApsSOAP horaApsSOAP = null;
  
  public HoraApsSOAPProxy() {
    _initHoraApsSOAPProxy();
  }
  
  public HoraApsSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initHoraApsSOAPProxy();
  }
  
  private void _initHoraApsSOAPProxy() {
    try {
      horaApsSOAP = (new cl.ufro.srhm.soap.HoraApsSOAPServiceLocator()).getHoraApsSOAP();
      if (horaApsSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)horaApsSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)horaApsSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (horaApsSOAP != null)
      ((javax.xml.rpc.Stub)horaApsSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.ufro.srhm.soap.HoraApsSOAP getHoraApsSOAP() {
    if (horaApsSOAP == null)
      _initHoraApsSOAPProxy();
    return horaApsSOAP;
  }
  
  public java.lang.String buscarHoraAPS(int medicoId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (horaApsSOAP == null)
      _initHoraApsSOAPProxy();
    return horaApsSOAP.buscarHoraAPS(medicoId, fecha1, fecha2);
  }
  
  public java.lang.String reservarHoraAps(int horaMedicaId, int pacienteId) throws java.rmi.RemoteException{
    if (horaApsSOAP == null)
      _initHoraApsSOAPProxy();
    return horaApsSOAP.reservarHoraAps(horaMedicaId, pacienteId);
  }
  
  public java.lang.String reservarHoraMedicaControl(int[] horasMedicasIds, int pacienteId) throws java.rmi.RemoteException{
    if (horaApsSOAP == null)
      _initHoraApsSOAPProxy();
    return horaApsSOAP.reservarHoraMedicaControl(horasMedicasIds, pacienteId);
  }
  
  
}