package com.cognizant.pharmaWeb.entities;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="medicine")
public class Medical {

	@Id
	private int id;
	@Column(name="type_of_medicine")
	private String typeOfMedicine;
	@Column(name="medicine_name")
	private String medicine_name;
	@Column(name="price")
	private double price;
	@Column(name="manufacturer")
	private String manufacturer;
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="date_of_expiry")
	private Date date_of_expiry;
	
	public Medical() {
		
	}
	public Medical(String typeOfMedicine, String medicine_name, double price, String manufacturer,Date date_of_expiry) {
		super();
		this.date_of_expiry=(date_of_expiry);
		this.typeOfMedicine = typeOfMedicine;
		this.medicine_name = medicine_name;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeOfMedicine() {
		return typeOfMedicine;
	}
	public void setTypeOfMedicine(String typeOfMedicine) {
		this.typeOfMedicine = typeOfMedicine;
	}
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(Date date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	@Override
	public String toString() {
		return "Medical [id=" + id + ", typeOfMedicine=" + typeOfMedicine + ", medicine_name=" + medicine_name
				+ ", price=" + price + ", manufacturer=" + manufacturer + ", date_of_expiry=" + date_of_expiry + "]";
	}
	

	

	
	
	
	
}
