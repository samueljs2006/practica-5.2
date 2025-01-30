# Practica 5.2

## a) Los elementos que te has encontrado en UML y que tienen mapeo sobre conceptos orientados a objetos.

- Los elemento que he encontrado son las class : clientes , pedido, pago , estadoPedido , detallePedido , producto , heredan de pago(Efectivo, Cheque , Tarjeta) con sus atributos y sus metodos que lo puedes ver en el archivo pdf que esta en el repositorio y tambien la relaciones que hay entre clases

## b) Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.

- He ultilizado lucidchart  para crear el diagrama de UML , la elegido porque es muy comodo y se guarda todo ne la nube , se puede trabajar en equipo compartiendo el enlace , lo puedes exportar y importar en diferentes formatos y es gratis.

## c) Explicación sobre la conversión del diagrama UML al código, explicando las decisiones que has tomado. No tiene porque ser el codigo completo, pero si un esquema de lo que podría llegar a ser. 


## 1. Clientes y Productos como Clases

- **Cliente** y **Producto** son representados como clases que contienen atributos relevantes como `id`, `nombre`, `email`, etc., para Cliente y `id`, `nombre`, `descripcion`, `precio`, `impuesto` y `stock` para Producto. Este mapeo es directo desde el diagrama UML.
- Estas clases son modeladas como `data class` en Kotlin, lo que facilita la creación de objetos inmutables con funciones estándar como `toString()`, `equals()`, etc.

## 2. Relación entre Pedido y DetallePedido

- El diagrama muestra una relación uno-a-muchos entre `Pedido` y `DetallePedido`. Esto se refleja con la clase `Pedido` teniendo una lista mutable de objetos `DetallePedido`, que se agregan usando el método `agregarDetalle`.
- El cálculo del total del pedido es una función (`calcularTotal()`) en la clase `Pedido`, que suma los subtotales de todos los `DetallePedido`.

## 3. Estado del Pedido

- Se utiliza un **enum** (`EstadoPedido`) para representar los diferentes estados de un pedido, como pendiente (`Pdte`), pagado (`Pgdo`), completado (`Pcdo`), enviado (`Envdo`) y entregado (`Entgdo`).
- El estado se mantiene en la clase `Pedido` como una propiedad mutable.

## 4. Tipos de Pago

- La clase base `Pago` tiene atributos comunes como `id`, `monto`, `fecha` y `tipo`. Las clases derivadas (`Tarjeta`, `Efectivo`, `Cheque`) heredan de `Pago` y añaden atributos específicos de cada tipo de pago, como `numero` y `fechaCaducidad` para `Tarjeta` o `banco` y `nombre` para `Cheque`.
- Esta jerarquía refleja la necesidad de diferentes tipos de pago, pero compartiendo comportamientos comunes definidos en la clase base `Pago`.

## 5. Uso de funciones de soporte

- En el código se utiliza `sumOf` para calcular el total del pedido de manera eficiente, lo que muestra cómo un comportamiento agregado se implementa en las clases. Esta función recorre los detalles del pedido, sumando los subtotales de cada `DetallePedido`.




