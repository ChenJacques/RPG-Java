public class Guerrier extends Personnage {
    
    protected Guerrier(String name){
        super(name, 100, 20, 20, 5);
        System.out.println("Vous avez choisi Guerrier : "+name);
    }
}