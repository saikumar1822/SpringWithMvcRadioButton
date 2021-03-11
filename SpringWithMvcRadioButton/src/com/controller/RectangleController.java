package com.controller;




	import org.springframework.stereotype.Controller;

	import org.springframework.ui.Model;

	import org.springframework.web.bind.annotation.ModelAttribute;

	import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.model.Rectangle;



	@Controller

	public class RectangleController {



	 @RequestMapping("/hello")

	 public String rect(Model model) {

	 Rectangle rectangle = new Rectangle();

	 model.addAttribute("rectangle", rectangle);

	 return "form";



	 }

	 @RequestMapping("/submit")

	 public String rect(@ModelAttribute Rectangle rectangle, Model model) {

	 if(rectangle.getCalculate().equals("Area")){

	  double area = rectangle.calculateArea();

	  model.addAttribute("area", area);

	 }

	 else{

	  double perimeter=rectangle.calculatePerimeter();

	  model.addAttribute("perimeter", perimeter);

	 }

	 return "result";

	 }



}
