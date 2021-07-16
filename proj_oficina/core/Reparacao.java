package core;

public class Reparacao {
    private int id;
    private String obs;
    private TipoReparacao tipo;
    private Viatura viatura;
    private Mecanico mecanico;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public TipoReparacao getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoReparacao tipo) {
        this.tipo = tipo;
    }

    public Viatura getViatura() {
        return this.viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    public Mecanico getMecanico() {
        return this.mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }


    public Reparacao( String obs, TipoReparacao tipo, Viatura viatura, Mecanico mecanico) {
  
        this.obs = obs;
        this.tipo = tipo;
        this.viatura = viatura;
        this.mecanico = mecanico;
    }
    
    @Override
    public String toString() {
        return "\n--------"+"\nViatura: " + this.viatura.getMarca() +"[" +this.viatura.getMatricula()+"], Mecanico: " + this.mecanico.getNome() + ", Tipo: " + this.tipo + "\nOBS: " + this.obs + "\n--------";
    }

}