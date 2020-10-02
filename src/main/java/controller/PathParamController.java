package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.bean.PathParam;

@Controller
@RequestMapping("/pathparam")
public class PathParamController {
	@RequestMapping(value="/{id}/{name}", method=RequestMethod.GET)
	public String display(@PathVariable Integer id, @PathVariable String name, Model model) {
		PathParam pathParam = new PathParam(id, name);
		model.addAttribute("id", pathParam.getId());
		model.addAttribute("name", pathParam.getName());
		model.addAttribute("msg", pathParam.toString());
		return "pathparam";
	}

	@RequestMapping(value="", method=RequestMethod.GET)
	public String emptyParams(Model model) {
		PathParam pathParam = new PathParam();
		model.addAttribute("id", pathParam.getId());
		model.addAttribute("name", pathParam.getName());
		model.addAttribute("msg", pathParam.toString());
		return "pathparam";
	}
}
