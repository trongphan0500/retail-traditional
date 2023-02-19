package vn.aloapp.training.springboot.response;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

import vn.aloapp.training.springboot.entity.Material;
import vn.aloapp.training.springboot.entity.Unit;

public class UnitResponse {

	private int id;

	private String name;

	@JsonProperty("user_id")
	private int userId;

	@JsonProperty("description")
	private String description;

	private int status;

	public UnitResponse() {
	}

	public UnitResponse(Unit entity) {

		this.id = entity.getId();
		this.name = entity.getName();
		this.userId = entity.getUserId();
		this.description = entity.getDescription();
		this.status = entity.getStatus();
	}

	public List<MaterialResponse> mapToList(List<Material> entiies) {
		return entiies.stream().map(x -> new MaterialResponse(x)).collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
