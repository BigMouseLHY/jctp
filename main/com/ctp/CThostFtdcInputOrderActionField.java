/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcInputOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcInputOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcInputOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcInputOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ctpJNI.CThostFtdcInputOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ctpJNI.CThostFtdcInputOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CThostFtdcInputOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcInputOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcInputOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CThostFtdcInputOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CThostFtdcInputOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcInputOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcInputOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcInputOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CThostFtdcInputOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpJNI.CThostFtdcInputOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpJNI.CThostFtdcInputOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CThostFtdcInputOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CThostFtdcInputOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ctpJNI.CThostFtdcInputOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ctpJNI.CThostFtdcInputOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcInputOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcInputOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpJNI.CThostFtdcInputOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CThostFtdcInputOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CThostFtdcInputOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CThostFtdcInputOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputOrderActionField() {
    this(ctpJNI.new_CThostFtdcInputOrderActionField(), true);
  }

}
