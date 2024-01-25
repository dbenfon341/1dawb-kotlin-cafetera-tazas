// Clase Cafetera con atributos ubicacion (nombre de la sala o habitación dónde se encuentra), capacidad (la cantidad
// máxima de café que puede contener la cafetera) y cantidad (la cantidad actual de café
// que hay en la cafetera).

class Cafetera() {
    // En la clase se debe establecer la capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera vacía).
    var capacidad: Double = 1000.0
    var cantidad: Double = 0.0
    var ubicacion: String = "Ubicación"

    // Constructor primario con la ubicacion.
    constructor(capacidad: Double, cantidad: Double, ubicacion: String) : this() {
        this.capacidad = capacidad
        this.cantidad = cantidad
        this.ubicacion = ubicacion
    }

    // Constructor secundario con la ubicación y la capacidad máxima de la cafetera. Inicializa la cantidad actual de café igual a la capacidad máxima.
    constructor(ubicacion: String, capacidad: Double) : this() {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
        this.cantidad = capacidad
    }

    // Constructor secundario con la ubicacion, la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
    constructor(ubicacion: String, capacidad: Double, cantidad: Double) : this() {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
        this.cantidad = if (cantidad > capacidad) capacidad else cantidad
    }

    /**
     * llenar(): hace que la cantidad actual sea igual a la capacidad.
     */
    fun llenar(){
        this.cantidad = this.capacidad
    }

    /**
    * servirTaza(Taza): simula la acción de servir una taza con la capacidad que tenga la taza. Si
    * la cafetera tiene café, llenará la taza y restará la cantidad servida en la
    * cantidad de la cafetera. Si la cantidad actual de café “no alcanza” para llenar la taza, se
    * sirve lo que quede. Actualizar la cantidad de la cafetera y aplicar el método adecuado de la taza.
    */
    fun servirTaza() {
    }

    /**
    * vaciar(): pone la cantidad de café actual en cero.
    * @return retorna cantidad
    */
    fun vaciar(): Double{
        this.cantidad = 0.0
        return this.cantidad
    }

    /** agregarCafe(Int): añade a la cafetera la cantidad de café indicada. Por defecto añade 200 c.c. No se puede añadir más
    * cantidad que su capacidad máxima, si ocurriera esta circunstancia, simplemente llenaríamos la cantidad de la cafetera a su capacidad máxima.
    * @return retorna la cantidad actualizada con + parametro cafe
    */
    fun agregarCafe(cafe: Double = 200.0): Double {
        val actualizarCantidad = this.cantidad + cafe
        this.cantidad = actualizarCantidad
        return this.cantidad
    }

    /** toString(): debe retornar por ejemplo "Cafetera(ubicación = Salón, capacidad = 1000 c.c., cantidad = 0 c.c.)"
     * @return Devuelve string con ubicación, capacidad y cantidad.
    */
    override fun toString(): String {
        return "Cafetera(Ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }

}