package org.example.HW12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TestingCoursePage implements CoursesElements {

    private final WebDriver driver;

    //Конструктор - власне ініціалізаця елементів сторінки за допомогою Page Factory
    public TestingCoursePage(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this); не реба це, я ж findElements використовую нижче
    }


    @Override
    public List<TestingCoursesBlock> getCourses() {
        // Отримання елементів, які представляють курси зі сторінки -
        List<WebElement> courseElements = driver.findElements(By.className("block-profession_item"));

        // Створення списку для зберігання об'єктів TestingCoursesBlock
        List<TestingCoursesBlock> courses = new ArrayList<>();

        // Проходження по кожному елементу курсу і створення об'єкту TestingCoursesBlock
        for (WebElement courseElement : courseElements) {
            // Створення об'єкту TestingCoursesBlock з вже знайденими елементами та додавання його до списку
            TestingCoursesBlock course = new TestingCoursesBlock(courseElement);
            courses.add(course);
        }
        // Повернення списку курсів
        return courses;
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