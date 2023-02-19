package vn.aloapp.training.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.aloapp.training.springboot.request.CRUDUserRequest;
import vn.aloapp.training.springboot.response.BaseResponse;
import vn.aloapp.training.springboot.response.UserResponse;
import vn.aloapp.training.springboot.service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "/create", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spGCreateBranch(@Valid @RequestBody CRUDUserRequest wrapper) throws Exception {
		BaseResponse response = new BaseResponse();
		response.setData(new UserResponse(userService.spUCreateUser(wrapper.getFirstName(), wrapper.getLastName(),
				wrapper.getFullName(), wrapper.getGender(), wrapper.getBirthday(), wrapper.getEmail(),
				wrapper.getIsExpire(), wrapper.getAvatar(), wrapper.getWarId(), wrapper.getCityId(),
				wrapper.getDistrictId(), wrapper.getFbUid(), wrapper.getGgUid(), wrapper.getAppleUid(),
				wrapper.getPhone(), wrapper.getPassword(), wrapper.getAuthType(), wrapper.getVerifyCode(),
				wrapper.getVerifyFailCount(), wrapper.getIsVerified(), wrapper.getLastActivityAt(),
				wrapper.getLastLoginAt(), wrapper.getAccessToken(), wrapper.getRefeshToken(),
				wrapper.getIsVerifyCodeAt(), wrapper.getIsLogin())));
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<BaseResponse> spULogin(
			@RequestParam(value = "email", defaultValue = "", required = true) String email,
			@RequestParam(value = "password", defaultValue = "", required = true) String password) throws Exception {
		BaseResponse response = new BaseResponse();
		userService.spULogin(email, password);
		response.setData(response);
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}
}
