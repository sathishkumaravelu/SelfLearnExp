package restAPI_restfulBooking_app.DirectCode;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateBooking_Restful_Booking {

	@Test
	public void updateBooking() {

		/*
		 * EndPoint : https://restful-booker.herokuapp.com/ 
		 * Pathparameter: /booking/id
		 * Header : Content-Type: application/json / Accept: application/json /Cookie:
		 * token=abc123 
		 * Auth : null 
		 * Request Body: { "firstname" : "James", "lastname" :
		 * "Brown", "totalprice" : 111, "depositpaid" : true, "bookingdates" : {
		 * "checkin" : "2018-01-01", "checkout" : "2019-01-01" }, "additionalneeds" :
		 * "Breakfast" } 
		 * Method :put
		 * 
		 */

				RequestSpecification requestBody = RestAssured.given()
				   .baseUri("https://restful-booker.herokuapp.com")
				   .contentType(ContentType.JSON)
				   .header("Accept","application/json")
				   .header("Cookie","token=cc4990ad87c30e1")
				   .body("{\r\n"
				   		+ "    \"firstname\": \"Sathish\",\r\n"
				   		+ "    \"lastname\": \"kumaravelu\",\r\n"
				   		+ "    \"totalprice\": 101,\r\n"
				   		+ "    \"depositpaid\": true,\r\n"
				   		+ "    \"bookingdates\": {\r\n"
				   		+ "        \"checkin\": \"2023-08-09\",\r\n"
				   		+ "        \"checkout\": \"2023-08-09\"\r\n"
				   		+ "    },\r\n"
				   		+ "    \"additionalneeds\": \"LuncSh\"\r\n"
				   		+ "}");
		
		//requestBody.log().all();
		
		Response responseBody = requestBody.put("/booking/5008");
		
		responseBody.prettyPrint();
	}
}
