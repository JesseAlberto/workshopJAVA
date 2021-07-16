package app.main;

import app.reparacoes.Menu;
import core.GestorOficina;
import ui.Comando;
public class DoOpenReparacoes extends Comando<GestorOficina> {

    public DoOpenReparacoes(GestorOficina receptor) {
        super(receptor, Label.MENU_REPARACOES);

    }

    @Override
    public void executar() {
        Menu m=new Menu(this.getReceptor());
        m.open();
        
    }
    
}