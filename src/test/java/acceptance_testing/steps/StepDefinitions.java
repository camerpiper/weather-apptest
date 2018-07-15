package acceptance_testing.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import acceptance_testing.pageobjects.WeatherPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver dr;
    WeatherPage hp;
        
    @Before
    public void beforeTest() {
    	System.setProperty("webdriver.chrome.driver", "src/test/resources/browserDrivers/chromedriver.exe");
        dr = new ChromeDriver();
        //dr.get("http://localhost:3000/");
        dr.get("https://weather-acceptance.herokuapp.com/");
    }

	
	@Given("^I am on the weather homepage$")
	public void i_am_on_the_weather_homepage(){
        hp = PageFactory.initElements(dr, WeatherPage.class);
        hp.verifyPageLoaded();
	}

	@When("^I enter \"([^\"]*)\" as the City$")
	public void i_enter_as_the_City(String city){
		hp.setCity(city);
	}

	@Then("^The 5 day forecast is displayed$")
	public void i_see_the_day_forecast() {
        assertTrue("Incorrect day displayed", hp.getSummaryDay1().equalsIgnoreCase("Tue"));
        hp.showOrHideSummary1();
        String day1TotRainfall = getTotalRainfall() + "mm";
        String day1MaxTemp = getMaxTemp() + "°";
        String day1MinTemp = getMinTemp() + "°"; 
        
        assertEquals("Wind directions different",hp.getSummaryDirection1(),hp.getDetailsDay1Direction1());
        assertEquals("Wind directions different",hp.getSummaryMaximum1(),day1MaxTemp);
        assertEquals("Wind directions different",hp.getSummaryMinimum1(),day1MinTemp);
        assertEquals("Wind directions different",hp.getSummaryDescription1(),hp.getDetailsDay1Description1());
        assertEquals("Wind directions different",hp.getSummarySpeed1(),hp.getDetailsDay1Speed1());
        assertEquals("Wind directions different",hp.getSummaryRainfall1(),day1TotRainfall);
        assertEquals("Wind directions different",hp.getSummaryPressure1(),hp.getDetailsDay1Pressure1());
	}
	
	@Then("^I see the error message displayed$")
	public void i_see_the_error_message_displayed() throws Throwable {
	    assertTrue("Error text incorrect or not displayed",hp.getErrorText().equalsIgnoreCase("Error retrieving the forecast"));
	}

	@When("^I expand a daily summary$")
	public void i_expand_a_daily_summary() {
		if (!isSummaryExpanded()){
			hp.showOrHideSummary1();
		}
	}

	@Then("^The (\\d+) hourly forecast is displayed$")
	public void the_hourly_forecast_is_displayed(int arg1) {
		assertTrue("Day details not visible",isSummaryExpanded());
	}

	@When("^I close a daily summary$")
	public void i_close_a_daily_summary() throws Throwable {
		if (isSummaryExpanded()){
			hp.showOrHideSummary1();
		}
		else if (!isSummaryExpanded()){
			hp.showOrHideSummary1();
			hp.showOrHideSummary1();
		}
	}

	@Then("^The (\\d+) hourly forecast is hidden$")
	public void the_hourly_forecast_is_hidden(int arg1) throws Throwable {
		assertFalse("Day details should not be visible but they are",isSummaryExpanded());
	}
	
	public int getMaxTemp(){
		int maxTemp = 0;
		String a = hp.getDetailsDay1Maximum1();
		String b = a.substring(0, a.indexOf("°"));
		String c = hp.getDetailsDay1Maximum2();
		String d = c.substring(0, c.indexOf("°"));
		String e = hp.getDetailsDay1Maximum3();
		String f = e.substring(0, e.indexOf("°"));
		String g = hp.getDetailsDay1Maximum4();
		String h = g.substring(0, g.indexOf("°"));
		int[] temps = {Integer.parseInt(b),Integer.parseInt(d),Integer.parseInt(f),Integer.parseInt(h)};
		for(int temp:temps){
			if (temp > maxTemp){
				maxTemp = temp;
			}
		}
		
		return maxTemp;
	}
	
	public int getMinTemp(){
		int minTemp = 100;
		String a = hp.getDetailsDay1Minimum1();
		String b = a.substring(0, a.indexOf("°"));
		String c = hp.getDetailsDay1Minimum2();
		String d = c.substring(0, c.indexOf("°"));
		String e = hp.getDetailsDay1Minimum3();
		String f = e.substring(0, e.indexOf("°"));
		String g = hp.getDetailsDay1Minimum4();
		String h = g.substring(0, g.indexOf("°"));
		int[] temps = {Integer.parseInt(b),Integer.parseInt(d),Integer.parseInt(f),Integer.parseInt(h)};
		for(int temp:temps){
			if (temp < minTemp){
				minTemp = temp;
			}
		}
		
		return minTemp;		
		
	}
	
	public int getTotalRainfall(){
		int totalRainfall = 0;
		String a = hp.getDetailsDay1Rainfall1();
		String b = a.substring(0, a.indexOf("m"));
		String c = hp.getDetailsDay1Rainfall2();
		String d = c.substring(0, c.indexOf("m"));
		String e = hp.getDetailsDay1Rainfall3();
		String f = e.substring(0, e.indexOf("m"));
		String g = hp.getDetailsDay1Rainfall4();
		String h = g.substring(0, g.indexOf("m"));
		int[] temps = {Integer.parseInt(b),Integer.parseInt(d),Integer.parseInt(f),Integer.parseInt(h)};
		for(int temp:temps){			
			totalRainfall = totalRainfall + temp;			
		}		
		return totalRainfall;			
	}
    
    public boolean isSummaryExpanded(){
		String atts = hp.getDetailsDay1Attributes();
		int size = Integer.parseInt(atts.substring(12, atts.indexOf("p")));
		if(size == 0){		
			return false;
		}
		else{
			return true;
		}
    }
    
    @After
    public void afterTest() {
        if (dr != null) {
            dr.quit();
        }
    }    
    
}
