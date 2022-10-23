public class Mage extends Personnage{

    protected Mage(String name){
        super(name, 70, 40, 5, 2);
        System.out.println("Vous avez choisi Mage : "+name);
    }
}