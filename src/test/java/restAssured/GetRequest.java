package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		Response response=request.get("/api/users?page=2");
		int code=response.getStatusCode();
		System.out.println("Status code :-"+code);
		String res=response.asString();
		System.out.println("Responce :-"+res);		
		
	}
	
	
}
