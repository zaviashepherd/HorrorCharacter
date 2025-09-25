import java.util.List;

/**
 * This is the child class vampire from the parent class horror character, I implemented the transformable interface.
 * When the vampire is transformed the attack and flee methods both change.
 */
public class Vampire extends HorrorCharacter implements Transformable{

    private boolean transformed;

    /**
     *constructor
     */
    Vampire(){
        super();
        vulnerabilities.add(Vulnerability.SUNLIGHT);
        vulnerabilities.add(Vulnerability.HOLY_WATER);
        transformed = false;
    }

    /**
     *attack method based off of current transformation
     */
    @Override
    public void attack(){
        if(!transformed) {
            System.out.println("Vampire has bit a chunk of your neck out.");
        }
        else if(transformed){
            System.out.println("Bat has swooped down and bit into your neck.");
        }
    }

    /**
     *flee method based off of current transformation
     */
    @Override
    public void flee(){
        if(!transformed) {
            System.out.println("Vampire has floated away.");
        }
        if(transformed){
            System.out.println("Bat has flown away.");
        }
    }

    /**
     *transformation method
     */
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

    /**
     *returns monster type
     */
    @Override
    public String getMonsterType(){
        return "vampire";
    }

}
