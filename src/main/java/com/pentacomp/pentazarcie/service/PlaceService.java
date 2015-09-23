package com.pentacomp.pentazarcie.service;

import com.pentacomp.pentazarcie.model.Place;

import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface PlaceService {

	List<Place> getAllPlaces();

	Place addPlace(Place place);

	void deletePlace(String placeId);

	Place updatePlace(Place place);

	void ratePlace(String placeId, String userId, int rating, String comment);
}
