/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcQryMMOptionInstrCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMMOptionInstrCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMMOptionInstrCommRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcQryMMOptionInstrCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcQryMMOptionInstrCommRateField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryMMOptionInstrCommRateField() {
    this(ctpapiJNI.new_CThostFtdcQryMMOptionInstrCommRateField(), true);
  }

}
