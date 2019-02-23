package gedikoglu.emre.mypersonalpage.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gedikoglu.emre.mypersonalpage.model.Contact;
import gedikoglu.emre.mypersonalpage.service.MyPersonalPageService;

@Controller
public class ContactController {
	@Autowired
	private MyPersonalPageService myPersonalPageService;
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String contact() {
		return "contact";
	}
	
	@ModelAttribute
	public Contact initModel() {
		return new Contact();
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.POST, params="submit")
	public String handleFormSubmit(@ModelAttribute @Valid Contact contact, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "contact";
		}
		myPersonalPageService.createContact(contact);
		redirectAttributes.addFlashAttribute("message", "Your message was successfully sent.");
		return "redirect:/contact";
	}
}
