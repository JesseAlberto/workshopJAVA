package app.reparacoes;

import core.GestorOficina;
import core.Mecanico;
import core.TipoReparacao;
import core.Viatura;
import core.exceptions.NoSuchCarException;
import core.exceptions.NoSuchUserException;
import ui.Comando;
import ui.LerInteiro;
import ui.LerString;

public class DoAddReparacao extends Comando<GestorOficina> {

    public DoAddReparacao(GestorOficina receptor) {
        super(receptor, Label.MENU_ADD_REP);

    }

    @Override
    public void executar() {
        LerString obs = new LerString(Label.ASK_FOR_OBS, null);
        LerString tipo = new LerString(Label.ASK_FOR_TIPO, Label.REGEX_FOR_TIPO);
        LerString matricula = new LerString(Label.ASK_FOR_MATRICULA, Label.REGEX_MATRICULA);
        LerInteiro idMecanico = new LerInteiro(Label.ASK_FOR_ID_MECANICO);

        Viatura carro;
        Mecanico mecanico;
        TipoReparacao tipoEnum = TipoReparacao.EXTRAORDINARIA;

        try {
            ui.lerInput(matricula);
            carro = this.getReceptor().getViatura(matricula.getValor());

            ui.lerInput(idMecanico);
            mecanico = this.getReceptor().getMecanico(idMecanico.getValor());

            ui.lerInput(tipo);
            switch (tipo.getValor()) {
                case "1":
                    tipoEnum = TipoReparacao.PROGRAMADA;
                    break;
            }

            ui.lerInput(obs);


            this.getReceptor().addReparacao(obs.getValor(), tipoEnum, carro, mecanico);

        } catch (NoSuchCarException e) {
            ui.escreveLinha("\n" + e.getMsg());
        } catch (NoSuchUserException e){
            ui.escreveLinha("\n" + e.getMsg());
        }
    

    }
    
}