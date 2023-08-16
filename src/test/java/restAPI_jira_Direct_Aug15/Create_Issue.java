package restAPI_jira_Direct_Aug15;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Issue {

	public static String id ;
	
	@Test (priority = 1)
	public void createIssueJira() {
		
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2";
		
		RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		
		RequestSpecification RequestBody = RestAssured
		.given()
		.header("Content-Type","application/json")
		//.contentType(ContentType.JSON)
		.body("{\r\n"
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
		id = createIssueBodyResponse.jsonPath().get("id");
		System.out.println(id);
	
	}
}
