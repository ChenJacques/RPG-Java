import java.util.*; 

public class Creation extends Personnage {
    
    public Creation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenue,");
        System.out.println("Choisissez une classe :");
        System.out.println("Guerrier, Mage, Archer");
        String a = sc.next();
        while (a != "Guerrier" || a != "Mage" || a != "Archer" ) {
            switch (a) {
                case "Guerrier":
                    System.out.print("Vous avez choissir Guerrier.");    
                    break;
                case "Mage":
                    break;
                case "Archer" :
                    break;        
                default:
                    System.out.println("Veuillez choisir une classe valide (Guerrier, Mage, Archer)");
                    break;
            }
            a = sc.next();
        }   

    }
}
