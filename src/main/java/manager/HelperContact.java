package manager;

import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperContact extends HelperBase {
    public HelperContact(WebDriver wd) {
        super(wd);
    }

    public void openContactForm(){
        click(By.xpath("//a[@href='/add']"));
    }

    public void fillContactForm(Contact contact){

        type(By.xpath("//input[1]"), contact.getName());
        type(By.xpath("//input[2]"), contact.getLastname());
        type(By.xpath("//input[3]"), contact.getPhone());
        type(By.xpath("//input[4]"), contact.getEmail());
        type(By.xpath("//input[5]"), contact.getAddress());
        type(By.xpath("//input[6]"), contact.getDescription());

    }

    public void submitContactForm(){
        click(By.xpath("//div[@class='add_form__2rsm2']//button"));
    }

    public void isContactCreated(){

    }
}
