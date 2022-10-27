package classesWithAttiributes2;

public class Main {
	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Excalibur Laptop",15000,9,"Siyah");

		//Product product = new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Excalibur Laptop");
		//product.setPrice(15000);
		//product.setStockAmount(9);

		ProductManeger productManeger = new ProductManeger();
		productManeger.Add(product);
	}
}
