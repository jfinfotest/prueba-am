//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val edad = 20

    // 'if' devuelve directamente el resultado para guardarlo en una variable
    val mensaje = if (edad >= 18) {
        "Acceso Concedido (Mayor de edad)"
    } else {
        "Acceso Denegado (Menor de edad)"
    }

    println("Estado: $mensaje")
}



