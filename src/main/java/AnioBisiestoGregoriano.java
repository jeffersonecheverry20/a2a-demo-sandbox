/**
 * Utilidades para determinar si un año es bisiesto según el calendario gregoriano.
 *
 * Regla: un año es bisiesto si es divisible entre 4, salvo los divisibles entre 100,
 * que solo son bisiestos si también son divisibles entre 400.
 *
 * Nota: el comportamiento para años cero o negativos está pendiente de aclarar
 * con el autor del issue #63; esta implementación aplica la misma regla aritmética
 * sin tratamiento especial.
 */
public class AnioBisiestoGregoriano {

    private AnioBisiestoGregoriano() {
    }

    /**
     * Indica si el año dado es bisiesto en el calendario gregoriano.
     *
     * @param anio año a evaluar
     * @return true si el año es bisiesto, false en caso contrario
     */
    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
    }

    private static void comprobar(int anio, boolean esperado) {
        boolean obtenido = esAnioBisiesto(anio);
        if (obtenido != esperado) {
            throw new IllegalStateException("Fallo para " + anio + ": esperado " + esperado + ", obtenido " + obtenido);
        }
    }

    /**
     * Ejecuta las comprobaciones de los casos de aceptación del issue #63.
     * Lanza IllegalStateException si alguna comprobación falla.
     */
    public static void main(String[] args) {
        // Divisibles entre 400
        comprobar(2000, true);
        comprobar(1600, true);
        // Divisibles entre 100 pero no entre 400
        comprobar(1900, false);
        comprobar(2100, false);
        // Divisibles entre 4 pero no entre 100
        comprobar(2024, true);
        comprobar(1996, true);
        // No divisibles entre 4
        comprobar(2023, false);
        comprobar(2025, false);

        System.out.println("Todas las comprobaciones de esAnioBisiesto se han superado.");
    }
}
