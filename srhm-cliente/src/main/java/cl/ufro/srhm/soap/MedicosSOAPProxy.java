package cl.ufro.srhm.soap;

public class MedicosSOAPProxy implements cl.ufro.srhm.soap.MedicosSOAP {
  private String _endpoint = null;
  private cl.ufro.srhm.soap.MedicosSOAP medicosSOAP = null;
  
  public MedicosSOAPProxy() {
    _initMedicosSOAPProxy();
  }
  
  public MedicosSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initMedicosSOAPProxy();
  }
  
  private void _initMedicosSOAPProxy() {
    try {
      medicosSOAP = (new cl.ufro.srhm.soap.MedicosSOAPServiceLocator()).getMedicosSOAP();
      if (medicosSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)medicosSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)medicosSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (medicosSOAP != null)
      ((javax.xml.rpc.Stub)medicosSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.ufro.srhm.soap.MedicosSOAP getMedicosSOAP() {
    if (medicosSOAP == null)
      _initMedicosSOAPProxy();
    return medicosSOAP;
  }
  
  public java.lang.String obtenerMedico(int id) throws java.rmi.RemoteException{
    if (medicosSOAP == null)
      _initMedicosSOAPProxy();
    return medicosSOAP.obtenerMedico(id);
  }
  
  public int obtenerOcupacionMedico(int medicoId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (medicosSOAP == null)
      _initMedicosSOAPProxy();
    return medicosSOAP.obtenerOcupacionMedico(medicoId, fecha1, fecha2);
  }
  
  public java.lang.String obtenerMedicoMasSolicitado(java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (medicosSOAP == null)
      _initMedicosSOAPProxy();
    return medicosSOAP.obtenerMedicoMasSolicitado(fecha1, fecha2);
  }
  
  public java.lang.String buscarSuDisponibilidad(int medicoId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (medicosSOAP == null)
      _initMedicosSOAPProxy();
    return medicosSOAP.buscarSuDisponibilidad(medicoId, fecha1, fecha2);
  }
  
  public java.lang.String obtenerMedicosDeEspecialidad(int especialidadId) throws java.rmi.RemoteException{
    if (medicosSOAP == null)
      _initMedicosSOAPProxy();
    return medicosSOAP.obtenerMedicosDeEspecialidad(especialidadId);
  }
  
  
}