package app.pessoal;

import core.GestorOficina;
import ui.Comando;

public class Menu extends ui.Menu {

    public Menu(GestorOficina go) {
        super(Label.TITULO, new Comando<?>[] {
            new DoAddMecanico(go),
            new DoGetMecanicoInfo(go),
            new DoListMecanicos(go)
        });

    }
    
}