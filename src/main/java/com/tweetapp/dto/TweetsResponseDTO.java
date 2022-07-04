package com.tweetapp.dto;

import java.util.List;

import com.tweetapp.model.Reply;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TweetsResponseDTO {
	private String tweetId;
	private String loginId;
	private String tweetDescription;
	private String postDate;
	private String tweetTag;
	private int tweetLikes;
	private List<Reply> replys;
	private List<String> likeIds;
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
	public List<Reply> getReplys() {
		return replys;
	}
	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}
	public List<String> getLikeIds() {
		return likeIds;
	}
	public void setLikeIds(List<String> likeIds) {
		this.likeIds = likeIds;
	}
}
