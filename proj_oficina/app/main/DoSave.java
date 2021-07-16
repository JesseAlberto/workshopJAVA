package app.main;

import core.GestorOficina;
import ui.Comando;




public class DoSave extends Comando<GestorOficina> {

    public DoSave(GestorOficina receptor) {
        super(receptor, Label.MENU_SAVE);

    }

    @Override
    public void executar() {
        ui.escreveLinha("Estou em Save");
 
    }
    
}