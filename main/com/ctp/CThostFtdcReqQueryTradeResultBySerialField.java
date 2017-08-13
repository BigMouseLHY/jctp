/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcReqQueryTradeResultBySerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqQueryTradeResultBySerialField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcReqQueryTradeResultBySerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
  }

  public void setReference(int value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
  }

  public int getReference() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
  }

  public void setRefrenceIssureType(char value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this, value);
  }

  public char getRefrenceIssureType() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr, this);
  }

  public void setRefrenceIssure(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
  }

  public String getRefrenceIssure() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpJNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcReqQueryTradeResultBySerialField() {
    this(ctpJNI.new_CThostFtdcReqQueryTradeResultBySerialField(), true);
  }

}
