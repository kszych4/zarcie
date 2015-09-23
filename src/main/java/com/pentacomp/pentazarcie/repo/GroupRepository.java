package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */

public interface GroupRepository extends MongoRepository<Group, String> {
	@Query("{ 'date_to' : ?0 }")
	List<Group> findByValidUntilDateGreaterThanEqual(Date validUntilDate);

	List<Group> findByName(String name);

	Group findByNameLike(String name);
}
