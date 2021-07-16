package app.pessoal;

import core.GestorOficina;
import core.exceptions.NoSuchUserException;
import ui.Comando;
import ui.LerInteiro;

public class DoGetMecanicoInfo extends Comando<GestorOficina> {

    public DoGetMecanicoInfo(GestorOficina receptor) {
        super(receptor, Label.GET_INFO_MEC);
    }

    @Override
    public void executar() {
        LerInteiro id = new LerInteiro(Label.ASK_FOR_ID);
        ui.lerInput(id);

        try {
            ui.escreveLinha(this.getReceptor().getMecanico(id.getValor()).toString());
        } catch (NoSuchUserException e) {
            ui.escreveLinha(e.getMsg());
        }

    }
    
}