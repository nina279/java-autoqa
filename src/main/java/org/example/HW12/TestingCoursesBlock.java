package org.example.HW12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingCoursesBlock {
    @FindBy(className = "profession-bar_title")
    private WebElement title;
    @FindBy(className = "profession-bar_subtitle profession-subtitle")
    private WebElement subtitle;
    @FindBy(className = "profession-bar_descr")
    private WebElement description;
    @FindBy(className = "block-profession_link profession-bar -offline")
    private WebElement link;

    public String getCourseName() {
        return title.getText();
    }
    public String getCourseSubtitle() {
        return subtitle.getText();
    }
    public String getCourseDescription() {
        return description.getText();
    }
    public String getCourseLink() {
        return link.getText();
    }
}
