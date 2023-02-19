package vn.aloapp.training.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.aloapp.training.springboot.dao.UserDao;
import vn.aloapp.training.springboot.entity.User;

@Service("userSerivce")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User spUCreateUser(String firstName, String lastName, String fullName, int gender, String birthday,
			String email, int isExpire, String avatar, int wardId, int cityId, int districtId, String fbUid,
			String ggUid, String appleUid, String phone, String password, int autoType, String verifyCode,
			int verifyFailCount, int isVerified, String lastActivityAt, String lastLoginAt, String acceessToken,
			String refeshToken, String isVerifyCodeAt, int isLogin) throws Exception {
		
		
		return userDao.spUCreateUser(firstName, lastName, fullName, gender, birthday, email, isExpire, avatar, wardId,
				cityId, districtId, fbUid, ggUid, appleUid, phone, password, autoType, verifyCode, verifyFailCount,
				isVerified, lastActivityAt, lastLoginAt, acceessToken, refeshToken, isVerifyCodeAt, isLogin);
	}

	@Override
	public void spULogin(String email, String password) throws Exception {
		userDao.spULogin(email, password);
		
	}

}
