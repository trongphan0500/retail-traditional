package vn.aloapp.training.springboot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CRUDUnitRequest extends BaseRequest {
	private String name;

	@JsonProperty("user_id")
	private int userId;

	@JsonProperty("description")
	private String description;

	private int status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
