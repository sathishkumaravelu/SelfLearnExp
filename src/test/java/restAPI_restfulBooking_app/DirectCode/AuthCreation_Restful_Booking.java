package restAPI_restfulBooking_app.DirectCode;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthCreation_Restful_Booking {

	public static String tokenValue;
	@Test
	public void authCreation() {
		
		/*
		 * EndPoint : https://restful-booker.herokuapp.com 
		 * Pathparameter: /auth 
		 * Header : Content-Type: application/json
		 * Auth : null 
		 * Request Body: { "username" : "admin", "password" : "password123" }
		 * Method : Post
		 * 
		 */
		
		RequestSpecification request = RestAssured.given()
												  .baseUri("https://restful-booker.herokuapp.com")
												  .headers("Content-Type","application/json")
												  .body("{ \"username\" : \"admin\", \"password\" : \"password123\" }");
		
		request.log().all();
		Response responseBody = request.post("/auth");
		responseBody.prettyPrint();
		
		tokenValue = responseBody.jsonPath().get("token");
		System.out.println("Token value of auth >>>>>>>>>>>>>>>> "+tokenValue);
	}

	
}
