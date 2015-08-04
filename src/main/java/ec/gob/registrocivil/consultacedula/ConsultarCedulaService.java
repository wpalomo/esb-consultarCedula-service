package ec.gob.registrocivil.consultacedula;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2015-07-29T10:58:51.172-05:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://www.registrocivil.gob.ec/ConsultaCedula", name = "ConsultarCedulaService")
@XmlSeeAlso({ObjectFactory.class})
public interface ConsultarCedulaService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "BusquedaPorCedula", targetNamespace = "http://www.registrocivil.gob.ec/ConsultaCedula", className = "ec.gob.registrocivil.consultacedula.BusquedaPorCedula")
    @WebMethod(operationName = "BusquedaPorCedula")
    @ResponseWrapper(localName = "BusquedaPorCedulaResponse", targetNamespace = "http://www.registrocivil.gob.ec/ConsultaCedula", className = "ec.gob.registrocivil.consultacedula.BusquedaPorCedulaResponse")
    public ec.gob.registrocivil.consultacedula.Cedula busquedaPorCedula(
        @WebParam(name = "Cedula", targetNamespace = "")
        java.lang.String cedula,
        @WebParam(name = "Usuario", targetNamespace = "")
        java.lang.String usuario,
        @WebParam(name = "Contrasenia", targetNamespace = "")
        java.lang.String contrasenia
    );
}
