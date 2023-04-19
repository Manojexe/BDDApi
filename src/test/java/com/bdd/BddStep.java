package com.bdd;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.testng.Assert;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BddStep {
	RequestSpecification request;
	Response resp;
		
	
	@Given("Hit the API from")
	public void hit_the_api_from() {
	 
		RestAssured.baseURI="https://reqres.in/api/unknown";
		request =RestAssured.given();
	}

	@When("Getting response code")
	public void getting_response_code() {
	    resp=request.get();
	}

	@When("print the response")
	public void print_the_response() {
	   resp.prettyPrint();
	}

	@Then("Print the get response")
	public void print_the_get_response() {
		
		//resp.statusCode();
		//resp.statusLine();
		//Assert.assertEquals(resp.getStatusLine(), 200);
	    //junit.framework.Assert.assertEquals(Response.getS, false);
		
		//RequestSpecification.
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.jsonPath().getString("data[0]"));
	  
	}


}
