package ae.gov.scad.employeesdo.app.common.serviceinterface;

import ae.gov.scad.employeesdo.query.common.EmpVOSDO;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.common.service.types.ProcessData;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 08 23:43:55 GST 2020
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace = "/ae/gov/scad/employeesdo/app/common/", name = "EmployeeSDOService",
                    wsdlLocation = "ae/gov/scad/employeesdo/app/common/serviceinterface/EmployeeSDOService.wsdl")
@SDODatabinding(schemaLocation = "ae/gov/scad/employeesdo/app/common/serviceinterface/EmployeeSDOService.xsd")
public interface EmployeeSDOService {
    public static final String NAME = "{/ae/gov/scad/employeesdo/app/common/}EmployeeSDOService";

    /**
     * Exported method print from ServiceApp.
     */
    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/print", operationName = "print")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "print")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "printResponse")
    void print() throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/getEmpVO", operationName = "getEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "getEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "getEmpVOResponse")
    @WebResult(name = "result")
    EmpVOSDO getEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "empno") Integer empno) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/createEmpVO", operationName = "createEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "createEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "createEmpVOResponse")
    @WebResult(name = "result")
    EmpVOSDO createEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "empVO") EmpVOSDO empVO) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/updateEmpVO", operationName = "updateEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "updateEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "updateEmpVOResponse")
    @WebResult(name = "result")
    EmpVOSDO updateEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "empVO") EmpVOSDO empVO) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/deleteEmpVO", operationName = "deleteEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "deleteEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "deleteEmpVOResponse")
    void deleteEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "empVO") EmpVOSDO empVO) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/mergeEmpVO", operationName = "mergeEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "mergeEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "mergeEmpVOResponse")
    @WebResult(name = "result")
    EmpVOSDO mergeEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "empVO") EmpVOSDO empVO) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/findEmpVO", operationName = "findEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "findEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "findEmpVOResponse")
    @WebResult(name = "result")
    List<EmpVOSDO> findEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "findCriteria") FindCriteria findCriteria,
                             @WebParam(mode = WebParam.Mode.IN, name = "findControl")
                             FindControl findControl) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/processEmpVO", operationName = "processEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "processEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "processEmpVOResponse")
    @WebResult(name = "result")
    List<EmpVOSDO> processEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "changeOperation") String changeOperation,
                                @WebParam(mode = WebParam.Mode.IN, name = "empVO") List<EmpVOSDO> empVO,
                                @WebParam(mode = WebParam.Mode.IN, name = "processControl")
                                ProcessControl processControl) throws ServiceException;

    @WebMethod(action = "/ae/gov/scad/employeesdo/app/common/processCSEmpVO", operationName = "processCSEmpVO")
    @RequestWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/", localName = "processCSEmpVO")
    @ResponseWrapper(targetNamespace = "/ae/gov/scad/employeesdo/app/common/types/",
                     localName = "processCSEmpVOResponse")
    @WebResult(name = "result")
    ProcessData processCSEmpVO(@WebParam(mode = WebParam.Mode.IN, name = "processData") ProcessData processData,
                               @WebParam(mode = WebParam.Mode.IN, name = "processControl")
                               ProcessControl processControl) throws ServiceException;
}
