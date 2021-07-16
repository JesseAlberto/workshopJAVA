package app.viaturas;

import core.GestorOficina;
import core.exceptions.NoSuchCarException;
import ui.Comando;
import ui.LerString;

public class DoGetInfoViatura extends Comando<GestorOficina> {

    public DoGetInfoViatura(GestorOficina receptor) {
        super(receptor, Label.MENU_PRINT_VIAT);
    }

    @Override
    public void executar() {
        LerString matricula = new LerString(Label.ASK_FOR_MATRICULA, Label.MATRICULA_REGEX);
        ui.lerInput(matricula);

        try {
            ui.escreveLinha(this.getReceptor().getViatura(matricula.getValor()).toString());
        } catch (NoSuchCarException e) {
            ui.escreveLinha("\n" + e.getMsg());
        }
    }
    
}