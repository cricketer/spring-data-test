package lan.localhost.controller;

import lan.localhost.service.AccountService;
import lan.localhost.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private EventService eventService;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String getIndex(Model model) {
		return "Hello World";
	}

}
