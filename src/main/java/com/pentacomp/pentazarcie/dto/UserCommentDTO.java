package com.pentacomp.pentazarcie.dto;

import com.pentacomp.pentazarcie.model.Place;
import com.pentacomp.pentazarcie.model.User;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
public class UserCommentDTO {

	private User user;
	private Place place;
	private String comment;
	private int rating;

	public UserCommentDTO(User user, Place place, String comment, int rating) {
		this.user = user;
		this.place = place;
		this.comment = comment;
		this.rating = rating;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
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
}
