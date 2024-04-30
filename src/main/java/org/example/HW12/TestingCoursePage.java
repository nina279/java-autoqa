package org.example.HW12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestingCoursePage implements CoursesElements {

    private final WebDriver driver;

    //Конструктор - власне ініціалізаця елементів сторінки за допомогою Page Factory
    public TestingCoursePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public List<TestingCoursesBlock> getCourses() {
        return List.of();
    }
    @Override
    public List<TestingCoursesBlock> getAdditionalCourses() {
        return List.of();
    }
    @Override
    public List<OpportunitiesBlock> getOpportunities() {
        return List.of();
    }
    @Override
    public void goToCategory(String category) {
        WebElement categoryLink = driver.findElement(By.linkText(category));
        categoryLink.click();
    }
}
