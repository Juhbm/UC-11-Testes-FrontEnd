package br.senai.sp.automacaoteste;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private WebDriver driver; //criação da variável do driver
	
	@Before
	public void Setup() { //configuração para abrir o chromedriver após 2 segundos e posteriormente maximizar a janela.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegarParaGoogle() { //realização do teste, abrindo o site senai, buscando a palavra "gestão" e acionando enter.
		
		driver.get("https://online.sp.senai.br/");
		
		WebElement input = driver.findElement(By.id("Busca1_txtFiltro"));
		
		input.sendKeys("gestão");
		input.sendKeys(Keys.ENTER);
	}
}
