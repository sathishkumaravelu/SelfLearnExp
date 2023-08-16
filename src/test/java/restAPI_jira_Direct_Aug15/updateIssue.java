package restAPI_jira_Direct_Aug15;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class updateIssue {

	@Test(priority = 2,dependsOnMethods = "jira_Chaning_Aug15.Create_Issue.createIssueJira")
	public void updateIssueJira() {
		
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/";
		RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		
		RequestSpecification request = RestAssured.given()
		.contentType(ContentType.JSON).body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}");
		
		
		Response responseBody = request.put("/issue/"+Create_Issue.id);
		responseBody.prettyPrint();
		responseBody.then().assertThat().statusCode(204);
		
	}
	
}
