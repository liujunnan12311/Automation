package com.vliu.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public interface IVDriver extends WebDriver {
	String getWebDriverType();

	boolean isAjaxLoadingDone(By AjaxElementIdentifier);

	boolean isAjaxLoadingDone(int threshold, By AjaxElementIdentifier);

	void maximizeWindow();

	void dragAndDropJS(By ByFrom, By ByTo);

	void dragAndDrop(By byFrom, By byTo);

	void sleep(long time);

	void clearCookie();
	
	WebElement findElement(By by);

//	Selenium getSelenium();

//	boolean isWindowExist(String title);

//	void waitUntilWindowClose(String windowTitle, long timeout);

	void uncheck(By by);

	void check(By by);

	List<String> getElementsValues(By by);

	int getTableRowByText(By by, int intColumn, String text);

	int getTableColCount(By by);

	int getTableRowCount(By by);

	String getTableCell(By by, int row, int column);

	void clickCancel();

	void clickOK();

	List<WebElement> getAllOptionInSelect(By by);

	void selectByIndex(By by, int index);

	void selectByValue(By by, String value);

	void selectInOptgroupByTextContains(By by, String option);

	void selectByTextContains(By by, String partText);

	void selectByText(By by, String text);

//	boolean isElementPresent(String locator);

	boolean isElementPresent(By by);

	ExpectedCondition<WebElement> visibilityOfElementLocated(By locator);

	void waitForElement(By by, long timeInSecond);

	void waitForElement(By by);

	int getWindowsCount();

	void selectWindow(int wIndex);

	void windowAuthLogin(String user, String pw);

	boolean isTextPresent(String text);

	JavascriptExecutor getJsExcutor();

	void moveToElement(By by);

	void open();

	WebDriver getDriver();

	void captureScreenshot(String filepath, String simpleName);
	
	void captureScreenshot(String filepath, String simpleName, String log);
	
	void setCheckboxSatus(By checkboxLocation, boolean checked);

	void selectByOptgroupByTextContains(By by, String optGroup,
			String option);
}
