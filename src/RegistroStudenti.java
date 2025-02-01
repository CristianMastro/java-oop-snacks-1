import java.util.ArrayList;
import java.util.List;

public class RegistroStudenti {
    
    // Lista privata per memorizzare gli studenti//
    private List<Studente> studenti; 

    // Costruttore senza parametri//
    public RegistroStudenti() {
        this.studenti = new ArrayList<>();
    }

    // Metodo per aggiungere uno studente al registro//
    public void addStudent(Studente studente) {
        studenti.add(studente);
    }

    // Metodo per stampare tutti gli studenti nel registro//
    public void stampaStudenti() {
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println("Studente: " + studenti.get(i).getStudente());
        }
    }
}