package pagaes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by dipak on 12/9/2018.
 */
public class Lovecalculatorpage {
    @FindBy(how = How.ID, using = "cnameone") private WebElement person1;
    @FindBy(how = How.ID, using = "cnametwo") private WebElement person2;
    @FindBy(how = How.CSS, using = "input[value='Calculate']")
    private WebElement calculateButton;
    @FindBy(how = How.CSS, using = "h1 b") private WebElement result;



    public void calcualteLove(){
        person1.sendKeys("abc");
        person2.sendKeys("dev");
        calculateButton.click();

    }

    public void verifyResult() {
        String res = result.getText();
        // Assert.assertEquals(res, "85%");




    }
}



