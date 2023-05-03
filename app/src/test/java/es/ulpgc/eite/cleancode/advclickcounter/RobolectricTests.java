package es.ulpgc.eite.cleancode.advclickcounter;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.RobolectricTestRunner;


@RunWith(RobolectricTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RobolectricTests {


  public RobolectricSteps steps = new RobolectricSteps();



  @Test
  public void test01CrearPrimerContador() {
    

    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // When pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de contadores con dimension "1"
    steps.mostramosListaDeContadoresConDimensionP1("1");
  }

  @Test
  public void test21CrearPrimerContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // When rotamos pantalla
    steps.rotarPantallaP1("Counters");
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de contadores con dimension "1"
    steps.mostramosListaDeContadoresConDimensionP1("1");

  }

  @Test
  public void test02CrearSegundoContador() {
    

    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // When pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de contadores con dimension "2"
    steps.mostramosListaDeContadoresConDimensionP1("2");
  }


  @Test
  public void test22CrearSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // When rotamos pantalla
    steps.rotarPantallaP1("Counters");
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de contadores con dimension "2"
    steps.mostramosListaDeContadoresConDimensionP1("2");
  }

  @Test
  public void test03PulsarEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // When pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    // Then mostramos lista de clics con dimension "0"
    steps.iniciamosPantallaP1("Clicks");
    steps.mostramosListaDeClicsConDimensionP1("0");
  }

  @Test
  public void test23PulsarEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos lista de clics con dimension "0"
    steps.mostramosListaDeClicsConDimensionP1("0");
  }


  @Test
  public void test04CrearPrimerClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // When pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test24CrearPrimerClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }

  @Test
  public void test05CrearSegundoClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // When pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos clic en lista en posicion "1" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }

  @Test
  public void test25CrearSegundoClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos clic en lista en posicion "1" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test06PulsarEnPrimerClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // Then mostramos clic en lista en posicion "0" con valor "1"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos clic en lista en posicion "1" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test26PulsarEnPrimerClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "1"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos clic en lista en posicion "1" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test07PulsarNuevamenteEnPrimerClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // Then mostramos clic en lista en posicion "0" con valor "2"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
    // And mostramos clic en lista en posicion "1" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test27PulsarNuevamenteEnPrimerClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "2"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
    // And mostramos clic en lista en posicion "1" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test08PulsarEnSegundoClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // When pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // Then mostramos clic en lista en posicion "0" con valor "2"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
    // And mostramos clic en lista en posicion "1" con valor "1"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "1");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test28PulsarEnSegundoClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "2"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
    // And mostramos clic en lista en posicion "1" con valor "1"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("1", "1");
    // And mostramos lista de clics con dimension "2"
    steps.mostramosListaDeClicsConDimensionP1("2");
  }


  @Test
  public void test09PulsarBackEnSegundoClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // When pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos lista de contadores con dimension "2"
    steps.mostramosListaDeContadoresConDimensionP1("2");
  }


  @Test
  public void test29PulsarBackEnSegundoClicEnSegundoContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Counters");
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos lista de contadores con dimension "2"
    steps.mostramosListaDeContadoresConDimensionP1("2");
  }


  @Test
  public void test10CrearTercerContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // When pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos contador en lista en posicion "2" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "0");
    // And mostramos lista de contadores con dimension "3"
    steps.mostramosListaDeContadoresConDimensionP1("3");
  }


  @Test
  public void test30CrearTercerContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // When rotamos pantalla
    steps.rotarPantallaP1("Counters");
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos contador en lista en posicion "2" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "0");
    // And mostramos lista de contadores con dimension "3"
    steps.mostramosListaDeContadoresConDimensionP1("3");
  }


  @Test
  public void test11PulsarEnTercerContador() {


    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // When pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // Then mostramos lista de clics con dimension "0"
    steps.mostramosListaDeClicsConDimensionP1("0");
  }


  @Test
  public void test31PulsarEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos lista de clics con dimension "0"
    steps.mostramosListaDeClicsConDimensionP1("0");
  }


  @Test
  public void test12CrearPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // When pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test32CrearPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }

  @Test
  public void test13PulsarEnPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // Then mostramos clic en lista en posicion "0" con valor "1"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test33PulsarEnPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "1"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }

  @Test
  public void test14PulsarNuevamenteEnPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // Then mostramos clic en lista en posicion "0" con valor "2"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test34PulsarNuevamenteEnPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "2"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test15PulsarBackEnPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // When pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos contador en lista en posicion "2" con valor "2"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
    // And mostramos lista de contadores con dimension "3"
    steps.mostramosListaDeContadoresConDimensionP1("3");
  }


  @Test
  public void test35PulsarBackEnPrimerClicEnTercerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Counters");
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos contador en lista en posicion "2" con valor "2"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
    // And mostramos lista de contadores con dimension "3"
    steps.mostramosListaDeContadoresConDimensionP1("3");
  }


  @Test
  public void test16PulsarEnPrimerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // When pulsamos boton de contador en posicion "0"
    steps.pulsamosBotonDeContadorEnPosicionP1("0");
    steps.iniciamosPantallaP1("Clicks");
    // Then mostramos lista de clics con dimension "0"
    steps.mostramosListaDeClicsConDimensionP1("0");
  }


  @Test
  public void test36PulsarEnPrimerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de contador en posicion "0"
    steps.pulsamosBotonDeContadorEnPosicionP1("0");
    steps.iniciamosPantallaP1("Clicks");
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos lista de clics con dimension "0"
    steps.mostramosListaDeClicsConDimensionP1("0");
  }


  @Test
  public void test17CrearPrimerClicEnPrimerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de contador en posicion "0"
    steps.pulsamosBotonDeContadorEnPosicionP1("0");
    steps.iniciamosPantallaP1("Clicks");
    // When pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test37CrearPrimerClicEnPrimerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de contador en posicion "0"
    steps.pulsamosBotonDeContadorEnPosicionP1("0");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Clicks");
    // Then mostramos clic en lista en posicion "0" con valor "0"
    steps.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos lista de clics con dimension "1"
    steps.mostramosListaDeClicsConDimensionP1("1");
  }


  @Test
  public void test18PulsarBackEnPrimerClicEnPrimerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de contador en posicion "0"
    steps.pulsamosBotonDeContadorEnPosicionP1("0");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // When pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos contador en lista en posicion "2" con valor "2"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
    // And mostramos lista de contadores con dimension "3"
    steps.mostramosListaDeContadoresConDimensionP1("3");
  }


  @Test
  public void test38PulsarBackEnPrimerClicEnPrimerContador() {
    // Given mostramos lista de contadores con dimension "0"
    steps.iniciamosPantallaP1("Counters");
    steps.mostramosListaDeContadoresConDimensionP1("0");
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "1"
    steps.pulsamosBotonDeContadorEnPosicionP1("1");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "1"
    steps.pulsamosBotonDeClicsEnPosicionP1("1");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de lista de contadores
    steps.pulsamosBotonDeListaDeContadores();
    // And pulsamos boton de contador en posicion "2"
    steps.pulsamosBotonDeContadorEnPosicionP1("2");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos boton de clics en posicion "0"
    steps.pulsamosBotonDeClicsEnPosicionP1("0");
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // And pulsamos boton de contador en posicion "0"
    steps.pulsamosBotonDeContadorEnPosicionP1("0");
    steps.iniciamosPantallaP1("Clicks");
    // And pulsamos boton de lista de clics
    steps.pulsamosBotonDeListaDeClics();
    // And pulsamos back en lista de clics
    steps.pulsamosBackEnListaDeClics();
    // When rotamos pantalla
    steps.rotarPantallaP1("Counters");
    // Then mostramos contador en lista en posicion "0" con valor "0"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
    // And mostramos contador en lista en posicion "1" con valor "3"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
    // And mostramos contador en lista en posicion "2" con valor "2"
    steps.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
    // And mostramos lista de contadores con dimension "3"
    steps.mostramosListaDeContadoresConDimensionP1("3");
  }

}