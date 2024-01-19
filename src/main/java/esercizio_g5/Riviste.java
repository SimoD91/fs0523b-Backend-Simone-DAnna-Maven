package esercizio_g5;

public class Riviste extends Catalogo{

    private Periodo periodo;

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Riviste(long codiceISBM, String titolo, int annoPubblicazione, int numeroPagine, Periodo periodo) {
        super(codiceISBM, titolo, annoPubblicazione, numeroPagine);
        this.periodo = periodo;


    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodo=" + periodo +
                '}' + super.toString();
    }
}
