package todesk.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import todesk.common.BasePage;


/**
 * LoginPage
 *
 * @author chenchao
 * @date 2023/2/3
 * @since 1.0.0
 */
@SuppressWarnings("all")
public class LoginPage extends BasePage {
    private RemoteWebDriver driver;
    /**
     * 元素定位信息
     */
    //我有企业账号，前往登录
    private By loginGoBusiness = By.xpath("//div[@class='login-desc']/a[text()='登录']");
    //手机登录
    private By mobileLoginBy = By.xpath("//*[@id='login_appLogin']/p");
    //手机号输入框
    private By mobileInputBy = By.id("#phone");
    //下一步按钮
    private By mobileLoginButtonBy = By.id("#login_loginSubmit");
    //账号登录
    private By acccountLoginBy = By.xpath("//*[@id=\"login_accountLogin\"]/p");
    //手机号或者邮箱输入框
    private By mobileOrEmailInputBy = By.cssSelector("#app > section > section > section > div.login-panle > div.tabs-logins > " +
            "div.login-type.login-type-username.backBox > form > div:nth-child(1) > div > div > input");
    //密码输入框
    private By passwordInputBy = By.cssSelector("#app > section > section > section > div.login-panle > div.tabs-logins " +
            "> div.login-type.login-type-username.backBox > form > div.el-form-item.is-required > div > div > input");
    //登录按钮
    private By loginButtonBy = By.cssSelector("#login_loginSubmit > span");
    //微信登录
    private By wechatLoginBy = By.xpath("//*[@id='login_wechartLogin']/p");
    //用户隐私政策
    private By loginGoPrivacyBy = By.xpath("//div[@class='agree-desc']/a[text()='《用户隐私政策》']");
    //软件许可协议
    private By loginGoLicenceBy = By.xpath("//div[@class='agree-desc']/a[text()='《软件许可协议》']");


    /**
     * 操作方法
     */
    //ToDesk页面的构造方法
    public LoginPage(RemoteWebDriver driver){
        this.driver = driver;
    }

    //在页面层封装点击前往【企业账号登录】方法
    public void clickLoginBusiness(){
        click(driver,loginGoLicenceBy,"企业账号登录");
    }
    //在页面层封装点击【手机登录】方法
    public void clickMobileLogin(){
        click(driver,mobileLoginBy,"手机登录");
    }
    //在页面层封装 点击【下一步】方法
    public void mobileButton(){
        click(driver,mobileLoginButtonBy,"下一步");
    }
    //在页面层封装向【手机号输入框】输入数据的方法
    public void inputMonile(String data){
        sendKey(driver,mobileInputBy,data,"手机号输入框");
    }
    //在页面层封装点击【账号登录】方法
    public void clickAccountLogin(){
        click(driver,acccountLoginBy,"账号登录");
    }
    //在页面层封装向【手机号或者邮箱输入框】输入数据的方法
    public void inputMobileOrEmail(String data){
        sendKey(driver,mobileOrEmailInputBy,data,"手机号或者邮箱输入框");
    }
    //在页面层封装向【密码输入框】输入数据的方法
    public void inputPassword(String data){
        sendKey(driver,passwordInputBy,data,"密码输入框");
    }
    //在页面层封装点击【登录】方法
    public void clickLogin(){
        click(driver,loginButtonBy,"登录");
    }
    //在页面层封装点击【微信登录】方法
    public void clickWechatLogin(){
        click(driver,wechatLoginBy,"微信登录");
    }
    //在页面层封装点击【用户隐私政策】方法
    public void clickPrivacy(){
        click(driver,loginGoPrivacyBy,"用户隐私政策");
    }
    //在页面层封装【软件许可协议】方法
    public void clickLicence(){
        click(driver,loginGoLicenceBy,"软件许可协议");
    }

}
