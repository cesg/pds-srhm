
/**
 * HoraApsSOAPCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package cl.ufro.srhm.soap;

    /**
     *  HoraApsSOAPCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class HoraApsSOAPCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public HoraApsSOAPCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public HoraApsSOAPCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for buscarHoraAPS method
            * override this method for handling normal response from buscarHoraAPS operation
            */
           public void receiveResultbuscarHoraAPS(
                    cl.ufro.srhm.soap.HoraApsSOAPStub.BuscarHoraAPSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarHoraAPS operation
           */
            public void receiveErrorbuscarHoraAPS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reservarHoraMedicaControl method
            * override this method for handling normal response from reservarHoraMedicaControl operation
            */
           public void receiveResultreservarHoraMedicaControl(
                    cl.ufro.srhm.soap.HoraApsSOAPStub.ReservarHoraMedicaControlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reservarHoraMedicaControl operation
           */
            public void receiveErrorreservarHoraMedicaControl(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buscarHorasMedicasPaciente method
            * override this method for handling normal response from buscarHorasMedicasPaciente operation
            */
           public void receiveResultbuscarHorasMedicasPaciente(
                    cl.ufro.srhm.soap.HoraApsSOAPStub.BuscarHorasMedicasPacienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarHorasMedicasPaciente operation
           */
            public void receiveErrorbuscarHorasMedicasPaciente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reservarHoraAps method
            * override this method for handling normal response from reservarHoraAps operation
            */
           public void receiveResultreservarHoraAps(
                    cl.ufro.srhm.soap.HoraApsSOAPStub.ReservarHoraApsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reservarHoraAps operation
           */
            public void receiveErrorreservarHoraAps(java.lang.Exception e) {
            }
                


    }
    