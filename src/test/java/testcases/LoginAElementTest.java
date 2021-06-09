package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageElements;
import utils.CommonMethods;

public class LoginAElementTest extends CommonMethods {


    @Test
    public void logoValidation() {
        LoginPageElements login=new LoginPageElements();
        Assert.assertTrue(displayed(login.logo));

    }





}
