package BaiTH2;

public class Product {
	private String code;
	private String description;
	private String price;

	public Product(String code, String description, String price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}
}
