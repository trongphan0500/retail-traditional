package vn.aloapp.training.springboot.dao;

import java.util.*;
import java.sql.Timestamp;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.dom4j.Branch;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import vn.aloapp.training.common.enums.StoreProcedureStatusCodeEnum;
import vn.aloapp.training.common.exception.TechresHttpException;
import vn.aloapp.training.springboot.entity.User;

@Repository("userDao")
@SuppressWarnings("unchecked")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	@Override
	public User spUCreateUser(String firstName, String lastName, String fullName, int gender, String birthday,
			String email, int isExpire, String avatar, int wardId, int cityId, int districtId, String fbUid,
			String ggUid, String appleUid, String phone, String password, int authType, String verifyCode,
			int verifyFailCount, int isVerified, String lastActivityAt, String lastLoginAt, String acceessToken,
			String refeshToken, String isVerifyCodeAt, int isLogin) throws Exception {

		StoredProcedureQuery query = this.getSession().createStoredProcedureQuery("sp_u_create_user", User.class)
				.registerStoredProcedureParameter("firstName", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("lastName", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("fullName", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_gender", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_birthday", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_email", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("isExpire", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_avatar", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("wardId", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("cityId", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("districtId", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("fbUid", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("ggUid", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("appleUid", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_phone", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_password", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("authType", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("verifyCode", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("verifyFailCount", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("isVerified", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("lastActivityAt", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("lastLoginAt", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("acceessToken", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("refeshToken", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("isVerifyCodeAt", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("isLogin", Integer.class, ParameterMode.IN)

				.registerStoredProcedureParameter("status_code", Integer.class, ParameterMode.OUT)
				.registerStoredProcedureParameter("message_error", String.class, ParameterMode.OUT);

		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);
		query.setParameter("fullName", fullName);
		query.setParameter("_gender", gender);
		query.setParameter("_birthday", birthday);
		query.setParameter("_email", email);
		query.setParameter("isExpire", isExpire);
		query.setParameter("_avatar", avatar);
		query.setParameter("wardId", wardId);
		query.setParameter("cityId", cityId);
		query.setParameter("districtId", districtId);
		query.setParameter("fbUid", fbUid);
		query.setParameter("ggUid", ggUid);
		query.setParameter("appleUid", appleUid);
		query.setParameter("_phone", phone);
		query.setParameter("_password", password);
		query.setParameter("authType", authType);
		query.setParameter("verifyCode", verifyCode);
		query.setParameter("verifyFailCount", verifyFailCount);
		query.setParameter("isVerified", isVerified);
		query.setParameter("lastActivityAt", lastActivityAt);
		query.setParameter("lastLoginAt", lastLoginAt);
		query.setParameter("acceessToken", acceessToken);
		query.setParameter("refeshToken", refeshToken);
		query.setParameter("isVerifyCodeAt", isVerifyCodeAt);
		query.setParameter("isLogin", isLogin);

		int statusCode = (int) query.getOutputParameterValue("status_code");
		String messageError = query.getOutputParameterValue("message_error").toString();

		switch (StoreProcedureStatusCodeEnum.valueOf(statusCode)) {
		case SUCCESS:
			return (User) query.getResultList().stream().findFirst().orElse(null);
		case INPUT_INVALID:
			throw new TechresHttpException(HttpStatus.BAD_REQUEST, messageError);
		default:
			throw new Exception(messageError);
		}
	}

	@Override
	public void spULogin(String email, String password) throws Exception {

		StoredProcedureQuery query = this.getSession().createStoredProcedureQuery("sp_u_login", User.class)
				.registerStoredProcedureParameter("_email", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_password", String.class, ParameterMode.IN)

				.registerStoredProcedureParameter("status_code", Integer.class, ParameterMode.OUT)
				.registerStoredProcedureParameter("message_error", String.class, ParameterMode.OUT);

		query.setParameter("_email", email);
		query.setParameter("_password", password);

		int statusCode = (int) query.getOutputParameterValue("status_code");
		String messageError = query.getOutputParameterValue("message_error").toString();

		switch (StoreProcedureStatusCodeEnum.valueOf(statusCode)) {
		case SUCCESS:
		case INPUT_INVALID:
			throw new TechresHttpException(HttpStatus.BAD_REQUEST, messageError);
		default:
			throw new Exception(messageError);
		}
		
	}

}
