package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.ForgotPassword;

import io.restassured.response.Response;


public class ForgetPasswordTest {
	
	@Test(description = "Verify forgetpasswod API is working....!!!!!!!!!!!")
	public void forgetpasswordTest() {
		
		AuthService auth = new AuthService();
		Response response = auth.forgot_password("sanket@gmail.com");
		System.out.println(response.asPrettyString());
		
		System.out.println();

	}
	
	
	
	
	
	

}
