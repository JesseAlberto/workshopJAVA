package app.viaturas;

import java.util.ArrayList;

import core.GestorOficina;
import core.Viatura;
import core.exceptions.NoCarsInDatabase;
import ui.Comando;
public class DoListViaturas extends Comando<GestorOficina>{

    public DoListViaturas(GestorOficina receptor) {
        super(receptor, Label.MENU_LIST_VIAT);
        
    }

    @Override
    public void executar() {
        ArrayList<ArrayList<Viatura>> lista;

        try {
            lista = this.getReceptor().getAllViaturas();

            ui.escreveLinha("--- CARROS ---");
            for (Viatura carro : lista.get(0)) {
                ui.escreveLinha(carro.toString());
            }

            ui.escreveLinha("--- MOTAS ---");
            for (Viatura mota : lista.get(1)) {
                ui.escreveLinha(mota.toString());
            }


        } catch (NoCarsInDatabase e) {
            ui.escreveLinha("\n" + e.getMsg());
        }

    }
    
}