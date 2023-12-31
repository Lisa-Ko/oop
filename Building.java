
public class Building extends Substance implements HasHealth {
    private int id;
    private int maxHealthPoint; 
    private int currentHealthPoint; 

    public Building(int maxHealthPoint, int id) {
        this.id = id;
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public Building(int maxHealthPoint) {
        this(maxHealthPoint, nextId++);

    }

    public int getId() {
        return id;
    }

    @Override
    public int getCurrentHealth() {
        return this.currentHealthPoint;
    }

    @Override
    public void setCurrentHealth(int healthPoint) {
        this.currentHealthPoint = healthPoint;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealthPoint;
    }
}