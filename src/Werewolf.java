import java.util.List;

/**
 * This is the child class werewolf from the parent class horror character, I implemented the transformable interface.
 * When the werewolf is transformed the attack and flee methods both change.
 */
public class Werewolf extends HorrorCharacter implements Transformable{

    private boolean transformed;

    /**
     *constructor
     */
    Werewolf(){
        super();
        addVulnerability(Vulnerability.SILVER);
        transformed = false;
    }

    /**
     *attack method based off of current transformation
     */
    @Override
    public void attack(){
        if(!transformed) {
            System.out.println("Werewolf has bit you");
        }
        else if(transformed){
            System.out.println("Human has punched you.");
        }
    }

    /**
     *flee method based off of current transformation
     */
    @Override
    public void flee(){
        if(!transformed) {
            System.out.println("Werewolf has ran away.");
        }
        if(transformed){
            System.out.println("Human has scurried away.");
        }
    }

    /**
     *transformation method
     */
    public void transform(){
        if(transformed){
            transformed = false;
            System.out.println("You have transformed to a werewolf.");
        }
        if(!transformed){
            transformed = true;
            System.out.println("You have transformed into a human.");
        }
    }

    /**
     *returns monster type
     */
    @Override
    public String getMonsterType(){
        return "werewolf";
    }

}
