import java.util.ArrayList;
import java.util.List;

public abstract class HorrorCharacter {

    //enum for horror character weaknesses
    protected enum Vulnerability{
        FIRE,
        SUNLIGHT,
        SILVER,
        HOLY_WATER
    }

    //declaring
    private String name;
    private int health;
    public List<Vulnerability> vulnerabilities;

    //constructor w/o arguments
    public HorrorCharacter(){
        this.name = "name";
        this.health = 100;
        this.vulnerabilities = new ArrayList<>();
    }

    //getter and setter for vulnerabilities
    public void addVulnerability(Vulnerability newVulnerability){
        vulnerabilities.add(newVulnerability);
    }

    public List<Vulnerability> getVulnerabilities(){
        return vulnerabilities;
    }

    //getter and setter for name
    public void setName(String newName){
        if(!name.equalsIgnoreCase(newName)){
            name = newName;
        }
    }

    public String getName(){
        return name;
    }

    //getter and setter for health
    public void setHealth(int newHealth){
        if(newHealth != health && newHealth > 0){
            health = newHealth;
        }
    }

    public int getHealth(){
        return health;
    }

    //abstract methods for void attack(), void flee(), and vulnerability[] vulnerabilities

    public void attack(){

    }

    public void flee(){

    }

    public void transform(){

    }

    public String getMonsterType(){
        return "Horror Character";
    }


    public String toString(){
        String s = "";
        s = "Name: " + getName() + " Health: " + getHealth() + " Vulnerabilities: " + getVulnerabilities();
        return s;
    }
}
