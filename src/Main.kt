import java.util.Date

// Clase Cliente
data class Cliente(
    val id: Int,
    val nombre: String,
    val email: String,
    val telefono: String
)

// Clase Producto
data class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val impuesto: Float,
    var stock: Int
)

// Clase DetallePedido
data class DetallePedido(
    val id: Int,
    val cantidad: Int,
    val subtotal: Float
)

// Enum EstadoPedido
enum class EstadoPedido {
    Pdte, Pgdo, Pcdo, Envdo, Entgdo
}

// Clase Pedido
class Pedido(
    val id: Int,
    val fecha: Date,
    var estado: EstadoPedido,
    private val detalles: MutableList<DetallePedido> = mutableListOf()
) {
    fun agregarDetalle(detalle: DetallePedido) {
        detalles.add(detalle)
    }

    fun calcularTotal(): Float {
        return detalles.sumOf { it.subtotal.toDouble() }.toFloat()
    }
}

// Clase Pago
open class Pago(
    val id: Int,
    val monto: Float,
    val fecha: Date,
    val tipo: String
)

// Clase Tarjeta
class Tarjeta(
    id: Int,
    monto: Float,
    fecha: Date,
    tipo: String,
    val numero: String,
    val fechaCaducidad: Date,
    val tipoTarjeta: String
) : Pago(id, monto, fecha, tipo)

// Clase Efectivo
class Efectivo(
    id: Int,
    monto: Float,
    fecha: Date,
    tipo: String,
    val tipoMoneda: String
) : Pago(id, monto, fecha, tipo)

// Clase Cheque
class Cheque(
    id: Int,
    monto: Float,
    fecha: Date,
    tipo: String,
    val nombre: String,
    val banco: String
) : Pago(id, monto, fecha, tipo)

fun main() {
    // Creación de un cliente
    val cliente = Cliente(1, "Juan Pérez", "juan@example.com", "123456789")

    // Creación de productos
    val producto1 = Producto(1, "Laptop", "Laptop potente", 1000.0f, 0.16f, 10)
    val producto2 = Producto(2, "Mouse", "Mouse inalámbrico", 50.0f, 0.16f, 20)

    // Creación de detalles de pedido
    val detalle1 = DetallePedido(1, 1, producto1.precio * (1 + producto1.impuesto))
    val detalle2 = DetallePedido(2, 2, producto2.precio * (1 + producto2.impuesto) * 2)

    // Creación de pedido
    val pedido = Pedido(1, Date(), EstadoPedido.Pdte)
    pedido.agregarDetalle(detalle1)
    pedido.agregarDetalle(detalle2)

    println("Total del pedido: ${pedido.calcularTotal()}")
}
