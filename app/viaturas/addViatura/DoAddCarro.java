package app.viaturas.addViatura;

import app.viaturas.Label;
import core.GestorOficina;
import ui.Comando;
import ui.LerData;
import ui.LerInteiro;
import ui.LerString;

public class DoAddCarro extends Comando<GestorOficina>{

    public DoAddCarro(GestorOficina receptor) {
        super(receptor, Label.MENU_ADD_VIAT_CARRO);
    }

    @Override
    public void executar() {
        LerString matricula = new LerString(Label.ASK_FOR_MATRICULA, Label.MATRICULA_REGEX);
        LerString marca = new LerString(Label.ASK_FOR_MARCA, null);
        LerData anoMatricula = new LerData(Label.ASK_FOR_DATE_MATRICULA);
        LerInteiro nPortas = new LerInteiro(Label.ASK_FOR_N_PORTAS);

        ui.lerInput(matricula);
        ui.lerInput(marca);
        ui.lerInput(anoMatricula);
        ui.lerInput(nPortas);

        this.getReceptor().addViatura(matricula.getValor(), marca.getValor(), anoMatricula.getValor(), nPortas.getValor(), null);

    }
    
}