/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcQryExchangeCombActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcQryExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    ctpapiJNI.CThostFtdcQryExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiJNI.CThostFtdcQryExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiJNI.CThostFtdcQryExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiJNI.CThostFtdcQryExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiJNI.CThostFtdcQryExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiJNI.CThostFtdcQryExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcQryExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcQryExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiJNI.CThostFtdcQryExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiJNI.CThostFtdcQryExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeCombActionField() {
    this(ctpapiJNI.new_CThostFtdcQryExchangeCombActionField(), true);
  }

}
