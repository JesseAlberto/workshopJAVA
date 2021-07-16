package core;

public class Carro extends Viatura {
    
    private int portas;

    public int getPortas() {
        return this.portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Carro(String matricula, String marca, int ano,int portas) {
        super(matricula, marca, ano);
        this.portas=portas;

    }

    @Override
    public String toString() {
        return super.toString() + ", Numero Portas: " + this.portas;
    }
    
}
