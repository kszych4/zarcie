package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface PlaceRepository extends MongoRepository<Place, String> {
	List<Place> findByName(String name);

}
