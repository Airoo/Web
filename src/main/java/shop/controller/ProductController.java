package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Product> products = productService.getAll();
        modelAndView.addObject("products", products);
        modelAndView.setViewName("products");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addOrUpdate(@ModelAttribute("product") Product product) {
        if (product.getId() == 0) {
            //new product, add it
            this.productService.add(product);
        } else {
            //existing product, call update
            this.productService.update(product);
        }
        return "redirect:/products";
    }

    @RequestMapping("/remove/{id}")
    public String remove(@PathVariable("id") long id) {
        Product product = productService.getProductById(id);
        if (product != null) {
            productService.remove(product);
        }
        return "redirect:/product/list.html";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        model.addAttribute("products", productService.getAll());
        return "products";
    }

}
