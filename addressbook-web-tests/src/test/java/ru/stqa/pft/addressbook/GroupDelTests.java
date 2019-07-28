package ru.stqa.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class GroupDelTests {
    private WebDriver wd;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        wd = new FirefoxDriver();
        js = (JavascriptExecutor) wd;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        wd.quit();
    }
    @Test
    public void testGroupDeletion() {
        wd.get("http://localhost/addressbook/");
        wd.manage().window().setSize(new Dimension(550, 694));
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.name("pass")).sendKeys(Keys.ENTER);
        wd.findElement(By.linkText("groups")).click();
        wd.findElement(By.name("selected[]")).click();
        wd.findElement(By.name("delete")).click();
        wd.findElement(By.linkText("group page")).click();
    }
}
