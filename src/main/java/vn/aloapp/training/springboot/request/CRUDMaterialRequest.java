package vn.aloapp.training.springboot.request;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CRUDMaterialRequest extends BaseRequest {

	private String code;

	private String name;

	@JsonProperty("prefix_name")
	private String prefixName;

	@JsonProperty("normalize_name")
	private String normalizeName;

	@JsonProperty("user_id")
	private String userId;

	private String avatar;
	
	@JsonProperty("avatarThumb")
	private String avatar_thumb;

	@JsonProperty("category_id")
	private String categoryId;

	@JsonProperty("unit_id")
	private String unitId;

	@JsonProperty("wastage_rate")
	private BigDecimal wastageRate;

	@JsonProperty("out_stock_alert_quantity")
	private BigDecimal outStockAlertQuantity;

	@JsonProperty("retail_price")
	private BigDecimal retailPrice;

	@JsonProperty("cost_price")
	private BigDecimal costPrice;

	private int status;

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatar_thumb() {
		return avatar_thumb;
	}

	public void setAvatar_thumb(String avatar_thumb) {
		this.avatar_thumb = avatar_thumb;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public BigDecimal getWastageRate() {
		return wastageRate;
	}

	public void setWastageRate(BigDecimal wastageRate) {
		this.wastageRate = wastageRate;
	}

	public BigDecimal getOutStockAlertQuantity() {
		return outStockAlertQuantity;
	}

	public void setOutStockAlertQuantity(BigDecimal outStockAlertQuantity) {
		this.outStockAlertQuantity = outStockAlertQuantity;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
