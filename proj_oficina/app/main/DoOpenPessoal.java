package app.main;

import app.pessoal.Menu;
import core.GestorOficina;
import ui.Comando;

public class DoOpenPessoal extends Comando<GestorOficina>{

    public DoOpenPessoal(GestorOficina receptor) {
        super(receptor, Label.MENU_PESSOAL);
    
    }

    @Override
    public void executar() {
        Menu m=new Menu(this.getReceptor());
        m.open();
    }
    
}