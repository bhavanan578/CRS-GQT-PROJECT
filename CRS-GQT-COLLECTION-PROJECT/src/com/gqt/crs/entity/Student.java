/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author bhavana
 *
 * 
 */
public class Student {
private int student_id;
private String student_name;
private String student_email;
private int student_password;
private String student_address;
/**
 * @param student_id
 * @param student_name
 * @param student_email
 * @param student_password
 * @param  Student_address
 
 */
public Student(int student_id, String student_name, String student_email, int student_password,
		String student_address) {
	super();
	this.student_id = student_id;
	this.student_name = student_name;
	this.student_email = student_email;
	this.student_password = student_password;
	this.student_address = student_address;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getStudent_email() {
	return student_email;
}
public void setStudent_email(String student_email) {
	this.student_email = student_email;
}
public int getStudent_password() {
	return student_password;
}
public void setStudent_password(int student_password) {
	this.student_password = student_password;
}
public String getStudent_address() {
	return student_address;
}
public void setStudent_address(String student_address) {
	this.student_address = student_address;
}



}
