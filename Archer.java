public class Archer extends Personnage {

    protected Archer(String name){
        super(name, 80, 20, 25, 3);
        System.out.println("Vous avez choisi Archer : "+name);
    }
}