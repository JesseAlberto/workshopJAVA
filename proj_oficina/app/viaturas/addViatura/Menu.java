package app.viaturas.addViatura;

import app.viaturas.Label;
import core.GestorOficina;
import ui.Comando;

public class Menu extends ui.Menu {

    public Menu(GestorOficina go) {
        super(Label.TITULO_MENU_ADD_VEICULO, new Comando<?>[] {
            new DoAddCarro(go),
            new DoAddMota(go)});
    }
    
}