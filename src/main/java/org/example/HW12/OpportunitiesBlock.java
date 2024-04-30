package org.example.HW12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunitiesBlock {

    // Змінила @FindBy(className) на @FindBy(css) для більшої гнучкості
    @FindBy(css = ".opportunity-item_title")
    private WebElement title;

    @FindBy(css = ".opportunity-item_descr")
    private WebElement description;

    // Методи з перевіркою на наявність елементів (перед спробою отримати їх текст або атрибути), щоб не виникло помилки
    public String getOpportunityName() {
        return title != null && title.isDisplayed() ? title.getText() : "";
    }

    public String getOpportunityDescription() {
        return description != null && description.isDisplayed() ? description.getText() : "";
    }
}
