package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;

import core.exceptions.NoCarsInDatabase;
import core.exceptions.NoMechanicsInDatabase;
import core.exceptions.NoRepairsDatabaseException;
import core.exceptions.NoSuchCarException;
import core.exceptions.NoSuchRepacaoMatriculaException;
import core.exceptions.NoSuchReparacaoException;
import core.exceptions.NoSuchUserException;

/**
 * GestorOfina
 */
public class GestorOficina {

    Oficina oficina;
    public GestorOficina() {
        this.oficina = new Oficina();
    }
    
    /**
     * 
     * METODOS
     * 
     */

     /* Mecanicos */

    public void addMecanico(String nome, LocalDate data){
         this.oficina.addMecanico(nome, data);
    }

    public Mecanico getMecanico(int id) throws NoSuchUserException{
        return this.oficina.getMecanico(id);
    }

    public ArrayList<Mecanico> getAllMecanicos() throws NoMechanicsInDatabase{
        return this.oficina.getAllMecanicos();
    }

    /* Viaturas*/

    public void addViatura(String matricula,String marca,LocalDate anoMatricula,Integer nPortas,Integer cilindrada){
        this.oficina.addViatura(matricula, marca, anoMatricula, nPortas, cilindrada);
    }

    public ArrayList<ArrayList<Viatura>> getAllViaturas() throws NoCarsInDatabase{
        return this.oficina.getAllViaturas();
    }

    public Viatura getViatura(String matricula) throws NoSuchCarException{
        return this.oficina.getViatura(matricula);
    }

    /* Reparacoes */

    public void addReparacao(String obs, TipoReparacao tipo, Viatura viatura, Mecanico mecanico){
        this.oficina.addReparacao(obs, tipo, viatura, mecanico);
    }

    public Hashtable<Integer,Reparacao> getAllReparacoes() throws NoRepairsDatabaseException{
        return this.oficina.getAllReparacoes();
    }

    public Reparacao getReparacao(int id) throws NoSuchReparacaoException{
        return this.oficina.getReparacao(id);
    }


    public ArrayList<Reparacao> getReparacoesPorMatricula(String matricula) throws NoSuchRepacaoMatriculaException{
        return this.oficina.getReparacoesPorMatricula(matricula);
    }

}