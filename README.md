#Practica 5.2

a) Los elementos que te has encontrado en UML y que tienen mapeo sobre conceptos orientados a objetos.

Los elemento que he encontrado son las class : clientes , pedido, pago , estadoPedido , detallePedido , producto , heredan de pago(Efectivo, Cheque , Tarjeta) con sus atributos y sus metodos 
que lo puedes ver en el archivo pdf que esta en el repositorio y tambien la relaciones que hay entre clases

b) Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.

He ultilizado lucidchart  para crear el diagrama de UML , la elegido porque es muy comodo y se guarda todo ne la nube , se puede trabajar en equipo compartiendo el enlace , lo puedes exportar 
y importar en diferentes formatos y es gratis.

c) Explicación sobre la conversión del diagrama UML al código, explicando las decisiones que has tomado. No tiene porque ser el codigo completo, pero si un esquema de lo que podría llegar a ser. 

-Uso de data class para clases de solo datos.
-Implementación de relaciones mediante listas (MutableList) y herencia (open class).
-Métodos específicos (calcularTotal(), agregarDetalle()) para cumplir con la funcionalidad esperada.
-Uso de enum class para valores predefinidos.




