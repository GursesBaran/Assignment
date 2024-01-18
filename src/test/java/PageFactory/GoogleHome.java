package PageFactory;

import Utilities.BaseDriver;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class GoogleHome {

    public GoogleHome() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
    public WebElement searchButton;

    @FindBy(xpath = "//h3[contains(text(),'Cucumber: BDD Testing & Collaboration Tools for Te')]")
    public WebElement cucumber;

}



















































