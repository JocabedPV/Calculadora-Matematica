# Jocabed Maijosmi Peña Valenzuela 2026-0053

# Calculadora Matemática

Aplicación de consola en Java que realiza las operaciones matemáticas básicas usando programación estructurada.

## Descripción

El programa muestra un menú interactivo que permite ingresar dos números y realizar:

- Suma
- Resta
- Multiplicación
- División (con validación de división por cero)

El menú se repite hasta que el usuario selecciona la opción **0 (Salir)**. Si el usuario intenta operar sin haber ingresado los números, el programa se lo avisa. Además, muestra la operación completa (ejemplo: `15.0 + 5.0 = 20.0`).

## Requisitos

- Java JDK 8 o superior
- NetBeans (opcional)

## Cómo ejecutarlo

### Desde la terminal

1. Clona el repositorio o descarga el archivo `CalculadoraMatematica.java`.
2. Abre una terminal en la carpeta del archivo.
3. Compila el programa:

```
   javac CalculadoraMatematica.java
```

4. Ejecútalo:

```
   java CalculadoraMatematica
```

### Desde NetBeans

1. Crea un proyecto nuevo de Java.
2. Agrega el archivo `CalculadoraMatematica.java`.
3. Haz clic derecho sobre el archivo y selecciona **Run File**.

## Menú

```
===== CALCULADORA MATEMÁTICA =====
1. Ingresar números
2. Sumar
3. Restar
4. Multiplicar
5. Dividir
0. Salir
==================================
Seleccione una opción:
```

## Ejemplo de ejecución

```
Seleccione una opción: 1
Ingrese el primer número: 15
Ingrese el segundo número: 5
Números ingresados correctamente.

Seleccione una opción: 2
15.0 + 5.0 = 20.0

Seleccione una opción: 5
15.0 / 5.0 = 3.0

Seleccione una opción: 0
¡Gracias por usar la calculadora!
```


