/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcEWarrantOffsetField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcEWarrantOffsetField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcEWarrantOffsetField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcEWarrantOffsetField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_Direction_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_HedgeFlag_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcEWarrantOffsetField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcEWarrantOffsetField_Volume_get(swigCPtr, this);
  }

  public CThostFtdcEWarrantOffsetField() {
    this(ctpJNI.new_CThostFtdcEWarrantOffsetField(), true);
  }

}
