package GestionCompteBancaire.Exceptions;

public class SoldeInsuffisantException extends Exception {
    private String message;
    public SoldeInsuffisantException(String message) {
        this.message = message;
        System.out.println("le solde est insuffisant ( doit etre > 0 ou ligne de credit ) montant indique par l'utilisateur : "+ message );

    }
}
