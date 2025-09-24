import java.util.List;

public class Werewolf extends HorrorCharacter implements Transformable{

    private String name;
    private int health;
    public List<Vulnerability> vulnerabilities;

    Werewolf(String newName){
        super();
        name = newName;
        addVulnerability(Vulnerability.SILVER);
    }

    @Override
    public void attack(){
        System.out.println("Werewolf has bit you");
    }

    @Override
    public void flee(){
        System.out.println("Werewolf has ran away");
    }

    @Override
    public int vulnerabilityBehavior(String opposingAttackType){
        int penalty = 0;
        if(opposingAttackType.equalsIgnoreCase("silver")){
            penalty = 1;
        }

        return penalty;
    }
}
