package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserPage extends BasePage {
    public NewUserPage(WebDriver navegador) {
        super(navegador);
    }

    public NewUserPage typeName(String name){
        navegador.findElement(By.id("user_name")).sendKeys(name);

        return this;
    }

    public NewUserPage typeLastName(String lastName){
        navegador.findElement(By.id("user_lastname")).sendKeys(lastName);

        return this;
    }

    public NewUserPage typeEmail(String email){
        navegador.findElement(By.id("user_email")).sendKeys(email);

        return this;
    }

    public NewUserPage typeAddress(String address){
        navegador.findElement(By.id("user_address")).sendKeys(address);

        return this;
    }

    public NewUserPage typeUniversity(String university){
        navegador.findElement(By.id("user_university")).sendKeys(university);

        return this;
    }

    public NewUserPage typeProfile(String profile){
        navegador.findElement(By.id("user_profile")).sendKeys(profile);

        return this;
    }

    public NewUserPage typeGender(String gender){
        navegador.findElement(By.id("user_gender")).sendKeys(gender);

        return this;
    }

    public NewUserPage typeAge(String age){
        navegador.findElement(By.id("user_age")).sendKeys(age);

        return this;
    }
    public  QueryUserPage clickButtonCriar(){
        navegador.findElement(By.name("commit")).click();

        return new QueryUserPage(navegador);
    }

    public QueryUserPage createUser(
        String name,
        String lastName,
        String email,
        String address,
        String university,
        String profile,
        String gender,
        String age
        ){
        typeName(name);
        typeLastName(lastName);
        typeEmail(email);
        typeAddress(address);
        typeUniversity(university);
        typeProfile(profile);
        typeGender(gender);
        typeAge(age);
        clickButtonCriar();

        return new QueryUserPage(navegador);
    }
}
