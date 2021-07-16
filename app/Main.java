package app;

import app.main.Menu;
import core.GestorOficina;
import static ui.Dialogo.IO;

public class Main {
    public static void main(String[] args) {
        GestorOficina go = new GestorOficina();
        try {
            Menu m = new Menu(go);
            m.open();

        } finally {

            IO.close();
        }
    }
}