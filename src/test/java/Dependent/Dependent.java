package Dependent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependent {
	public static WebDriver driver;
	
	//Ici, notre méthode SignIn() dépend de la méthode OpenBrowser()
	
	 @Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("Cela s'exécutera en second (SignIn)");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("Cela s'exécutera en premier (Open Browser)");
	  }
}
