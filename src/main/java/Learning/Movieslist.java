package Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Movieslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://play.google.com/store/movies");
List<String> moviesname = new ArrayList<String>();
List<WebElement> movieslist1 = driver.findElements(By.cssSelector("[@aria-label*='Rated 4']")); 
//List<WebElement> movieslist1 = driver.findElements(By.xpath("//div[@class='hP61id']"));

//List<WebElement> movieslist1 = driver.findElements(By.xpath("//a[@class='Si6A0c ZD8Cqc']/div[@class='LrNMN']"));
//List<WebElement> movieslist1 = driver.findElements(By.xpath("//div[contains(@aria-label, 'Rated 4']"));

//for (WebElement moviefilteredlist : movieslist1)
//{
//WebElement childElement = driver.findElement(By.xpath("//div[@class='vlGucd']"));
//if (childElement.getText().contains("4.0")) {
  //  System.out.println(moviefilteredlist.getText());

	
//}
//}	
	
for (WebElement st1: movieslist1) 
{

	moviesname.add(st1.getText());
 
} 
System.out.println(moviesname);

driver.close();

	}

	}


