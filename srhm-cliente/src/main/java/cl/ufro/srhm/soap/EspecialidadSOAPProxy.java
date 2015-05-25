package cl.ufro.srhm.soap;

public class EspecialidadSOAPProxy implements cl.ufro.srhm.soap.EspecialidadSOAP {
  private String _endpoint = null;
  private cl.ufro.srhm.soap.EspecialidadSOAP especialidadSOAP = null;
  
  public EspecialidadSOAPProxy() {
    _initEspecialidadSOAPProxy();
  }
  
  public EspecialidadSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initEspecialidadSOAPProxy();
  }
  
  private void _initEspecialidadSOAPProxy() {
    try {
      especialidadSOAP = (new cl.ufro.srhm.soap.EspecialidadSOAPServiceLocator()).getEspecialidadSOAP();
      if (especialidadSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)especialidadSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)especialidadSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (especialidadSOAP != null)
      ((javax.xml.rpc.Stub)especialidadSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.ufro.srhm.soap.EspecialidadSOAP getEspecialidadSOAP() {
    if (especialidadSOAP == null)
      _initEspecialidadSOAPProxy();
    return especialidadSOAP;
  }
  
  public java.lang.String obtenerEspecialidades() throws java.rmi.RemoteException{
    if (especialidadSOAP == null)
      _initEspecialidadSOAPProxy();
    return especialidadSOAP.obtenerEspecialidades();
  }
  
  
}