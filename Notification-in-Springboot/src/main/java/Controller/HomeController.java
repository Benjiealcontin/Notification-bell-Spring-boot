package Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entities.Notifications;
import Repositories.NotiRepository;
import Services.Services;

@Controller
public class HomeController {

	@Autowired
	private NotiRepository repo;
	
	@Autowired
	private Services service;
	
	
	@RequestMapping("/")	
	public ModelAndView homepage(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		long id = 1;
		long noti = service.findByStatus(id);
		List<Notifications> asd = repo.counts(id);
		mv.addObject("count", noti);
		session.setAttribute("counts", asd);
		mv.setViewName("index");
		
		return mv;		
	}
	
	@PutMapping("/update")
	public String home() {
		long userid = 1;
		return service.Updatedata(userid)+ "index";
	}
}
