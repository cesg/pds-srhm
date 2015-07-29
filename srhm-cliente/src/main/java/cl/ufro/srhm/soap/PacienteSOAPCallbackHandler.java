
/**
 * PacienteSOAPCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package cl.ufro.srhm.soap;

    /**
     *  PacienteSOAPCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PacienteSOAPCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PacienteSOAPCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PacienteSOAPCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerPacientesMasReservas method
            * override this method for handling normal response from obtenerPacientesMasReservas operation
            */
           public void receiveResultobtenerPacientesMasReservas(
                    cl.ufro.srhm.soap.PacienteSOAPStub.ObtenerPacientesMasReservasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPacientesMasReservas operation
           */
            public void receiveErrorobtenerPacientesMasReservas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for bucarPaciente method
            * override this method for handling normal response from bucarPaciente operation
            */
           public void receiveResultbucarPaciente(
                    cl.ufro.srhm.soap.PacienteSOAPStub.BucarPacienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bucarPaciente operation
           */
            public void receiveErrorbucarPaciente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPacientes method
            * override this method for handling normal response from obtenerPacientes operation
            */
           public void receiveResultobtenerPacientes(
                    cl.ufro.srhm.soap.PacienteSOAPStub.ObtenerPacientesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPacientes operation
           */
            public void receiveErrorobtenerPacientes(java.lang.Exception e) {
            }
                


    }
    