package BaiTH2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DeleteProductsController {
	@GetMapping("/deleteproducts")
	public String delete() {
		return "deleteproducts";
	}
}
