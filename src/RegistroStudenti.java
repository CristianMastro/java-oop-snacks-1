
public class RegistroStudenti {
    
    // Lista privata per memorizzare gli studenti//
    private Studente[] registroStudenti;
    private int presenze = 0; 

    //costrutto con numero massimo di studenti//
    public RegistroStudenti(int maxStudenti) {
        registroStudenti = new Studente[maxStudenti]; 
    }

    //metodo per aggiungere studente//
    public void aggiungiStudente(Studente studente) {
        if (presenze < registroStudenti.length) {
            registroStudenti[presenze] = studente;
            presenze++;
            System.out.println("Studente aggiunto con successo.");
        } else {
            System.out.println("Registro pieno, impossibile aggiungere altri studenti.");
        }
    }

    //metodo per stampare studenti presenti//
    public void stampaRegistro() {
        if (presenze == 0) {
            System.out.println("Il registro è vuoto");
        }else {
            for (int i = 0; i < presenze; i++) {
            System.out.println(registroStudenti[i].getName()); 
            }
        }
    }
}
