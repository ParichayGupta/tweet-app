package com.tweetapp.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tweetPost")
public class TweetPost {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tweetId;

	@Lob
	@Column(name = "message", length = 144)
	@NotBlank(message = "Tweet Content is required")
	private String tweetMessage;

	@Column(name = "likesCount")
	private Integer likesCount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userIDs", referencedColumnName = "userId")
	private User userId;

	private Instant creationDate;
}
