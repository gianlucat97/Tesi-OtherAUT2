package it.movie.repository;

import org.springframework.data.repository.CrudRepository;

import it.movie.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
