/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author bhavana
 *
 * 
 */
public class Admin {
private int admin_id;
private int admin_password;
/**
 * @param admin_id
 * @param Admin_password
 */
public Admin(int admin_id, int admin_password) {
	super();
	this.admin_id = admin_id;
	this.admin_password = admin_password;
}
/**
 * 
 * @return the admin_id
 */
public int getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(int admin_id) {
	this.admin_id = admin_id;
}
public int getAdmin_password() {
	return admin_password;
}
public void setAdmin_password(int admin_password) {
	this.admin_password = admin_password;
}
}