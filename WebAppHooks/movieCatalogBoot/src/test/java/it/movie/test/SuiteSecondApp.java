package it.movie.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.apache.commons.io.FileUtils;
import java.io.File;

public class SuiteSecondApp {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testSuiteSecondApp() throws Exception {
    driver.get("http://localhost:8080/movie");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).sendKeys("La vita è meravigliosa");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).sendKeys("Andrea75");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).sendKeys("8");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-32]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][5]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-6]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("9");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][5]//*[@x-test-hook-49]")).click();
  }

  @After
  public void tearDown() throws Exception {
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
