package app.reparacoes;


import core.GestorOficina;
import core.exceptions.NoSuchReparacaoException;
import ui.Comando;
import ui.LerInteiro;

public class DoGetInfoReparacao extends Comando<GestorOficina> {

    public DoGetInfoReparacao(GestorOficina receptor) {
        super(receptor, Label.MENU_GET_INFO_REP);

    }

    @Override
    public void executar() {
        LerInteiro id = new LerInteiro(Label.ASK_FOR_ID_REPARACAO);
        ui.lerInput(id);

        try {
            ui.escreveLinha(this.getReceptor().getReparacao(id.getValor()).toString());
        } catch (NoSuchReparacaoException e) {
            ui.escreveLinha(e.getMsg());
        }

    }
    
}