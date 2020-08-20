package GestionCompteBancaire.Exceptions;

public class MontantNonValideException extends Exception {
    private String message;

    public MontantNonValideException(String message) {
        this.message = message;
        System.out.println("le montant est non valide ( doit etre > 0 ) montant indique par l'utilisateur : "+ message );
    }
}
