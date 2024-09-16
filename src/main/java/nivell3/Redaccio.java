package nivell3;

import java.util.ArrayList;
import java.util.List;

public class Redaccio {

    private List<Redactor> redactors;

    public Redaccio() {
        this.redactors = new ArrayList<>();
    }

    public void afegirRedactor(Redactor redactor) {
        this.redactors.add(redactor);

        System.out.println("Nou redactor afegit correctament.");
    }

    public void esborrarRedactor(String dniRedactorEsborrar) {

        for (int i = 0; i < redactors.size(); i++) {
            if (redactors.get(i).getDni().equals(dniRedactorEsborrar)) {
                redactors.remove(redactors.get(i));

                System.out.println("Redactor eliminat correctament.");
            } else {
                System.out.println("No es troba el redactor al llistat de redactors.");
            }
        }



    }

    public void imprimirLlistatRedactors() {
        System.out.println("Llistat de redactors: ");
        for (int i = 0; i < redactors.size(); i++) {
            System.out.println("Nom: " + redactors.get(i).getNom() + " Dni: " + redactors.get(i).getDni());
        }
    }
}
