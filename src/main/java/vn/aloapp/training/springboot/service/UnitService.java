package vn.aloapp.training.springboot.service;

import vn.aloapp.training.springboot.entity.Unit;

public interface UnitService {
	public Unit spUCreateUnit(String name, int userId, String description, int status) throws Exception;
	
	public Unit spUUpdateUnit(int untiId, String name, int userId, String description) throws Exception;
	
	public Unit spOnUnit(int unitId) throws Exception;
	
	public Unit spOffUnit(int unitId) throws Exception;
}
