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

import vn.aloapp.training.springboot.request.CRUDUnitRequest;
import vn.aloapp.training.springboot.response.BaseResponse;
import vn.aloapp.training.springboot.response.UnitResponse;
import vn.aloapp.training.springboot.service.UnitService;

@RestController
@RequestMapping("api/v1/units")

public class UnitController {

	@Autowired
	private UnitService unitService;

	@PostMapping(value = "/create", produces = { MediaType.APPLICATION_JSON_VALUE })
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<BaseResponse> spGCreateBranch(@Valid @RequestBody CRUDUnitRequest wrapper) throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new UnitResponse(unitService.spUCreateUnit(wrapper.getName(), wrapper.getUserId(),
				wrapper.getDescription(), wrapper.getStatus())));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "{id}/update", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spGCreateBranch(@PathVariable("id") int id,
			@RequestParam(name = "name", required = false, defaultValue = "") String name,
			@RequestParam(name = "userId", required = true, defaultValue = "-1") int userId,
			@RequestParam(name = "description", required = false, defaultValue = "") String description)
			throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new UnitResponse(unitService.spUUpdateUnit(id, name, userId, description)));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "{id}/on-unit", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spOnUnit(@PathVariable("id") int id) throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new UnitResponse(unitService.spOnUnit(id)));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "{unitId}/off-unit", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spOffUnit(@PathVariable("unitId") int unitId) throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new UnitResponse(unitService.spOffUnit(unitId)));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}
}
