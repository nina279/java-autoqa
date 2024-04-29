package org.example.HW12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunitiesBlock {
    @FindBy(className = "opportunity-item_title")
    private WebElement title;
    @FindBy(className = "p-s opportunity-item_descr")
    private WebElement description;

    public String getOpportunityName() {
        return title.getText();
    }
    public String getOpportunityDescription() {
        return description.getText();
    }
}
