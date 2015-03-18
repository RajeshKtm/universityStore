package mum.universitystore.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "PRODUCT")
@XmlRootElement
public class Product {

	// @Pattern(regexp="P[1-9]+",
	// message="{Pattern.Product.productId.validation}")
	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue
	private Long id;

	@Size(min = 4, max = 50, message = "{Product.name.validation}")
	private String name;
	//
	// @Min(value = 0, message = "Min.Product.unitPrice.validation}")
	// @Digits(integer = 8, fraction = 2, message =
	// "{Digits.Product.unitPrice.validation}")
	@NotNull(message = "{Product.unitPrice.validation}")
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	@NotNull(message = "{Product.stock.validation}")
	private Long unitsInStock;
	private Long unitsInOrder;
	private Boolean discontinued;
//	private String condition;
	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID", referencedColumnName = "id")
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(Long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Long getUnitsInOrder() {
		return unitsInOrder;
	}

	public void setUnitsInOrder(Long unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
