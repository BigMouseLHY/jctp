/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcSettlementInfoConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSettlementInfoConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcSettlementInfoConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcSettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcSettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcSettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcSettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
  }

  public void setConfirmDate(String value) {
    ctpJNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_set(swigCPtr, this, value);
  }

  public String getConfirmDate() {
    return ctpJNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_get(swigCPtr, this);
  }

  public void setConfirmTime(String value) {
    ctpJNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_set(swigCPtr, this, value);
  }

  public String getConfirmTime() {
    return ctpJNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_get(swigCPtr, this);
  }

  public CThostFtdcSettlementInfoConfirmField() {
    this(ctpJNI.new_CThostFtdcSettlementInfoConfirmField(), true);
  }

}
