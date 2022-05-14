package BaiTH2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EditProductsController {
	@GetMapping("/editproducts")
	public String edit() {
		return "editproducts";
	}

}
