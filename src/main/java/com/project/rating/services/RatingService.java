package com.project.rating.services;

import com.project.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create

    Rating createRating(Rating rating);


    //getAll Ratings
    List<Rating> getRatings();

    //get all By USER ID
    List<Rating> getRatingByUserId(String userId);

    //get all By Hotels
    List<Rating> getRatingByHotelId(String hotelId);

}
