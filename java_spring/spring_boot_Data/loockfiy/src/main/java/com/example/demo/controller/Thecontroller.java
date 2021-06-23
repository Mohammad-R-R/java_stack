package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Song;
import com.example.demo.services.LookifyService;


@Controller
public class Thecontroller {
	private final LookifyService lookifyService;
	
	public Thecontroller(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@RequestMapping("/")
	public String home () {
		return "welcome.jsp";
	}
	@RequestMapping("/dashborad")
	public String dashborad (Model model) {
		model.addAttribute("songs", this.lookifyService.finaAllSongs());
		return "dashborad.jsp";
	}
	@RequestMapping("/toaddnew")
	public String toaddnew () {
		
		return "addnew.jsp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.lookifyService.deleteSong(id);
		return "redirect:/dashborad";
	}
	
	
	@RequestMapping("/show/{id}")
	public String show_tabe(@PathVariable("id") Long id,Model model) {
		model.addAttribute("songs", this.lookifyService.finaSongById(id));
		
		return "show_tabe.jsp";
	}
	
	@RequestMapping("/top10")
	public String show_tabe(Model model) {
		model.addAttribute("songs", this.lookifyService.findtop10());
		
		return "topten.jsp";
	}
	
	
	
	@RequestMapping ("/search")
	public String artistSearch(@RequestParam("search") String artist, Model model) {
		model.addAttribute("artistSongs",this.lookifyService.search(artist));
		model.addAttribute("artist", artist);
		return "searchres.jsp";
	}
	
	
	
	@RequestMapping(value="/addnew", method=RequestMethod.POST)
	 public String create(@RequestParam(value="title") String title, @RequestParam(value="art") String desc, @RequestParam(value="rating") Integer numOfPages) {
		Song song = new Song(title, desc, numOfPages);
		this.lookifyService.create(song);
	     return "redirect:/toaddnew" ;
	 }

}
