package javaBasicsBrushUp;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		//created a object for JSON Parser
		JSONParser parserObj = new JSONParser();
		//created a object for file
		FileReader readObj = new FileReader("./jsonFiles/restfulAuthReqBody.json");
		//pass the jsonRead file to the parser object
		Object parse = parserObj.parse(readObj);
		
		// we are type casting the JSONObject, since initally Parse is an Object where we are trying to assign it back to an JSONObject. So we are trying to convert it as and JSONObject by typecasting
		JSONObject jsonResponse = (JSONObject) parse;
		
		String userNameValue = (String) jsonResponse.get("username");
		String passwordValue = (String) jsonResponse.get("password");
		
		System.out.println("The value of the json username is :"+userNameValue);
		System.out.println("The value of the json username is :"+passwordValue);

	}
}
