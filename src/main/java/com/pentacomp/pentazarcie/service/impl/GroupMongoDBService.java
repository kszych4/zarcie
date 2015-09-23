package com.pentacomp.pentazarcie.service.impl;

import com.pentacomp.pentazarcie.model.Group;
import com.pentacomp.pentazarcie.model.User;
import com.pentacomp.pentazarcie.model.UserGroup;
import com.pentacomp.pentazarcie.repo.GroupRepository;
import com.pentacomp.pentazarcie.repo.UserGroupRepository;
import com.pentacomp.pentazarcie.repo.UserRepository;
import com.pentacomp.pentazarcie.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoCollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Service
public final class GroupMongoDBService implements GroupService {

	@Autowired
	private GroupRepository groupRepository;

	@Autowired
	private UserGroupRepository userGroupRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Group> getAllGroups() {
		return groupRepository.findAll();
	}

	@Override
	public List<Group> getAllActiveGroups() {
		return groupRepository.findByValidUntilDateGreaterThanEqual(new Date());
	}

	@Override
	public void addGroup(Group group) {
		groupRepository.insert(group);
	}

	@Override
	public void deleteGroup(Group group) {
		groupRepository.delete(group);
	}

	@Override
	public void updateGroup(Group group) {
		groupRepository.save(group);
	}

	@Override
	public void joinGroup(Group group, User user) {
		userGroupRepository.insert(new UserGroup(user.getId(), user.getLogin(), group.getId(), group.getName(), new Date(), null)) ;
	}

	@Override
	public void leaveGroup(Group group, User user) {
		List<UserGroup> userGroups = userGroupRepository.findByUserLoginAndGroupId(user.getLogin(), group.getId());
		for(UserGroup userGroup: userGroups){
			userGroupRepository.delete(userGroup);
		}
	}

	@Override
	public Group getGroup(String name) {
		return groupRepository.findByNameLike(name);
	}

	@Override
	public List<User> getGroupMembers(String groupId) {
		List<UserGroup> groupMembers = userGroupRepository.findByGroupId(groupId);
		return userRepository.findByLoginIn(groupMembers.stream().map(sc->sc.getUserLogin()).collect(Collectors.toList()));
	}

	@Override
	public List<UserGroup> getUserGroups(User user) {
		return userGroupRepository.findAllByUserLogin(user.getLogin());
	}

	@Override
	public List<Group> getUserActiveGroups(User user) {
		return null;
	}
}
