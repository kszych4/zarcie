package com.pentacomp.pentazarcie.dto;

import com.pentacomp.pentazarcie.model.Group;
import com.pentacomp.pentazarcie.model.User;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public class UserGroupDTO {

	private User user;

	private Group group;

	public UserGroupDTO(User user, Group group) {
		this.user = user;
		this.group = group;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
}
