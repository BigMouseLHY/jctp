/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcRspFutureSignOutField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspFutureSignOutField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspFutureSignOutField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcRspFutureSignOutField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpapiJNI.CThostFtdcRspFutureSignOutField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpapiJNI.CThostFtdcRspFutureSignOutField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcRspFutureSignOutField() {
    this(ctpapiJNI.new_CThostFtdcRspFutureSignOutField(), true);
  }

}
