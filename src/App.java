public class App {
    public static void main(String[] args) throws Exception {
        
        Studente studente1 = new Studente("Cristian", "Mastrotoaro", 32);

        System.out.println("Nome: " + studente1.getName());
        System.out.println("Cognome: " + studente1.getSurname());
        System.out.println("Età: " + studente1.getAge());
        System.out.println(studente1.getStudente());


        ContoBancario contoCristian = new ContoBancario("ITSONOPOVERO");

        //visualizza numero conto//
        System.out.println(contoCristian.getNumeroConto());

        //essendo una variabile primitiva il saldo sarà 0//
        System.out.println("Il tuo saldo è: " + contoCristian.getSaldo() + "euro");

        //aggiungiamo denaro//
        contoCristian.addDenaro(100);

        //visualizzaiamo nuovo saldo//
        System.out.println("Il tuo nuovo saldo è: " + contoCristian.getSaldo() + "euro");

        //preleviamo//
        contoCristian.removeDenaro(25);

        //stampiamo nuovo saldo//
        System.out.println("Il tuo nuovo saldo è: " + contoCristian.getSaldo() + "euro");

        Studente studente2 = new Studente("Giulio", "Mastrotoaro", 25);

        System.out.println("Nome: " + studente2.getName());
        System.out.println("Cognome: " + studente2.getSurname());
        System.out.println("Età: " + studente2.getAge());
        System.out.println(studente2.getStudente());

        Studente studente3 = new Studente("Alessandro", "Mastrotoaro", 22);

        System.out.println("Nome: " + studente3.getName());
        System.out.println("Cognome: " + studente3.getSurname());
        System.out.println("Età: " + studente3.getAge());
        System.out.println(studente3.getStudente());

        Studente studente4 = new Studente("Gino", "Mastrotoaro", 12);

        RegistroStudenti registroStudenti = new RegistroStudenti(3);
        
        registroStudenti.aggiungiStudente(studente1);
        registroStudenti.aggiungiStudente(studente2);
        registroStudenti.aggiungiStudente(studente3);
        registroStudenti.aggiungiStudente(studente4);

        registroStudenti.stampaRegistro();
    }
}
