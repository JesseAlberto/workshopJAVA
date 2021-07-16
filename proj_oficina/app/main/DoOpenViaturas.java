package app.main;


import app.viaturas.Menu;
import core.GestorOficina;
import ui.Comando;

public class DoOpenViaturas extends Comando<GestorOficina> {

    public DoOpenViaturas(GestorOficina receptor) {
        super(receptor, Label.MENU_VIATURAS);
  
    }

    @Override
    public void executar() {
        Menu m=new Menu(this.getReceptor());
        m.open();

        

    }
    
}