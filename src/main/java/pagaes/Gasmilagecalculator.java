package pagaes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by dipak on 12/9/2018.
 */
public class Gasmilagecalculator {
    @FindBy(how = How.ID,using = "uscodreading") private WebElement currentOdometer;
    @FindBy(how = How.ID,using = "uspodreading") private WebElement previousOdometer;
    @FindBy(how = How.ID,using = "usgasputin") private WebElement gasAdedToTank;
    @FindBy(how = How.ID,using = "usgasprice") private WebElement gasPrice;
    @FindBy(how = How.CSS,using = "#standard > tbody > tr:nth-child(5) > td > input[type=\"image\"]")
    private WebElement clickCalculateButton;


    public void clickCalculateButton(){
        clickCalculateButton.click();

    }
}
