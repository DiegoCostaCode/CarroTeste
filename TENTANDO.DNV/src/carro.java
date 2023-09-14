public class carro {
    private String nome;
    private String marca;
    private int cavalo;
    private double peso;

    public carro (){}

    public carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public carro(String nome, String marca, int cavalo, double peso) {
        this.nome = nome;
        this.marca = marca;
        this.cavalo = cavalo;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCavalo() {
        return cavalo;
    }

    public void setCavalo(int cavalo) {
        this.cavalo = cavalo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void Ligar() {
        System.out.println(nome + ": Ligando");
    }

    public void Desligar() {
        System.out.println(nome + ": Desligando");
    }

    @Override
    public String toString() {
        return "carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", cavalo=" + cavalo +
                ", peso=" + peso +
                '}';
    }
}
