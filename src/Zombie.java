import java.util.List;

/**
 * This is the child class zombie from the parent class horror character.
 */
public class Zombie extends HorrorCharacter{

    /**
     *constructor
     */
    Zombie(){
        super();
        addVulnerability(Vulnerability.FIRE);
    }

    /**
     *attack method
     */
    @Override
    public void attack(){
        System.out.println("The zombie has eaten a chunk of your brain");
    }

    /**
     *flee method
     */
    @Override
    public void flee(){
        System.out.println("The zombie crawled away");
    }

    /**
     *transform method that just returns "zombies can't transform"
     */
    public void transform(){
        System.out.println("Zombies can't transform");
    }

    /**
     *returns monster type
     */
    @Override
    public String getMonsterType(){
        return "zombie";
    }

}
