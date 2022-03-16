package com.n11.test;

import com.n11.Base.BaseClass;
import org.junit.Test;

public class HomePage extends BaseClass {


    

    @Test  //başarılı login olma senaryosu
    public void login() throws InterruptedException {
        clickElementByCssSelector("[class='btnSignIn']");
        setElementById("email",userName);
        setElementById("password",password);
        clickElementById("loginButton");
    }

    @Test // başarısız login olma senaryosu
    public void unLogin() throws InterruptedException {
        clickElementByCssSelector("[class='btnSignIn']");
        setElementById("email",userName);
        setElementById("password","çilek");
        clickElementById("loginButton");

    }

    @Test //başarılı üye olma işlemi
    public void Memberlogin() throws InterruptedException {
        clickElementByCssSelector("[class='btnSignUp']");
        clickElementByCssSelector("[class='button medium black']");
        setElementById("firstName",name);
        setElementById("lastName", lastName);
        setElementById("registrationEmail",email);
        setElementById("registrationPassword",password);
        setElementById("passwordAgain",password);
        setElementById("phoneNumber",phone);



    }

    @Test //başarılı bir şekilde arama yapma işlemi
    public void searcProduct() throws InterruptedException {
        setElementById("searchData","tava");
        clickElementByCssSelector("[class='searchBtn']");
        scroll();
    }

    @Test //sepete ürün ekleme
    public void addProduct() throws InterruptedException {
        searcProduct();
        Thread.sleep(2000);
        scroll();
        clickElementByXpath("//div[@id='p-479471863']");
        scroll();
        clickElementByCssSelector("[class='btn btnGrey btnAddBasket']");
        Thread.sleep(2000);
        clickElementByCssSelector("[class='icon iconBasket'] ");
        clickElementByXpath("//div//span[@class='btn btnBlack']");
        clickElementByXpath("//div//span[@class='removeProd svgIcon svgIcon_trash']");
       // clickElementByXpath("//td//div//span[@class='textImg followBtn svgIcon svgIcon_heart']");  favorilere ekleme yapıyor

    }


}
