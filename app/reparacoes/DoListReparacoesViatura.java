package app.reparacoes;

import java.util.ArrayList;

import core.GestorOficina;
import core.Reparacao;
import core.exceptions.NoSuchRepacaoMatriculaException;
import ui.Comando;
import ui.LerString;

public class DoListReparacoesViatura extends Comando<GestorOficina> {

    public DoListReparacoesViatura(GestorOficina receptor) {
        super(receptor, Label.MENU_LIST_VIAT_REP);

    }

    @Override
    public void executar() {
        LerString matricula = new LerString(Label.ASK_FOR_MATRICULA, Label.REGEX_MATRICULA);
        ui.lerInput(matricula);

        try {
            ArrayList<Reparacao> lista = this.getReceptor().getReparacoesPorMatricula(matricula.getValor());

            for (Reparacao reparacao : lista) {
                ui.escreve(reparacao.toString());
            }
        } catch (NoSuchRepacaoMatriculaException e) {
            ui.escreveLinha(e.getMsg());
        }
    }
    
}