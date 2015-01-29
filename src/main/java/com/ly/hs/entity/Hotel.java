package com.ly.hs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;


@Entity
@Indexed(index="hotel")
public class Hotel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String name;
	
	private String address;
	
	private String oneWord;
	
	private double price;

	
	@Id
	@GeneratedValue(generator="UUID_KEY")
	@GenericGenerator(name="UUID_KEY", strategy="uuid.hex")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Field(index=org.hibernate.search.annotations.Index.YES,analyze=Analyze.YES,store=Store.YES)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Field(index=org.hibernate.search.annotations.Index.YES,analyze=Analyze.YES,store=Store.NO)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOneWord() {
		return oneWord;
	}

	public void setOneWord(String oneWord) {
		this.oneWord = oneWord;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address
				+ ", oneWord=" + oneWord + ", price=" + price + "]";
	}
	
}
