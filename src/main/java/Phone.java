
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phone {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32(1)\\chromedriver.exe");
        WebDriver webdriver=new ChromeDriver();
        webdriver.get("https://krisha.kz/");
        WebElement webElement= webdriver.findElement(By.className("is-visible"));
        webElement.click();

//        if (1==1) {
//            JSONObject jsonObject = new JSONObject();

//            jsonObject.put("lat", 78797);
//            jsonObject.put("lon", "bbbbbbbb");
//            System.out.println(json_funcs.get_json_string_response("http://localhost:7000/core-api/c_loc/update_c_loc", 60, 60,
//                    "POST", jsonObject.toString().getBytes(StandardCharsets.UTF_8), "application/json"));
//
//            return;
//        }

    }
}


