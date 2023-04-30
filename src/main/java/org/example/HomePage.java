package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By _registerButton =  By.className("ico-register");
    public void clickOnRegisterButton(){
        //click on register link
        clickElement(_registerButton);

    }


}
