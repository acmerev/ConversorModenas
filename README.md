# Conversor de Moneda - Challenge ONE - Java - Back End

Este proyecto es un **Conversor de Moneda** desarrollado en Java que utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para realizar conversiones de divisas. Es parte del Challenge ONE orientado a desarrollar habilidades en el back end con Java.

## Características

- Conversión entre varias monedas filtradas (USD, EUR, JPY, MXN, GBP, CAD, MX).
- Consulta de tasas de cambio en tiempo real utilizando la API de ExchangeRate-API.
- Guardado de un historial de conversiones en un archivo de texto.
- Interfaz de consola interactiva para seleccionar la conversión deseada.

## Requisitos

- JDK 11 o superior.
- Dependencia `Gson` para manejar los datos JSON.
- Clave de API válida de [ExchangeRate-API](https://www.exchangerate-api.com/).

## Dependencias

Si estás usando Maven, añade la siguiente dependencia para Gson en tu archivo `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
