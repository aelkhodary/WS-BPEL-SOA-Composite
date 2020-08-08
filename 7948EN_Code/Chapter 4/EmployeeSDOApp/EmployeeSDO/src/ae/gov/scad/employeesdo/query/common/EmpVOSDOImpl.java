package ae.gov.scad.employeesdo.query.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class EmpVOSDOImpl extends SDODataObject implements EmpVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 9;

   public EmpVOSDOImpl() {}

   public java.lang.Integer getEmpno() {
      return getInt(START_PROPERTY_INDEX + 0);
   }

   public void setEmpno(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getEname() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setEname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getJob() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setJob(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getMgr() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setMgr(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Timestamp getHiredate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 4);
   }

   public void setHiredate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getSal() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setSal(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getComm() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setComm(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Integer getDeptno() {
      return getInt(START_PROPERTY_INDEX + 7);
   }

   public void setDeptno(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getDepartmentName() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setDepartmentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getTravelClass() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setTravelClass(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }


}

