package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;

import java.util.List;
import java.util.Random;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


public class PHPTrevelersPages {

    @FindBy(xpath = "//nav[contains(@class, 'main-nav main-nav-holder')]//span[contains(text(),'Features')]")
    private static WebElement menuFeature;
    @FindBy(xpath = "//li[contains(@class, 'has-drop')]/div[contains(@class, 'menu-dropdown')]/ul[contains(@class, 'menu reset')]/li[3]/a")
    private static WebElement submenuFlightsModule;
    @FindBy(xpath = "//b[contains(text(),'Pricing')]")
    private static WebElement nextPagePricing;
    @FindBy(xpath = "//form[contains(@action,'//phptravels.org/cart.php?a=add&pid=4')]//button")
    private static WebElement orderNow;

    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary btn-lg')]")
    private static WebElement buttonContinue;
    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary btn-lg')]")
    private static WebElement buttonCheckOut;


    //Chechout inputs
    @FindBy(id = "inputFirstName")
    private static WebElement inputFirstName;
    @FindBy(id = "inputLastName")
    private static WebElement inputLastName;
    @FindBy(id="inputCompanyName")
    private static WebElement inputCompanyName;
    @FindBy(id = "inputEmail")
    private static WebElement inputEmail;
    @FindBy(id = "inputPhone")
    private static WebElement inputPhone;
    @FindBy(xpath = "//div[contains(@class, 'selected-dial-code')]")
    private static List<WebElement> inputPhoneCountry;
    @FindBy(id = "inputAddress1")
    private static WebElement inputAddress1;
    @FindBy(id = "stateinput")
    private static WebElement stateinput;
    @FindBy(id = "inputCity")
    private static WebElement inputCity;
    @FindBy(id = "inputPostcode")
    private static WebElement inputPostcode;
    @FindBy(id = "inputCountry")
    private static List<WebElement> inputCountry;

    @FindBy(id = "customfield2")
    private static WebElement customfield2;
    @FindBy(id = "inputNewPassword1")
    private static WebElement inputNewPassword1;
    @FindBy(id = "inputNewPassword2")
    private static WebElement inputNewPassword2;

    @FindBy(xpath = "//div[contains(@id,'google-recaptcha-domainchecker')]//iframe[contains(@src,'https://www.google.com/recaptcha')]")
    private static WebElement reCapthca;

    @FindBy(id = "btnCompleteOrder")
    private static WebElement buttonCompleteOrder;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-lg')]")
    private static WebElement buttonCheckoutCart;

    @FindBy(xpath = "//div[contains(@class,'invoice-col')]//strong[contains(text(),'Invoiced To')]/../address")
    private static WebElement invoiceInformation;



    public static void initializePHPTravelsPage(){

        Driver.getDriver().get("https://phptravels.com/demo/");
        PageFactory.initElements(Driver.getDriver(), PHPTrevelersPages.class);

    }


    public static void hoverFeatureMenu(){

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(menuFeature).perform();

    }

    public static void clickFlightsModule(){

        submenuFlightsModule.click();

    }

    public static void clickCheckoutPricing(){
        nextPagePricing.click();
    }

    public static void clickOrderNow(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)");
        orderNow.click();
    }
    public static void clickContinue(){

        Driver.switchToTab(1);

        buttonContinue.click();
        System.out.println("executed");
    }

    public static void checkoutButtonClick(){
        buttonCheckOut.click();
    }

    public static void completeFields() throws InterruptedException {
     inputFirstName.sendKeys("Nume");
     inputLastName.sendKeys("Prenume");
     inputCompanyName.sendKeys("Compania");
     inputEmail.sendKeys(  "32Mail@asa.sd");
        for(WebElement element: inputPhoneCountry) {
            if (element.getText().trim().equals("Moldova (Republica Moldova)")) {
                element.click();
                break;
            }
        }
        inputPhone.sendKeys("1212312");

        inputAddress1.sendKeys("adresa12");
        inputCity.sendKeys("Oras");
        stateinput.sendKeys("statulMeu");
        customfield2.sendKeys("123123123");
        inputNewPassword1.sendKeys("Pass@3");
        inputNewPassword2.sendKeys("Pass@3");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)");
        //Thread.sleep(2000);
        //reCapthca.click();
//        Actions action = new Actions(Driver.getDriver());
//        action.moveToElement(reCapthca).perform();
        Thread.sleep(80000);
        buttonCompleteOrder.click();

    }

//    public static void cardCheckout(){
//        buttonCheckoutCart.click();
//    }

    public static void compareInvoice(){

        String invoice = invoiceInformation.toString().trim().replace("\"","").replace(" ","").replace(",","");

        String compareInvoice="CompaniaNumePrenumeadresa12OrasstatulMeuPakistanMobileNumber:123123";
        assertEquals(compareInvoice,invoice);


    }


}
