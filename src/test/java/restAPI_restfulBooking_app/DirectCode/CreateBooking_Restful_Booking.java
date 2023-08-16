package restAPI_restfulBooking_app.DirectCode;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateBooking_Restful_Booking {
	
	@Test
	public void createBooking() {
		/*
		 * EndPoint : https://restful-booker.herokuapp.com 
		 * Pathparameter: /booking
		 * Header : Content-Type: application/json 
		 * Auth : null 
		 * Request Body: {
		 * "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111, "depositpaid"
		 * : true, "bookingdates" : { "checkin" : "2018-01-01", "checkout" :
		 * "2019-01-01" } ,"additionalneeds" : "Breakfast"}
		 * Method :post()
		 */
		
		
		RequestSpecification requestBody = RestAssured.given()
				  .baseUri("https://restful-booker.herokuapp.com")
				  .headers("Content-Type","application/json")
				   .body("{\r\n"
				   		+ "    \"firstname\" : \"Jim\",\r\n"
				   		+ "    \"lastname\" : \"Brown\",\r\n"
				   		+ "    \"totalprice\" : 111,\r\n"
				   		+ "    \"depositpaid\" : true,\r\n"
				   		+ "    \"bookingdates\" : {\r\n"
				   		+ "        \"checkin\" : \"2018-01-01\",\r\n"
				   		+ "        \"checkout\" : \"2019-01-01\"\r\n"
				   		+ "    },\r\n"
				   		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				   		+ "}");
		 requestBody.log().everything();
		 System.out.println("----------------------------------");
		 Response responseBody = requestBody.post("/booking");

			responseBody.body().prettyPrint();
			 String bookingId = responseBody.jsonPath().get("bookingid");
			System.out.println("Booking id -------------> :" + bookingId);

			responseBody.then().assertThat().statusCode(200);
			responseBody.then().body("booking.firstname", Matchers.containsString("Jim"));
		  
		 
	
	}
}
