/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcErrExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcErrExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcErrExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpapiJNI.CThostFtdcErrExecOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpapiJNI.CThostFtdcErrExecOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcErrExecOrderField() {
    this(ctpapiJNI.new_CThostFtdcErrExecOrderField(), true);
  }

}
