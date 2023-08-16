package jira_Direct_Aug15;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIssue {
	@Test(dependsOnMethods = {"jira_Chaning_Aug15.updateIssue.updateIssueJira"})
	public void updateIssue() {
		
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/";
		RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		
		RequestSpecification request = RestAssured.given()
		.contentType(ContentType.JSON);
		
		Response responseBody = request.delete("/issue/"+Create_Issue.id);
		
		responseBody.then().assertThat().statusCode(204);
		
	}
	

}
