package vn.aloapp.training.springboot.response;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

import vn.aloapp.training.springboot.entity.Category;

public class CategoryResponse {

	private int id;

	@JsonProperty("user_id")
	private int userId;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	private String name;

	@JsonProperty("prefix_name")
	private String prefixName;

	@JsonProperty("normalize_name")
	private String normalizeName;

	@JsonProperty("description")
	private String description;

	@JsonProperty("sort")
	private int sort;

	@JsonProperty("status")
	private int status;

	public CategoryResponse() {
	}

	public CategoryResponse(Category entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.code = entity.getCode();
		this.name = entity.getName();
		this.prefixName = entity.getPrefixName();
		this.normalizeName = entity.getNormalizeName();
		this.description = entity.getDescription();
		this.sort = entity.getSort();
		this.status = entity.getStatus();
	}

	public List<CategoryResponse> mapToList(List<Category> entiies) {
		return entiies.stream().map(x -> new CategoryResponse(x)).collect(Collectors.toList());
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrefixName() {
		return prefixName;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	public String getNormalizeName() {
		return normalizeName;
	}

	public void setNormalizeName(String normalizeName) {
		this.normalizeName = normalizeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
