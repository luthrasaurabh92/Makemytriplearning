package Learning;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class firstclass {

	public firstclass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
try {
driver.switchTo().frame(driver.findElement(By.xpath("/html/body/webengagedata/div/div/iframe")));
}
catch (Exception e)
{
	System.out.println("element doesn't found");
}

List<String>stringlist = new ArrayList<String>(); 
List<WebElement> multiplestore1 =driver.findElements(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText']"));

for (WebElement st1: multiplestore1) {

	stringlist.add(st1.getText());
 
} 
System.out.println(stringlist);

for (String st1: stringlist) 
{ 
	WebElement element =
 driver.findElement(By.linkText(st1)); 
	element.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
 }

driver.close();

	}


	}


