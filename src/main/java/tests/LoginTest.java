package tests;

import com.microsoft.playwright.*;
import pages.LoginPage;

public class LoginTest {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );

        Page page = browser.newPage();

        LoginPage loginPage = new LoginPage(page);

        loginPage.navigate();
        loginPage.login("standard_user", "secret_sauce");

        // 👇 manual assertion
        if (page.url().contains("inventory")) {
            System.out.println("✅ TEST PASSED");
        } else {
            System.out.println("❌ TEST FAILED");
        }

        page.waitForTimeout(5000);

        browser.close();
        playwright.close();
    }
}
