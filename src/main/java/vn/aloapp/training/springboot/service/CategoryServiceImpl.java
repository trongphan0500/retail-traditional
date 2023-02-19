package vn.aloapp.training.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.aloapp.training.springboot.dao.CategoryDao;
import vn.aloapp.training.springboot.entity.Category;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired CategoryDao dao;

	@Override
	public Category spUCreateCategory(int userId, String code, String name, String prefixName, String normalizeName,
			String description, int sort, int status) throws Exception {
		return dao.spUCreateCategory(userId, code, name, prefixName, normalizeName, description, sort, status);
	}

	@Override
	public Category spUUpdateCategory(int categoryId,String name, String description, int sort) throws Exception {
		return dao.spUUpdateCategory(categoryId, name, description, sort);
	}

	@Override
	public Category spOnOffCatetory(int categoryId, int status) throws Exception {
		return dao.spOnOffCatetory(categoryId, status);
	}

}
