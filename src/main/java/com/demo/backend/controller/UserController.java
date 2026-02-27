package com.demo.backend.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/dummy/users")
public class UserController
{

	@GetMapping({ "/{userId}/posts/{postId}", "/{userId}" })
	public ResponseEntity<String> searchUserPostWithMultiPathVariables(@PathVariable Long userId,
			@PathVariable(required = false) Long postId)
	{
		String response;
		if (postId == null)
		{
			response = "Fetched user with id: " + userId;
		}
		else
		{
			response = "Fetched user with id: " + userId + " and post id: " + postId;
		}
		// return response;
		return ResponseEntity.ok().body(response);
	}

	@GetMapping({ "/{userId}/orders/{orderId}" })
	public String searchUserOrderWithMultiPathVariables(@PathVariable(name = "userId") Long customerId, @PathVariable Long orderId)
	{
		return "Fetched user with id: " + customerId + " and order id: " + orderId;
	}

	@GetMapping({ "/{userId}/address/{addressId}" })
	public String searchUserAddressWithMultiPathVariables(@PathVariable Map<String, String> pathVariablesMap)
	{
		return "Fetched user with id: " + pathVariablesMap.get("userId") + " and address id: " + pathVariablesMap.get("addressId");
	}

	@GetMapping("/search")
	public String searchUserWithQueryParams(@RequestParam(required = false, defaultValue = "Guest") String name,
			@RequestParam(name = "gender") String gender)
	{
		return "Fetched user with query params : " + name + " and gender: " + gender;
	}

	@GetMapping("/search/map")
	public String searchUserWithMapQueryParams(@RequestParam Map<String, String> requestParams)
	{
		return "Fetched user with query params : " + requestParams.get("name") + " and gender: " + requestParams.get("gender");
	}
}
