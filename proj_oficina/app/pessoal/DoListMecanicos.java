package app.pessoal;

import java.util.ArrayList;

import core.GestorOficina;
import core.Mecanico;
import core.exceptions.NoMechanicsInDatabase;

public class DoListMecanicos extends ui.Comando<GestorOficina> {

    public DoListMecanicos(GestorOficina receptor) {
        super(receptor, Label.LIST_MECANICOS);

    }

    @Override
    public void executar() {
        ArrayList<Mecanico> lista;

        try {
            lista = this.getReceptor().getAllMecanicos();
            for (Mecanico mecanico : lista) {
                ui.escreveLinha(mecanico.toString());
            }
        } catch (NoMechanicsInDatabase e) {
            ui.escreveLinha("\n" + e.getMsg());
        }


    }
    
}