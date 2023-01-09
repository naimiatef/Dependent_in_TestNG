package Inherited_Dependent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
L’héritage est un concept populaire dans les paradigmes de programmation orientée objet, 
et surtout si vous avez travaillé en Java, vous devez l’avoir beaucoup entendu et utilisé.
 Dans les méthodes utilisées précédemment, nous avons utilisé tous les tests de la même classe dans
  TestNG. Dans les méthodes de test dépendantes héritées dans TestNG, nous créons une dépendance 
  entre les méthodes qui appartiennent à différentes classes, et l’une des classes hérite des
   fonctionnalités d’une autre classe
 */
class SuperClass {
	@Test
	public void OpenBrowser() {
		System.out.println("BrowserOpened");
	}
}

public class Inherited_Dependent extends SuperClass {
	@Test(dependsOnMethods = { "OpenBrowser" })
	public void LogIn() {
		System.out.println("Logged In");
	}

}
