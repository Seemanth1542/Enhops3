
public class Sample {/*
	//public static void main(String[] args) {
		@Test
		public void webs() throws Exception {
		// Base url
		RestAssured.baseURI="https://uat.apollopharmacy.in";
		// given using for sending resources, parameters, request cookies
		RequestSpecification request=RestAssured.given();
		//Header authentication
		request.header("Authorization","Bearer 2o1kd4bjapqifpb27fy7tnbivu8bqo1d").
		// sending body with parameters. 1.>each " before use \. for java understand sting 2 > Each line start,end with " and ending with + because java can understand string concatenation
		body("{"+
		    "\"postalcode\":\"500008\","+
		   "\"skucategory\":["+
		   "{"+
		   "\"SKU\":\"FMCG\""+
		"}"+
		"]"+
		"}"+
		"");
		// request.header("Authorization","Bearer 2o1kd4bjapqifpb27fy7tnbivu8bqo1d").body("{\"postalcode\":\"500008\",\"skucategory\":[{\"SKU\":\"FMCG\"}]}");
		// header type
		request.header("Content-Type","application/json");
		// sending resource url with Post method along with request and return as response then assign to Response variable
		Response response=request.post("/pincode_api.php");
		// trying to get the status of the response API
		int code=response.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("CODE is"+code);
		// get the body of the response like: res:{"Availability":true,"catg":"FMCG"}
		System.out.println("res:"+response.getBody().asString());
		ResponseBody b=response.getBody();
		boolean s=response.getBody().asString().contains("\"catg\":\"FMCG\"");
		System.out.println("bol: "+s);

		// validate the response body using string parameter.By default response display raw data(extract body) then Response body assign in string

		String res=response.asString();
		System.out.println("response body: "+res); // response body: {"Availability":true,"catg":"FMCG"}
		// string parameter to convert agina JsonPath looks like convert string to json format
		JsonPath jp=new JsonPath(res);
		//here fetch the response body using key. get the parameter value form json path using key-value
		String pcode1=jp.getString("catg");
		System.out.println("catg : "+ pcode1); // catg : FMCG
		boolean pcode=jp.get("Availability");
		System.out.println("Availability : "+ pcode); // Availability : true
		}
		}

		API Approach 2: 
		public static void main(String[] args) {

		RestAssured.baseURI="https://uat.apollopharmacy.in";
		RequestSpecification request=RestAssured.given();
		given().
		header("Authorization","Bearer 2o1kd4bjapqifpb27fy7tnbivu8bqo1d").
		body("{"+
		"\"params\":SAL0020"+
		"}");

		request.header("Content-Type","application/json");
		Response response=request.post("/popcsrchprd_api.php");
		int code=response.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("CODE is"+code);


		API Approach 3: 
		@Test
		public void Meth() {
		RestAssured.baseURI="https://uat.apollopharmacy.in";
		given().
		header("Bearer","2o1kd4bjapqifpb27fy7tnbivu8bqo1d").
		body("{"+
		"\"params\":SAL0020"+
		"}").
		when().
		post("popcsrchss_api.php").
		then().assertThat().statusCode(200).contentType(ContentType.HTML).and().
		header("Server","Apache/2.4.18 (Ubuntu)");
		}*/
}
