
package juego_fizzbuzz.mvc;


public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public boolean esDivisiblePor3() {
        return numero % 3 == 0;
    }

    public boolean esDivisiblePor5() {
        return numero % 5 == 0;
    }

    public int getNumero() {
        return numero;
    }

    public String obtenerResultado() {
        if (esDivisiblePor3() && esDivisiblePor5()) {
            return "FizzBuzz";
        } else if (esDivisiblePor3()) {
            return "Fizz";
        } else if (esDivisiblePor5()) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }
}
