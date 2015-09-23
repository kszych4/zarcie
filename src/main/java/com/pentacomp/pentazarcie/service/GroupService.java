package com.pentacomp.pentazarcie.service;

import com.pentacomp.pentazarcie.model.Group;
import com.pentacomp.pentazarcie.model.Place;
import com.pentacomp.pentazarcie.model.User;
import com.pentacomp.pentazarcie.model.UserGroup;

import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public interface GroupService {

	List<Group> getAllGroups();

	List<Group> getAllActiveGroups();

	List<UserGroup> getUserGroups(User user);

	List<Group> getUserActiveGroups(User user);

	void addGroup(Group group);

	void deleteGroup(Group group);

	void updateGroup(Group group);

	void joinGroup(Group group, User user);

	void leaveGroup(Group group, User user);

	Group getGroup(String name);

	List<User> getGroupMembers(String groupId);


}
