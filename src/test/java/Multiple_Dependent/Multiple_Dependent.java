package Multiple_Dependent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Dans l’exemple ci-dessus, j’ai créé plusieurs dépendances en faisant
 *  dépendre la méthode de test « LogOut » de deux tests différents, qui sont « SignIn » et
 *   « OpenBrowser ». La méthode Logout() a été déplacée au milieu intentionnellement pour démontrer 
 *   l’utilisation de tests dépendants dans TestNG
 */
public class Multiple_Dependent {
	@Test
	public void OpenBrowser() {
		System.out.println("Opening The Browser");
	}

	@Test(dependsOnMethods = { "SignIn", "OpenBrowser" })
	public void LogOut() {
		System.out.println("Logging Out");
	}

	@Test
	public void SignIn() {
		System.out.println("Signing In");
	}
}
