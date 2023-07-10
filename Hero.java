public class Hero extends Substance implements HasHealth, HasMana {
    private int id;

    private int maxHealthPoint; 
    private int currentHealthPoint; 

    private int maxManaPoint; 
    private int currentManaPoint; 

    public Hero(int maxHealthPoint, int maxManaPoint, int id) {
        this.id = id;
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this(maxHealthPoint, maxManaPoint, nextId++);

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

    @Override
    public int getCurrentMana() {
        return this.currentManaPoint;
    }

    @Override
    public void setCurrentMana(int manaPoint) {
        this.currentManaPoint = manaPoint;
    }

    @Override
    public int getMaxMana() {
        return this.maxManaPoint;
    }
}
