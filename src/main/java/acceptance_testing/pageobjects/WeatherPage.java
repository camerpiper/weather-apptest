package acceptance_testing.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeatherPage {

    @FindBy(xpath = "//div[@data-test='error']")   
    private WebElement errorText;
	
    @FindBy(xpath = "//input[@id='city']")   
    private WebElement fiveDayWeatherForecastFor;
    
	// Day 1

	@FindBy(xpath = "//div[@class='summary'][0]")
	private WebElement summary1;
	
	@FindBy(xpath = "//span[@data-test='day-1']")
	private WebElement summaryDay1;
	
	@FindBy(xpath = "//span[@data-test='date-1']")
	private WebElement summaryDate1;
	
	@FindBy(xpath = "//*[name()='svg']")
	private WebElement summaryDescription1;	
	
	@FindBy(xpath = "//span[@data-test='maximum-1']")
	private WebElement summaryMaximum1;	
	
	@FindBy(xpath = "//span[@data-test='minimum-1']")
	private WebElement summaryMinimum1;
	
	@FindBy(xpath = "//span[@data-test='speed-1']")
	private WebElement summarySpeed1;
	
	@FindBy(xpath = "//span[@data-test='direction-1']/*[name()='svg']")
	private WebElement summaryDirection1;
	
	@FindBy(xpath = "//span[@data-test='rainfall-1']")
	private WebElement summaryRainfall1;
	
	@FindBy(xpath = "//span[@data-test='pressure-1']")
	private WebElement summaryPressure1;	
	
	@FindBy(xpath = "//span[@data-test='hour-1-1']")
	private WebElement detailsDay1Hour1;
	
	@FindBy(xpath = "//div[@class='details']//*[name()='svg']")
	private WebElement detailsDay1Description1;	
	
	@FindBy(xpath = "//span[@data-test='maximum-1-1']")
	private WebElement detailsDay1Maximum1;	
	
	@FindBy(xpath = "//span[@data-test='minimum-1-1']")
	private WebElement detailsDay1Minimum1;	
	
	@FindBy(xpath = "//span[@data-test='speed-1-1']")
	private WebElement detailsDay1Speed1;	
	
	@FindBy(xpath = "//span[@data-test='direction-1-1']/*[name()='svg']")
	private WebElement detailsDay1Direction1;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-1-1']")
	private WebElement detailsDay1Rainfall1;	
	
	@FindBy(xpath = "//span[@data-test='pressure-1-1']")
	private WebElement detailsDay1Pressure1;	

	@FindBy(xpath = "//span[@data-test='hour-1-2']")
	private WebElement detailsDay1Hour2;
	
	@FindBy(xpath = "//svg[@data-test='description-1-2']")
	private WebElement detailsDay1Description2;	
	
	@FindBy(xpath = "//span[@data-test='maximum-1-2']")
	private WebElement detailsDay1Maximum2;	
	
	@FindBy(xpath = "//span[@data-test='minimum-1-2']")
	private WebElement detailsDay1Minimum2;	
	
	@FindBy(xpath = "//span[@data-test='speed-1-2']")
	private WebElement detailsDay1Speed2;	
	
	@FindBy(xpath = "//span[@data-test='direction-1-2']")
	private WebElement detailsDay1Direction2;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-1-2']")
	private WebElement detailsDay1Rainfall2;	
	
	@FindBy(xpath = "//span[@data-test='pressure-1-2']")
	private WebElement detailsDay1Pressure2;
	
	@FindBy(xpath = "//span[@data-test='hour-1-3']")
	private WebElement detailsDay1Hour3;
	
	@FindBy(xpath = "//svg[@data-test='description-1-3']")
	private WebElement detailsDay1Description3;	
	
	@FindBy(xpath = "//span[@data-test='maximum-1-3']")
	private WebElement detailsDay1Maximum3;	
	
	@FindBy(xpath = "//span[@data-test='minimum-1-3']")
	private WebElement detailsDay1Minimum3;	
	
	@FindBy(xpath = "//span[@data-test='speed-1-3']")
	private WebElement detailsDay1Speed3;	
	
	@FindBy(xpath = "//span[@data-test='direction-1-3']")
	private WebElement detailsDay1Direction3;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-1-3']")
	private WebElement detailsDay1Rainfall3;	
	
	@FindBy(xpath = "//span[@data-test='pressure-1-3']")
	private WebElement detailsDay1Pressure;	

	@FindBy(xpath = "//span[@data-test='hour-1-4']")
	private WebElement detailsDay1Hour4;
	
	@FindBy(xpath = "//svg[@data-test='description-1-4']")
	private WebElement detailsDay1Description4;	
	
	@FindBy(xpath = "//span[@data-test='maximum-1-4']")
	private WebElement detailsDay1Maximum4;	
	
	@FindBy(xpath = "//span[@data-test='minimum-1-4']")
	private WebElement detailsDay1Minimum4;	
	
	@FindBy(xpath = "//span[@data-test='speed-1-4']")
	private WebElement detailsDay1Speed4;	
	
	@FindBy(xpath = "//span[@data-test='direction-1-4']")
	private WebElement detailsDay1Direction4;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-1-4']")
	private WebElement detailsDay1Rainfall4;	
	
	@FindBy(xpath = "//span[@data-test='pressure-1-4']")	
	private WebElement detailsDay1Pressure4;
	
	// Day 2
	
	@FindBy(xpath = "//span[@data-test='day-2']")
	private WebElement summaryDay2;
	
	@FindBy(xpath = "//span[@data-test='date-2']")
	private WebElement summaryDate2;
	
	@FindBy(xpath = "//svg[@data-test='description-2']")
	private WebElement summaryDescription2;		
	
	@FindBy(xpath = "//span[@data-test='maximum-2']")
	private WebElement summaryMaximum2;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2']")
	private WebElement summaryMinimum2;
	
	@FindBy(xpath = "//span[@data-test='speed-2']")
	private WebElement summarySpeed2;
	
	@FindBy(xpath = "//span[@data-test='direction-2']")
	private WebElement summaryDirection2;
	
	@FindBy(xpath = "//span[@data-test='rainfall-2']")
	private WebElement summaryRainfall2;
	
	@FindBy(xpath = "//span[@data-test='pressure-2']")
	private WebElement summaryPressure2;	
	
	@FindBy(xpath = "//span[@data-test='hour-2-1']")
	private WebElement detailsDay2Hour1;
	
	@FindBy(xpath = "//svg[@data-test='description-2-1']")
	private WebElement detailsDay2Description1;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-1']")
	private WebElement detailsDay2Maximum1;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-1']")
	private WebElement detailsDay2Minimum1;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-1']")
	private WebElement detailsDay2Speed1;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-1']")
	private WebElement detailsDay2Direction1;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-1']")
	private WebElement detailsDay2Rainfall1;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-1']")
	private WebElement detailsDay2Pressure1;	

	@FindBy(xpath = "//span[@data-test='hour-2-2']")
	private WebElement detailsDay2Hour2;
	
	@FindBy(xpath = "//svg[@data-test='description-2-2']")
	private WebElement detailsDay2Description2;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-2']")
	private WebElement detailsDay2Maximum2;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-2']")
	private WebElement detailsDay2Minimum2;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-2']")
	private WebElement detailsDay2Speed2;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-2']")
	private WebElement detailsDay2Direction2;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-2']")
	private WebElement detailsDay2Rainfall2;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-2']")
	private WebElement detailsDay2Pressure2;
	
	@FindBy(xpath = "//span[@data-test='hour-2-3']")
	private WebElement detailsDay2Hour3;
	
	@FindBy(xpath = "//svg[@data-test='description-2-3']")
	private WebElement detailsDay2Description3;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-3']")
	private WebElement detailsDay2Maximum3;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-3']")
	private WebElement detailsDay2Minimum3;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-3']")
	private WebElement detailsDay2Speed3;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-3']")
	private WebElement detailsDay2Direction3;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-3']")
	private WebElement detailsDay2Rainfall3;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-3']")
	private WebElement detailsDay2Pressure;	

	@FindBy(xpath = "//span[@data-test='hour-2-4']")
	private WebElement detailsDay2Hour4;
	
	@FindBy(xpath = "//svg[@data-test='description-2-4']")
	private WebElement detailsDay2Description4;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-4']")
	private WebElement detailsDay2Maximum4;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-4']")
	private WebElement detailsDay2Minimum4;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-4']")
	private WebElement detailsDay2Speed4;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-4']")
	private WebElement detailsDay2Direction4;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-4']")
	private WebElement detailsDay2Rainfall4;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-4']")	
	private WebElement detailsDay2Pressure4;
	
	@FindBy(xpath = "//span[@data-test='hour-2-5']")
	private WebElement detailsDay2Hour5;
	
	@FindBy(xpath = "//svg[@data-test='description-2-5']")
	private WebElement detailsDay2Description5;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-5']")
	private WebElement detailsDay2Maximum5;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-5']")
	private WebElement detailsDay2Minimum5;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-5']")
	private WebElement detailsDay2Speed5;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-5']")
	private WebElement detailsDay2Direction5;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-5']")
	private WebElement detailsDay2Rainfall5;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-5']")
	private WebElement detailsDay2Pressure5;	

	@FindBy(xpath = "//span[@data-test='hour-2-6']")
	private WebElement detailsDay2Hour6;
	
	@FindBy(xpath = "//svg[@data-test='description-2-6']")
	private WebElement detailsDay2Description6;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-6']")
	private WebElement detailsDay2Maximum6;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-6']")
	private WebElement detailsDay2Minimum6;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-6']")
	private WebElement detailsDay2Speed6;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-6']")
	private WebElement detailsDay2Direction6;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-6']")
	private WebElement detailsDay2Rainfall6;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-6']")	
	private WebElement detailsDay2Pressure6;
	
	@FindBy(xpath = "//span[@data-test='hour-2-7']")
	private WebElement detailsDay2Hour7;
	
	@FindBy(xpath = "//svg[@data-test='description-2-7']")
	private WebElement detailsDay2Description7;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-7']")
	private WebElement detailsDay2Maximum7;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-7']")
	private WebElement detailsDay2Minimum7;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-7']")
	private WebElement detailsDay2Speed7;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-7']")
	private WebElement detailsDay2Direction7;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-7']")
	private WebElement detailsDay2Rainfall7;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-7']")
	private WebElement detailsDay2Pressure7;	

	@FindBy(xpath = "//span[@data-test='hour-2-8']")
	private WebElement detailsDay2Hour8;
	
	@FindBy(xpath = "//svg[@data-test='description-2-8']")
	private WebElement detailsDay2Description8;	
	
	@FindBy(xpath = "//span[@data-test='maximum-2-8']")
	private WebElement detailsDay2Maximum8;	
	
	@FindBy(xpath = "//span[@data-test='minimum-2-8']")
	private WebElement detailsDay2Minimum8;	
	
	@FindBy(xpath = "//span[@data-test='speed-2-8']")
	private WebElement detailsDay2Speed8;	
	
	@FindBy(xpath = "//span[@data-test='direction-2-8']")
	private WebElement detailsDay2Direction8;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-2-8']")
	private WebElement detailsDay2Rainfall8;	
	
	@FindBy(xpath = "//span[@data-test='pressure-2-8']")	
	private WebElement detailsDay2Pressure8;	
	
	// Day 3
	
	@FindBy(xpath = "//span[@data-test='day-3']")
	private WebElement summaryDay3;
	
	@FindBy(xpath = "//span[@data-test='date-3']")
	private WebElement summaryDate3;
	
	@FindBy(xpath = "//svg[@data-test='description-3']")
	private WebElement summaryDescription3;		
	
	@FindBy(xpath = "//span[@data-test='maximum-3']")
	private WebElement summaryMaximum3;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3']")
	private WebElement summaryMinimum3;
	
	@FindBy(xpath = "//span[@data-test='speed-3']")
	private WebElement summarySpeed3;
	
	@FindBy(xpath = "//span[@data-test='direction-3']")
	private WebElement summaryDirection3;
	
	@FindBy(xpath = "//span[@data-test='rainfall-3']")
	private WebElement summaryRainfall3;
	
	@FindBy(xpath = "//span[@data-test='pressure-3']")
	private WebElement summaryPressure3;	
	
	@FindBy(xpath = "//span[@data-test='hour-3-1']")
	private WebElement detailsDay3Hour1;
	
	@FindBy(xpath = "//svg[@data-test='description-3-1']")
	private WebElement detailsDay3Description1;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-1']")
	private WebElement detailsDay3Maximum1;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-1']")
	private WebElement detailsDay3Minimum1;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-1']")
	private WebElement detailsDay3Speed1;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-1']")
	private WebElement detailsDay3Direction1;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-1']")
	private WebElement detailsDay3Rainfall1;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-1']")
	private WebElement detailsDay3Pressure1;	

	@FindBy(xpath = "//span[@data-test='hour-3-2']")
	private WebElement detailsDay3Hour2;
	
	@FindBy(xpath = "//svg[@data-test='description-3-2']")
	private WebElement detailsDay3Description2;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-2']")
	private WebElement detailsDay3Maximum2;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-2']")
	private WebElement detailsDay3Minimum2;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-2']")
	private WebElement detailsDay3Speed2;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-2']")
	private WebElement detailsDay3Direction2;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-2']")
	private WebElement detailsDay3Rainfall2;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-2']")	
	private WebElement detailsDay3Pressure2;
	
	@FindBy(xpath = "//span[@data-test='hour-3-3']")
	private WebElement detailsDay3Hour3;
	
	@FindBy(xpath = "//svg[@data-test='description-3-3']")
	private WebElement detailsDay3Description3;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-3']")
	private WebElement detailsDay3Maximum3;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-3']")
	private WebElement detailsDay3Minimum3;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-3']")
	private WebElement detailsDay3Speed3;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-3']")
	private WebElement detailsDay3Direction3;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-3']")
	private WebElement detailsDay3Rainfall3;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-3']")
	private WebElement detailsDay3Pressure;	

	@FindBy(xpath = "//span[@data-test='hour-3-4']")
	private WebElement detailsDay3Hour4;
	
	@FindBy(xpath = "//svg[@data-test='description-3-4']")
	private WebElement detailsDay3Description4;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-4']")
	private WebElement detailsDay3Maximum4;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-4']")
	private WebElement detailsDay3Minimum4;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-4']")
	private WebElement detailsDay3Speed4;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-4']")
	private WebElement detailsDay3Direction4;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-4']")
	private WebElement detailsDay3Rainfall4;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-4']")	
	private WebElement detailsDay3Pressure4;
	
	@FindBy(xpath = "//span[@data-test='hour-3-5']")
	private WebElement detailsDay3Hour5;
	
	@FindBy(xpath = "//svg[@data-test='description-3-5']")
	private WebElement detailsDay3Description5;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-5']")
	private WebElement detailsDay3Maximum5;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-5']")
	private WebElement detailsDay3Minimum5;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-5']")
	private WebElement detailsDay3Speed5;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-5']")
	private WebElement detailsDay3Direction5;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-5']")
	private WebElement detailsDay3Rainfall5;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-5']")
	private WebElement detailsDay3Pressure5;	

	@FindBy(xpath = "//span[@data-test='hour-3-6']")
	private WebElement detailsDay3Hour6;
	
	@FindBy(xpath = "//svg[@data-test='description-3-6']")
	private WebElement detailsDay3Description6;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-6']")
	private WebElement detailsDay3Maximum6;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-6']")
	private WebElement detailsDay3Minimum6;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-6']")
	private WebElement detailsDay3Speed6;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-6']")
	private WebElement detailsDay3Direction6;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-6']")
	private WebElement detailsDay3Rainfall6;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-6']")	
	private WebElement detailsDay3Pressure6;
	
	@FindBy(xpath = "//span[@data-test='hour-3-7']")
	private WebElement detailsDay3Hour7;
	
	@FindBy(xpath = "//svg[@data-test='description-3-7']")
	private WebElement detailsDay3Description7;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-7']")
	private WebElement detailsDay3Maximum7;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-7']")
	private WebElement detailsDay3Minimum7;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-7']")
	private WebElement detailsDay3Speed7;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-7']")
	private WebElement detailsDay3Direction7;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-7']")
	private WebElement detailsDay3Rainfall7;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-7']")
	private WebElement detailsDay3Pressure7;	

	@FindBy(xpath = "//span[@data-test='hour-3-8']")
	private WebElement detailsDay3Hour8;
	
	@FindBy(xpath = "//svg[@data-test='description-3-8']")
	private WebElement detailsDay3Description8;	
	
	@FindBy(xpath = "//span[@data-test='maximum-3-8']")
	private WebElement detailsDay3Maximum8;	
	
	@FindBy(xpath = "//span[@data-test='minimum-3-8']")
	private WebElement detailsDay3Minimum8;	
	
	@FindBy(xpath = "//span[@data-test='speed-3-8']")
	private WebElement detailsDay3Speed8;	
	
	@FindBy(xpath = "//span[@data-test='direction-3-8']")
	private WebElement detailsDay3Direction8;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-3-8']")
	private WebElement detailsDay3Rainfall8;	
	
	@FindBy(xpath = "//span[@data-test='pressure-3-8']")	
	private WebElement detailsDay3Pressure8;	
	
	// Day 4
	
	@FindBy(xpath = "//span[@data-test='day-4']")
	private WebElement summaryDay4;
	
	@FindBy(xpath = "//span[@data-test='date-4']")
	private WebElement summaryDate4;
	
	@FindBy(xpath = "//svg[@data-test='description-4']")
	private WebElement summaryDescription4;		
	
	@FindBy(xpath = "//span[@data-test='maximum-4']")
	private WebElement summaryMaximum4;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4']")
	private WebElement summaryMinimum4;
	
	@FindBy(xpath = "//span[@data-test='speed-4']")
	private WebElement summarySpeed4;
	
	@FindBy(xpath = "//span[@data-test='direction-4']")
	private WebElement summaryDirection4;
	
	@FindBy(xpath = "//span[@data-test='rainfall-4']")
	private WebElement summaryRainfall4;
	
	@FindBy(xpath = "//span[@data-test='pressure-4']")
	private WebElement summaryPressure4;	
	
	@FindBy(xpath = "//span[@data-test='hour-4-1']")
	private WebElement detailsDay4Hour1;
	
	@FindBy(xpath = "//svg[@data-test='description-4-1']")
	private WebElement detailsDay4Description1;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-1']")
	private WebElement detailsDay4Maximum1;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-1']")
	private WebElement detailsDay4Minimum1;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-1']")
	private WebElement detailsDay4Speed1;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-1']")
	private WebElement detailsDay4Direction1;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-1']")
	private WebElement detailsDay4Rainfall1;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-1']")
	private WebElement detailsDay4Pressure1;	

	@FindBy(xpath = "//span[@data-test='hour-4-2']")
	private WebElement detailsDay4Hour2;
	
	@FindBy(xpath = "//svg[@data-test='description-4-2']")
	private WebElement detailsDay4Description2;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-2']")
	private WebElement detailsDay4Maximum2;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-2']")
	private WebElement detailsDay4Minimum2;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-2']")
	private WebElement detailsDay4Speed2;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-2']")
	private WebElement detailsDay4Direction2;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-2']")
	private WebElement detailsDay4Rainfall2;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-2']")	
	private WebElement detailsDay4Pressure2;
	
	@FindBy(xpath = "//span[@data-test='hour-4-3']")
	private WebElement detailsDay4Hour3;
	
	@FindBy(xpath = "//svg[@data-test='description-4-3']")
	private WebElement detailsDay4Description3;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-3']")
	private WebElement detailsDay4Maximum3;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-3']")
	private WebElement detailsDay4Minimum3;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-3']")
	private WebElement detailsDay4Speed3;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-3']")
	private WebElement detailsDay4Direction3;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-3']")
	private WebElement detailsDay4Rainfall3;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-3']")
	private WebElement detailsDay4Pressure;	

	@FindBy(xpath = "//span[@data-test='hour-4-4']")
	private WebElement detailsDay4Hour4;
	
	@FindBy(xpath = "//svg[@data-test='description-4-4']")
	private WebElement detailsDay4Description4;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-4']")
	private WebElement detailsDay4Maximum4;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-4']")
	private WebElement detailsDay4Minimum4;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-4']")
	private WebElement detailsDay4Speed4;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-4']")
	private WebElement detailsDay4Direction4;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-4']")
	private WebElement detailsDay4Rainfall4;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-4']")	
	private WebElement detailsDay4Pressure4;
	
	@FindBy(xpath = "//span[@data-test='hour-4-5']")
	private WebElement detailsDay4Hour5;
	
	@FindBy(xpath = "//svg[@data-test='description-4-5']")
	private WebElement detailsDay4Description5;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-5']")
	private WebElement detailsDay4Maximum5;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-5']")
	private WebElement detailsDay4Minimum5;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-5']")
	private WebElement detailsDay4Speed5;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-5']")
	private WebElement detailsDay4Direction5;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-5']")
	private WebElement detailsDay4Rainfall5;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-5']")
	private WebElement detailsDay4Pressure5;	

	@FindBy(xpath = "//span[@data-test='hour-4-6']")
	private WebElement detailsDay4Hour6;
	
	@FindBy(xpath = "//svg[@data-test='description-4-6']")
	private WebElement detailsDay4Description6;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-6']")
	private WebElement detailsDay4Maximum6;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-6']")
	private WebElement detailsDay4Minimum6;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-6']")
	private WebElement detailsDay4Speed6;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-6']")
	private WebElement detailsDay4Direction6;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-6']")
	private WebElement detailsDay4Rainfall6;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-6']")	
	private WebElement detailsDay4Pressure6;
	
	@FindBy(xpath = "//span[@data-test='hour-4-7']")
	private WebElement detailsDay4Hour7;
	
	@FindBy(xpath = "//svg[@data-test='description-4-7']")
	private WebElement detailsDay4Description7;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-7']")
	private WebElement detailsDay4Maximum7;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-7']")
	private WebElement detailsDay4Minimum7;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-7']")
	private WebElement detailsDay4Speed7;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-7']")
	private WebElement detailsDay4Direction7;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-7']")
	private WebElement detailsDay4Rainfall7;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-7']")
	private WebElement detailsDay4Pressure7;	

	@FindBy(xpath = "//span[@data-test='hour-4-8']")
	private WebElement detailsDay4Hour8;
	
	@FindBy(xpath = "//svg[@data-test='description-4-8']")
	private WebElement detailsDay4Description8;	
	
	@FindBy(xpath = "//span[@data-test='maximum-4-8']")
	private WebElement detailsDay4Maximum8;	
	
	@FindBy(xpath = "//span[@data-test='minimum-4-8']")
	private WebElement detailsDay4Minimum8;	
	
	@FindBy(xpath = "//span[@data-test='speed-4-8']")
	private WebElement detailsDay4Speed8;	
	
	@FindBy(xpath = "//span[@data-test='direction-4-8']")
	private WebElement detailsDay4Direction8;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-4-8']")
	private WebElement detailsDay4Rainfall8;	
	
	@FindBy(xpath = "//span[@data-test='pressure-4-8']")	
	private WebElement detailsDay4Pressure8;	
	
	// Day 5
	
	@FindBy(xpath = "//span[@data-test='day-5']")
	private WebElement summaryDay5;
	
	@FindBy(xpath = "//span[@data-test='date-5']")
	private WebElement summaryDate5;
	
	@FindBy(xpath = "//svg[@data-test='description-5']")
	private WebElement summaryDescription5;		
	
	@FindBy(xpath = "//span[@data-test='maximum-5']")
	private WebElement summaryMaximum5;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5']")
	private WebElement summaryMinimum5;
	
	@FindBy(xpath = "//span[@data-test='speed-5']")
	private WebElement summarySpeed5;
	
	@FindBy(xpath = "//span[@data-test='direction-5']")
	private WebElement summaryDirection5;
	
	@FindBy(xpath = "//span[@data-test='rainfall-5']")
	private WebElement summaryRainfall5;
	
	@FindBy(xpath = "//span[@data-test='pressure5']")
	private WebElement summaryPressure5;	
	
	@FindBy(xpath = "//span[@data-test='hour-5-1']")
	private WebElement detailsDay5Hour1;
	
	@FindBy(xpath = "//svg[@data-test='description-5-1']")
	private WebElement detailsDay5Description1;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-1']")
	private WebElement detailsDay5Maximum1;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-1']")
	private WebElement detailsDay5Minimum1;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-1']")
	private WebElement detailsDay5Speed1;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-1']")
	private WebElement detailsDay5Direction1;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-1']")
	private WebElement detailsDay5Rainfall1;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-1']")
	private WebElement detailsDay5Pressure1;	

	@FindBy(xpath = "//span[@data-test='hour-5-2']")
	private WebElement detailsDay5Hour2;
	
	@FindBy(xpath = "//svg[@data-test='description-5-2']")
	private WebElement detailsDay5Description2;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-2']")
	private WebElement detailsDay5Maximum2;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-2']")
	private WebElement detailsDay5Minimum2;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-2']")
	private WebElement detailsDay5Speed2;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-2']")
	private WebElement detailsDay5Direction2;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-2']")
	private WebElement detailsDay5Rainfall2;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-2']")	
	private WebElement detailsDay5Pressure2;
	
	@FindBy(xpath = "//span[@data-test='hour-5-3']")
	private WebElement detailsDay5Hour3;
	
	@FindBy(xpath = "//svg[@data-test='description-5-3']")
	private WebElement detailsDay5Description3;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-3']")
	private WebElement detailsDay5Maximum3;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-3']")
	private WebElement detailsDay5Minimum3;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-3']")
	private WebElement detailsDay5Speed3;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-3']")
	private WebElement detailsDay5Direction3;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-3']")
	private WebElement detailsDay5Rainfall3;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-3']")
	private WebElement detailsDay5Pressure;	

	@FindBy(xpath = "//span[@data-test='hour-5-4']")
	private WebElement detailsDay5Hour4;
	
	@FindBy(xpath = "//svg[@data-test='description-5-4']")
	private WebElement detailsDay5Description4;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-4']")
	private WebElement detailsDay5Maximum4;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-4']")
	private WebElement detailsDay5Minimum4;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-4']")
	private WebElement detailsDay5Speed4;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-4']")
	private WebElement detailsDay5Direction4;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-4']")
	private WebElement detailsDay5Rainfall4;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-4']")	
	private WebElement detailsDay5Pressure4;
	
	@FindBy(xpath = "//span[@data-test='hour-5-5']")
	private WebElement detailsDay5Hour5;
	
	@FindBy(xpath = "//svg[@data-test='description-5-5']")
	private WebElement detailsDay5Description5;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-5']")
	private WebElement detailsDay5Maximum5;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-5']")
	private WebElement detailsDay5Minimum5;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-5']")
	private WebElement detailsDay5Speed5;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-5']")
	private WebElement detailsDay5Direction5;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-5']")
	private WebElement detailsDay5Rainfall5;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-5']")
	private WebElement detailsDay5Pressure5;	

	@FindBy(xpath = "//span[@data-test='hour-5-6']")
	private WebElement detailsDay5Hour6;
	
	@FindBy(xpath = "//svg[@data-test='description-5-6']")
	private WebElement detailsDay5Description6;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-6']")
	private WebElement detailsDay5Maximum6;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-6']")
	private WebElement detailsDay5Minimum6;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-6']")
	private WebElement detailsDay5Speed6;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-6']")
	private WebElement detailsDay5Direction6;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-6']")
	private WebElement detailsDay5Rainfall6;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-6']")	
	private WebElement detailsDay5Pressure6;
	
	@FindBy(xpath = "//span[@data-test='hour-5-7']")
	private WebElement detailsDay5Hour7;
	
	@FindBy(xpath = "//svg[@data-test='description-5-7']")
	private WebElement detailsDay5Description7;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-7']")
	private WebElement detailsDay5Maximum7;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-7']")
	private WebElement detailsDay5Minimum7;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-7']")
	private WebElement detailsDay5Speed7;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-7']")
	private WebElement detailsDay5Direction7;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-7']")
	private WebElement detailsDay5Rainfall7;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-7']")
	private WebElement detailsDay5Pressure7;	

	@FindBy(xpath = "//span[@data-test='hour-5-8']")
	private WebElement detailsDayHour8;
	
	@FindBy(xpath = "//svg[@data-test='description-5-8']")
	private WebElement detailsDay5Description8;	
	
	@FindBy(xpath = "//span[@data-test='maximum-5-8']")
	private WebElement detailsDay5Maximum8;	
	
	@FindBy(xpath = "//span[@data-test='minimum-5-8']")
	private WebElement detailsDay5Minimum8;	
	
	@FindBy(xpath = "//span[@data-test='speed-5-8']")
	private WebElement detailsDay5Speed8;	
	
	@FindBy(xpath = "//span[@data-test='direction-5-8']")
	private WebElement detailsDay5Direction8;	
	
	@FindBy(xpath = "//span[@data-test='rainfall-5-8']")
	private WebElement detailsDay5Rainfall8;	
	
	@FindBy(xpath = "//span[@data-test='pressure-5-8']")	
	private WebElement detailsDay5Pressure8;
	
	
    private WebDriver driver;
    private int timeout = 15;
    private final String pageLoadedText = "Five Day Weather Forecast for";
    
      
    public WeatherPage() {
    }

    public WeatherPage(WebDriver driver) {
        this.driver = driver;
        
    }
    
    public void showOrHideSummary1(){
    	summaryDay1.click();
    }
    public String getSummaryDay1(){
    	return summaryDay1.getText();
    }
    
    public String getSummaryDate1(){
    	return summaryDate1.getText();
    }
    
    public String getSummaryDescription1(){
    	return summaryDescription1.getAttribute("aria-label");
    }
    
    public String getSummaryMaximum1(){
    	return summaryMaximum1.getText();
    }
    
    public String getSummaryMinimum1(){
    	return summaryMinimum1.getText();
    }
    
    public String getSummarySpeed1(){
    	return summarySpeed1.getText();
    }
    
    public String getSummaryDirection1(){
    	String dir = summaryDirection1.getAttribute("style");
    	return dir.substring(dir.indexOf("rotate"), dir.length() - 1);
    }
    
    public String getSummaryRainfall1(){
    	return summaryRainfall1.getText();
    }
    
    public String getSummaryPressure1(){
    	return summaryPressure1.getText();
    }
    
    public String getDetailsDay1Hour1(){
    	return detailsDay1Hour1.getText();
    }
    
    public String getDetailsDay1Description1(){
    	return detailsDay1Description1.getAttribute("aria-label");
    }
    
    public String getDetailsDay1Maximum1(){
    	return detailsDay1Maximum1.getText();
    }
    
    public String getDetailsDay1Maximum2(){
    	return detailsDay1Maximum2.getText();
    }
    
    public String getDetailsDay1Maximum3(){
    	return detailsDay1Maximum3.getText();
    }
    
    public String getDetailsDay1Maximum4(){
    	return detailsDay1Maximum4.getText();
    }
    
    public String getDetailsDay1Minimum1(){
    	return detailsDay1Minimum1.getText();
    }
    
    public String getDetailsDay1Minimum2(){
    	return detailsDay1Minimum2.getText();
    }
    
    public String getDetailsDay1Minimum3(){
    	return detailsDay1Minimum3.getText();
    }
    
    public String getDetailsDay1Minimum4(){
    	return detailsDay1Minimum4.getText();
    }
    
    public String getDetailsDay1Speed1(){
    	return detailsDay1Speed1.getText();
    }
    
    public String getDetailsDay1Direction1(){
    	String dir = detailsDay1Direction1.getAttribute("style");
    	return dir.substring(dir.indexOf("rotate"), dir.length() - 1);
    }
    
    public String getDetailsDay1Rainfall1(){
    	return detailsDay1Rainfall1.getText();
    }
    
    public String getDetailsDay1Rainfall2(){
    	return detailsDay1Rainfall2.getText();
    }
    
    public String getDetailsDay1Rainfall3(){
    	return detailsDay1Rainfall3.getText();
    }
    
    public String getDetailsDay1Rainfall4(){
    	return detailsDay1Rainfall4.getText();
    }
    
    public String getDetailsDay1Pressure1(){
    	return detailsDay1Pressure1.getText();
    }


    /**
     * Set value to Five Day Weather Forecast For Text field.
     *
     * @return the WeatherPage class instance.
     */
    public String getFiveDayWeatherForecastForTextField() {
       return fiveDayWeatherForecastFor.getAttribute("value");
    }
    
    public String getDetailsDay1Attributes() {
    	WebElement dets = driver.findElement(By.xpath("//div[@class='details'][1]"));
        return dets.getAttribute("style");
     }

    /**
     * @ret.
     */    
    public void setCity(String cityIn){
    	fiveDayWeatherForecastFor.clear();
    	fiveDayWeatherForecastFor.sendKeys(cityIn, Keys.ENTER);
    }
 
    /**
     * @return the error message.
     */    
    public String getErrorText(){
    	return errorText.getText();
    }
    

    /**
     * Verify that the page loaded completely.
     *
     * @return the WeatherPage class instance.
     */
    public WeatherPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }
       
}
