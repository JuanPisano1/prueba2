package locators;

import org.openqa.selenium.By;

import javax.print.DocFlavor;

public interface TaskPageLocators {
    //By HOME_TITLE_LABEL=By.id("j_idt11");
    By BOTON_BUSCAR_CLIENTE=By.xpath("/html/body/div[1]/div/form/table/tbody/tr/td[2]/div/ul/li[2]");
    By BUSCAR_CLIENTE_POR_CUS=By.id("PorNumero");
    By INGRESAR_NUMERO_CLIENTE=By.id("busquedaCliente:numeroCliente");
    By BOTON_BUSCAR=By.id("busquedaCliente:btnBusquedaPorNumero");
    By FORMULARIO_CLIENTE_ENCONTRADO=By.id("formularioClientesEncontrados:resultadoBusqueda:0:j_idt129");
    By FORMULARIO=By.id("j_idt802:formularioContratos:grillaResumenServiciosPorEmpresa_data");
   // By FORMULARIO=By.xpath("//*[@id=\"j_idt803:formularioContratos:grillaResumenServiciosPorEmpresa_data\"]/tr/td[1]/div");
 //   By VER_DOMINIO=(By.className("ui-row-toggler ui-icon ui-icon-circle-triangle-e"));
    By INGRESO_CONTRATO= By.xpath("//*[@id=\"j_idt677:formularioContratos:grillaResumenServiciosPorEmpresa_data\"]/tr/td[1]/div");
    By GENERAR_TRAMITE=By.id("j_idt677:formularioContratos:grillaResumenServiciosPorEmpresa:0:grilla:0:j_idt720");
    By TRAMITE_MODIFICACION_DATOS=By.xpath("//*[@id=\"formDetalleNuevoTramite:tipoDeTramite\"]/div[1]/ul/li[5]/span");
    By INGRESAR_OBSERVACION=By.id("formDetalleNuevoTramite:observacion");
    By SIGUIENTE=By.id("formDetalleNuevoTramite:btnSiguiente");
    By DESPLEGAR_CANALES_ATENCION=By.id("formularioDeTramite:dialogoQueja:formBaja:selectTipoCanal_label");
    By CANALATENCION=By.cssSelector("#formDetalleNuevoTramite\\:selectCanal_label");

    By GUARDAR_TRAMITE=By.id("j_idt171");
    By CALL_CENTER=By.id("formularioDeTramite:dialogoQueja:formBaja:selectTipoCanal_4");
    By DNI_TITULAR=By.id("formWizard:numeroIdentificacion");
    By BUSCAR_CLIENTE_DESTINATARIO=By.id("formWizard:btnBusquedaPorIdentificacion");
    By TIPO_CANAL=By.id("formWizard:j_idt231:selectTipoDeCanal");
    By TIPO_CALLCENTER=By.id("formWizard:j_idt231:selectTipoDeCanal_4");
    By CANAL=By.id("formWizard:j_idt231:selectCanal");
    By TIPO_CANAL_CALLCONTACT=By.id("formWizard:j_idt231:selectCanal_1");
    By VENDEDOR=By.id("formWizard:j_idt231:selectVendedor");
    By VENDEDOR_ECABANA=By.id("formWizard:j_idt231:selectVendedor_1");

    By CAMPANIA=By.id("formWizard:j_idt231:selectCampania");

    By CAMPANIA_ATENCIONCLIENTE=By.id("formWizard:j_idt231:selectCampania_1");

    By SOLUCION=By.id("formWizard:j_idt274:selectSolucion");

    By TIPO_SOLUCION=By.id("formWizard:j_idt274:selectSolucion_1");

    By FRECUENCIA_FACTURACION=By.id("formWizard:j_idt274:selectFrecuencia");

    By PRECIO_MENSUAL=By.id("formWizard:j_idt274:selectFrecuencia_1");

    By SELECCIONAR_LISTAPRECIO=By.id("formWizard:j_idt274:selectListaDePrecios_label");
    By LISTAPRECIO=By.id("formWizard:j_idt274:selectListaDePrecios_1");

    By SELECCIONAR_CONTRATO=By.id("formWizard:grillaDetalleDeIdentificables_data");

    By GUARDARREACTIVACION=By.id("j_idt271");
    By TIPOCANALREACTIVACION=By.id("j_idt147:j_idt150:selectTipoDeCanal");
    By CALLCENTERVENTANAREACTIVACION=By.id("j_idt147:j_idt150:selectTipoDeCanal_4");
    By CANALPANTALLAREACTIVACION=By.id("j_idt147:j_idt150:selectCanal");
    By CANALCALLCONTACTPANTALLAREACTIVACION=By.id("j_idt147:j_idt150:selectCanal_1");
    By VENDEDORPANTALLAREACTIVACION=By.id("j_idt147:j_idt150:selectVendedor");
    By VENDEDOREBANAPANTALLAREACTIVACION=By.id("j_idt147:j_idt150:selectVendedor_1");
    By CAMPANIAPANTALLAREACTIVACION=By.id("j_idt147:j_idt150:selectCampania_label");
    By CAMPANIAATENCIONALCLIENTEPANTALLAREACTIVACION=By.id("j_idt147:j_idt150:selectCampania_1");
    By SOLUCIONINACTIVAPANTALLAREACTIVACION=By.id("j_idt147:j_idt194:selectSolucion");
    By SOLUCIONINACTIVACONTRATADAPANTALLAREACTIVACION=By.xpath("//*[@id='j_idt147:j_idt194:selectSolucion_1']");
    By BOTONESTADOCONTRATOACTIVO=By.id("j_idt676:formularioContratos:j_idt681:0");
    By BOTONEXPANDIRCONTRATOACTIVOS=By.xpath("//*[@id='j_idt676:formularioContratos:grillaResumenServiciosPorEmpresa_data']/tr/td[1]/div");

    By BOTONOJITOACTIVO=By.id("j_idt676:formularioContratos:grillaResumenServiciosPorEmpresa:0:grilla:0:j_idt718");
    By BOTONTRAMITESDENTRODELOJO=By.xpath("//*[@id='formDatosCuenta:j_idt160:j_idt215']/ul/li[5]");
    By BOTONPARAENTRARAFINALIZARTRAMITE=By.id("formDatosCuenta:j_idt160:j_idt215:tramites:0:j_idt419");
    By BOTONTOMARTAREAERRORACTIVACIONSIM=By.xpath("//*[@id='j_idt204:j_idt205:j_idt220:j_idt221:0:j_idt244']/span[1]");
    By BOTONFINALIZARREACTIVACIONSIM=By.id("formResolucion:j_idt210");
    By BOTONCAMBIODOMICILIOFACTURACION=By.xpath("//*[@id='formDetalleNuevoTramite:tipoDeTramite']/div[2]/ul/li[4]");
    By TEXTBOXDIRECCIONCAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:calle");
    By TEXTBOXALTURACAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:altura");
    By TEXTBOXPROVINCIACAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:provincia_input");
    By TEXTBOXPARTIDOCAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:partido_input");
    By TEXTBOXLOCALIDADCAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:localidad_input");
    By TEXTBOXCODIGOPOSTALCAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:codigoPostal");
    By BOTONNORMALIZARCAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:j_idt198");
    By BOTONCONFIRMARNORMALIZACIONCAMBIODOMICILIOFACTURACION = By.id("j_idt183:j_idt184:j_idt221");
    By TEXTBOXTELEFONOCAMBIODOMICILIOFACTURACION = By.id("datosIdentificatorios:telefonoNuevo");
    By botonGUARDARCAMBIODOMICILIOFACTURACION = By.id("j_idt255");
    By botonACEPTARCAMBIODOMICILIOFACTURACION = By.id("formularioConfirmacionTramite:btnVolverADetalleCliente2");
    By COMENTARIOQUEJA = By.id("formResolucion:observacionResolucion");
    By MONTORECLAMOQUEJA = By.id("formResolucion:montoEnReclamo");
    By tramiteAdministrativosCambiodeAcuerdo = By.xpath("//*[@id='formDetalleNuevoTramite:tipoDeTramite']/div[2]/ul/li[3]");
    By tipoDeCanalPantallaCambioAcuerdo = By.id("j_idt147:j_idt149:selectTipoDeCanal_label");
    By callCenterCanalPantallaCambioAcuerdo = By.xpath("//*[@id='j_idt147:j_idt149:selectTipoDeCanal_4']");
    By canalPantallaCambioAcuerdo = By.id("j_idt147:j_idt149:selectCanal_label");
    By callycontactCanalPantallaCambioAcuerdo= By.xpath("//*[@id='j_idt147:j_idt149:selectCanal_1']");
    By vendedorPantallaCambioAcuerdo= By.id("j_idt147:j_idt149:selectVendedor_label");
    By vendedorEcabanaPantallaCambioAcuerdo= By.xpath("//*[@id='j_idt147:j_idt149:selectVendedor_1']");
    By campaniaPantallaCambioAcuerdo= By.id("j_idt147:j_idt149:selectCampania_label");
    By atencionalclienteCampaniaPantallaCambioAcuerdo= By.xpath("//*[@id='j_idt147:j_idt149:selectCampania_1']");
    By solucioncontratadaPantallaCambioAcuerdo= By.id("j_idt147:j_idt193:selectSolucion_label");
    By seleccionarSolucioncontratadaPantallaCambioAcuerdo= By.xpath("//*[@id='j_idt147:j_idt193:selectSolucion_1']");
    By nuevoAcuerdoSponsoreoPantallaCambioAcuerdo= By.id("j_idt147:selectAcuerdoDeSponsoreo_label");
    By seleccionarNuevoAcuerdoSponsoreoPantallaCambioAcuerdo= By.xpath("j//*[@id='j_idt147:selectAcuerdoDeSponsoreo_1']");
    By botonGUARDARPantallaCambioAcuerdo= By.id("j_idt247");
    By botonGUARDARSegundaPantallaCambioAcuerdo= By.id("j_idt171");
    By comboBoxTipoCanalPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectTipoDeCanal_label");
    By callCenterTipoCanalPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectTipoDeCanal_1");
    By comboBoxCanalPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectCanal_label");
    By callContactCanalPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectCanal_1");
    By comboBoxVendedorPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectVendedor_label");
    By ebannaVendedorPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectVendedor_1");
    By comboBoxCampaniaPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectCampania_label");
    By atencionAlClienteCampaniaPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt150:selectCampania_1");
    By comboBoxMotivoPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectMotivoDeTramite_label");
    By aumentoMotivoPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectMotivoDeTramite_1");
    By comboBoxSolucionActualPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt208:selectSolucion_label");
    By seleccionarSolucionActualPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:j_idt208:selectSolucion_1");
    By comboBoxFrecuenciaFacturacionPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectFrecuenciaDeFacturacion_label");
    By mensualFrecuenciaFacturacionPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectFrecuenciaDeFacturacion_1");
    By comboBoxListaPreciosFacturacionPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectListaDePrecio_label");
    By listaListaPreciosFacturacionPantallaCambioListaPrecioYFacturacion= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectListaDePrecio_1");
    By importeAFacturar= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectImporteAFacturar");
    By importeFactura= By.id("tabViewCambioDeListaDePreciosYCondicionesDeFacturacion:j_idt146:selectImporteAFacturar_1");
    By botonGuardarPantallaCambioListaPrecioYFacturacion= By.id("j_idt360");
    By botonGuardarPantallaCambioListaPrecioYFacturacionConfirmarTramite= By.id("formularioConfirmacionTramite:btnVolverADetalleCliente2");
    By comentarioQuejaPorBaja= By.id("formResolucion:observacionResolucion");
}
