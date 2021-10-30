package it.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.movie.model.Movie;
import it.movie.repository.MovieRepository;

@RestController
@RequestMapping("/movierest") //questo controller risponderà al path localhost:8080/Movierest
public class MovieRestController {

	@Autowired
	MovieRepository MovieService;
	
	
	@GetMapping("/get-prodotti") //risponde al path localhost:8080/Movierest/get-prodotti
	public Iterable<Movie> getProdotti() {
		return MovieService.findAll();
	}
	
	
	@GetMapping("/get-Movie/{id}") //risponde al path localhost:8080/Movierest/get-Movie/{id}
	public Movie getMovie(@PathVariable Integer id) {
		return MovieService.findById(id).get();
	}
	
	@PostMapping("/add")	//se si va al path localhost:8080/Movierest/add passando nel body il JSON 
	//contenente il Movie da inserire, questo verrà inserito dato che questa è una funzionalità di tipo
	//Post Mapping
	public Movie add(@RequestBody Movie m) {
		return MovieService.save(m);
	}
}
