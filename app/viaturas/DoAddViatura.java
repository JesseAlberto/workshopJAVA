package app.viaturas;

import app.viaturas.addViatura.Menu;
import core.GestorOficina;
import ui.Comando;



public class DoAddViatura extends Comando<GestorOficina> {

    public DoAddViatura(GestorOficina receptor) {
        super(receptor, Label.MENU_ADD_VIAT);
    }

    @Override
    public void executar() {
        Menu m= new Menu(this.getReceptor());
        m.open();
    }

    
}