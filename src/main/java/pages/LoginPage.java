package pages;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    private String usernameInput = "#user-name";
    private String passwordInput = "#password";
    private String loginButton = "#login-button";

    public LoginPage(Page page) {
        super(page);
    }

    public void navigate() {
        page.navigate("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        fill(usernameInput, username);
        fill(passwordInput, password);
        click(loginButton);
    }
}
