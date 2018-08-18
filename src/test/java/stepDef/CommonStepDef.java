package stepDef;



import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
 
public class CommonStepDef {

	public RequestSpecification request = SerenityRest.rest();
	public static Response response;

@Given("^I send sample get request$")
public void i_send_sample_get_request() {
	
	response=request.get("https://jsonplaceholder.typicode.com/posts/5");
   
}

@Then("^I validate status code to be \"([^\"]*)\"$")
public void i_validate_status_code(int statusCode) {
	
	response.then().statusCode(statusCode);
   
}

}
