/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcTradingAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return ctpJNI.CThostFtdcTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return ctpJNI.CThostFtdcTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return ctpJNI.CThostFtdcTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return ctpJNI.CThostFtdcTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    ctpJNI.CThostFtdcTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return ctpJNI.CThostFtdcTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return ctpJNI.CThostFtdcTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return ctpJNI.CThostFtdcTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return ctpJNI.CThostFtdcTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    ctpJNI.CThostFtdcTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return ctpJNI.CThostFtdcTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    ctpJNI.CThostFtdcTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return ctpJNI.CThostFtdcTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    ctpJNI.CThostFtdcTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return ctpJNI.CThostFtdcTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return ctpJNI.CThostFtdcTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ctpJNI.CThostFtdcTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return ctpJNI.CThostFtdcTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return ctpJNI.CThostFtdcTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return ctpJNI.CThostFtdcTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    ctpJNI.CThostFtdcTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return ctpJNI.CThostFtdcTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return ctpJNI.CThostFtdcTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CThostFtdcTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CThostFtdcTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return ctpJNI.CThostFtdcTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    ctpJNI.CThostFtdcTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return ctpJNI.CThostFtdcTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    ctpJNI.CThostFtdcTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return ctpJNI.CThostFtdcTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return ctpJNI.CThostFtdcTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    ctpJNI.CThostFtdcTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return ctpJNI.CThostFtdcTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    ctpJNI.CThostFtdcTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return ctpJNI.CThostFtdcTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    ctpJNI.CThostFtdcTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return ctpJNI.CThostFtdcTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    ctpJNI.CThostFtdcTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return ctpJNI.CThostFtdcTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    ctpJNI.CThostFtdcTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return ctpJNI.CThostFtdcTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    ctpJNI.CThostFtdcTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return ctpJNI.CThostFtdcTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public void setBizType(char value) {
    ctpJNI.CThostFtdcTradingAccountField_BizType_set(swigCPtr, this, value);
  }

  public char getBizType() {
    return ctpJNI.CThostFtdcTradingAccountField_BizType_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountField() {
    this(ctpJNI.new_CThostFtdcTradingAccountField(), true);
  }

}
