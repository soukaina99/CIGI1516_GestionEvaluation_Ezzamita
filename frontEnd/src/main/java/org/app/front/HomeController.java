package org.app.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")

	public String getHome(Model model) {

		//String url = "http://localhost:8080/sqli_backend1/webresources/projects/";
		//List<Projet> projets;
		//RestTemplate restTemplate = new RestTemplate();
		//projets = restTemplate.getForObject(url, List.class);
		//model.addAttribute("projects", projets);
		return "space";

	}
	
/*	@RequestMapping(value="/getProject/{idProject}")	
	public Model getProject(Model model,@PathVariable("idProject") int idProject){
		String url="";
		Projet project;
		RestTemplate restTemplate=new RestTemplate();
		project=restTemplate.getForObject(url, Projet.class);
		model.addAttribute("project",project);	
			return model;	
	}*/
	

}
