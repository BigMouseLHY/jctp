/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcBrokerUserEventField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserEventField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public void setEventSequenceNo(int value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_set(swigCPtr, this, value);
  }

  public int getEventSequenceNo() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_EventTime_get(swigCPtr, this);
  }

  public void setUserEventInfo(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_set(swigCPtr, this, value);
  }

  public String getUserEventInfo() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcBrokerUserEventField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcBrokerUserEventField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserEventField() {
    this(ctpapiJNI.new_CThostFtdcBrokerUserEventField(), true);
  }

}
