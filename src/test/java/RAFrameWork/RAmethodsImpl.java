package RAFrameWork;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class RAmethodsImpl implements RAmethods {
    private RequestSpecification requestSpec;
    private static final Logger logger = LoggerFactory.getLogger(RAmethodsImpl.class);

    @Override
    public Response get(String endpoint, Map<String, String> headers, String basepath) throws Exception {
        try {
            Response response = RestAssured.given().baseUri(endpoint).basePath("/" + basepath).get();
            logger.debug("GET Request URL: " + endpoint + "/" + basepath);
            logger.debug("GET Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in GET request: " + e.getMessage(), e);
            throw new Exception("Error in GET request: " + e.getMessage());
        }
    }

    @Override
    public Response post(String endpoint, Object requestBody, Map<String, String> headers, String basePath) throws Exception {
        try {
            Response response = RestAssured.given()
                    .baseUri(endpoint)
                    .headers(headers)
                    .basePath("/" + basePath)
                    .body(requestBody)
                    .post();
            logger.debug("POST Request URL: " + endpoint + "/" + basePath);
            logger.debug("POST Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in POST request: " + e.getMessage(), e);
            throw new Exception("Error in POST request: " + e.getMessage());
        }
    }

    @Override
    public Response put(String endpoint, Object requestBody, Map<String, String> headers, String basePath) throws Exception {
        try {
            Response response = RestAssured.given()
                    .baseUri(endpoint)
                    .headers(headers)
                    .basePath("/" + basePath)
                    .body(requestBody)
                    .put();
            logger.debug("PUT Request URL: " + endpoint + "/" + basePath);
            logger.debug("PUT Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in PUT request: " + e.getMessage(), e);
            throw new Exception("Error in PUT request: " + e.getMessage());
        }
    }

    @Override
    public Response delete(String endpoint, String basepath) throws Exception {
        try {
            Response response = RestAssured.given().baseUri(endpoint).basePath("/" + basepath).delete();
            logger.debug("DELETE Request URL: " + endpoint + "/" + basepath);
            logger.debug("DELETE Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in DELETE request: " + e.getMessage(), e);
            throw new Exception("Error in DELETE request: " + e.getMessage());
        }
    }

    @Override
    public Response update(String endpoint, Object requestBody) throws Exception {
        try {
            Response response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .put(endpoint);
            logger.debug("UPDATE Request URL: " + endpoint);
            logger.debug("UPDATE Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in UPDATE request: " + e.getMessage(), e);
            throw new Exception("Error in UPDATE request: " + e.getMessage());
        }
    }

    @Override
    public Response patch(String endpoint, Object requestBody) throws Exception {
        try {
            Response response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .patch(endpoint);
            logger.debug("PATCH Request URL: " + endpoint);
            logger.debug("PATCH Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in PATCH request: " + e.getMessage(), e);
            throw new Exception("Error in PATCH request: " + e.getMessage());
        }
    }

    @Override
    public Response head(String endpoint) throws Exception {
        try {
            Response response = RestAssured.head(endpoint);
            logger.debug("HEAD Request URL: " + endpoint);
            logger.debug("HEAD Response Status Code: " + response.getStatusCode());
            return response;
        } catch (Exception e) {
            logger.error("Error in HEAD request: " + e.getMessage(), e);
            throw new Exception ("Error in HEAD request: " + e.getMessage());
        }
    }
}
