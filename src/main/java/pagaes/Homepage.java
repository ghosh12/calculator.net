package pagaes;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dipak on 12/9/2018.
 */
public class Homepage {
    public  WebDriver driver = null;
    @FindBy(how = How.LINK_TEXT, using = "Gas Mileage Calculator")
    private WebElement gasMilage;

    public Gasmilagecalculator clickGasMilageCalculator() {
        gasMilage.click();
        return PageFactory.initElements(Browser.driver, Gasmilagecalculator.class);
    }
        @FindBy(how = How.XPATH,using = "//a[text()='Love Calculator']") private WebElement lovecalculator;

        public Lovecalculatorpage clcklovecalculator(){
            lovecalculator.click();

         return PageFactory.initElements(Browser.driver,Lovecalculatorpage.class);
    }
}


