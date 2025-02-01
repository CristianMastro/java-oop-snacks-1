public class App {
    public static void main(String[] args) throws Exception {
        
        Studente studente1 = new Studente("Cristian", "Mastrotoaro", 32);

        System.out.println("Nome: " + studente1.getName());
        System.out.println("Cognome: " + studente1.getSurname());
        System.out.println("Età: " + studente1.getAge());
        System.out.println(studente1.getStudente());

    }
}
