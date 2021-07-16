package app.reparacoes;

import java.util.Hashtable;

import core.GestorOficina;
import core.Reparacao;
import core.exceptions.NoRepairsDatabaseException;
import ui.Comando;

public class DoListReparacoes extends Comando<GestorOficina> {

    public DoListReparacoes(GestorOficina receptor) {
        super(receptor, Label.MENU_LIST_ALL);

    }

    @Override
    public void executar() {
        Hashtable<Integer, Reparacao> table;
        try {
            table = this.getReceptor().getAllReparacoes();

            //funcao arrow encontrei aqui = https://www.geeksforgeeks.org/hashtable-foreach-method-in-java-with-examples/

            table.forEach((k,v) -> {
                ui.escreveLinha("ID: [" + k + "] " + v.toString());
            });
        } catch (NoRepairsDatabaseException e) {
            ui.escreveLinha(e.getMsg());
        }

    }
    
}