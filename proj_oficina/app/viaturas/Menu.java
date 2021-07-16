package app.viaturas;

import core.GestorOficina;
import ui.Comando;


public class Menu extends ui.Menu {

    public Menu(GestorOficina go) {
        super(Label.TITULO, new Comando<?>[]{
            new DoAddViatura(go),
            new DoListViaturas(go),
            new DoGetInfoViatura(go)
        });

    }
    
}