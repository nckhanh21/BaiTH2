package BaiTH2.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import BaiTH2.Product;
import BaiTH2.ListProduct;

@Slf4j
@Controller
@RequestMapping("/products")
public class ProductsController {
	List<Product> list = new ArrayList<Product>();
	@ModelAttribute
	public void addProductsToModel(Model model) {
		rest.postForObject("http://localhost:8085/products",
				product, Product.class);
		Product cd1= new Product("8601","86 (the band)- True Life Songs and Pictures ","14.95");
		Product cd2= new Product("pf01","Paddllefoot-The first CD","12.55");
		Product cd3= new Product("pf02","Paddllefoot- The second CD","14.95");
		list.add(cd1);
		list.add(cd2);
		list.add(cd3);
		model.addAttribute("products", list);
	}
	@GetMapping
	public String showProductForm(Model model) {
		model.addAttribute("products", list);
		return "products";
	}
	
	
}
