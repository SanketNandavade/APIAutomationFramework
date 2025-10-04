package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify signup API is working....!!!!!!!!!!")
	public void createAccountTest() {
	
		SignupRequest signupRequest = new SignupRequest.Builder()
		.username("Prakash3")
		.password("Prakash3")
		.email("Prakash3@gmail.com")
		.firstName("Prakash3")
		.lastName("Shetty")
		.mobileNumber("3333333333")
		.build();
		
		AuthService auth = new AuthService();
		 Response response = auth.signup(signupRequest);
		 
//		 System.out.println(response.asPrettyString());
		 
		 Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		 Assert.assertEquals(response.statusCode(), 200);

	}
	
	
	
	
	
	
	
	
	
	
	
}
