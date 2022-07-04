package com.tweetapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateTweetRequestDTO {
	private String tweetDescriptions;
	private String tweetTag;
	public String getTweetDescriptions() {
		return tweetDescriptions;
	}
	public void setTweetDescriptions(String tweetDescriptions) {
		this.tweetDescriptions = tweetDescriptions;
	}
	public String getTweetTag() {
		return tweetTag;
	}
	public void setTweetTag(String tweetTag) {
		this.tweetTag = tweetTag;
	}
}
