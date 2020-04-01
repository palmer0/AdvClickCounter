Feature: contador de clicks avanzado

  Scenario: 01 crear primer contador
    Given mostramos lista de contadores con dimension "0"
    When pulsamos boton de lista de contadores
    Then mostramos contador en lista en posicion "0" con valor "0"
    And mostramos lista de contadores con dimension "1"

  Scenario: 02 crear segundo contador
    Given mostramos lista de contadores con dimension "0"
    When pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    Then mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    
  Scenario: 03 pulsar en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    When pulsamos boton de contador en posicion "1"
    Then mostramos lista de clics con dimension "0"

  Scenario: 04 crear primer clic en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    When pulsamos boton de lista de clics
    Then mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"



  Scenario: 05 crear segundo clic en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    When pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    Then mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"


  Scenario: 06 pulsar en primer clic en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    When pulsamos boton de clics en posicion "0"
    Then mostramos clic en lista en posicion "0" con valor "1"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"


  Scenario: 07 pulsar nuevamente en primer clic en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    When pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    Then mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"


  Scenario: 08 pulsar en segundo clic en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    When pulsamos boton de clics en posicion "1"
    Then mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"

  Scenario: 09 pulsar back en segundo clic en segundo contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    When pulsamos back en lista de contadores
    Then mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"


  Scenario: 10 crear tercer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    When pulsamos boton de lista de contadores
    Then mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"


  Scenario: 11 pulsar en tercer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    When pulsamos boton de contador en posicion "2"
    Then mostramos lista de clics con dimension "0"



  Scenario: 12 crear primer clic en tercer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    When pulsamos boton de lista de clics
    Then mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"



  Scenario: 13 pulsar en primer clic en tercer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    When pulsamos boton de clics en posicion "0"
    Then mostramos clic en lista en posicion "0" con valor "1"
    And mostramos lista de clics con dimension "1"



  Scenario: 14 pulsar nuevamente en primer clic en tercer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    When pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    Then mostramos clic en lista en posicion "0" con valor "2"
    And mostramos lista de clics con dimension "1"



  Scenario: 15 pulsar back en primer clic en tercer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos lista de clics con dimension "1"
    When pulsamos back en lista de contadores
    Then mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "2"
    And mostramos lista de contadores con dimension "3"



  Scenario: 16 pulsar en primer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos lista de clics con dimension "1"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "2"
    And mostramos lista de contadores con dimension "3"
    When pulsamos boton de contador en posicion "0"
    Then mostramos lista de clics con dimension "0"



  Scenario: 17 crear primer clic en primer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos lista de clics con dimension "1"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "2"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "0"
    And mostramos lista de clics con dimension "0"
    When pulsamos boton de lista de clics
    Then mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"




  Scenario: 18 pulsar back en primer clic en primer contador
    Given mostramos lista de contadores con dimension "0"
    And pulsamos boton de lista de contadores
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "0"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de contador en posicion "1"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos clic en lista en posicion "1" con valor "0"
    And mostramos lista de clics con dimension "2"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "1"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos clic en lista en posicion "1" con valor "1"
    And mostramos lista de clics con dimension "2"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos lista de contadores con dimension "2"
    And pulsamos boton de lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "0"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "2"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    And pulsamos boton de clics en posicion "0"
    And pulsamos boton de clics en posicion "0"
    And mostramos clic en lista en posicion "0" con valor "2"
    And mostramos lista de clics con dimension "1"
    And pulsamos back en lista de contadores
    And mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "2"
    And mostramos lista de contadores con dimension "3"
    And pulsamos boton de contador en posicion "0"
    And mostramos lista de clics con dimension "0"
    And pulsamos boton de lista de clics
    And mostramos clic en lista en posicion "0" con valor "0"
    And mostramos lista de clics con dimension "1"
    When pulsamos back en lista de contadores
    Then mostramos contador en lista en posicion "0" con valor "0"
    And mostramos contador en lista en posicion "1" con valor "3"
    And mostramos contador en lista en posicion "2" con valor "2"
    And mostramos lista de contadores con dimension "3"