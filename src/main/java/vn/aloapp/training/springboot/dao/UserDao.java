package vn.aloapp.training.springboot.dao;

import java.util.*;
import java.sql.Timestamp;

import vn.aloapp.training.springboot.entity.User;

public interface UserDao {
	public User spUCreateUser(String firstName, String lastName, String fullName, int gender, String birthday,
			String email, int isExpire, String avatar, int wardId, int cityId, int districtId, String fbUid,
			String ggUid, String appleUid, String phone, String password, int autoType, String verifyCode,
			int verifyFailCount, int isVerified, String lastActivityAt, String lastLoginAt, String acceessToken,
			String refeshToken, String isVerifyCodeAt, int isLogin) throws Exception;
	public User create(User user);
	
	public void spULogin(String email, String password) throws Exception;
}
