package restAPI_channing_RestfulBooking_app;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateBooking_Restful_Booking extends BaseClass {

	@Test(priority = 3, dependsOnMethods = {"channing_RestfulBooking_app.CreateBooking_Restful_Booking.createBooking","channing_RestfulBooking_app.AuthCreation_Restful_Booking.authCreation"})
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

				RequestSpecification requestBody = request.given()
				   .header("Accept","application/json")
				   .header("Cookie","token="+tokenValue)
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
		
		requestBody.log().all();
		
		
		System.out.println("-----------Response Body--------------");
		Response responseBody = requestBody.put("/booking/"+bookingId);
		responseBody.prettyPrint();
		
		responseBody.then().assertThat().statusCode(200);
		responseBody.then().assertThat().body("firstname", Matchers.containsString("Sathish"));
	}
}
