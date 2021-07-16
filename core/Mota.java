package core;

public class Mota extends Viatura {

    private int cilindrada;

    public int getCelindrada() {
        return this.cilindrada;
    }

    public void setCelindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Mota(String matricula, String marca, int ano, int cilindrada) {
        super(matricula, marca, ano);
        this.cilindrada=cilindrada;

    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + this.cilindrada;
    }
    
}
