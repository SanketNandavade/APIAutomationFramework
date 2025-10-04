package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest3 {

	
	@Test(description = "Verify if Login API is working.....")
	public void loginTest() {
		
		LoginRequest loginRequest = new LoginRequest("Alex", "Asdfghjkl@12345");
		
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getId());
		System.out.println(loginResponse.getEmail());
		
		Assert.assertTrue(loginResponse.getToken() != null);
	
		
		
	}
	
}
