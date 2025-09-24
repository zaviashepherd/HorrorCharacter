import java.util.List;

public class Zombie extends HorrorCharacter implements Transformable{
    private String name;
    private int health;
    public List<Vulnerability> vulnerabilities;

    Zombie(String newName){
        super();
        name = newName;
        addVulnerability(Vulnerability.FIRE);
    }

    @Override
    public void attack(){
        System.out.println("The zombie has eaten a chunk of your brain");
    }

    @Override
    public void flee(){
        System.out.println("The zombie crawled away");
    }

    @Override
    public int vulnerabilityBehavior(String opposingAttackType){
        int penalty = 0;
        if(opposingAttackType.equalsIgnoreCase("fire")){
            penalty = 1;
        }

        return penalty;
    }
}
