package app.pessoal;

import core.GestorOficina;
import ui.Comando;
import ui.LerData;
import ui.LerString;

public class DoAddMecanico extends Comando<GestorOficina> {

    public DoAddMecanico(GestorOficina receptor) {
        super(receptor, Label.ADD_MECANICO);

    }

    @Override
    public void executar() {
        LerData data=new LerData(Label.ASK_FOR_DATE);
        LerString nome=new LerString(Label.ASK_FOR_NAME, null);

        ui.lerInput(nome);
        ui.lerInput(data);

        this.getReceptor().addMecanico(nome.getValor(), data.getValor());
    }
    
}