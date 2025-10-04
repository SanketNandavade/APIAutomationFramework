package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test
	public void updateProfileInfo() {
		
		AuthService auth = new AuthService();
		Response response = auth.login(new LoginRequest("Alex", "Asdfghjkl@12345"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("-----------------------------------------------------------");
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		
		System.out.println("-----------------------------------------------------------");
		
		ProfileRequest profileRequest = new ProfileRequest.Builder()
				.firstName("alia")
				.lastName("bhut")
				.email("alia@gmail.com")
				.mobileNumber("0000987654").build();
		response =userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
		
	}
	
}
