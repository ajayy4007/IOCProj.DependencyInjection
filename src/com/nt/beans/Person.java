package com.nt.beans;

public class Person {
	//Spring bean Property
private int pid;
private String pname;
private String paddrs;
private float income;
//Alt+shift+s,s
public void setPid(int pid) {
	this.pid = pid;
}
public void setPname(String pname) {
	this.pname = pname;
}
public void setPaddrs(String paddrs) {
	this.paddrs = paddrs;
}
public void setIncome(float income) {
	this.income = income;
}
//Alt+shift+s,s
@Override
public String toString() {
	return "Person [id=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", income=" + income + "]";
}

}
