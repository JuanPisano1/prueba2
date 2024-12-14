package pages;

import io.qameta.allure.Step;
import locators.LandingPageLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LandingPage extends BasePage implements LandingPageLocators {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @Step("Ingresa a la pagina de mercado")
    public void visitGroupLife() {
        visit(URL_GROUPLIFE);
        waitLoading();
    }

    @Step("Ingreso {string} en el campo de fecha")
    public void ingresaFecha(String fecha) {
        WebElement dateInput = driver.findElement(FECHADENACIMIENTO);
        dateInput.sendKeys(fecha);
        dateInput.sendKeys(Keys.ENTER);
        sleepSeconds(2);
    }
    @Step("Selecciona la provincia")
    public void ingresaProvincia() {
        waitClick(INPUTPROV);
        // Espera a que el menú desplegable esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-province-results")));
        // Busca la opción "CABA" dentro del menú
        WebElement opcionCABA = dropdown.findElement(By.xpath(".//li[contains(text(), 'CABA')]"));
        opcionCABA.click();

        }

    @Step("Ingresa número de teléfono: Código de área - {0}, Número - {1}")
    public void ingresarNumeroDeTelefono(String codigoArea, String numeroTelefono) {
        try {
            sleepSeconds(2);
            WebElement campoCodigoArea = findElement(By.id("txtPhoneCode"));
            WebElement campoNumeroTelefono = findElement(By.id("txtPhoneNumber"));
            campoCodigoArea.clear();
            campoCodigoArea.sendKeys(codigoArea);
            campoNumeroTelefono.clear();
            campoNumeroTelefono.sendKeys(numeroTelefono);
            campoNumeroTelefono.sendKeys(Keys.ENTER);

            System.out.println("Número de teléfono ingresado correctamente: " + codigoArea + " " + numeroTelefono);
        } catch (Exception e) {
            System.err.println("Ocurrió un error al ingresar el número de teléfono: " + e.getMessage());
        }
    }
        @Step("Validar que el campo de fecha tenga errores")
        public void validarErrorFecha() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement campoFechaNacimiento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BirthdayStep1")));

            // Verifica si el campo tiene la clase 'customError'
            if (campoFechaNacimiento.getAttribute("class").contains("form-control dateValidation personsToCover maskedInput customError")) {
                System.out.println("Validación exitosa: El campo fecha de nacimiento tiene el error 'customError'.");
            } else {
                throw new AssertionError("El campo fecha de nacimiento no tiene el error 'customError'.");
            }

            System.out.println("Validación exitosa: El campo de fecha tiene un error.");
        }

    @Step("Validar que el campo provincia muestra el mensaje de error 'The ProvinceId field is required.' cuando no se selecciona una provincia")
    public void validarErrorProvincia() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement campoProvincia = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("province")
        ));
        // Verifica si el atributo aria-invalid es "true"
        boolean tieneError = campoProvincia.getAttribute("aria-invalid").equals("true");
        // Si el campo tiene error, verifica que el mensaje de error 'The ProvinceId field is required.' aparezca
        if (tieneError) {
            // Verificamos si el mensaje de error se encuentra en el atributo data-val-required
            String mensajeErrorEsperado = "The ProvinceId field is required.";

            String mensajeError = campoProvincia.getAttribute("data-val-required");

            if (mensajeError != null && mensajeError.equals(mensajeErrorEsperado)) {
                System.out.println("El mensaje de error es correcto: " + mensajeError);
            } else {
                throw new AssertionError("El mensaje de error no es correcto. Esperado: 'The ProvinceId field is required.'");
            }
        } else {
            throw new AssertionError("El campo 'province' no mostró el error esperado.");
        }

    }
    @Step("Validar mensaje de error en telefono")
    public void validarMensajeDeErrorTelefono() {
        WebElement phoneInput = driver.findElement(By.id("txtPhoneNumber"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(phoneInput));
// Verificar si el campo tiene error
        String ariaInvalid = phoneInput.getAttribute("aria-invalid");
        boolean isInvalid = ariaInvalid.equals("true");
// Verificar si el campo tiene la clase "customError" que podría indicar un error
        boolean hasErrorClass = phoneInput.getAttribute("class").contains("customError");
// Verificar si alguno de los dos indica error
        if (isInvalid || hasErrorClass) {
            System.out.println("El campo de teléfono tiene un error.");
        } else {
            System.out.println("El campo de teléfono es válido.");
        }

    }

}









/*

        waitClick(CANALATENCION);
        if (canal == null || canal.isEmpty()) {
            throw new IllegalArgumentException("El parámetro 'canal' no puede ser nulo o vacío.");
        }
        try {
            if (canal.equals("Call center")) {
                waitClick(By.xpath("//*[@id=\"formDetalleNuevoTramite:selectCanal_2\"]"));
            } else {
                throw new IllegalArgumentException("El tipo de trámite " + canal + " no es valido");
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("No se pudo hacer click en el canal de atencion: " + canal);
        }
        waitClick(SIGUIENTE);
        sleepSeconds(10);


























    }



    ///////////////////////
    @Step("Ingresa la suma asegurada")
    public void sumaAsegurada() {
        // Encuentra el manejador del slider (min-slider-handle)
        WebElement sliderHandle = driver.findElement(By.cssSelector(".slider-handle.min-slider-handle.round"));

        // Si deseas hacer clic directamente en el slider, puedes hacerlo de la siguiente manera:
        Actions actions = new Actions(driver);
        actions.moveToElement(sliderHandle).click().perform();  // Hacer clic en el slider

        // Si necesitas mover el slider a un valor específico (en porcentaje), puedes usar el siguiente código
        int porcentaje = 0;
        int desplazamientoX = (int) (sliderHandle.getSize().width * porcentaje / 100.0);  // Calcula el desplazamiento en píxeles

        // Mover el slider al valor deseado en el porcentaje (por ejemplo, 50% de la barra)
        actions.dragAndDropBy(sliderHandle, desplazamientoX, 0).perform();  // Mover el slider
        */


