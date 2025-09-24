import java.util.List;

public class Vampire extends HorrorCharacter implements Transformable{

    private String name;
    private int health;
    public List<Vulnerability> vulnerabilities;


    Vampire(String newName){
        super();
        name = newName;
        addVulnerability(Vulnerability.SUNLIGHT);
        addVulnerability(Vulnerability.HOLY_WATER);
        addVulnerability(Vulnerability.SILVER);
    }

    @Override
    public void attack(){
        System.out.println("Vampire has bit a chunk of your neck out.");
    }

    @Override
    public void flee(){
        System.out.println("Vampire has floated away.");
    }

    //returning an int for future use to be handled in the main program, if vulnerability is present in battle with opponent then
    //there will be penalty of 1 and return it ot the main program to handle to increases attack damage coming from opponent
    @Override
    public int vulnerabilityBehavior(String opposingAttackType){
        int penalty = 0;
        if(opposingAttackType.equalsIgnoreCase("fire") || opposingAttackType.equalsIgnoreCase("sunlight")
        || opposingAttackType.equalsIgnoreCase("silver")){
            penalty = 1;
        }

        return penalty;
    }
}
