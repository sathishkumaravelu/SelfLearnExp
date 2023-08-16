package restAPI_jira_Chainning_Aug15;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIssue extends BaseClass_Jira {
	@Test(dependsOnMethods = {"jira_Chainning_Aug15.updateIssue.updateIssueJira"})
	public void updateIssue() {
		
		RequestSpecification requestBody = request.given()
		.contentType(ContentType.JSON);
		
		Response responseBody = requestBody.delete("/issue/"+createdIssueId);
		
		responseBody.then().assertThat().statusCode(204);
		
	}
	

}
