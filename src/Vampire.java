import java.util.List;

public class Vampire extends HorrorCharacter implements Transformable{

    private boolean transformed;


    Vampire(){
        super();
        vulnerabilities.add(Vulnerability.SUNLIGHT);
        vulnerabilities.add(Vulnerability.HOLY_WATER);
        transformed = false;
    }

    @Override
    public void attack(){
        if(!transformed) {
            System.out.println("Vampire has bit a chunk of your neck out.");
        }
        else if(transformed){
            System.out.println("Bat has swooped down and bit into your neck.");
        }
    }

    @Override
    public void flee(){
        if(!transformed) {
            System.out.println("Vampire has floated away.");
        }
        if(transformed){
            System.out.println("Bat has flown away.");
        }
    }

    public void transform(){
        if(transformed){
            transformed = false;
            System.out.println("You have transformed into a vampire.");
        }
        else if(!transformed){
            transformed = true;
            System.out.println("You have transformed into a bat.");
        }
    }

    @Override
    public String getMonsterType(){
        return "vampire";
    }

}
