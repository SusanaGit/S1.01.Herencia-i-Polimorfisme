package nivell3;

import java.util.List;

public class Redactor {

    private String nom;
    private final String dni;
    private static final double sou = 1500;
    private List<Noticia> noticies;

    public Redactor(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public List<Noticia> getNoticies() {
        return noticies;
    }

    public void setNoticies(List<Noticia> noticies) {
        this.noticies = noticies;
    }

    public void afegirNoticia(Noticia novaNoticia) {
        this.noticies.add(novaNoticia);
    }
}
