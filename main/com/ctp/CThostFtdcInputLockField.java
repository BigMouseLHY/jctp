/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcInputLockField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputLockField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputLockField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcInputLockField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcInputLockField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcInputLockField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcInputLockField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcInputLockField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcInputLockField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcInputLockField_InstrumentID_get(swigCPtr, this);
  }

  public void setLockRef(String value) {
    ctpapiJNI.CThostFtdcInputLockField_LockRef_set(swigCPtr, this, value);
  }

  public String getLockRef() {
    return ctpapiJNI.CThostFtdcInputLockField_LockRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcInputLockField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcInputLockField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpapiJNI.CThostFtdcInputLockField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpapiJNI.CThostFtdcInputLockField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiJNI.CThostFtdcInputLockField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiJNI.CThostFtdcInputLockField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpapiJNI.CThostFtdcInputLockField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpapiJNI.CThostFtdcInputLockField_BusinessUnit_get(swigCPtr, this);
  }

  public void setLockType(char value) {
    ctpapiJNI.CThostFtdcInputLockField_LockType_set(swigCPtr, this, value);
  }

  public char getLockType() {
    return ctpapiJNI.CThostFtdcInputLockField_LockType_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcInputLockField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcInputLockField_ExchangeID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiJNI.CThostFtdcInputLockField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiJNI.CThostFtdcInputLockField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiJNI.CThostFtdcInputLockField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiJNI.CThostFtdcInputLockField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputLockField() {
    this(ctpapiJNI.new_CThostFtdcInputLockField(), true);
  }

}
