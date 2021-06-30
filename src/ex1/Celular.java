package ex1;

public class Celular implements IPrecedable<Celular> {

    private int numero;
    private String titular;

    public Celular(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.numero < celular.numero ? -1 : 1;
    }

    @Override
    public String toString() {
        return "ex1.Celular{" +
                "numero=" + numero +
                '}';
    }
}
