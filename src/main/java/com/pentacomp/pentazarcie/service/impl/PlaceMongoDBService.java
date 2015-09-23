package com.pentacomp.pentazarcie.service.impl;

import com.pentacomp.pentazarcie.model.Place;
import com.pentacomp.pentazarcie.model.UserComment;
import com.pentacomp.pentazarcie.repo.PlaceRepository;
import com.pentacomp.pentazarcie.repo.UserCommentsRepository;
import com.pentacomp.pentazarcie.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Component
public final class PlaceMongoDBService implements PlaceService {

	@Autowired
	private PlaceRepository placeRepository;

	@Autowired
	private UserCommentsRepository userCommentsRepository;

	@Override
	public List<Place> getAllPlaces() {
		return placeRepository.findAll();
	}

	@Override
	public Place addPlace(Place place) {
		return placeRepository.insert(place);
	}

	@Override
	public void deletePlace(String placeId) {
		placeRepository.delete(placeId);
	}

	@Override
	public Place updatePlace(Place place) {
		return placeRepository.save(place);
	}

	@Override
	public void ratePlace(String placeId, String userId, int rating, String comment) {
		userCommentsRepository.insert(new UserComment(userId, placeId, comment, rating, new Date()));
	}
}
