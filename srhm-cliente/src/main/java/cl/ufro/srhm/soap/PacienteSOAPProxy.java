package cl.ufro.srhm.soap;

public class PacienteSOAPProxy implements cl.ufro.srhm.soap.PacienteSOAP {
  private String _endpoint = null;
  private cl.ufro.srhm.soap.PacienteSOAP pacienteSOAP = null;
  
  public PacienteSOAPProxy() {
    _initPacienteSOAPProxy();
  }
  
  public PacienteSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initPacienteSOAPProxy();
  }
  
  private void _initPacienteSOAPProxy() {
    try {
      pacienteSOAP = (new cl.ufro.srhm.soap.PacienteSOAPServiceLocator()).getPacienteSOAP();
      if (pacienteSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pacienteSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pacienteSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pacienteSOAP != null)
      ((javax.xml.rpc.Stub)pacienteSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.ufro.srhm.soap.PacienteSOAP getPacienteSOAP() {
    if (pacienteSOAP == null)
      _initPacienteSOAPProxy();
    return pacienteSOAP;
  }
  
  public java.lang.String obtenerPacientesMasReservas(java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (pacienteSOAP == null)
      _initPacienteSOAPProxy();
    return pacienteSOAP.obtenerPacientesMasReservas(fecha1, fecha2);
  }
  
  public java.lang.String obtenerPacientes() throws java.rmi.RemoteException{
    if (pacienteSOAP == null)
      _initPacienteSOAPProxy();
    return pacienteSOAP.obtenerPacientes();
  }
  
  
}