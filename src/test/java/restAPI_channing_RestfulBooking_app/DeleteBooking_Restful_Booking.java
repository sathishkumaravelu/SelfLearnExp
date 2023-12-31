package restAPI_channing_RestfulBooking_app;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteBooking_Restful_Booking extends BaseClass{

	/*
	* EndPoint : https://restful-booker.herokuapp.com
	* Pathparameter: 
	* Header : 'Content-Type: application/json'  // 'Cookie: token=abc123'
	* Auth : null
	* Request Body: 
	* Method :DELETE 
	* 
	*/
	
	@Test(dependsOnMethods ={"channing_RestfulBooking_app.CreateBooking_Restful_Booking.createBooking",
			"channing_RestfulBooking_app.AuthCreation_Restful_Booking.authCreation","channing_RestfulBooking_app.UpdateBooking_Restful_Booking.updateBooking"})

	public void deleteBooking() {
	
		RequestSpecification deleteRequest = request
				.given()
				.header("Accept","application/json")
				.header("Cookie", "token="+tokenValue);

		deleteRequest.log().all();
		Response deleteResponseBody = deleteRequest.delete("/booking/"+bookingId);
		deleteResponseBody.prettyPrint();
		deleteResponseBody.then().assertThat().statusCode(201);
	}
	
}
