import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Selenium {
    public static void main(String[] args) throws IOException, InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver_win32(1)\\chromedriver.exe");
//        WebDriver webdriver = new ChromeDriver();
        Document doc = null;
        // String separator = File.separator;
        File file = new File("parse");
        Scanner scanner = new Scanner(file);
        int has = 0;
//        while (scanner.hasNextLine()) {

            String stringt = scanner.nextLine();

            doc = Jsoup.connect("https://krisha.kz/a/show/676559140").get();

            Thread.sleep(3000);

           String s=doc.getElementsByClass("gallery__main").first().child(1).child(0).child(2).attr("src");
        String file_name=doc.getElementsByClass("gallery__main").first().child(1).child(0).child(2).attr("alt");
        System.out.println(s);
        System.out.println(file_name);
//            Elements elementsClient = doc.getElementsByClass("gallery__small-item");
//
//
//            String[] offer = new String[elementsClient.size()];
//            String[] offerx = new String[elementsClient.size()];
//            int i_offer = 0;
//            for (Element offerElement : elementsClient) {
//                offer[i_offer] = offerElement.child(0).child(2).attr("src");
//                System.out.println(offer[i_offer] );
//                offerx[i_offer] = offerElement.child(0).child(2).attr("alt");
//                System.out.println(offerx[i_offer]);
//                i_offer++;
//            }
//            for (int l = 0; l < elementsClient.size(); l++) {
//                String s = offer[l];
//                String file_name = offerx[l];
//                System.out.println(s);
//                System.out.println(file_name);
                // System.out.println(doc.getElementsByClass("gallery__small-item active").first().child(0).child(2).attr("src"));
                //  System.out.println(doc.getElementsByClass("gallery__small-item active").first().child(1).child(0).child(2).attr("alt"));
//        Element inputElements = doc.getElementsByClass("gallery__main").first().child(1);
//                for (Element inputElement : inputElements) {
//                    System.out.println(inputElement.attr("href"));
//                }
//        for (WebElement inputElement : webElement) {
//            System.out.println(inputElement.getText());
//            String d = inputElement.getAttribute("href");
//            System.out.println(d);
//            // }
//        List<WebElement> pg_btn = webdriver.findElements(By.className("paginator__btn"));
//        for (int i = 6; i < 7; i++) {
//            WebElement pg = webdriver.findElement(By.xpath("/html/body/main/section[3]/div/nav/a[" + i + "]"));
//            pg.click();
//            Thread.sleep(1000);
//            List<WebElement> webElement = webdriver.findElements(By.className("a-card__title"));
//            for (WebElement inputElement : webElement) {
//
//                inputElement.click();
//                String d = inputElement.getAttribute("href");
//                WebDriver webdriver1 = new ChromeDriver();
//                webdriver1.get(d);
//                WebElement webElement2 = webdriver1.findElement(By.className("show-phones"));
//                webElement2.click();
//                Thread.sleep(2000);
//                Document document = Jsoup.parse(webdriver1.getPageSource());
//                webdriver1.quit();
//                Thread.sleep(3000);
//
//            }
//
            }

        }




