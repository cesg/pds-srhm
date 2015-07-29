
/**
 * MedicosSOAPCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package cl.ufro.srhm.soap;

    /**
     *  MedicosSOAPCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MedicosSOAPCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MedicosSOAPCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MedicosSOAPCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerMedico method
            * override this method for handling normal response from obtenerMedico operation
            */
           public void receiveResultobtenerMedico(
                    cl.ufro.srhm.soap.MedicosSOAPStub.ObtenerMedicoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedico operation
           */
            public void receiveErrorobtenerMedico(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerMedicosDeEspecialidad method
            * override this method for handling normal response from obtenerMedicosDeEspecialidad operation
            */
           public void receiveResultobtenerMedicosDeEspecialidad(
                    cl.ufro.srhm.soap.MedicosSOAPStub.ObtenerMedicosDeEspecialidadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedicosDeEspecialidad operation
           */
            public void receiveErrorobtenerMedicosDeEspecialidad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerOcupacionMedico method
            * override this method for handling normal response from obtenerOcupacionMedico operation
            */
           public void receiveResultobtenerOcupacionMedico(
                    cl.ufro.srhm.soap.MedicosSOAPStub.ObtenerOcupacionMedicoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerOcupacionMedico operation
           */
            public void receiveErrorobtenerOcupacionMedico(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerMedicoMasSolicitado method
            * override this method for handling normal response from obtenerMedicoMasSolicitado operation
            */
           public void receiveResultobtenerMedicoMasSolicitado(
                    cl.ufro.srhm.soap.MedicosSOAPStub.ObtenerMedicoMasSolicitadoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedicoMasSolicitado operation
           */
            public void receiveErrorobtenerMedicoMasSolicitado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buscarSuDisponibilidad method
            * override this method for handling normal response from buscarSuDisponibilidad operation
            */
           public void receiveResultbuscarSuDisponibilidad(
                    cl.ufro.srhm.soap.MedicosSOAPStub.BuscarSuDisponibilidadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarSuDisponibilidad operation
           */
            public void receiveErrorbuscarSuDisponibilidad(java.lang.Exception e) {
            }
                


    }
    