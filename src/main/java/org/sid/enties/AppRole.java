package org.sid.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppRole {
	@Id @GeneratedValue
  private Long id;
  private String roleName;
public AppRole() {
	super();
	// TODO Auto-generated constructor stub
}
public AppRole(Long id, String roleName) {
	super();
	this.id = id;
	this.roleName = roleName;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

  
  
}
