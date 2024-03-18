package web.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By productImage = By.id("item_4_img_link");
    By productPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {driver.get("https://www.saucedemo.com/inventory.html");}

    public void validateOnHomePage() {
        WebElement productElement1 = driver.findElement(productTitle);
        assertTrue(productElement1.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement1.getText());
    }
    public void validateImageProduct() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Menunggu hingga 10 detik
            wait.until(ExpectedConditions.visibilityOfElementLocated(productImage));
            WebElement productElement2 = driver.findElement(productImage);
            assertTrue(productElement2.isDisplayed());
        } catch (Exception e) {
            fail("Element not found within specified time: " + e.getMessage());
        }
    }
    public void validatePriceProduct() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Menunggu hingga 10 detik
            wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice));
            WebElement productElement3 = driver.findElement(productPrice);
            assertTrue(productElement3.isDisplayed());
        } catch (Exception e) {
            fail("Element not found within specified time: " + e.getMessage());
        }
    }
}
