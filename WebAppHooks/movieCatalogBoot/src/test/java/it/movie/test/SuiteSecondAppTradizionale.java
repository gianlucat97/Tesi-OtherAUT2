
//File risulta attualmente aggiornato per webdriver chrome headless!
package it.movie.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class SuiteSecondAppTradizionale {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/Tesi-OtherAUT2/Tesi-OtherAUT2/chromedriver_v94_linux64/chromedriver";
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  System.setProperty("webdriver.chrome.whitelistedIps", "");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void testSuiteSecondAppTradizionale_release_1_0() throws Exception {
    driver.get("http://localhost:8080/movie");
    driver.findElement(By.id("nome_film")).click();
    driver.findElement(By.id("nome_film")).clear();
    driver.findElement(By.id("nome_film")).sendKeys("Avatar");
    driver.findElement(By.id("nome_utente")).click();
    driver.findElement(By.id("nome_utente")).clear();
    driver.findElement(By.id("nome_utente")).sendKeys("Marco92");
    driver.findElement(By.id("valutazione")).click();
    driver.findElement(By.id("valutazione")).clear();
    driver.findElement(By.id("valutazione")).sendKeys("9");
    driver.findElement(By.name("sendMovieData")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[5]/following::a[1]")).click();
    driver.findElement(By.xpath("//form[@id='datiMovie']")).click();
    driver.findElement(By.id("valutazione")).clear();
    driver.findElement(By.id("valutazione")).sendKeys("10");
    driver.findElement(By.name("sendMovieData")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Marco92'])[1]/following::a[1]")).click();
  }


 @AfterAll
	  public static void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
