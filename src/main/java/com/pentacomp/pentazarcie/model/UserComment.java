package com.pentacomp.pentazarcie.model;

import com.pentacomp.pentazarcie.dto.UserCommentDTO;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Document(collection = "users_comments")
public class UserComment {

	@Field("place_id")
	private String placeId;

	@Field("user_id")
	private String userId;

	private String comment;

	private int rating;

	@Field ("insert_date")
	private Date createDate;

	public UserComment(String userId, String placeId, String comment, int rating, Date createDate) {
		this.comment = comment;
		this.rating = rating;
		this.createDate = createDate;
		this.placeId = placeId;
		this.userId = userId;
	}

	public UserComment(UserCommentDTO userComment) {
		this.comment = userComment.getComment();
		this.rating = userComment.getRating();
		this.createDate = new Date();
		this.placeId = userComment.getPlace().getId();
		this.userId = userComment.getUser().getId();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return "UserComment{" +
				"user=" + userId +
				", place=" + placeId +
				", comment='" + comment + '\'' +
				", rating=" + rating +
				", createDate=" + createDate +
				'}';
	}
}
