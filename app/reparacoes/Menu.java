package app.reparacoes;

import core.GestorOficina;
import ui.Comando;

public class Menu extends ui.Menu {

    public Menu(GestorOficina go) {
        super(Label.TITULO,new Comando<?>[]{
            new DoAddReparacao(go),
            new DoListReparacoes(go),
            new DoListReparacoesViatura(go),
            new DoGetInfoReparacao(go)
        });

    }


    
}