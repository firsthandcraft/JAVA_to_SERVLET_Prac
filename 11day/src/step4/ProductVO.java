package step4;

public class ProductVO {
	private String name;
	private String marker;
	private int price;
	public ProductVO(String name, String marker, int price) {
		super();
		this.name = name;
		this.marker = marker;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarker() {
		return marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", marker=" + marker + ", price=" + price + "]";
	}
	
}
