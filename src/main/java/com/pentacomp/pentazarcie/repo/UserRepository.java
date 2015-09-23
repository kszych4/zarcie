package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByLoginIn(List<String> logins);
}
