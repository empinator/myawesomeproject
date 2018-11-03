package de.studiapp.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vorlesungsverschiebung {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private long id;
	private String fach;
	private String prof;
	private String terminold;
	private String terminnew;
	
	public long getId( ) {
		return id;
	}
	
	public String getFach() {
		return fach;
	}
	
	public String getProf() {
		return prof;
	}
	
	public String getTerminold() {
		return terminold;
	}
	
	public String getTerminnew() {
		return terminnew;
	}
	

}
