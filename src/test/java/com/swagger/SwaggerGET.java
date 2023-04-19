package com.swagger;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerGET {
	RequestSpecification request;
	Response resp;
	
	@Given("I want retrieve details from user")
	public void i_want_retrieve_details_from_user() {
		RestAssured.baseURI="https://bookcart.azurewebsites.net/api/Book";
	    request=RestAssured.given();
	    
	}

	@When("I send a Get req with vaild user id")
	public void i_send_a_get_req_with_vaild_user_id() {
		
		
		resp=request.get();
		
//		Response response=RestAssured.given()
//				.queryParam("ookStore/BookStoreV1BooksGet","1")
//				.get("/v1/User/{userId}");
//				response.then().statusCode(200);
//		        response.prettyPrint();
	    
	}

	@Then("i should receiver vaild response with user details")
	public void i_should_receiver_vaild_response_with_user_details() {
		resp.prettyPrint();
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.jsonPath().get("[41].title"));
	  
		
//		Assert.assertEquals(response.getStatusCode(), 200);
//		System.out.println(resp.statusCode());
//		System.out.println(resp.statusLine());
	   
	}


}
