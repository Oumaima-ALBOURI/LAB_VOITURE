public class Test {

    public static void main(String[] args) {

        // Création d'une voiture
        Voiture voiture = new Voiture(
            "Toyota",
            "Corolla",
            50,
            2023
        );

        // Afficher les informations
        voiture.afficherInformations();

        // Accélérer
        voiture.accelerer(50);

        // Freiner
        voiture.freiner(20);

        // Afficher les informations finales
        voiture.afficherInformations();
    }
}