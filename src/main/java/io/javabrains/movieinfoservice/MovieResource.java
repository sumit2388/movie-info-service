package io.javabrains.movieinfoservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	private static final Logger log = LoggerFactory.getLogger(MovieResource.class);
	
	// to check port number in ribbon client 
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/{movieId}")
	public Movie getmovieInfo(@PathVariable("movieId") String movieId){
		log.info("sumit - info service");

		return new Movie(movieId,"test name:"+port);
	}
}
