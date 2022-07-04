package com.tweetapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TweetPostRequestDTO {

	private String tweetDescription;
	private String date;
	private String tweetTag;
	private int tweetLikes;
	public String getTweetDescription() {
		return tweetDescription;
	}
	public void setTweetDescription(String tweetDescription) {
		this.tweetDescription = tweetDescription;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTweetTag() {
		return tweetTag;
	}
	public void setTweetTag(String tweetTag) {
		this.tweetTag = tweetTag;
	}
	public int getTweetLikes() {
		return tweetLikes;
	}
	public void setTweetLikes(int tweetLikes) {
		this.tweetLikes = tweetLikes;
	}
}
