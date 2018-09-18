package org.sid.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Data @AllargsConstructor @NoArgConstructor: c'est sont des 	annotations lombo qui remplace respectivement les get et set, constructeur avec et sans parametre
public class Task {
	@Id  @GeneratedValue
	private Long id;
	private String taskName;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(Long id, String taskName) {
		super();
		this.id = id;
		this.taskName = taskName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	

}
