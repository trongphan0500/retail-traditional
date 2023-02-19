package vn.aloapp.training.springboot.entity;

import java.util.*;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "users")
public class User extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "birthday")
	private String birthday;
	
	private String email;
	
	@Column(name = "is_expire")
	private int isExpire;
	
	private String avatar;
	
	@Column(name = "ward_id")
	private int warId;
	
	@Column(name = "city_id")
	private int cityId;
	
	@Column(name = "district_id")
	private int districtId;
	
	@Column(name = "fb_uid")
	private String fbUid;
	
	@Column(name = "gg_uid")
	private String ggUid;
	
	@Column(name = "apple_uid")
	private String appleUid;
	
	private String phone;
	
	private String password;
	
	@Column(name = "auth_type")
	private int authType;
	
	@Column(name = "verify_code")
	private int verifyCode;
	
	@Column(name = "verify_fail_count")
	private int verifyFailCount;
	
	@Column(name = "is_verified")
	private int isVerified;
	
	@Column(name = "last_activity_at")
	private String lastActivityAt;
	
	@Column(name = "last_login_at")
	private String lastLoginAt;
	
	@Column(name = "access_token")
	private String accessToken;
	
	@Column(name = "refesh_token")
	private String refeshToken;
	
	@Column(name = "is_verify_code_at")
	private String isVerifyCodeAt;
	
	@Column(name = "is_login")
	private int isLogin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(int verifyCode) {
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
