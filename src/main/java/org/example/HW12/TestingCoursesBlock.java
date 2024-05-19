package org.example.HW12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingCoursesBlock {

    @FindBy(css = ".profession-bar_title")
    private WebElement title;

    @FindBy(css = ".profession-bar_subtitle")
    private WebElement subtitle;

    @FindBy(css = ".profession-bar_descr")
    private WebElement description;

    @FindBy(css = ".block-profession_link")
    private WebElement link;

    public TestingCoursesBlock(WebElement courseElement) {
        PageFactory.initElements(courseElement, this);
        // оце все нижче не треба, бо я використовую PageFactory з @FindBy
//        this.title = courseElement.findElement(By.cssSelector(".profession-bar_title"));
//        this.subtitle = courseElement.findElement(By.cssSelector(".profession-bar_subtitle"));
//        this.description = courseElement.findElement(By.cssSelector(".profession-bar_descr"));
//        this.link = courseElement.findElement(By.cssSelector(".block-profession_link"));
    }

    public String getCourseName() {
        return title.getText();
    }

    public String getCourseSubtitle() {
        return subtitle.isDisplayed() ? subtitle.getText() : "";
    }

    public String getCourseDescription() {
        return description.isDisplayed() ? description.getText() : "";
    }

    public String getCourseLink() {
        return link.isDisplayed() ? link.getText() : "";
    }
}
