/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcVerifyCustInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyCustInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyCustInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcVerifyCustInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCustomerName(String value) {
    ctpJNI.CThostFtdcVerifyCustInfoField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpJNI.CThostFtdcVerifyCustInfoField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpJNI.CThostFtdcVerifyCustInfoField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpJNI.CThostFtdcVerifyCustInfoField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpJNI.CThostFtdcVerifyCustInfoField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpJNI.CThostFtdcVerifyCustInfoField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpJNI.CThostFtdcVerifyCustInfoField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpJNI.CThostFtdcVerifyCustInfoField_CustType_get(swigCPtr, this);
  }

  public CThostFtdcVerifyCustInfoField() {
    this(ctpJNI.new_CThostFtdcVerifyCustInfoField(), true);
  }

}
