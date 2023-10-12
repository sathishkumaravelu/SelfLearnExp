package RAFrameWork;

import io.restassured.response.Response;
import java.util.Map;

/**
 * Interface for the RestAssured Java Library, facilitating REST API requests. This interface provides a blueprint for
 * commonly used HTTP methods.
 *
 * @author Sathish Kumaravelu
 */
public interface RAmethods {
    /**
     * Sends a GET request to the specified endpoint.
     *
     * @param endpoint The URL endpoint to send the GET request to.
     * @param headers Custom headers to include in the request (can be null if no custom headers are needed).
     * @param basePath The base path of the GET call (can be an empty string if not required).
     * @return A Response object representing the server's response to the request.
     */

    Response get(String endpoint, Map<String, String> headers, String basePath) throws Exception;

    /**
     * Sends a POST request to the specified endpoint with a request body and custom headers.
     *
     * @param endpoint The URL endpoint to send the POST request to.
     * @param requestBody The request body to include in the POST request.
     * @param headers Custom headers to include in the request (can be null if no custom headers are needed).
     * @param basePath The base path of the POST call (can be an empty string if not required).
     * @return A Response object representing the server's response to the request.
     */

    Response post(String endpoint, Object requestBody, Map<String, String> headers, String basePath) throws Exception;

    /**
     * Sends a PUT request to the specified endpoint with a request body and custom headers.
     *
     * @param endpoint The URL endpoint to send the PUT request to.
     * @param requestBody The request body to include in the PUT request.
     * @param headers Custom headers to include in the request (can be null if no custom headers are needed).
     * @param basePath The base path of the PUT call (can be an empty string if not required).
     * @return A Response object representing the server's response to the request.
     */

    Response put(String endpoint, Object requestBody, Map<String, String> headers, String basePath) throws Exception;

    /**
     * Sends a DELETE request to the specified endpoint.
     *
     * @param endpoint The URL endpoint to send the DELETE request to.
     * @param basePath The base path of the DELETE call (can be an empty string if not required).
     * @return A Response object representing the server's response to the request.
     */

    Response delete(String endpoint, String basePath) throws Exception;

    /**
     * Sends an UPDATE request to the specified endpoint with a request body.
     *
     * @param endpoint The URL endpoint to send the UPDATE request to.
     * @param requestBody The request body to include in the UPDATE request.
     * @return A Response object representing the server's response to the request.
     */

    Response update(String endpoint, Object requestBody) throws Exception;

    /**
     * Sends a PATCH request to the specified endpoint with a request body.
     *
     * @param endpoint The URL endpoint to send the PATCH request to.
     * @param requestBody The request body to include in the PATCH request.
     * @return A Response object representing the server's response to the request.
     */

    Response patch(String endpoint, Object requestBody) throws Exception;

    /**
     * Sends a HEAD request to the specified endpoint.
     *
     * @param endpoint The URL endpoint to send the HEAD request to.
     * @return A Response object representing the server's response to the request.
     */

    Response head(String endpoint) throws Exception;
}
