package com.tweetapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteTweetResponseDTO {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
