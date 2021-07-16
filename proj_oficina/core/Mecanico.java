package core;

import java.time.LocalDate;

public class Mecanico implements Comparable<Mecanico>{
    private Integer id;
    private String nome;
    private LocalDate data;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Mecanico(int id,String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
        this.id=id;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s - %s", this.id,this.nome,this.data.toString());
    }


    @Override
    public int compareTo(Mecanico m) {
            return this.id.compareTo(m.getId());
    }
}