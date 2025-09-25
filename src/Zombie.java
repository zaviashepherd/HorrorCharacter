import java.util.List;

public class Zombie extends HorrorCharacter{

    Zombie(){
        super();
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

    public void transform(){
        System.out.println("Zombies can't transform");
    }

    @Override
    public String getMonsterType(){
        return "zombie";
    }

}
