package ag.selm.manager.controller;

import ag.selm.manager.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalog/products")
public class ProductsController {

    private final ProductService productService;
    @RequestMapping(value = "list", method = GET)
    public String getProductsList(Model model){
        model.addAttribute("products", this.productService.findAllProducts());
        return "catalog/products/list";
    }
}
