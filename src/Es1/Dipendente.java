package Es1;

public class Dipendente {
    public static double stipendioBase = 1000;
    private final String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dip){
        this.matricola = matricola;
        this.dipartimento = dip;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente --->" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public void promuovi(){
        switch (this.livello){
            case OPERAIO -> {
                this.livello = Livello.IMPIEGATO;
                this.stipendio = stipendioBase * 1.2;
                System.out.println("Complimenti per la tua promozione a IMPIEGATO!");
            }
            case IMPIEGATO -> {
                this.livello = Livello.QUADRO;
                this.stipendio = stipendioBase * 1.5;
                System.out.println("Complimenti per la tua promozione a QUADRO!");
            }
            case QUADRO -> {
                this.livello = Livello.DIRIGENTE;
                this.stipendio = stipendioBase * 2;
                System.out.println("Complimenti per la tua promozione a DIRIGENTE!");
            }
            case DIRIGENTE -> System.err.println("sei già un dirigente!");
        }
    }

    public static double getStipendioBase(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double getStipendioBase(Dipendente dipendente, int oreStraordinario) {
        return dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * oreStraordinario);
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }


    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
