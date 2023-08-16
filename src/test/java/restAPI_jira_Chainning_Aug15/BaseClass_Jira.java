package restAPI_jira_Chainning_Aug15;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseClass_Jira {

	public static String createdIssueId;
	public static RequestSpecification  request;
	@BeforeMethod
	public void setUp() {
		
		RestAssured.baseURI = "https://testjirafeb2023.atlassian.net/rest/api/2/";
		RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		request = RestAssured.given().contentType(ContentType.JSON);
	}
	
	
}
