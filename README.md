# Practicas Java
Este repositorio contiene el primer taller del programa canteras nivel 2 de SOFKA, en este taller podrás ver una aplicación con una visual obtenida por la importación de JOptionPane.
El objetivo principal del taller es demostrar las habilidades de los conceptos básicos de la programación orientada a objetos en el lenguaje JAVA.

## Conceptos practicados 

 - Clases, métodos y atributos
 - Modificadores de acceso
 - Objetos y ArrayList

## Funcionalidad

El sistema cuenta con un menú principal el cual contiene 5 opciones, cada opción corresponde a una clase la cual ejecutara un proceso independiente, las siguientes 
funciones pertenecen a este sistema.

- Registro - emula el proceso de registrar un usuario y realiza una validad de edad para permitir el registro.
- Registro - permite guardar las características básicas de una fruta su nombre, peso y colores
- Validación - permite simular el proceso de retiro y depósito de una cuenta bancaria, valida si el número de cuenta coincide con el del usuario y si el saldo es suficiente para retirar
- Registro - Guarda los datos código, nombre y valor de un producto, permite registrar (n) números de productos
- Registro - Guarda los datos código, nombre y valor de un carro, permite registrar (n) números de productos

## Conceptos

En cada opción del sistema se creó una clase que contiene métodos, atributos y modificadores de acceso, en algunas se utilizaron herencia de clases a través de sus métodos y atributos

 - En la primera opción se creó dos funciones, en una se realiza la validación y registro de datos, en otra se imprime los datos registrados. getters y setter hicieron parte de esta clase.
 - En la segunda opción se crea un método constructor el cual ejecuta el proceso de registro, nombre, peso y los colores los cuales se guardan en un arraylist por medio de un ciclo que itera por la cantidad digitada de colores a registrar.
 - En la tercera opción se crea un método constructor que tiene unos valores iniciales y ejecuta el método que contiene un menú que cuenta con las opciones de retirar o depositar las cuales cada una tiene su propio método, finalmente se crea un método que imprime toda la información registrada 
 - En el caso de la opción 4 y 5 se crea un objeto de tipo article permite crear cada artículo a registrar en un arraylist, luego se crea una clase inventory el cual crea métodos que permiten ejecutar las diferentes opciones que se emplearan en el arraylist (crear el arraylist, agregar cada objeto, imprimir cada objeto)
 por último, creamos una clase RegisterToInventory que solicita la información a guardar de esa clase hereda métodos y atributos la clase RegisterToInventoryCars.
 
 ## Menú del sistema

 
    | Documentación |       Sistema        |
    | ------------- | -------------------- |
    |    Opcion 1   | Person registration  |
    |    Opcion 2   | Fruit inventory      | 
    |    Opcion 3   | Bank account         |
    |    Opcion 4   | Register products    |  
    |    Opcion 5   | Register cars        |
   
## Authors

- [@Tavodeveloper](https://github.com/Gustavo-dev-96)
