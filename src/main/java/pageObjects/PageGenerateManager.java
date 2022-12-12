package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerateManager {
    public static UserHomePO getUserHomePage(WebDriver driver){
        return new UserHomePO(driver);
    }
    public static UserLoginPO getUserLoginPage(WebDriver driver){
        return new UserLoginPO(driver);
    }
    public static UserRegisterPO getUserRegisterPage(WebDriver driver){
        return new UserRegisterPO(driver);
    }
    public static UserCustomerInfoPO getUserCustomerInfoPage(WebDriver driver){
        return new UserCustomerInfoPO(driver);
    }
    public static UserAddressesPO getUserAddressesPage(WebDriver driver){
        return new UserAddressesPO(driver);
    }
    public static UserChangePassPO getUserChangePassPage(WebDriver driver){
        return new UserChangePassPO(driver);
    }
}
