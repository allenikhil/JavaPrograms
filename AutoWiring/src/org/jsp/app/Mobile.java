package org.jsp.app;

public class Mobile 
{
   private String imeiNum;
   private String location;
public String getImeiNum() {
	return imeiNum;
}
public void setImeiNum(String imeiNum) {
	this.imeiNum = imeiNum;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Mobile [imeiNum=" + imeiNum + ", location=" + location + "]";
}
}
