package org.example.HW12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingCoursesBlock {

    // Змінила @FindBy(className) на @FindBy(css) для більшої гнучкості
    @FindBy(css = ".profession-bar_title")
    private WebElement title;

    @FindBy(css = ".profession-bar_subtitle")
    private WebElement subtitle;

    @FindBy(css = ".profession-bar_descr")
    private WebElement description;

    @FindBy(css = ".block-profession_link")
    private WebElement link;

    public TestingCoursesBlock(WebElement courseElement) {
    }

    // Методи з перевіркою на наявність елементів (перед спробою отримати їх текст або атрибути), щоб не виникло помилки
    public String getCourseName() {
        return title.isDisplayed() ? title.getText() : "";
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