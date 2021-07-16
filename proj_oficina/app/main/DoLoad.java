package app.main;

import core.GestorOficina;
import ui.Comando;


public class DoLoad extends Comando<GestorOficina> {

    public DoLoad(GestorOficina receptor) {
        super(receptor, Label.MENU_LOAD);
    
    }

    @Override
    public void executar() {
        
       ui.escreveLinha("Estou no menu Load");

    }
    
}