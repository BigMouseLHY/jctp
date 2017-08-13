/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcBrokerDepositField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerDepositField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcBrokerDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcBrokerDepositField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcBrokerDepositField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcBrokerDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcBrokerDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcBrokerDepositField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcBrokerDepositField_ParticipantID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcBrokerDepositField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcBrokerDepositField_ExchangeID_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return ctpJNI.CThostFtdcBrokerDepositField_PreBalance_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return ctpJNI.CThostFtdcBrokerDepositField_CurrMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ctpJNI.CThostFtdcBrokerDepositField_CloseProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return ctpJNI.CThostFtdcBrokerDepositField_Balance_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return ctpJNI.CThostFtdcBrokerDepositField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return ctpJNI.CThostFtdcBrokerDepositField_Withdraw_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return ctpJNI.CThostFtdcBrokerDepositField_Available_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return ctpJNI.CThostFtdcBrokerDepositField_Reserve_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ctpJNI.CThostFtdcBrokerDepositField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ctpJNI.CThostFtdcBrokerDepositField_FrozenMargin_get(swigCPtr, this);
  }

  public CThostFtdcBrokerDepositField() {
    this(ctpJNI.new_CThostFtdcBrokerDepositField(), true);
  }

}
