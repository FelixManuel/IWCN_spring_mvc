package Controller;

import Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Félix Manuel Mellado
 */
@Controller
public class ProductController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("home_template");
    }
    
    @RequestMapping(value="/products", method=RequestMethod.GET)
    public ModelAndView listProducts(){
        return new ModelAndView("listProducts_template");
    }
    
    @RequestMapping(value="/products", method=RequestMethod.POST)
    public ModelAndView createProduct(){
        return new ModelAndView("createProduct_template");
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
