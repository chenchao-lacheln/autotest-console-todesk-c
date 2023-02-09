package todesk.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import todesk.common.BaseTest;
import todesk.config.GlobalDatas;
import todesk.pages.LoginPage;

/**
 * TestLogin
 *
 * @author chenchao
 * @date 2023/2/7
 * @since 1.0.0
 */
public class TestLogin extends BaseTest {
    @BeforeMethod
    public void setup(){
        //用例前置
        //1.打开浏览器
        openBrowser(GlobalDatas.BROWSER_NAME);
        maxBrowser();
        //2.进入登录页面
        toUrl(GlobalDatas.INDEX_URL);
    }

    //测试手机号登录功能
    @Test
    public void test_mobile_login_success(){

    }
    //测试账号登录
    @Test
    public void test_account_login_success(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAccountLogin();
        loginPage.inputMobileOrEmail(GlobalDatas.USER_NAME);
        loginPage.inputPassword(GlobalDatas.USER_PASSWORD);
        loginPage.clickLogin();
    }
    //测试微信登录

    @AfterMethod
    public void teardown(){
        //用例后置
        //退出浏览器
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        quitBrowser();
    }
}
