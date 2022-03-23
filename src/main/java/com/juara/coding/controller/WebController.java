package com.juara.coding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juara.coding.model.ContentModel;
import com.juara.coding.model.JudulModel;
import com.juara.coding.model.TestiModel;
import com.juara.coding.model.UserModel;

@Controller
public class WebController {
	
	JudulModel judul = new JudulModel("Coding", "Bareng Gue!");
	
	
	String judul1 = "Coding";
	String judul2 = "Bareng Gue!";
	
	@GetMapping("/")
	private String index(Model model) {
		
		List<ContentModel> listContent = new ArrayList<ContentModel>();
		
		//Ini adalah pelajatan array 
		ContentModel model1 = new ContentModel("Judul ini asik", "keasikan judul ini adalah judul asik");
		listContent.add(model1);
		ContentModel model2 = new ContentModel("Judul ini gaasik", "gaasik karna ga rame");
		listContent.add(model2);
		ContentModel model3 = new ContentModel("Judul ini mantap", "mantap karna memang mantap");
		listContent.add(model3);
		
		model.addAttribute("listContent", listContent);
		
		//ini adalah akhir pelajaran array
		
		TestiModel testi = new TestiModel("Matematika itu menyenangkan bukan? Bukan!","PT Menantea Jaya Abadi", "Kucing Gemuk", "img/person/jerome.jpg");
		
		model.addAttribute("tulisanJudul", "Programming itu asyik bukan? Bukan!");
		model.addAttribute("tulisanVisi", "Yukk belajar coding!");
		model.addAttribute("button", "Klik Disini!");
		
		
		model.addAttribute("judul1", judul1);
		model.addAttribute("judul2", judul2);
		
		//attribute key
		model.addAttribute("testiObjek", testi);
		model.addAttribute("judulModel", judul);
		return "index";
	}
	
	@GetMapping("/about")
	private String about(Model model) {
		model.addAttribute("judul1", judul1);
		model.addAttribute("judul2", judul2);
		return "about";
	}
	
	@GetMapping("/services")
	private String services(Model model) {
		model.addAttribute("judul1", judul1);
		model.addAttribute("judul2", judul2);
		return "services";
	}
	
	@GetMapping("/blog")
	private String news(Model model) {
		
		List<UserModel> listUser = new ArrayList<UserModel>();
		
		//Ini adalah pelajatan array 
		UserModel model1 = new UserModel("Soni Abdullah","23 Apr 2020", "/img/person/meme1.jpg", "periang", "Joko seorang yang periang dan asik");
		listUser.add(model1);
		UserModel model2 = new UserModel("Sewan Anakdajal", "19 Apr 2020", "/img/person/meme1.jpg", "ngeselin", "Dia adalah anak dakjal");
		listUser.add(model2);
		UserModel model3 = new UserModel("Doni Malamalam", "25 Mar 2020", "/img/person/meme1.jpg" , "tukang nasgor", "Doni tukang nipu");
		listUser.add(model3);
		UserModel model4 = new UserModel("Doni Cagur", "27 Apr 2020", "/img/person/meme2.jpg" , "jalan-jalan", "Jalan-jalan asik");
		listUser.add(model4);
		UserModel model5 = new UserModel("Joni Tegak","27 Apr 2020", "/img/person/meme2.jpg" , "jualan cireng", "Joni jualan cireng");
		listUser.add(model5);
		UserModel model6 = new UserModel("Doni Asikasik","19 Apr 2020", "/img/person/meme2.jpg" , "kang handal", "Doni tukang nipu");
		listUser.add(model6);
		UserModel model7 = new UserModel("Dodi Suhanjo", "19 Apr 2020", "/img/person/meme2.jpg" , "kang bohong", "Doni tukang bohongin orang");
		listUser.add(model7);
		UserModel model8 = new UserModel("Doni terdampar", "19 Apr 2020", "/img/person/meme2.jpg" , "cendol", "Doni tukang cendol enak euyy");
		listUser.add(model8);
		UserModel model9 = new UserModel("jojon dongo", "19 Apr 2020", "/img/person/meme1.jpg" , "pasrah", "Jojon pasrah");
		listUser.add(model9);
		
	
		
		model.addAttribute("listUser", listUser);
		
		model.addAttribute("judul1", judul1);
		model.addAttribute("judul2", judul2);

		return "blog";
	}
	
	@GetMapping("/contact")
	private String contact(Model model) {
		model.addAttribute("judul1", judul1);
		model.addAttribute("judul2", judul2);
		return "contact";
	}
}
