package todesk.businesslogic;

import org.openqa.selenium.remote.RemoteWebDriver;
import todesk.config.GlobalDatas;
import todesk.pages.LoginPage;

/**
 * LoginFlow
 * 业务逻辑层
 * @author chenchao
 * @date 2023/2/13
 * @since 1.0.0
 */
public class LoginFlow {
    private RemoteWebDriver driver;

    public LoginFlow(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void accountLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAccountLogin();
        loginPage.inputMobileOrEmail(GlobalDatas.USER_NAME);
        loginPage.inputPassword(GlobalDatas.USER_PASSWORD);
        loginPage.clickLogin();
    }
}
