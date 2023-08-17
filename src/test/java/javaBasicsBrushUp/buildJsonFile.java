package javaBasicsBrushUp;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class buildJsonFile {
	/*
	 * JSON stands for JavaScript Object Notation. JSON file contains,JSON Objects
	 * with .json file extension.
	 * 
	 * 
	 * Our browser is the point of contact, to make the request to the server,
	 * receive the response from the server, process the response and render it to
	 * the user. A web server may be implemented with any programing language like
	 * Java, python etc. Our browser can understand Javascript. So there has to be a
	 * common, language-independent data transmission between a web application and
	 * a web server.
	 * 
	 * Why JSON? --------------------- 
	 * 1) JSON is a lightweight data-interchange format 
	 * 2) JSON is "self-describing" and easy to understand 
	 * 3) JSON is language independent
	 * 
	 * --------
	 * 
	 * Steps :
	 * 1. Download json simple dependency (org.json.simple.JSONObject)
	 * 2. Create an object for JSONObject
	 * 3. Use .put method to add the Key and Value 
	 * 4. Using FileWriter Class, create an object for FileWriter  
	 * 5. Pass the path of the file to be created for the Json file
	 * 6. use .write method to write the json file (the values created would be in a
	 * Object formate, so convert it into toJSONString()
	 * 7. finally .close and run the program. !!!
	 * 
	 * ------------------
	 * Happy coding !!!
	 * 
	 */

	public static void main(String[] args) throws IOException {

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("username", "admin");
		jsonObj.put("password", "password123");

		FileWriter fileWriter = new FileWriter("./jsonFiles/restfulAuthReqBody.json");

		fileWriter.write(jsonObj.toJSONString());

		fileWriter.close();
	}

}
