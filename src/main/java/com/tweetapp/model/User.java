package com.tweetapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "firstName", length = 30)
	@NotBlank(message = "First Name is required!!")
	private String firstName;

	@Column(name = "lastName", length = 30)
	private String lastName;

	@Column(name = "userName", length = 30, unique = true)
	@NotBlank(message = "UserName is Required!!")
	private String userName;

	@Column(name = "password", length = 20)
	@NotBlank(message = "Password is Required!!")
	private String password;

	@Email
	@Column(name = "email", length = 30, unique = true)
	@NotEmpty(message = "Email is Required!!")
	private String userEmail;

	@Column(name = "gender", length = 6)
	private String gender;

}
