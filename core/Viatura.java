package core;

public abstract class Viatura implements Comparable<Viatura>{
    private String matricula;
    private String marca;
    private Integer ano;
    
    public Viatura(String matricula, String marca, int ano) {
        this.matricula = matricula;
        this.marca = marca;
        this.ano = ano;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



    @Override
    public String toString() {
        return "Ano: " + this.ano + ", [Matricula: " + this.matricula + "]" + ", Marca: " + this.marca;
    }

    @Override
    public int compareTo(Viatura v) {
            return this.ano.compareTo(v.getAno());
    }

}