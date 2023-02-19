package vn.aloapp.training.springboot.dao;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import vn.aloapp.training.common.enums.StoreProcedureStatusCodeEnum;
import vn.aloapp.training.common.exception.TechresHttpException;
import vn.aloapp.training.springboot.entity.Category;
import vn.aloapp.training.springboot.entity.User;

@Repository("categoryDao")
@SuppressWarnings("unchecked")
public class CategoryDaoImpl extends AbstractDao<Integer, User> implements CategoryDao {

	@Override
	public Category spUCreateCategory(int userId, String code, String name, String prefixName, String normalizeName,
			String description, int sort, int status) throws Exception {
		StoredProcedureQuery query = this.getSession()
				.createStoredProcedureQuery("sp_u_create_category", Category.class)
				.registerStoredProcedureParameter("userId", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("code", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("name", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("prefixName", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("normalizeName", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_description", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_sort", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("status", Integer.class, ParameterMode.IN)

				.registerStoredProcedureParameter("status_code", Integer.class, ParameterMode.OUT)
				.registerStoredProcedureParameter("message_error", String.class, ParameterMode.OUT);

		query.setParameter("userId", userId);
		query.setParameter("code", code);
		query.setParameter("name", name);
		query.setParameter("prefixName", prefixName);
		query.setParameter("normalizeName", normalizeName);
		query.setParameter("_description", description);
		query.setParameter("_sort", sort);
		query.setParameter("status", status);

		int statusCode = (int) query.getOutputParameterValue("status_code");
		String messageError = query.getOutputParameterValue("message_error").toString();

		switch (StoreProcedureStatusCodeEnum.valueOf(statusCode)) {
		case SUCCESS:
			return (Category) query.getResultList().stream().findFirst().orElse(null);
		case INPUT_INVALID:
			throw new TechresHttpException(HttpStatus.BAD_REQUEST, messageError);
		default:
			throw new Exception(messageError);
		}
	}

	@Override
	public Category spUUpdateCategory(int categoryId,String name, String description, int sort) throws Exception {
		StoredProcedureQuery query = this.getSession()
				.createStoredProcedureQuery("sp_u_update_category", Category.class)
				.registerStoredProcedureParameter("categoryId", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("name", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_description", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_sort", Integer.class, ParameterMode.IN)

				.registerStoredProcedureParameter("status_code", Integer.class, ParameterMode.OUT)
				.registerStoredProcedureParameter("message_error", String.class, ParameterMode.OUT);

		query.setParameter("categoryId", categoryId);
		query.setParameter("name", name);
		query.setParameter("_description", description);
		query.setParameter("_sort", sort);

		int statusCode = (int) query.getOutputParameterValue("status_code");
		String messageError = query.getOutputParameterValue("message_error").toString();

		switch (StoreProcedureStatusCodeEnum.valueOf(statusCode)) {
		case SUCCESS:
			return (Category) query.getResultList().stream().findFirst().orElse(null);
		case INPUT_INVALID:
			throw new TechresHttpException(HttpStatus.BAD_REQUEST, messageError);
		default:
			throw new Exception(messageError);
		}
	}

	@Override
	public Category spOnOffCatetory(int categoryId, int status) throws Exception {
		// TODO Auto-generated method stub
		StoredProcedureQuery query = this.getSession()
				.createStoredProcedureQuery("sp_onoff_category", Category.class)
				.registerStoredProcedureParameter("categoryId", Integer.class, ParameterMode.IN)
				.registerStoredProcedureParameter("_status", Integer.class, ParameterMode.IN)

				.registerStoredProcedureParameter("status_code", Integer.class, ParameterMode.OUT)
				.registerStoredProcedureParameter("message_error", String.class, ParameterMode.OUT);

		query.setParameter("categoryId", categoryId);
		query.setParameter("_status", status);

		int statusCode = (int) query.getOutputParameterValue("status_code");
		String messageError = query.getOutputParameterValue("message_error").toString();

		switch (StoreProcedureStatusCodeEnum.valueOf(statusCode)) {
		case SUCCESS:
			return (Category) query.getResultList().stream().findFirst().orElse(null);
		case INPUT_INVALID:
			throw new TechresHttpException(HttpStatus.BAD_REQUEST, messageError);
		default:
			throw new Exception(messageError);
		}
	}

}
