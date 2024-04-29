package org.example.HW12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TestingCoursePage implements Courses {

    //Конструктор
    public TestingCoursePage(WebDriver driver) {
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
    }
}
