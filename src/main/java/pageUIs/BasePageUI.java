package pageUIs;

public class BasePageUI {
    public static final String HEADER_LINK_BY_TEXT = "xpath=//div[@class='header-links']//a[@class='%s']";
    public static final String SUB_HEADER_MENU_BY_TEXT = "xpath=//ul[@class='top-menu notmobile']//a[normalize-space()='%s']/..//a[normalize-space()='%s']";
    public static final String HEADER_MENU_BY_TEXT = "xpath=//ul[@class='top-menu notmobile']//a[normalize-space()='%s']";
    public static final String SIDEBAR_MENU_BY_MENU_TEXT = "xpath=//div[@class='side-2']//a[normalize-space()='%s']";
    public static final String FOOTER_MENU_BY_MENU_TEXT = "xpath=//a[normalize-space()='%s']";
    public static final String CHANGE_PASS_SUCCESSFUL_MESSAGE_TEXT = "xpath=//p[@class='content']";
    public static final String CLOSE_MESSAGE_BUTTON = "xpath=//span[@class='close']";
    public static final String AJAX_PRODUCT_BUSY_ICON="xpath=//div[@class='ajax-products-busy']";
}
