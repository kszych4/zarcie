package com.pentacomp.pentazarcie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Document(collection = "groups")
public class Group {

	@Id
	private String id;

	private String name;

	@Field("date_from")
	private Date validFromDate;

	@Field("date_to")
	private Date validUtilDate;

	@Field("insert_date")
	private Date createDate;

	@Field("update_date")
	private Date updateDate;

	private Place place;

	private List<User> users;

	public Group(String name, Date createDate, Date validUtilDate, Date validFromDate, Date updateDate) {
		this.name = name;
		this.createDate = createDate;
		this.validFromDate = validFromDate;
		this.validUtilDate = validUtilDate;
		this.updateDate = updateDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getValidFromDate() {
		return validFromDate;
	}

	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	public Date getValidUtilDate() {
		return validUtilDate;
	}

	public void setValidUtilDate(Date validUtilDate) {
		this.validUtilDate = validUtilDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Group{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", createDate=" + createDate +
				", validFromDate=" + validFromDate +
				", validUtilDate=" + validUtilDate +
				", updateDate=" + updateDate +
				", place=" + place +
				'}';
	}
}
