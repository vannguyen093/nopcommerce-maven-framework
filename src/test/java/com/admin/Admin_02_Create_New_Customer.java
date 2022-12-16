package com.admin;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import data.AdminDataMapper;
import data.UserDataMapper;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.*;
import reportConfig.ExtentTestManager;
import ultilities.Environment;

import java.lang.reflect.Method;

public class Admin_02_Create_New_Customer extends BaseTest {

    private WebDriver driver;
    private String userName, password;
    AdminDataMapper adminData;
    Environment env;
    AdminLoginPO adminLoginPage;
    AdminDashboardPO adminDashboardPage;
    AdminProductsPO adminProductsPage;

    @Parameters({"browser", "evnName", "ipAddress", "portNumber", "osName", "osVersion"})
    @BeforeClass
    public void beforeClass(@Optional("firefox") String browserName, @Optional("local") String evnName, @Optional("Windows") String osName, @Optional("10") String osVersion, @Optional("localhost") String ipAddress, @Optional("4444") String portNumber) {
        String environmentName = System.getProperty("evn");
        ConfigFactory.setProperty("env", environmentName);
        env = ConfigFactory.create(Environment.class);

        driver = getBrowserDriver(browserName, env.adminUrl(), evnName, osName, osVersion, ipAddress, portNumber);
        adminData = AdminDataMapper.getAdminData();

        adminLoginPage = PageGenerateManager.getAdminLoginPage(driver);

        userName = "admin@yourstore.com";
        password = "admin";
    }

    @Test
    public void TC_01_Search_With_Product_Name(Method method) {
        ExtentTestManager.startTest(method.getName(), "Search with product name");

        ExtentTestManager.getTest().log(Status.INFO, "Search With Product Name - Step 01: Input '" + userName + "' in 'Email' text box");
        adminLoginPage.inputToLoginTextboxByTextboxId("Email", userName);

        ExtentTestManager.getTest().log(Status.INFO, "Search With Product Name - Step 02: Input '" + password + "' in 'Password' text box");
        adminLoginPage.inputToLoginTextboxByTextboxId("Password", password);

        ExtentTestManager.getTest().log(Status.INFO, "Search With Product Name - Step 03: Click the 'Login' button");
        adminDashboardPage = adminLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Search With Product Name - Step 04: Click the 'Customers' link at Sidebar menu");
        adminDashboardPage.clickToAdminSubSidebarMenuByMenuText(driver, "Customers", "Customers");
//        adminCustomersPage = PageGenerateManager.getAdminCustomersPage(driver);

        ExtentTestManager.getTest().log(Status.INFO, "Search With Product Name - Step 05: Click the 'Add new' button");
//        adminCustomersPage.clickToAddNewButton();


    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        closeBrowserAndDriver();
    }

}
