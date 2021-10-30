package it.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import it.movie.model.*;
import it.movie.repository.*;

@Controller
@RequestMapping("/")
public class MovieController {

	@Autowired
	private MovieRepository repo;
	
	
	//serve localhost:8080/lista
	@ResponseBody
	@GetMapping("movie/list")
	public Iterable<Movie> list() {
		
		Iterable<Movie> movies = repo.findAll();
		
		//Dovrebbe essere una funzione inline (lambda function)
		movies.forEach((Movie m) -> {
			System.out.println(m.toString());
		});
		
		return movies;
	}
	
		//serve localhost:8080/movie
		@GetMapping("/movie")
		public ModelAndView index(@RequestParam(required = false) String id, ModelMap mm) {
			
			if(id != null) {
				Movie prod = new Movie();
				prod = repo.findById(Integer.parseInt(id)).get();
				mm.addAttribute("movieToUpdate",  prod);
			}
			
			Iterable<Movie> prods = repo.findAll();
			
			return new ModelAndView("indexMovies", "MoviesList", prods);
		}
		
		@GetMapping("/movie/addingstub")
		public void addStub() {
			//Movie m = new Movie();

		}
		
		
		
		
		@PostMapping("/add")
		public String add(@ModelAttribute("datiMovie") Movie p) {
			repo.save(p);
			return "redirect:/movie";
		}
		
		
		@PostMapping("/update")
		public String update(@ModelAttribute("datiMovie") Movie p) {
			repo.save(p);
			return "redirect:/movie";
		}
		
		
		@GetMapping("/delete")
		public String delete(@RequestParam("id") String idMovie) {
			if(idMovie != null)
				repo.deleteById(Integer.parseInt(idMovie));
			
			return "redirect:/movie";
		}
	
	
	
	
}
