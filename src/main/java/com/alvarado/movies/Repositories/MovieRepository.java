package com.alvarado.movies.Repositories;

import com.alvarado.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId); //We do not want the database ID to be public, so we will use IMDB id to query instead.
}
