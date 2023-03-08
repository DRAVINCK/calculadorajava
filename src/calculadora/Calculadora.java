package calculadora;

public class Calculadora {
    public Double numero1;
    public Double numero2;
    public Calculadora() {
    }
    public Calculadora(Double n1, Double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    public Double soma(Double valor1, Double valor2) { //funcao soma
        return valor1 + valor2;
    }
}
