package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.UserComment;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface UserCommentsRepository extends MongoRepository<UserComment, String> {
}
