import java.util.ArrayList;
import java.util.List;

/**
 * This is my parent class, it is left as abstract so that the child classes can override these methods.
 * I created my enumeration in the parent class so that the child classes could reference them.
 */
public abstract class HorrorCharacter {

    /**
     * Enum for vulnerability
     */
    protected enum Vulnerability{
        FIRE,
        SUNLIGHT,
        SILVER,
        HOLY_WATER
    }


    private String name;
    private int health;
    public List<Vulnerability> vulnerabilities;

    /**
     * construtor
     */
    public HorrorCharacter(){
        this.name = "name";
        this.health = 100;
        this.vulnerabilities = new ArrayList<>();
    }

    /**
     * Takes the array lost created in the parent class and adds a vulnerability
     * @param newVulnerability
     */
    public void addVulnerability(Vulnerability newVulnerability){
        vulnerabilities.add(newVulnerability);
    }

    /**
     * returns vulnerabilities
     */
    public List<Vulnerability> getVulnerabilities(){
        return vulnerabilities;
    }

    /**
     * receives new name a changes the name
     */
    public void setName(String newName){
        if(!name.equalsIgnoreCase(newName)){
            name = newName;
        }
    }

    /**
     * returns name
     */
    public String getName(){
        return name;
    }

    /**
     *receives new health and changes health.
     */
    public void setHealth(int newHealth){
        if(newHealth != health && newHealth > 0){
            health = newHealth;
        }
    }

    /**
     *returns health
     */
    public int getHealth(){
        return health;
    }

    /**
     *attack method
     */
    public void attack(){

    }

    /**
     *flee method
     */
    public void flee(){

    }

    /**
     *transform method
     */
    public void transform(){

    }

    /**
     *returns monster type
     */
    public String getMonsterType(){
        return "Horror Character";
    }

    /**
     *toString
     */
    public String toString(){
        String s = "";
        s = "Name: " + getName() + " Health: " + getHealth() + " Vulnerabilities: " + getVulnerabilities();
        return s;
    }
}
