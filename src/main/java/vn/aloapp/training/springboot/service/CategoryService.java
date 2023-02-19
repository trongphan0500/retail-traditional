package vn.aloapp.training.springboot.service;

import vn.aloapp.training.springboot.entity.Category;

public interface CategoryService {
	public Category spUCreateCategory(int userId, String code, String name, String prefixName, String normalizeName,
			String description, int sort, int status) throws Exception;

	public Category spUUpdateCategory(int categoryId,String name, String description, int sort) throws Exception;
	
	public Category spOnOffCatetory(int categoryId, int status) throws Exception;
}
