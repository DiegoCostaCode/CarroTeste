public class motor extends carro
{
    private String modelo;
    private int cilindros;

    public motor (){}

    public motor(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public motor(String nome, String marca, String modelo, int cilindros) {
        super(nome, marca);
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public motor(String nome, String marca, int cavalo, double peso, String modelo, int cilindros) {
        super(nome, marca, cavalo, peso);
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public void Ligar() {
        super.Ligar();
        Partida();
    }

    @Override
    public void Desligar() {
        super.Desligar();
    }

    private void Partida(){System.out.println( modelo + "dando partida");}

    @Override
    public String toString() {
        return "motor{" +
                "modelo='" + modelo + '\'' +
                ", cilindros=" + cilindros +
                '}'+ super.toString();
    }
}
