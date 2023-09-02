package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cardetails")
public class CarEntity {
	@Id
	private int id;
	private String carNme;
	private String carType;
	private int owners;
	private String currentOwnerName;
    private long mobile;
    private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarNme() {
		return carNme;
	}
	public void setCarNme(String carNme) {
		this.carNme = carNme;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getOwners() {
		return owners;
	}
	public void setOwners(int owners) {
		this.owners = owners;
	}
	public String getCurrentOwnerName() {
		return currentOwnerName;
	}
	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CarEntity(int id, String carNme, String carType, int owners, String currentOwnerName, long mobile,
			String address) {
		super();
		this.id = id;
		this.carNme = carNme;
		this.carType = carType;
		this.owners = owners;
		this.currentOwnerName = currentOwnerName; 
		this.mobile = mobile;
		this.address = address;
	}
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}