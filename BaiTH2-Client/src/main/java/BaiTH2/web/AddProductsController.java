package BaiTH2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class AddProductsController {
	@GetMapping("/addproducts")
	public String delete() {
		return "addproducts";
	}
}
