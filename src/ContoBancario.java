public class ContoBancario {
    private String numeroConto;
    private double saldo;


    //costruttore//
    public ContoBancario(String numeroConto){
        this.numeroConto = numeroConto;
    }

    //metodo per ritornare numero di conto//
    public String getNumeroConto() {
        return numeroConto;
    }

    //metodo per depositare denaro//
    public double addDenaro(double denaroDaAggiungere) {
        saldo += denaroDaAggiungere;
        return saldo;
    }

    //metodo per prelevare denaro//
    public double removeDenaro(double denaroDaRimuovere) {
        saldo -= denaroDaRimuovere;
        return saldo;
    }

    //metodo per ritornare il saldo//
    public double getSaldo() {
        return saldo;
    }

}
