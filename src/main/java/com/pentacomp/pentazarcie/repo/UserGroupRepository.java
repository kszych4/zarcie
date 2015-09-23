package com.pentacomp.pentazarcie.repo;

import com.pentacomp.pentazarcie.model.Group;
import com.pentacomp.pentazarcie.model.UserGroup;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface UserGroupRepository extends MongoRepository<UserGroup, String>{

	List<UserGroup> findAllByUserLogin(String userLogin);
	List<UserGroup> findByGroupId(String groupId);
	List<UserGroup> findByUserLoginAndGroupId(String userLogin, String groupId);
}
