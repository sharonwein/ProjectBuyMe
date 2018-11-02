package buyme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class HomeScreenConstants {
    // selecting an amount from a list
   static void selectAmount(WebDriver driver) {
       WebDriverWait wait= new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.elementToBeClickable(By.className("chosen-single")));
       WebElement element =driver.findElements(By.className("chosen-single")).get(0);
       element.click();
       driver.findElements(By.className("active-result")).get(2).click();
   }

   //selecting a city from a list
   static void selectACity(WebDriver driver){
       WebElement element= driver.findElements(By.className("chosen-single")).get(1);
       element.click();
       driver.findElements(By.className("active-result")).get(2).click();
   }

   // select the gift category
   static void selectACategory(WebDriver driver) { 
       WebElement element = driver.findElements(By.className("chosen-single")).get(2);
       element.click();
       driver.findElements(By.className("active-result")).get(4).click();
   }
   // click on search button
   static void searchButton(WebDriver driver){
       WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
       element.click();
   }
}

