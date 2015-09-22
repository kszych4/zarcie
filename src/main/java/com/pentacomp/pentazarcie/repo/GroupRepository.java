package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface GroupRepository extends MongoRepository<Group, String> {


}
