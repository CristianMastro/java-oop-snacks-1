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

    }
}
