/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcQryInstrumentStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQryInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcQryInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcQryInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcQryInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcQryInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentStatusField() {
    this(ctpJNI.new_CThostFtdcQryInstrumentStatusField(), true);
  }

}
