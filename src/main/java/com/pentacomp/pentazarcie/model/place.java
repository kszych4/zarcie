package com.pentacomp.pentazarcie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Document(collection = "places")
public class Place {

	@Id
	private String id;
	private String name;
	private String description;
	@Field("insert_date")
	private Date createDate;

	@Field("update_date")
	private Date updateDate;

	public Place(String name, String description, Date createDate, Date updateDate) {
		this.name = name;
		this.description = description;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Place{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				'}';
	}

	public String getId() {
		return id;
	}
}
