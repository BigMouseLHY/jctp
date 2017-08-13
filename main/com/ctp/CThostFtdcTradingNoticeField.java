/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcTradingNoticeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTradingNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcTradingNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcTradingNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpJNI.CThostFtdcTradingNoticeField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpJNI.CThostFtdcTradingNoticeField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcTradingNoticeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcTradingNoticeField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    ctpJNI.CThostFtdcTradingNoticeField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return ctpJNI.CThostFtdcTradingNoticeField_SequenceSeries_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcTradingNoticeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcTradingNoticeField_UserID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ctpJNI.CThostFtdcTradingNoticeField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ctpJNI.CThostFtdcTradingNoticeField_SendTime_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CThostFtdcTradingNoticeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CThostFtdcTradingNoticeField_SequenceNo_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    ctpJNI.CThostFtdcTradingNoticeField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return ctpJNI.CThostFtdcTradingNoticeField_FieldContent_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeField() {
    this(ctpJNI.new_CThostFtdcTradingNoticeField(), true);
  }

}
