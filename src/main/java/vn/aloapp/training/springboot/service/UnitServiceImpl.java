package vn.aloapp.training.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.aloapp.training.springboot.dao.UnitDao;
import vn.aloapp.training.springboot.entity.Unit;

@Service("unitSerivce")
@Transactional
public class UnitServiceImpl implements UnitService {

	@Autowired
	private UnitDao dao;
	
	@Override
	public Unit spUCreateUnit(String name, int userId, String description, int status) throws Exception {
		return dao.spUCreateUnit(name, userId, description, status);
	}

	@Override
	public Unit spUUpdateUnit(int untiId, String name, int userId, String description) throws Exception {
		// TODO Auto-generated method stub
		return dao.spUUpdateUnit(untiId, name, userId, description);
	}

	@Override
	public Unit spOnUnit(int unitId) throws Exception {
		return dao.spOnUnit(unitId);
	}

	@Override
	public Unit spOffUnit(int unitId) throws Exception {
		return dao.spOffUnit(unitId);
	}

}
