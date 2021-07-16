package app.viaturas.addViatura;

import app.viaturas.Label;
import core.GestorOficina;
import ui.Comando;
import ui.LerData;
import ui.LerInteiro;
import ui.LerString;

public class DoAddMota extends Comando<GestorOficina>{

    public DoAddMota(GestorOficina receptor) {
        super(receptor, Label.MENU_ADD_VIAT_MOTA);
    }

    @Override
    public void executar() {
        LerString matricula = new LerString(Label.ASK_FOR_MATRICULA, Label.MATRICULA_REGEX);
        LerString marca = new LerString(Label.ASK_FOR_MARCA, null);
        LerData anoMatricula = new LerData(Label.ASK_FOR_DATE_MATRICULA);
        LerInteiro cilindrada = new LerInteiro(Label.ASK_FOR_CILINDRADA);

        ui.lerInput(matricula);
        ui.lerInput(marca);
        ui.lerInput(anoMatricula);
        ui.lerInput(cilindrada);

        this.getReceptor().addViatura(matricula.getValor(), marca.getValor(), anoMatricula.getValor(), null, cilindrada.getValor());

    }
    
}