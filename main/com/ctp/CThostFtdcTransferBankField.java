/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcTransferBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcTransferBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBankID(String value) {
    ctpapiJNI.CThostFtdcTransferBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpapiJNI.CThostFtdcTransferBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ctpapiJNI.CThostFtdcTransferBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ctpapiJNI.CThostFtdcTransferBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    ctpapiJNI.CThostFtdcTransferBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return ctpapiJNI.CThostFtdcTransferBankField_BankName_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpapiJNI.CThostFtdcTransferBankField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpapiJNI.CThostFtdcTransferBankField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankField() {
    this(ctpapiJNI.new_CThostFtdcTransferBankField(), true);
  }

}
