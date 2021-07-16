package app.main;

import core.GestorOficina;
import ui.Comando;

public class Menu extends ui.Menu {

    public Menu(GestorOficina go) {
        super(Label.TITULO, new Comando<?>[]{
            new DoOpenPessoal(go),
            new DoOpenViaturas(go),
            new DoOpenReparacoes(go),
            new DoSave(go),
            new DoLoad(go)
        });

    }
    
}