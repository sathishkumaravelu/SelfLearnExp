package RAFrameWork;

import Owner.AppProperties;
import Owner.ApplicationPropLoader;
import RAFrameWork.POJO.AuthBodyPojo;
import RAFrameWork.POJO.AuthBody_TokenPojo;
import RAFrameWork.POJO.BookingResponsePojo;
import RAFrameWork.POJO.createBookingRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static Owner.ApplicationPropLoader.*;


public class RAWrapper extends RAmethodsImpl {


        //AppProperties obj = new ApplicationPropLoader.app;


    public static final String endpoint = "https://restful-booker.herokuapp.com";

    private Map<String, String> setContentTypeHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        return header;
    }

    private Map<String, String> setUpdateHeader() throws Exception {
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        header.put("Cookie", "token=" + createAuthTokenPojo().getToken());
        return header;
    }


    Map<String, String> putHeader = new HashMap<>();

    private AuthBodyPojo setAuthRequestPojoBody() {
        AuthBodyPojo authRequestPojoBody = new AuthBodyPojo();
        authRequestPojoBody.setUsername("admin");
        authRequestPojoBody.setPassword("password123");
        return authRequestPojoBody;
    }

    private createBookingRequest setcreateBookingRequestBody(String firstName, String lastName, String totalPrice, String deposit, String checkinDate, String checkoutDate, String extraNeed) {
        createBookingRequest createRequestBody = new createBookingRequest();
        createRequestBody.setFirstname(firstName);
        createRequestBody.setLastname(lastName);
        createRequestBody.setTotalprice(totalPrice);
        createRequestBody.setDepositpaid(deposit);
        createBookingRequest.BookingDates checkingDates = new createBookingRequest.BookingDates();
        checkingDates.setCheckin(checkinDate);
        checkingDates.setCheckout(checkoutDate);
        createRequestBody.setBookingdates(checkingDates);
        createRequestBody.setAdditionalneeds(extraNeed);

        return createRequestBody;
    }

    public Response getPingStatus() throws Exception {
        Response pingResponse = get(endpoint, setContentTypeHeader(), "ping");
        pingResponse.prettyPrint();
        return pingResponse;
    }

    public Response createAuthToken() throws Exception {

        Response pingResponse = post(endpoint, setAuthRequestPojoBody(), setContentTypeHeader(), "auth");
        pingResponse.prettyPrint();
        return pingResponse;
    }

    public AuthBody_TokenPojo createAuthTokenPojo()throws Exception  {
        Response pingResponse = post(endpoint, setAuthRequestPojoBody(), setContentTypeHeader(), "auth");
        pingResponse.prettyPrint();
        pingResponse.then().statusCode(200);
        return pingResponse.getBody().as(AuthBody_TokenPojo.class);
    }

    public Response getBooking(String id) throws Exception {
        return get(endpoint, setContentTypeHeader(), "booking" + id);
    }

    public createBookingRequest getBookingPojo(String id) throws Exception {

        Response booking = get(endpoint, setContentTypeHeader(), "booking" + id);
        booking.prettyPrint();
        booking.then().log();
        booking.then().statusCode(200);
        return booking.getBody().as(createBookingRequest.class);
    }

    public Response createBooking(String firstName, String lastName, String totalPrice, String deposit, String checkinDate, String checkoutDate, String extraNeed)throws Exception  {

        Response booking = post(endpoint, setcreateBookingRequestBody(firstName, lastName, totalPrice, deposit, checkinDate, checkoutDate, extraNeed), setContentTypeHeader(), "booking");
        booking.prettyPrint();
        return booking;
    }

    public BookingResponsePojo createBookingPojo(String firstName, String lastName, String totalPrice, String deposit, String checkinDate, String checkoutDate, String extraNeed) throws Exception {
        Response booking = post(endpoint, setcreateBookingRequestBody(firstName, lastName, totalPrice, deposit, checkinDate, checkoutDate, extraNeed), setContentTypeHeader(), "booking");
        booking.prettyPrint();
        booking.then().statusCode(200);
        return booking.getBody().as(BookingResponsePojo.class);
    }


    public Response updateBooking(String firstName, String lastName, String totalPrice, String deposit, String checkinDate, String checkoutDate, String extraNeed) throws Exception {
        Response booking = put(endpoint, setcreateBookingRequestBody(firstName, lastName, totalPrice, deposit, checkinDate, checkoutDate, extraNeed), setUpdateHeader(), "booking");
        booking.prettyPrint();
        return booking;
    }

    public createBookingRequest updateBookingPojo(String firstName, String lastName, String totalPrice, String deposit, String checkinDate, String checkoutDate, String extraNeed)throws Exception  {
        Response booking = put(endpoint, setcreateBookingRequestBody(firstName, lastName, totalPrice, deposit, checkinDate, checkoutDate, extraNeed), setUpdateHeader(), "booking");
        booking.prettyPrint();
        booking.then().statusCode(200);
        return booking.getBody().as(createBookingRequest.class);
    }

    public Response deleteBooking(String id)throws Exception  {
        return get(endpoint, setUpdateHeader(), "booking" + id);
    }

}
