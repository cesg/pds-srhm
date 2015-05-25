package cl.ufro.srhm.soap;

public class BoxSOAPProxy implements cl.ufro.srhm.soap.BoxSOAP {
  private String _endpoint = null;
  private cl.ufro.srhm.soap.BoxSOAP boxSOAP = null;
  
  public BoxSOAPProxy() {
    _initBoxSOAPProxy();
  }
  
  public BoxSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initBoxSOAPProxy();
  }
  
  private void _initBoxSOAPProxy() {
    try {
      boxSOAP = (new cl.ufro.srhm.soap.BoxSOAPServiceLocator()).getBoxSOAP();
      if (boxSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)boxSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)boxSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (boxSOAP != null)
      ((javax.xml.rpc.Stub)boxSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.ufro.srhm.soap.BoxSOAP getBoxSOAP() {
    if (boxSOAP == null)
      _initBoxSOAPProxy();
    return boxSOAP;
  }
  
  public java.lang.String obtenerBoxes() throws java.rmi.RemoteException{
    if (boxSOAP == null)
      _initBoxSOAPProxy();
    return boxSOAP.obtenerBoxes();
  }
  
  public int obtenerOcupacionBox(int boxId, java.util.Calendar fecha1, java.util.Calendar fecha2) throws java.rmi.RemoteException{
    if (boxSOAP == null)
      _initBoxSOAPProxy();
    return boxSOAP.obtenerOcupacionBox(boxId, fecha1, fecha2);
  }
  
  
}