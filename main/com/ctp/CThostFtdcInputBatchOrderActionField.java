/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcInputBatchOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputBatchOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputBatchOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcInputBatchOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiJNI.CThostFtdcInputBatchOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiJNI.CThostFtdcInputBatchOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputBatchOrderActionField() {
    this(ctpapiJNI.new_CThostFtdcInputBatchOrderActionField(), true);
  }

}
