package org.example.HW12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MainForPageObject {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/courses/testing");

        TestingCoursePage testingCoursePage = new TestingCoursePage(driver);
        List<TestingCoursesBlock> courses = testingCoursePage.getCourses();
        // виведення курсів
        for (TestingCoursesBlock course : courses) {
            System.out.println(course.getCourseName());
        }

        driver.quit(); //Не забувай!
    }
}
