/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcMulticastGroupInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMulticastGroupInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMulticastGroupInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcMulticastGroupInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setGroupIP(String value) {
    ctpJNI.CThostFtdcMulticastGroupInfoField_GroupIP_set(swigCPtr, this, value);
  }

  public String getGroupIP() {
    return ctpJNI.CThostFtdcMulticastGroupInfoField_GroupIP_get(swigCPtr, this);
  }

  public void setGroupPort(int value) {
    ctpJNI.CThostFtdcMulticastGroupInfoField_GroupPort_set(swigCPtr, this, value);
  }

  public int getGroupPort() {
    return ctpJNI.CThostFtdcMulticastGroupInfoField_GroupPort_get(swigCPtr, this);
  }

  public void setSourceIP(String value) {
    ctpJNI.CThostFtdcMulticastGroupInfoField_SourceIP_set(swigCPtr, this, value);
  }

  public String getSourceIP() {
    return ctpJNI.CThostFtdcMulticastGroupInfoField_SourceIP_get(swigCPtr, this);
  }

  public CThostFtdcMulticastGroupInfoField() {
    this(ctpJNI.new_CThostFtdcMulticastGroupInfoField(), true);
  }

}
