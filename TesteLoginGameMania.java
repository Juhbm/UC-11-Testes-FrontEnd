package br.senai.sp.testegamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginGameMania {
	private WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	@Test
	public void TestarLogin() {
		driver.get("http://localhost:4200/");

		driver.findElement(By.id("link_login")).click();

		// Teste usando o laço de repetição for para 4 senhas: incorreta, curta, vazia e correta.

		WebElement inputEmail = driver.findElement(By.id("login"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botao = driver.findElement(By.id("enviar"));
		
		String[] listaSenhas = {"senai000", "111", "", "senai2021"};
	
		for (int tentativas = 0; tentativas < 4; tentativas++) {
			try {
				
				inputEmail.clear();
				inputSenha.clear();
				
				inputEmail.sendKeys("juliana@email.com");
				inputSenha.sendKeys(listaSenhas[tentativas]);
				botao.click();
				
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		
		// Teste senha individual
		
		/*WebElement inputEmail = driver.findElement(By.id("login"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botao = driver.findElement(By.id("enviar"));
		
		inputEmail.sendKeys("juliana@email.com");
		inputSenha.sendKeys("senai1111");
		botao.click();
		*/

		WebElement mensagem = driver.findElement(By.id("mensagem"));

		System.out.println(mensagem.getText());
	}
}
