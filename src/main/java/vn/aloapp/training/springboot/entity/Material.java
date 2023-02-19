package vn.aloapp.training.springboot.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "materials")
public class Material extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String code;
	
	private String name;
	
	@Column(name = "prefix_name")
	private String prefixName;
	
	@Column(name = "normalize_name")
	private String normalizeName;
	
	@Column(name = "user_id")
	private String userId;
	
	private String avatar;
	@Column(name = "avatarThumb")
	private String avatar_thumb;
	
	@Column(name = "category_id")
	private String categoryId;
	
	@Column(name = "unit_id")
	private String unitId;
	
	@Column(name = "wastage_rate")
	private BigDecimal wastageRate;
	
	@Column(name = "out_stock_alert_quantity")
	private BigDecimal outStockAlertQuantity;
	
	@Column(name = "retail_price")
	private BigDecimal retailPrice;
	
	@Column(name = "cost_price")
	private BigDecimal costPrice;
	
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
