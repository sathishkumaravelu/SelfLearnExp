package restAPI_restfulBooking_app.DirectCode;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteBooking_Restful_Booking {

	/*
	* EndPoint : https://restful-booker.herokuapp.com
	* Pathparameter: 
	* Header : 'Content-Type: application/json'  // 'Cookie: token=abc123'
	* Auth : null
	* Request Body: 
	* Method :DELETE 
	* 
	*/
	
	@Test
	public void deleteBooking() {
	
		RequestSpecification deleteRequest = RestAssured
				.given()
				.baseUri("https://restful-booker.herokuapp.com")
				.contentType(ContentType.JSON)
				.header("Accept","application/json")
				.header("Cookie", "token=cc4990ad87c30e1");

		deleteRequest.log().all();
		Response deleteResponseBody = deleteRequest.delete("/booking/2166");
		deleteResponseBody.prettyPrint();
	}
	
}
