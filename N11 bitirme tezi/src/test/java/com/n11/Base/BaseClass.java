package com.n11.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BaseClass extends BaseTest{



    public void newTab(){
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
    }

    public void setElementByCssSelector(String cssSelector, String value) {
        WebElement search = driver.findElement(By.cssSelector(cssSelector));
        search.sendKeys(value);
    }

    public void setElementById(String id, String value) {
        WebElement search = driver.findElement(By.id(id));
        search.sendKeys(value);
    }

    public void clickElementByCssSelector(String cssSelector) {
        WebElement click = driver.findElement(By.cssSelector(cssSelector));
        click.click();
    }

    public void clickElementById(String id) {
        WebElement click = driver.findElement(By.id(id));
        click.click();
    }

    public void clickElementByXpath(String xpath) {
        WebElement click = driver.findElement(By.xpath(xpath));
        click.click();
    }

    public void mouseHover(String attribute, String secondAttribute) throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector(attribute));
        builder.moveToElement(element).build().perform();
        //wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        TimeUnit.SECONDS.sleep(5);
        clickElementByCssSelector(secondAttribute);
    }

    public String scroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(1000);
        return null;
    }

}
