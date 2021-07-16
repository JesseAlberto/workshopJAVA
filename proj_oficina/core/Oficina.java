package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

import core.exceptions.NoCarsInDatabase;
import core.exceptions.NoMechanicsInDatabase;
import core.exceptions.NoRepairsDatabaseException;
import core.exceptions.NoSuchCarException;
import core.exceptions.NoSuchRepacaoMatriculaException;
import core.exceptions.NoSuchReparacaoException;
import core.exceptions.NoSuchUserException;

public class Oficina {
    private Hashtable<String,Viatura> viaturas;
    private Hashtable<Integer,Reparacao> reparacoes;
    private Hashtable<Integer,Mecanico> mecanicos;
    private ArrayList<Mecanico> listaMecanicos;
    private ArrayList<Viatura> listaCarros;
    private ArrayList<Viatura> listaMotas;


    private static int contador_mec=0;
    private static int contador_rep=0;


    public Oficina(){
        this.viaturas=new Hashtable<>();
        this.reparacoes=new Hashtable<>();
        this.mecanicos=new Hashtable<>();
        this.listaMecanicos = new ArrayList<>();
        this.listaCarros = new ArrayList<>();
        this.listaMotas = new ArrayList<>();
    }

    /**
     * 
     * METODOS
     * 
     */
    /*Mecanicos */
     public void addMecanico(String nome, LocalDate data){
        int key=++contador_mec;
        this.mecanicos.put(key, new Mecanico(key,nome, data));
        this.listaMecanicos = new ArrayList<>(mecanicos.values());
        Collections.sort(this.listaMecanicos);
     }

     public Mecanico getMecanico(int id) throws NoSuchUserException{
         if(!this.mecanicos.containsKey(id))
            throw new NoSuchUserException(id);
        
        return this.mecanicos.get(id);
     }

     public ArrayList<Mecanico> getAllMecanicos() throws NoMechanicsInDatabase{
         if(listaMecanicos.size() == 0)
            throw new NoMechanicsInDatabase();

        return listaMecanicos;
     }

     /*VIATURAS */

     public void addViatura(String matricula,String marca,LocalDate anoMatricula,Integer nPortas,Integer cilindrada){
     
        if(nPortas == null){
            Mota mota = new Mota(matricula, marca, anoMatricula.getYear(), cilindrada);
            this.viaturas.put(matricula, mota);
            this.listaMotas.add(mota);
            Collections.sort(this.listaMotas);
        }
        else{
            Carro carro = new Carro(matricula, marca, anoMatricula.getYear(), nPortas);
            this.viaturas.put(matricula, carro);
            this.listaCarros.add(carro);
            Collections.sort(this.listaCarros);
        }

     }

     public ArrayList<ArrayList<Viatura>> getAllViaturas() throws NoCarsInDatabase{
         ArrayList<ArrayList<Viatura>> listaViaturas = new ArrayList<>();

        listaViaturas.add(listaCarros);
        listaViaturas.add(listaMotas);

        if(listaCarros.size() == 0 && listaMotas.size() ==0)
           throw new NoCarsInDatabase();

       return listaViaturas;
    }


    public Viatura getViatura(String matricula) throws NoSuchCarException{
        if(!this.viaturas.containsKey(matricula))
           throw new NoSuchCarException(matricula);
       
       return this.viaturas.get(matricula);
    }


    /* Reparaçoes */

    public void addReparacao(String obs, TipoReparacao tipo, Viatura viatura, Mecanico mecanico){
        int key=++contador_rep;
        this.reparacoes.put(key, new Reparacao(obs, tipo, viatura, mecanico));
     }

     public Hashtable<Integer,Reparacao> getAllReparacoes() throws NoRepairsDatabaseException{
         if(reparacoes.isEmpty())
            throw new NoRepairsDatabaseException();
         return this.reparacoes;
     }


     public Reparacao getReparacao(int id) throws NoSuchReparacaoException{
        if(!this.reparacoes.containsKey(id))
           throw new NoSuchReparacaoException(id);
       
       return this.reparacoes.get(id);
    }

    public ArrayList<Reparacao> getReparacoesPorMatricula(String matricula) throws NoSuchRepacaoMatriculaException{
        ArrayList<Reparacao> lista = new ArrayList<>();

        this.reparacoes.forEach((k, v)->{
            if(v.getViatura().getMatricula().equals(matricula))
                lista.add(v);
        });

        if(lista.size() == 0)
            throw new NoSuchRepacaoMatriculaException(matricula);

        return lista;
    } 

}