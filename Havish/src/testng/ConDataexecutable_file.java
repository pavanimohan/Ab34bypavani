package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//data executable file
//print att the options present in autosuggestion
public class ConDataexecutable_file {
public static void main(String[] args) throws InterruptedException {
		      EdgeDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("mobiles");
Thread.sleep(2000);
List<WebElement> ls=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
//the above x path comes from GF FATHER AND child
int count =ls.size();//size method returns the count of elements present in this list container in selectbar
System.out.println(count);
for(int i=0;i<count;i++) 
{
WebElement suggestion=ls.get(i);//get index will print i value the return type is int
String s1=suggestion.getText();//get text is used to print the text RT is string
System.out.println(s1);

}
}
}
