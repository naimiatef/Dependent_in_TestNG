package GroupDependency;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupDependency {
	public static WebDriver driver;
	/*
	 * L’attribut dependsOnGroups nous permet de faire dépendre un test d’un 
	 * groupe entier plutôt que d’un test unique.
	
	 */
	
	  @Test(dependsOnGroups = { "SignIn" })
	    public void ViewAcc() {
	        System.out.println("SignIn Successful");
	    }
	 
	    @Test(groups = { "SignIn" })
	    public void LogIn() {
	        System.out.println("Logging In Success");
	    }
}
