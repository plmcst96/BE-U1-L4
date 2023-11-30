import Es1.Dipartimento;
import Es1.Dipendente;
import Es1.Livello;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente laura = new Dipendente("A105Y", 2500, 6, Livello.DIRIGENTE, Dipartimento.VENDITE);
        Dipendente matteo = new Dipendente("A1054", 1500, 4, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente riccardo = new Dipendente("B208T", 1200, 9, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente chiara = new Dipendente("B208T", 1200, 9, Livello.OPERAIO, Dipartimento.PRODUZIONE);

        System.out.println(laura);
        System.out.println(chiara);
        System.out.println(riccardo);
        System.out.println(matteo);

        riccardo.promuovi();
        matteo.promuovi();

        Dipendente[] dipendentes = {laura, matteo, riccardo, chiara};
        double totSalary = 0.0;

            for (int i = 0; i < dipendentes.length; i++) {
            totSalary += dipendentes[i].getStipendioBase(dipendentes[i], 5);
        }
        System.out.println(totSalary);
    }
}