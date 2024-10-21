public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(200, 50, "INVISIBILITY");
        heroes[1] = new Medic(100, 30, "HEALING", 50);
        heroes[2] = new Warrior(140, 45, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}