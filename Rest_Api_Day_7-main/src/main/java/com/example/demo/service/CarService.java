package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarEntity;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo cr;
	
	public List<CarEntity> addCars(List<CarEntity> c)
	{
		return (List<CarEntity>)cr.saveAll(c);
	}
	
	public List<CarEntity> showOwners(int owners)
	{
		return cr.getCarOwners(owners);
	}
	
	public List<CarEntity> showAddress(String address)
	{
		return cr.getCarAddress(address);
	}
	
	public List<CarEntity> showCarName(String carname)
	{
		return cr.getCarName(carname);
	}
	
	public List<CarEntity> showOwnersAndCartype(int owners, String cartype)
	{
		return cr.getCarOwnerAndCartype(owners, cartype);
	}
	
	
}