package ae.gov.scad.employeesdo.app.server.serviceinterface;

import ae.gov.scad.employeesdo.app.ServiceAppImpl;
import ae.gov.scad.employeesdo.app.common.serviceinterface.EmployeeSDOService;
import ae.gov.scad.employeesdo.query.common.EmpVOSDO;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.common.service.types.ProcessData;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 08 23:43:55 GST 2020
// ---------------------------------------------------------------------
@Stateless(name = "ae.gov.scad.employeesdo.app.common.EmployeeSDOServiceBean", mappedName = "EmployeeSDOServiceBean")
@Remote(EmployeeSDOService.class)
@PortableWebService(targetNamespace = "/ae/gov/scad/employeesdo/app/common/", serviceName = "EmployeeSDOService",
                    portName = "EmployeeSDOServiceSoapHttpPort",
                    endpointInterface = "ae.gov.scad.employeesdo.app.common.serviceinterface.EmployeeSDOService")
@Interceptors({ ServiceContextInterceptor.class })
public class EmployeeSDOServiceImpl extends ServiceImpl implements EmployeeSDOService {
    private static boolean _isInited = false;
    private static final Map _map = new HashMap();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeSDOServiceImpl() {
        init();
        setApplicationModuleDefName("ae.gov.scad.employeesdo.app.ServiceApp");
        setConfigurationName("EmployeeSDOService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (EmployeeSDOServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("ae/gov/scad/employeesdo/app/common/serviceinterface/",
                                                "EmployeeSDOService.xsd");
                _map.put("print", ServiceAppImpl.class.getMethod("print", new Class[] { }));
                _isInited = true;
            } catch (Throwable t) {
                ADFLogger.createADFLogger(Diagnostic.SERVINT_RT_LOGGER).severe(t);
            }
        }
    }

    /**
     * print: generated method. Do not modify.
     */
    public void print() throws ServiceException {
        invokeCustom((Method) _map.get("print"), new Object[] { }, new String[] { }, false);
    }

    /**
     * getEmpVO: generated method. Do not modify.
     */
    public EmpVOSDO getEmpVO(Integer empno) throws ServiceException {
        return (EmpVOSDO) get(new Object[] { empno }, "EmpVO", EmpVOSDO.class);
    }

    /**
     * createEmpVO: generated method. Do not modify.
     */
    public EmpVOSDO createEmpVO(EmpVOSDO empVO) throws ServiceException {
        return (EmpVOSDO) create(empVO, "EmpVO");
    }

    /**
     * updateEmpVO: generated method. Do not modify.
     */
    public EmpVOSDO updateEmpVO(EmpVOSDO empVO) throws ServiceException {
        return (EmpVOSDO) update(empVO, "EmpVO");
    }

    /**
     * deleteEmpVO: generated method. Do not modify.
     */
    public void deleteEmpVO(EmpVOSDO empVO) throws ServiceException {
        delete(empVO, "EmpVO");
    }

    /**
     * mergeEmpVO: generated method. Do not modify.
     */
    public EmpVOSDO mergeEmpVO(EmpVOSDO empVO) throws ServiceException {
        return (EmpVOSDO) merge(empVO, "EmpVO");
    }

    /**
     * findEmpVO: generated method. Do not modify.
     */
    public List<EmpVOSDO> findEmpVO(FindCriteria findCriteria, FindControl findControl) throws ServiceException {
        return (List<EmpVOSDO>) find(findCriteria, findControl, "EmpVO", EmpVOSDO.class);
    }

    /**
     * processEmpVO: generated method. Do not modify.
     */
    public List<EmpVOSDO> processEmpVO(String changeOperation, List<EmpVOSDO> empVO,
                                       ProcessControl processControl) throws ServiceException {
        return (List<EmpVOSDO>) process(changeOperation, processControl, empVO, "EmpVO");
    }

    /**
     * processCSEmpVO: generated method. Do not modify.
     */
    public ProcessData processCSEmpVO(ProcessData processData, ProcessControl processControl) throws ServiceException {
        return processChangeSummary(processData, processControl, "EmpVO");
    }
}

