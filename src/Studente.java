public class Studente {
    
    private String name;
    private String surname;
    private int age;

    public Studente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //metodo per ritornare stringa concatenata//
    public String getStudente() {
        return name + " " + surname + "," + age +  "anni";
    }

    //metodo per ritornare il nome//
    public String getName() {
        return name;
    }

    //metodo per ritornare il cognome//
    public String getSurname() {
        return surname;
    }

    //metodo per ritornare l'eta//
    public int getAge() {
        return age;
    }

    //metodo per cambiare nome//
    public String setName(String name) {
        this.name = name;
        return name;
    }

    //metodo per cambiare cognnome//
    public String setSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    //metodo per cambiare nome//
    public int setName(int age) {
        this.age = age;
        return age;
    }



}
