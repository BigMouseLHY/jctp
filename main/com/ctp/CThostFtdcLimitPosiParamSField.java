/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcLimitPosiParamSField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcLimitPosiParamSField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcLimitPosiParamSField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcLimitPosiParamSField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_ExchangeID_get(swigCPtr, this);
  }

  public void setTotalVolume(int value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_TotalVolume_set(swigCPtr, this, value);
  }

  public int getTotalVolume() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_TotalVolume_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    ctpapiJNI.CThostFtdcLimitPosiParamSField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return ctpapiJNI.CThostFtdcLimitPosiParamSField_OpenVolume_get(swigCPtr, this);
  }

  public CThostFtdcLimitPosiParamSField() {
    this(ctpapiJNI.new_CThostFtdcLimitPosiParamSField(), true);
  }

}
