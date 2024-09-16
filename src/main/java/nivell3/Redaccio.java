package nivell3;

import java.util.ArrayList;
import java.util.List;

public class Redaccio {

    private List<Redactor> redactors;

    public Redaccio() {
        this.redactors = new ArrayList<>();
    }

    public List<Redactor> getRedactors() {
        return redactors;
    }

    public void setRedactors(List<Redactor> redactors) {
        this.redactors = redactors;
    }

    public void afegirRedactor(Redactor redactor) {
        this.redactors.add(redactor);

        System.out.println("Nou redactor afegit correctament.");
    }

    public void esborrarRedactor(String dniRedactorEsborrar) {

        if (buscarRedactor(dniRedactorEsborrar) > 0) {
            redactors.remove(buscarRedactor(dniRedactorEsborrar));
            System.out.println("Redactor esborrat correctament.");
        }
    }

    public void imprimirLlistatRedactors() {
        System.out.println("Llistat de redactors: ");
        for (int i = 0; i < redactors.size(); i++) {
            System.out.println("Nom: " + redactors.get(i).getNom() + " Dni: " + redactors.get(i).getDni());
        }
    }

    public int buscarRedactor(String dniRedactor) {

        int posicioRedactor = -1;

        for (int i = 0; i < redactors.size(); i++) {
            if (redactors.get(i).getDni().equals(dniRedactor)) {
                redactors.remove(redactors.get(i));

                System.out.println("S'ha trobat el redactor.");

                posicioRedactor = i;
            } else {
                System.out.println("No es troba el redactor al llistat de redactors.");
            }
        }

        return posicioRedactor;
    }
}
