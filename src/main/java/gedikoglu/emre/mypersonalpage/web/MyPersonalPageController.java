package gedikoglu.emre.mypersonalpage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyPersonalPageController {
	
	@RequestMapping(value={"/","/aboutme"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="/experiences")
	public ModelAndView experiences() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("experienceAndEducation");
		return mav;
	}
	
	@RequestMapping(value="/skills")
	public ModelAndView skills() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mySkills");
		return mav;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("contact");
		return mav;
	}
}
