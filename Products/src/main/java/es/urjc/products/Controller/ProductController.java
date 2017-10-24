package es.urjc.products.Controller;

import Model.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Félix Manuel Mellado
 */
@Controller
public class ProductController {
    //Atributter
    private List<Product> products;
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("home_template");
    }
    
    @RequestMapping(value="/products", method=RequestMethod.GET)
    public ModelAndView listProducts(){
        this.products = new ArrayList<Product>();
        Product producto = new Product();
        producto.setName("Chorizo");
        this.products.add(producto);
        return new ModelAndView("listProducts_template").addObject("products", this.products);
    }
    
    @RequestMapping(value="/products/forms", method=RequestMethod.GET)
    public ModelAndView formProduct(){
        return new ModelAndView("createProduct_template");
    }
    
    @RequestMapping(value="/products", method=RequestMethod.POST)
    public ModelAndView createProduct(){
        return new ModelAndView("home_template");
    }
    
    @RequestMapping(value="/products/{id}", method=RequestMethod.GET)
    public ModelAndView getProduct(){
        return new ModelAndView("product_template");
    }
    
    @RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
    public ModelAndView deleteProduct(){
        return listProducts();
    }
    
    
}
