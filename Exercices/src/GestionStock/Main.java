package GestionStock;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // produits
        ProduitBeaute creme = new ProduitBeaute("autoprotec", 50d, "protection solaire");
        ProduitBricolage scie = new ProduitBricolage("KoupTout", 950d, "outils de decoupe");
        ProduitInformatique souris = new ProduitInformatique("Razer", 200d, "souris");
        ProduitMusique cd = new ProduitMusique("Best of Rammstein", 60d, "Rammstein");

        // ArrayList<Produit> produits = new ArrayList<>();
        // produits.add(creme); produits.add(scie); produits.add(souris); produits.add(cd);

        // clients
        ArrayList<Client> clients = new ArrayList<>() ;
        double soldefictif;
        for (int i = 0; i < 5; i++) {
            soldefictif = i * 1000;
            String nom = "Client " + (i+1);
            Client c = new Client(nom, soldefictif);
            clients.add(c);
        }

        // magasins
        ArrayList<Magasin> magasins = new ArrayList<>() ;

        Magasin di = new Magasin("DI");
        Magasin brico = new Magasin("Brico");
        Magasin openit = new Magasin("Open IT");
        Magasin lido = new Magasin("Lido Music");
        Magasin fourtout = new Magasin("Four-Tout");

        magasins.add(di); magasins.add(brico); magasins.add(openit); magasins.add(lido); magasins.add(fourtout);
        for (Magasin magasin : magasins) {

            switch(magasin.getNomCompletMagasin()) {
                case "DI" : magasin.ajouterProduit(creme); break;
                case "Brico" : magasin.ajouterProduit(scie); break;
                case "Open IT" : magasin.ajouterProduit(souris); break;
                case "Lido Music" : magasin.ajouterProduit(cd); break;
                default:
                    // 3 produit de chaque et un produit stock = 0
                    for (int i = 0; i < 3; i++) {
                        magasin.ajouterProduit(creme);
                        magasin.ajouterProduit(scie);
                        magasin.ajouterProduit(souris);
                    }
                    magasin.ajouterProduit(cd); magasin.retirerProduit(cd);
                    break;
            }

        }

        // print init clients - magasin
        for (Client client : clients) {
            System.out.println(client);
        }
        for (Magasin magasin : magasins) {
            System.out.println(magasin);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // test des fonctionnalites
        // tous les client achete une creme chez di
        System.out.println("##### tous les clients achetent une creme chez dit");
        for (Client client : clients) {
            client.acheter(creme, di);
        }

        System.out.println("\n#### tous les clients achetent  une creme chez fourtout");
        for (Client client : clients) {
            client.acheter(creme, fourtout);
        }

        System.out.println("\n#### tous les clients achetent  une creme chez Brico");
        for (Client client : clients) {
            client.acheter(creme, fourtout);
        }

        System.out.println("\n#### tous les clients achetent  un cd chez fourtout (produit existant mais stock : 0");
        for (Client client : clients) {
            client.acheter(cd, fourtout);
        }
        System.out.println("\n#### tous les clients achetent  une scie chez fourtout");
        for (Client client : clients) {
            client.acheter(scie, brico);
        }

        System.out.println("\n#### Client 3 achete une souris raze chez fourtout et chez open it");
        clients.get(2).acheter(souris, fourtout);
        clients.get(2).acheter(souris, openit);
        System.out.println("\n#### Client 3 achete le cd ramstein chez lido music");
        clients.get(2).acheter(cd, lido);



        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // print init clients - magasin
        for (Client client : clients) {
            System.out.println(client);
        }
        for (Magasin magasin : magasins) {
            System.out.println(magasin);
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n#### Client 3 utilise ses produits");


        for (Produit p : clients.get(2).getProduits()) {
            p.utiliser();
            System.out.println("\t---");
        }

    }


}
