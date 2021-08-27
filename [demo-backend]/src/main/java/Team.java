public class Team {
    private String name;
    private int level;
    private boolean isEmpty;
    private boolean isFull;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public Team(String name, int level, boolean isEmpty, boolean isFull) {
        this.name = name;
        this.level = level;
        this.isEmpty = isEmpty;
        this.isFull = isFull;


    }
}
