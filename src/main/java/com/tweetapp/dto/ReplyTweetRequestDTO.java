package com.tweetapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyTweetRequestDTO {

	private String replyDescription;
	private String date;
	public String getReplyDescription() {
		return replyDescription;
	}
	public void setReplyDescription(String replyDescription) {
		this.replyDescription = replyDescription;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
