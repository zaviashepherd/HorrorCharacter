import java.util.ArrayList;
import java.util.List;

public abstract class HorrorCharacter {

    //enum for horror character weaknesses
    public enum Vulnerability{
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
        String name = "name";
        int health = 100;
        List<Vulnerability> vulnerabilities = new ArrayList<>();
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

    //returning an int for future use to be handled in the main program, if vulnerability is present in battle with opponent then
    //there will be penalty of 1 and return it ot the main program to handle to increases attack damage coming from opponent
    public int vulnerabilityBehavior(String opposingAttackType){
        int penalty = 0;

        return penalty;
    }

    public String toString(){
        String s = "";
        s = "Name: " + getName() + " Health: " + getHealth() + " Vulnerabilities: " + getVulnerabilities();
        return s;
    }
}
