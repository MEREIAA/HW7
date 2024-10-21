public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Hero applies super ability: " + superAbility);
    }
}