package com.nadasanders.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Testimonial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	 
	private String name;
	private String designation;
	private String content;
	private String imageUrl;
	
	public Testimonial(){
		
	}

	
	public Testimonial( String name, String designation, String content, String imageUrl) {
		super();
		this.name = name;
		this.designation = designation;
		this.content = content;
		this.imageUrl = imageUrl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Testimonial [id=" + id + ", name=" + name + ", designation=" + designation + ", content=" + content
				+ ", imageUrl=" + imageUrl + "]";
	}
	

}
