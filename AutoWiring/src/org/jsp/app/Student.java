package org.jsp.app;

public class Student 
{
  private String sName;
  private String sAddress;
  private Mobile mb;
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsAddress() {
	return sAddress;
}
public void setsAddress(String sAddress) {
	this.sAddress = sAddress;
}
public Mobile getMb() {
	return mb;
}
public void setMb(Mobile mb) {
	this.mb = mb;
}
@Override
public String toString() {
	return "Student [sName=" + sName + ", sAddress=" + sAddress + ", mb=" + mb + "]";
}  
}
