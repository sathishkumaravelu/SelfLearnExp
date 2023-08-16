package restAPI_jira_Chainning_Aug15;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class updateIssue extends BaseClass_Jira {

	@Test(priority = 2,dependsOnMethods = "jira_Chainning_Aug15.Create_Issue.createIssueJira")
	public void updateIssueJira() {
		
		RequestSpecification RequestBody = request.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}");
		
		
		Response responseBody = RequestBody.put("/issue/"+createdIssueId);
		responseBody.prettyPrint();
		responseBody.then().assertThat().statusCode(204);
		
	}
	
}
