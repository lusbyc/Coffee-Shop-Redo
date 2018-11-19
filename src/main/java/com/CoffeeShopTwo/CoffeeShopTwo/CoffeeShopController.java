package com.CoffeeShopTwo.CoffeeShopTwo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.CoffeeShopTwo.CoffeeShopTwo.entity.Customer;
import com.CoffeeShopTwo.CoffeeShopTwo.repo.CustomerRepository;

@Controller
@SessionAttributes("customer")
public class CoffeeShopController {

	@Autowired
	CustomerRepository cR;

//	@Autowired
//	private Customer c;

	@RequestMapping("/")
	public ModelAndView index(HttpSession session) {
		ModelAndView mv = new ModelAndView("index", "firstPage", "Welcome to Grand Circus Coffee!");
		return mv;
	}

	@RequestMapping("register") // shows customer registration form
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping("thankyou") // shows welcome message to customer after registering
	public ModelAndView thankYou(HttpSession session) {
//		Customer c1 = (Customer) session.getAttribute("customer");
//		System.out.println(c1.getFirstname());
		return new ModelAndView("thankyou", "memberwelcome", "Welcome to the GC Coffee Club, ");

	}

	@RequestMapping("menu")
	public ModelAndView menu(HttpSession session) {
		ModelAndView mv = new ModelAndView("menu", "food", );
		return mv;
	}


	
	@RequestMapping("/addcustomer") // performs the action of adding the customer
	public ModelAndView addNewCustomer(@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("email") String email,
			@RequestParam("phone") String phone, @RequestParam("birthdate") String birthdate, HttpSession session) {
		Customer c1 = new Customer(firstname, lastname, email, phone, birthdate);
		cR.save(c1);
		session.setAttribute("customer", c1);
//		mv.addObject("fname", firstname);
//		c.setFirstname(firstname);
		return new ModelAndView("thankyou", "memberwelcome", "Welcome to the GC Coffee Club, " + c1.getFirstname());
	}

//	@RequestMapping("registersummary")
//	public ModelAndView registerOutput(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {
////		cR.findById(customerid);
////		c1.setFirstName(firstname);
////		cR.setLastName(lastname);
//		c.setFirstname(firstname);
//		String sayHello = "Welcome, " +  firstname + "!";
//		return new ModelAndView("formPage", "userData", sayHello);

//	}

//	@RequestMapping("/getfirstname") // experimenting with retrieving first name from different request mapping
//	public ModelAndView getFirstname (@RequestParam(cR.
//	
}


