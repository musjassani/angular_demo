package org.angular.demo.store;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/store")
public class StroreController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal) {
		//return principal != null ? "store/store" : "home/homeNotSignedIn";
		return "store/index";
	}
}
