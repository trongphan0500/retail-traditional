package vn.aloapp.training.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.aloapp.training.springboot.request.CRUDCategoryRequest;
import vn.aloapp.training.springboot.response.BaseResponse;
import vn.aloapp.training.springboot.response.CategoryResponse;
import vn.aloapp.training.springboot.service.CategoryService;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "/create", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spUCreateCategory(@Valid @RequestBody CRUDCategoryRequest wrapper)
			throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new CategoryResponse(categoryService.spUCreateCategory(wrapper.getUserId(), wrapper.getCode(),
				wrapper.getName(), wrapper.getPrefixName(), wrapper.getNormalizeName(), wrapper.getDescription(),
				wrapper.getSort(), wrapper.getStatus())));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "/{id}/update", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spUUpdateCategory(@PathVariable("id") int id,
			@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "description", required = false) String description,
			@RequestParam(name = "sort", required = false, defaultValue = "1") int sort) throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new CategoryResponse(categoryService.spUUpdateCategory(id,name, name, sort)));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "/{id}/on-off-status", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spOnOfStatus(@ PathVariable("id") int id,
			@RequestParam(name = "status", required = true, defaultValue = "1") int status
			) throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new CategoryResponse(categoryService.spOnOffCatetory(id,status)));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}
}
