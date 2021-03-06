/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcMdApi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMdApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMdApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast) {
    long cPtr = ctpapiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_0(pszFlowPath, bIsUsingUdp, bIsMulticast);
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp) {
    long cPtr = ctpapiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_1(pszFlowPath, bIsUsingUdp);
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath) {
    long cPtr = ctpapiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_2(pszFlowPath);
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static CThostFtdcMdApi CreateFtdcMdApi() {
    long cPtr = ctpapiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_3();
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static String GetApiVersion() {
    return ctpapiJNI.CThostFtdcMdApi_GetApiVersion();
  }

  public void Release() {
    ctpapiJNI.CThostFtdcMdApi_Release(swigCPtr, this);
  }

  public void Init() {
    ctpapiJNI.CThostFtdcMdApi_Init(swigCPtr, this);
  }

  public int Join() {
    return ctpapiJNI.CThostFtdcMdApi_Join(swigCPtr, this);
  }

  public String GetTradingDay() {
    return ctpapiJNI.CThostFtdcMdApi_GetTradingDay(swigCPtr, this);
  }

  public void RegisterFront(String pszFrontAddress) {
    ctpapiJNI.CThostFtdcMdApi_RegisterFront(swigCPtr, this, pszFrontAddress);
  }

  public void RegisterNameServer(String pszNsAddress) {
    ctpapiJNI.CThostFtdcMdApi_RegisterNameServer(swigCPtr, this, pszNsAddress);
  }

  public void RegisterFensUserInfo(CThostFtdcFensUserInfoField pFensUserInfo) {
    ctpapiJNI.CThostFtdcMdApi_RegisterFensUserInfo(swigCPtr, this, CThostFtdcFensUserInfoField.getCPtr(pFensUserInfo), pFensUserInfo);
  }

  public void RegisterSpi(CThostFtdcMdSpi pSpi) {
    ctpapiJNI.CThostFtdcMdApi_RegisterSpi(swigCPtr, this, CThostFtdcMdSpi.getCPtr(pSpi), pSpi);
  }

  public int SubscribeMarketData(String[] ppInstrumentID, int nCount) {
    return ctpapiJNI.CThostFtdcMdApi_SubscribeMarketData(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int UnSubscribeMarketData(String[] ppInstrumentID, int nCount) {
    return ctpapiJNI.CThostFtdcMdApi_UnSubscribeMarketData(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int SubscribeForQuoteRsp(String[] ppInstrumentID, int nCount) {
    return ctpapiJNI.CThostFtdcMdApi_SubscribeForQuoteRsp(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int UnSubscribeForQuoteRsp(String[] ppInstrumentID, int nCount) {
    return ctpapiJNI.CThostFtdcMdApi_UnSubscribeForQuoteRsp(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
    return ctpapiJNI.CThostFtdcMdApi_ReqUserLogin(swigCPtr, this, CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
  }

  public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
    return ctpapiJNI.CThostFtdcMdApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, nRequestID);
  }

}
