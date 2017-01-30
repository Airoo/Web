package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import shop.models.Product;
import shop.services.ProductService;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    public ProductController() {
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Product> products = productService.getAll();
        modelAndView.addObject("products", products);
        modelAndView.setViewName("products");
        return  modelAndView;
    }
}
