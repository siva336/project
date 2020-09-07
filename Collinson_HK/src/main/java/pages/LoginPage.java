package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestaBase;

import static org.junit.Assert.assertEquals;

public class LoginPage extends TestaBase {


        By whoweare = By.xpath("//*[@class='caret']");
        By leadership = By.xpath("//*[@class ='text-center inner-navigation']/li[2]/a");
        By founder = By.xpath("//*[@id='countrydivcontainer']/div/div/div/div/div[2]/span[2]/p");


        public LoginPage() {
            PageFactory.initElements(driver, this);
        }

        public void clickOnDeveloperApplyButton() {

            driver.findElement(whoweare).click();
        }

        public void rApplyButton() {


            driver.findElement(leadership).click();
        }


        public void ApplyButton() {
            System.out.println("Text is absent");
            WebElement TxtBoxContent = driver.findElement(founder);
            String stc=TxtBoxContent.getText();
            System.out.println("actualmessage"+ stc);
            String actual="Founder – HCL\n" +
                    "Chief Strategy Officer – HCL Technologies\n" +
                    "Founder & Chairman - Shiv Nadar Foundation";
            System.out.println("message +"        + actual);
            assertEquals(stc,actual);


        }


    }








