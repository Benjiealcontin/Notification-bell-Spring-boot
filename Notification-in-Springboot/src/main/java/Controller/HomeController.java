package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entities.Notifications;
import Repositories.NotiRepository;
import Services.Services;

@Controller
public class HomeController {

	@Autowired
	private Services service;
	
	
	@RequestMapping("/")	
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		long id = 1;
		long noti = service.findByStatus(id);
		mv.addObject("count", noti);
		mv.setViewName("index");
		
		return mv;		
	}
}
