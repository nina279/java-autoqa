import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HW11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.get("https://ithillel.ua/");

        browser.manage().window().maximize();

        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement switchoverProgrammingButton = browser.findElement(By.cssSelector("[href=\"https://ithillel.ua/courses/programming\"]"));

        switchoverProgrammingButton.click();

        // Затримка для завершення переходу на нову сторінку
        Thread.sleep(5000);

        // CSS селектор для кнопки "Прийняти" щодо файлів cookie
        String acceptButtonSelector = "button.btn.-small.-light.cookie-ntf_agreement";

        // Натискання на кнопку "Прийняти"
        browser.findElement(By.cssSelector(acceptButtonSelector)).click();

        // Затримка для завершення обробки відповіді на підтвердження файлів cookie
        Thread.sleep(5000);

        // Знаходимо елемент "front-end-basic"
        WebElement frontEndBasicButton = browser.findElement(By.cssSelector("a.block-profession_link.profession-bar.-offline[href=\"https://ithillel.ua/courses/front-end-basic\"]"));

        // Виконуємо скрипт JavaScript для прокручування до елементу
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", frontEndBasicButton);

        // Затримка для завершення прокручування
        Thread.sleep(1000);

        // Натискання на кнопку "front-end-basic"
        frontEndBasicButton.click();

        // Затримка для завершення обробки дії натискання на кнопку "front-end-basic"
        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(15));

        WebElement showAllButton = wait.until(driver -> {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
            return driver.findElement(By.cssSelector("span.coaches_show"));
        });

        showAllButton.click();

        // Затримка для завершення обробки дії натискання на кнопку "Показати всіх"
        Thread.sleep(5000);

//        List<WebElement> coaches = browser.findElements(By.className("coach-card_name"));
//        System.out.println("Список імен і прізвищ тренерів:");
//        for (WebElement coach : coaches) {
//            System.out.println(coach.getText());
//        }

//        WebElement coachSection = wait.until(driver -> {
//            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
//            return driver.findElement(By.id("coachSection"));
//        });
//
//        System.out.println(coachSection);

        List<WebElement> coachesNames = browser.findElements(By.className("coach-card_name"));
        coachesNames.stream().map(WebElement::getText).forEach(System.out::println);

        // Закриття браузера
        browser.quit();
    }
}