package vn.aloapp.training.springboot.request;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CRUDUserRequest extends BaseRequest {

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("full_name")
	private String fullName;

	@JsonProperty("gender")
	private int gender;

	@JsonProperty("birthday")
	private String birthday;

	private String email;

	@JsonProperty("is_expire")
	private int isExpire;

	private String avatar;

	@JsonProperty("ward_id")
	private int warId;

	@JsonProperty("city_id")
	private int cityId;

	@JsonProperty("district_id")
	private int districtId;

	@JsonProperty("fb_uid")
	private String fbUid;

	@JsonProperty("gg_uid")
	private String ggUid;

	@JsonProperty("apple_uid")
	private String appleUid;

	private String phone;

	private String password;

	@JsonProperty("auth_type")
	private int authType;

	@JsonProperty("verify_code")
	private String verifyCode;

	@JsonProperty("verify_fail_count")
	private int verifyFailCount;

	@JsonProperty("is_verified")
	private int isVerified;

	@JsonProperty("last_activity_at")
	private String lastActivityAt;

	@JsonProperty("last_login_at")
	private String lastLoginAt;

	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("refesh_token")
	private String refeshToken;

	@JsonProperty("is_verify_code_at")
	private String isVerifyCodeAt;

	@JsonProperty("is_login")
	private int isLogin;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsExpire() {
		return isExpire;
	}

	public void setIsExpire(int isExpire) {
		this.isExpire = isExpire;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getWarId() {
		return warId;
	}

	public void setWarId(int warId) {
		this.warId = warId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getFbUid() {
		return fbUid;
	}

	public void setFbUid(String fbUid) {
		this.fbUid = fbUid;
	}

	public String getGgUid() {
		return ggUid;
	}

	public void setGgUid(String ggUid) {
		this.ggUid = ggUid;
	}

	public String getAppleUid() {
		return appleUid;
	}

	public void setAppleUid(String appleUid) {
		this.appleUid = appleUid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAuthType() {
		return authType;
	}

	public void setAuthType(int authType) {
		this.authType = authType;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public int getVerifyFailCount() {
		return verifyFailCount;
	}

	public void setVerifyFailCount(int verifyFailCount) {
		this.verifyFailCount = verifyFailCount;
	}

	public int getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(int isVerified) {
		this.isVerified = isVerified;
	}

	public String getLastActivityAt() {
		return lastActivityAt;
	}

	public void setLastActivityAt(String lastActivityAt) {
		this.lastActivityAt = lastActivityAt;
	}

	public String getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(String lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefeshToken() {
		return refeshToken;
	}

	public void setRefeshToken(String refeshToken) {
		this.refeshToken = refeshToken;
	}

	public String getIsVerifyCodeAt() {
		return isVerifyCodeAt;
	}

	public void setIsVerifyCodeAt(String isVerifyCodeAt) {
		this.isVerifyCodeAt = isVerifyCodeAt;
	}

	public int getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(int isLogin) {
		this.isLogin = isLogin;
	}

	
	
	

	

	
	
	
}
