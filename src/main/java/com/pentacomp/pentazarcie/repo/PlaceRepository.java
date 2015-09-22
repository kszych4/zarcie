package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface PlaceRepository extends MongoRepository<Place, String> {
}
