package com.pentacomp.pentazarcie.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Document(collection = "members_groups")
public class UserGroup {

	@Field("user_id")
	private String userId;

	@Field("user_login")
	private String userLogin;

	@Field("group_id")
	private String groupId;

	@Field("group_name")
	private String groupName;

	@Field("insert_date")
	private Date createDate;

	@Field("update_date")
	private Date updateDate;

	public UserGroup(String userId, String userLogin, String groupId, String groupName, Date createDate, Date updateDate) {
		this.userId = userId;
		this.userLogin = userLogin;
		this.groupId = groupId;
		this.groupName = groupName;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
