/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcUserRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcUserRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcUserRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcUserRightField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcUserRightField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcUserRightField_UserID_get(swigCPtr, this);
  }

  public void setUserRightType(char value) {
    ctpapiJNI.CThostFtdcUserRightField_UserRightType_set(swigCPtr, this, value);
  }

  public char getUserRightType() {
    return ctpapiJNI.CThostFtdcUserRightField_UserRightType_get(swigCPtr, this);
  }

  public void setIsForbidden(int value) {
    ctpapiJNI.CThostFtdcUserRightField_IsForbidden_set(swigCPtr, this, value);
  }

  public int getIsForbidden() {
    return ctpapiJNI.CThostFtdcUserRightField_IsForbidden_get(swigCPtr, this);
  }

  public CThostFtdcUserRightField() {
    this(ctpapiJNI.new_CThostFtdcUserRightField(), true);
  }

}
