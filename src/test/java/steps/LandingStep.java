package steps;

import database.business.BoxesDB;
import database.business.Servicio;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPage;
import utils.GlobalData;

import java.util.Locale;
import java.util.Random;

import static utils.GlobalData.*;
import static utils.GlobalData.motor;


public class LandingStep extends  BaseStep {
	LandingPage landingPage;

	public LandingStep() throws Exception {
		landingPage = new LandingPage(Hooks.getRunnerDriver());

	}

	@Test(description = "Boxes Page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Ingreso a la pagina de Boxesº")
	@Story("Story: Recupero GPS")
	@Given("Ingresa a la web")
	public void visitOctopus() {
		landingPage.visitGroupLife();
		//	Assert.assertTrue(landingPage.isLandingPage());
	}

	@When("Ingresa {string} en el campo de fecha")
	public void ingresaFechaNacimiento(String fecha) {
		landingPage.ingresaFecha(fecha);
	}

	@And("Selecciona la provincia")
	public void ingresaProvincia() {
		landingPage.ingresaProvincia();

	}

	@And("Se ingresa el numero de telefono con codigo de area {string} y numero {string}")
	public void ingresarTelefono(String codigoArea, String numeroTelefono) {
		landingPage.ingresarNumeroDeTelefono(codigoArea, numeroTelefono);
	}

	@And("Valida que el campo fecha tenga errores")
	public void validarFecha() {
		landingPage.validarErrorFecha();
	}

	@And("Valida que el campo provincia tenga errores")
	public void validarFechah() {
		landingPage.validarErrorProvincia();
	}

	@Then("Valida que aparezca el mensaje de error en telefono")
	public void validaErrorTelefono() {
		landingPage.validarMensajeDeErrorTelefono();
	}

	}



	//*[@id="frmIndex"]/div[1]/div[3]/div/div[2]

//	@And("Hace click en suma asegurada")
//	public void sumaAsegurada(){
//		landingPage.sumaAsegurada();


