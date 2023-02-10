
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class B {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.setProperty("webdriver.chrome.driver","chromedriver_win32(2)\\chromedriver.exe");
        WebDriver webdriver=new ChromeDriver();
       // webdriver.get("https://www.youtube.com");
        webdriver.get("http://localhost/camunda/app/cockpit/default/#/login");
  WebElement webElement= webdriver.findElement(By.xpath("//input[@ng-model='username']"));
  webElement.sendKeys("Demo", Keys.ENTER);
//        File file=new File("parse");
//        PrintWriter pw= new PrintWriter(file);
//        File file1=new File("Phone");
//
//        PrintWriter pw1= new PrintWriter(file1);
//        for(int i=5;i<6;i++) {
//            WebElement pg=webdriver.findElement(By.xpath("/html/body/main/section[3]/div/nav/a["+i+"]"));
//            pg.click();
//            Thread.sleep(1000);
//            System.out.println(webdriver);
//            List<WebElement> webElement = webdriver.findElements(By.className("a-card__title"));
//            for (WebElement inputElement : webElement) {
//                inputElement.click();
//                String d = inputElement.getAttribute("href");
//                pw.println(d);
//                WebDriver webdriver1 = new ChromeDriver();
//                webdriver1.get(d);
//                WebElement webElement2 = webdriver1.findElement(By.className("show-phones"));
//                webElement2.click();
//                Document document = Jsoup.parse(webdriver1.getPageSource());
//                pw1.println(document.getElementsByClass("offer__contacts-phones").text());
//                webdriver1.quit();
//                ArrayList<String> tabs2 = new ArrayList<String> (webdriver.getWindowHandles());
//                if(tabs2.size()>2){webdriver.switchTo().window(tabs2.get(2));
//                webdriver.close();
//                    webdriver.switchTo().window(tabs2.get(0));}
//               // webdriver1.navigate().back();
//                Thread.sleep(2000);
//
//            }
//        }
//        pw.close();
//        pw1.close();
    }
}
