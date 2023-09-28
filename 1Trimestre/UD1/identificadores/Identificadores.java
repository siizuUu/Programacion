package identificadores;

import java.util.ArrayList;
import java.util.List;

public class Identificadores {
    private static List<String> identificadores = new ArrayList<>();

    public static boolean esValido(String identificador) {
        // verifica si el identificador es nulo o vacío
        if (identificador == null || identificador.isEmpty()) {
            return false;
        }

        // verifica si el identificador comienza con una letra, un guión bajo (_) o un signo de dólar ($)
        char primerCaracter = identificador.charAt(0);
        if (!Character.isLetter(primerCaracter) && primerCaracter != '_' && primerCaracter != '$') {
            return false;
        }

        // verifica el resto de caracteres del identificador
        for (int i = 1; i < identificador.length(); i++) {
            char caracter = identificador.charAt(i);
            if (!Character.isLetterOrDigit(caracter) && caracter != '_' && caracter != '$') {
                return false;
            }
        }

        // si todas las comprobaciones pasan, el identificador es válido
        return true;
    }

    public static void agregarIdentificador(String identificador) {
        identificadores.add(identificador);
    }

    public static void main(String[] args) {

        agregarIdentificador("numeroDeTelefono");
        agregarIdentificador("$totalVentas");
        agregarIdentificador("mi_nombre");
        agregarIdentificador("4everYoung");
        agregarIdentificador("_variable");
        agregarIdentificador("#precioProducto");
        agregarIdentificador("usuario-email");
        agregarIdentificador("$saldoCuenta");
        agregarIdentificador("primeraClase");
        agregarIdentificador("mi_123_variable");
        agregarIdentificador("_nombreUsuario");
        agregarIdentificador("12345_valor");
        agregarIdentificador("&variable");
        agregarIdentificador("$precioUnitario");
        agregarIdentificador("#contador_de_inventario");
        agregarIdentificador("miVariable%descuento");
        agregarIdentificador("producto1");
        agregarIdentificador("3añosDeExperiencia");
        agregarIdentificador("_mi_numero_de_cuenta");
        agregarIdentificador("mi_salario$$");
        agregarIdentificador("$nombreCliente");
        agregarIdentificador("variable#temporal");
        agregarIdentificador("_variable99");
        agregarIdentificador("mi_@direccion");
        agregarIdentificador("precio-total");
        agregarIdentificador("5HorasTrabajo");
        agregarIdentificador("!descuento");
        agregarIdentificador("codigoDeProducto");
        agregarIdentificador("_MiIdentificador");
        agregarIdentificador("valor#unitario");

        // validar cada identificador en la lista
        for (String identificador : identificadores) {
            if (esValido(identificador)) {
                System.out.println("El identificador '" + identificador + "' es válido.");
            } else {
                System.out.println("El identificador '" + identificador + "' no es válido.");
            }
        }
    }
}
