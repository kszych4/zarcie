package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface UserRepository extends MongoRepository<User, String> {
}
