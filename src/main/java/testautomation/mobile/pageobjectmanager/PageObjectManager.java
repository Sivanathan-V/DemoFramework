package testautomation.mobile.pageobjectmanager;


import testautomation.mobile.mobilebase.MobileBase;
import testautomation.mobile.pages.CartPage;
import testautomation.mobile.pages.HomePage;
import testautomation.mobile.pages.ProductList;
import testautomation.mobile.pages.ProductPage;

public class PageObjectManager extends MobileBase {

    private HomePage homePage;
    private ProductList productList;
    private ProductPage productPage;
    private CartPage cartPage;
    public HomePage getHomePage() {
        return (homePage==null)?homePage= new HomePage():homePage;
    }
    public ProductList getProductList() {
        return (productList==null)?productList=new ProductList():productList;
    }
    public ProductPage getProductPage() {
        return (productPage==null)?productPage=new ProductPage():productPage;
    }
    public CartPage getCartPage() {
        return (cartPage==null)?cartPage=new CartPage():cartPage;
    }




}
