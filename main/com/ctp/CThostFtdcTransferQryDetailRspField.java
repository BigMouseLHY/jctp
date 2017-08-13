/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcTransferQryDetailRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryDetailRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryDetailRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTransferQryDetailRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_TradeCode_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_FutureSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_FutureID_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setBankSerial(int value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_BankSerial_set(swigCPtr, this, value);
  }

  public int getBankSerial() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_BankSerial_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_BankAccount_get(swigCPtr, this);
  }

  public void setCertCode(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_CertCode_set(swigCPtr, this, value);
  }

  public String getCertCode() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_CertCode_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_get(swigCPtr, this);
  }

  public void setTxAmount(double value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_TxAmount_set(swigCPtr, this, value);
  }

  public double getTxAmount() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_TxAmount_get(swigCPtr, this);
  }

  public void setFlag(char value) {
    ctpJNI.CThostFtdcTransferQryDetailRspField_Flag_set(swigCPtr, this, value);
  }

  public char getFlag() {
    return ctpJNI.CThostFtdcTransferQryDetailRspField_Flag_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryDetailRspField() {
    this(ctpJNI.new_CThostFtdcTransferQryDetailRspField(), true);
  }

}
