package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://qa-ruleengine-v2-1.creditmantri.in";
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		String body="{\"productType\": \"GL\", \"inputs\": {\"loanAmount\": \"10000\",\"goldWeight\": \"1\",\r\n" + 
				" \"city\": \"Chennai\", \"dob\": \"11-07-1990\",\"gender\": \"Male\",\"residentialPincode\": \"521109\"},\r\n" + 
				"    \"leadId\": 4678532, \"userId\": 2679107,\r\n" + 
				"    \"products\": [\"DCB\", \"ICICI\", \"INDUSIND\", \"HDFC\"],\r\n" + 
				"    \"validationType\": \"full\"}";	
		request.body(body);
		Response response=request.post("/run/rules");
		int code=response.getStatusCode();
		System.out.println("Status code :-"+code);
		String res=response.asString();
		System.out.println("Responce :-"+res);
		System.out.println("Responce :-"+response.prettyPrint());	
		// Header named Content-Type
	    String contentType = response.header("Content-Type");
	    System.out.println("Content-Type value: " + contentType);
		Headers allHeaders = response.headers();		 
		 // Iterate over all the Headers
	    for(Header header : allHeaders)
		 {
		 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		 }
		

	}

}
