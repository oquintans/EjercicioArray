package ejercicio.array;

/**
 *
 * @author oquintansocampo
 */
public class Dni {

    private int dni;
    private char letra;

    public Dni() {

    }

    public Dni(int dni) {
        this.dni=dni;
    }

    public int getDni() {
        int letranum = dni % 23;
        return letranum;
    }

    public char getLetra(int letra) {
        char dni[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return dni[(int) letra];
    }

}
