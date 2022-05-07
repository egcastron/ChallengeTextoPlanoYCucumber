# ChallengeTextoPlanoYCucumber

### Descripción:
Proyecto Maven de automatizacion WEB (https://www.way2automation.com/way2auto_jquery/index.php) con Selenium, Cucumber, Screenplay; y parte Main JAVA  para lectura de datos desde TXT. Programa hecho en entorno IntelliJ IDEA, usando Java jdk 1.8.0_111 , Maven apache-maven-3.5.2.
La automatización tiene dos Scenarios, Sc1 con la comparación de mensaje correcto "This is just a dummy form," tras dar Submit al formulario; y Sc2 con un mensaje diferente con propósitos de fallo de Test.

### Despliegue:
Tras clonar, la lectura del archivo 'insumo.txt' se realiza desde el Main ubicado en src/main/java/co/com/tcs/certification/avianca/utils/MainReto1.java . Para correr los Test de automatización el Runner se ubica en src/test/java/co/com/tcs/certification/avianca/runners/ValidateSubmitMessage.java
