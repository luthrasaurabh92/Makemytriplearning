package Learning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleplaystoreassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://play.google.com/store/");
List<String> list1 = new ArrayList<String>();
List<WebElement> elementslist =driver.findElements(By.xpath("//span[@class='VfPpkd-N5Lhkf']"));



for (WebElement st1: elementslist) {

	list1.add(st1.getText());
 
} 
System.out.println(list1);

for (String st1: list1) 
{ 
	WebElement element =
 driver.findElement(By.linkText(st1)); 
	element.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
 }

driver.close();

}

}

