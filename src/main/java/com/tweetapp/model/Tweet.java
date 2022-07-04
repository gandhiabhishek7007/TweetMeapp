package com.tweetapp.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tweet {

	@Id
	private String tweetId;
	@Field
	private String loginId;
	@Field
	private String tweetDescription;
	@Field
	private String postDate;
	@Field
	private String tweetTag;
	@Field
	private int tweetLikes;
	@Field
	private List<String> replyId;
	@Field
	private List<String> likeId;
	public String getTweetId() {
		return tweetId;
	}
	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getTweetDescription() {
		return tweetDescription;
	}
	public void setTweetDescription(String tweetDescription) {
		this.tweetDescription = tweetDescription;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
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
	public List<String> getReplyId() {
		return replyId;
	}
	public void setReplyId(List<String> replyId) {
		this.replyId = replyId;
	}
	public List<String> getLikeId() {
		return likeId;
	}
	public void setLikeId(List<String> likeId) {
		this.likeId = likeId;
	}
}
