package restAPI_jira_Chainning_Aug15;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Issue extends BaseClass_Jira {


	
	@Test (priority = 1)
	public void createIssueJira() {
		
		
		RequestSpecification RequestBody = request.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"TES\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in RA project by Sathish\",\r\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}");
		
		
		Response createIssueBodyResponse = RequestBody.post("/issue");
		createIssueBodyResponse.prettyPrint();
		createIssueBodyResponse.then().assertThat().statusCode(201);
		createdIssueId  = createIssueBodyResponse.jsonPath().get("id");
		
		System.out.println(createdIssueId);
	
	}
}
