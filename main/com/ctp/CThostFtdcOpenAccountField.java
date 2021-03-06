/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcOpenAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOpenAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOpenAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcOpenAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpapiJNI.CThostFtdcOpenAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpapiJNI.CThostFtdcOpenAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpapiJNI.CThostFtdcOpenAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiJNI.CThostFtdcOpenAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpapiJNI.CThostFtdcOpenAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpapiJNI.CThostFtdcOpenAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpapiJNI.CThostFtdcOpenAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiJNI.CThostFtdcOpenAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpapiJNI.CThostFtdcOpenAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpapiJNI.CThostFtdcOpenAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpapiJNI.CThostFtdcOpenAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return ctpapiJNI.CThostFtdcOpenAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return ctpapiJNI.CThostFtdcOpenAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpapiJNI.CThostFtdcOpenAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ctpapiJNI.CThostFtdcOpenAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return ctpapiJNI.CThostFtdcOpenAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ctpapiJNI.CThostFtdcOpenAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return ctpapiJNI.CThostFtdcOpenAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return ctpapiJNI.CThostFtdcOpenAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return ctpapiJNI.CThostFtdcOpenAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return ctpapiJNI.CThostFtdcOpenAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpapiJNI.CThostFtdcOpenAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiJNI.CThostFtdcOpenAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ctpapiJNI.CThostFtdcOpenAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return ctpapiJNI.CThostFtdcOpenAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpapiJNI.CThostFtdcOpenAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ctpapiJNI.CThostFtdcOpenAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ctpapiJNI.CThostFtdcOpenAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ctpapiJNI.CThostFtdcOpenAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpapiJNI.CThostFtdcOpenAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpapiJNI.CThostFtdcOpenAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_UserID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpapiJNI.CThostFtdcOpenAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpapiJNI.CThostFtdcOpenAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpapiJNI.CThostFtdcOpenAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpapiJNI.CThostFtdcOpenAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcOpenAccountField() {
    this(ctpapiJNI.new_CThostFtdcOpenAccountField(), true);
  }

}
