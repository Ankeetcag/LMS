package springbootprojecttwowheller.com.cagl.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springbootprojecttwowheller.com.cagl.entity.whatsappLeads;
import springbootprojecttwowheller.com.cagl.repository.whatsappLeadsRepository;

@Controller
public class whatsappLeadsController {

	@Autowired
	HttpServletRequest request;
	
	@Autowired
	whatsappLeadsRepository whatsappLeadsRepository;
	
	@GetMapping("/upload_new")
	public String showleads(Model model) {
		List<whatsappLeads> Leads = whatsappLeadsRepository.getWhatsappLeads();
		System.out.println(Leads);
//		model.addAllAttributes(Leads);
		model.addAttribute("Leadsdata",Leads);
	return "upload_new";
	}
}
