# Challenge_Conversor_de_Monedas

**Archivo:** `Conversor.java`  
**Clase principal:** `Conversor`  

Este proyecto es un **conversor de monedas por consola**, desarrollado en **Java**, que permite realizar conversiones rápidas entre el dólar estadounidense y monedas latinoamericanas. El usuario interactúa mediante un menú y puede realizar múltiples conversiones hasta que decida salir del programa.

## Funcionalidades
- Menú interactivo para seleccionar el tipo de conversión.
- Conversión entre:
  1. Dólar estadounidense (USD) ↔ Peso Argentino (ARS)  
  2. Dólar estadounidense (USD) ↔ Real Brasileño (BRL)  
  3. Dólar estadounidense (USD) ↔ Peso Colombiano (COP)  
- Colores en la salida para una mejor visualización de resultados.
- Tasas de cambio fijas y fáciles de modificar.
- Permite realizar varias conversiones sin reiniciar el programa.

## Estructura del programa

**Clase `Conversor`**  
Contiene el método `main` y seis métodos auxiliares para cada tipo de conversión.

**Métodos:**
- `main(String[] args)` → Controla el flujo principal del programa, muestra el menú, recibe la opción del usuario y llama al método correspondiente.  
- `convertirDolarAPesoArgentino(Scanner scan)` → Convierte dólares (USD) a pesos argentinos (ARS).  
- `convetirPesoArgentinoaDolar(Scanner scan)` → Convierte pesos argentinos (ARS) a dólares (USD).  
- `convertirDolaraRealBrasileno(Scanner scan)` → Convierte dólares (USD) a reales brasileños (BRL).  
- `convertirRealBrasilenoaDolar(Scanner scan)` → Convierte reales brasileños (BRL) a dólares (USD).  
- `convertirDolaraaPesoColombiano(Scanner scan)` → Convierte dólares (USD) a pesos colombianos (COP).  
- `convertirPesoColombianoaDolar(Scanner scan)` → Convierte pesos colombianos (COP) a dólares (USD).  

## Tecnologías utilizadas
- **Lenguaje:** Java y JDK 17  
