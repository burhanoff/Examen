public class Ferm {
    private String name;
    private String[] cows;
    private String[] hors;
    private String owner;

    public Ferm(String name, String[] cows, String[] hors, String owner) {
        this.name = name;
        this.cows = cows;
        this.hors = hors;
        this.owner = owner;
    }
    public int Sum(){
        return cows.length + hors.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCows() {
        return cows;
    }

    public void setCows(String[] cows) {
        this.cows = cows;
    }

    public String[] getHors() {
        return hors;
    }

    public void setHors(String[] hors) {
        this.hors = hors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void info(){
        System.out.println("Ферма " + name);
        System.out.println("Владелец " +owner);
        System.out.println("Количество коров "+ cows.length);
        System.out.println("Количество лошадей "+ hors.length);
        System.out.println("Общее количество животных "+Sum());
        System.out.println();
    }
}