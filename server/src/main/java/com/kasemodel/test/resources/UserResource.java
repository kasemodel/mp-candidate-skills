package com.kasemodel.test.resources;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kasemodel.test.core.service.UserService;
import com.kasemodel.test.vo.User;

@Path("user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	private UserService userService;

	@Inject
	public UserResource(UserService userService) {
		this.userService = userService;
	}

	@POST
	public User save(@Valid User user) {
		User savedUser = null;
		if (user != null) {
			savedUser = userService.save(user);
		}
		return savedUser;
	}

	@GET
	public List<User> list() {
		return null;
	}

}
