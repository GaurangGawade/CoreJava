package com.edubridge.equalsmethod;

import java.util.Objects;

public class Site {
	
	private String name;
	private Integer id;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	/* Only */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Site other = (Site) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public Site(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
