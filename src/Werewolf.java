import java.util.List;

public class Werewolf extends HorrorCharacter implements Transformable{

    private boolean transformed;

    Werewolf(){
        super();
        addVulnerability(Vulnerability.SILVER);
        transformed = false;
    }

    @Override
    public void attack(){
        if(!transformed) {
            System.out.println("Werewolf has bit you");
        }
        else if(transformed){
            System.out.println("Human has punched you.");
        }
    }

    @Override
    public void flee(){
        if(!transformed) {
            System.out.println("Werewolf has ran away.");
        }
        if(transformed){
            System.out.println("Human has scurried away.");
        }
    }

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

    @Override
    public String getMonsterType(){
        return "werewolf";
    }

}
