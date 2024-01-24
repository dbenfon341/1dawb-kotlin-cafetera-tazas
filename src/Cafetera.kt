
// Clase Cafetera con atributos ubicacion (nombre de la sala o habitación dónde se encuentra), capacidad (la cantidad
// máxima de café que puede contener la cafetera) y cantidad (la cantidad actual de café
// que hay en la cafetera).

class Cafetera() {
    var nombre: String = ""
        get() = field
        set(value) {
            if (value.isEmpty()) {
                field = "Lugar"
            }
            else {
                field = value
            }

        }

    var capacidad: Double = 0.0
    var cantidad: Double = 0.0
    var ubicacion: String = "Nowhere"

    // En la clase se debe establecer la capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera vacía).


    // Init para establecer que la capacidad máxima debe ser 1000.
    init {
        require(this.capacidad <= 1000.0) { "La capacidad máxima debe ser 1000." }
    }


    // Constructor primario con la ubicacion.
    // Constructor secundario con la ubicación y la capacidad máxima de la cafetera. Inicializa la cantidad actual de café igual a la capacidad máxima.
    // Constructor secundario con la ubicacion, la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.

    constructor(nombre: String, capacidad: Double, cantidad: Double, ubicacion: String) : this() {
        this.nombre = nombre
        this.capacidad = capacidad
        this.cantidad = cantidad
        this.ubicacion = ubicacion
    }

    constructor(ubicacion: String, capacidad: Double) : this() {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Double, cantidad: Double) : this() {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
        this.cantidad = cantidad
    }

    /**
      llenar(): hace que la cantidad actual sea igual a la capacidad.
     */
    fun llenar(){
        if (this.capacidad != this.cantidad)
            return (this.capacidad == this.cantidad)
    }

    /**
    * servirTaza(Taza): simula la acción de servir una taza con la capacidad que tenga la taza. Si
    la cafetera tiene café, llenará la taza y restará la cantidad servida en la
    cantidad de la cafetera. Si la cantidad actual de café “no alcanza” para llenar la taza, se
    sirve lo que quede. Actualizar la cantidad de la cafetera y aplicar el método adecuado de la taza.
    */
    fun servirTaza() {


    }

    /**
    * vaciar(): pone la cantidad de café actual en cero.
    * @return devuelve cantidad
    */
    fun vaciar(): Double{
        var cantidad = 0.0
        return cantidad
    }

    /** agregarCafe(Int): añade a la cafetera la cantidad de café indicada. Por defecto añade 200 c.c. No se puede añadir más
    cantidad que su capacidad máxima, si ocurriera esta circunstancia, simplemente llenaríamos la cantidad de la cafetera a su capacidad máxima.
    */
    fun agregarCafe() {

    }

    /** toString(): debe retornar por ejemplo "Cafetera(ubicación = Salón, capacidad = 1000 c.c., cantidad = 0 c.c.)"
    */


}