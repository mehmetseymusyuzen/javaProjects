public class Fighter {
    String name;
    int weight;
    double health;
    double damage;
    double block;

    Fighter(String name, int weight, double health, double damage, double block) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        if (block >= 0 && block <= 100) {
            this.block = block;
        } else {
            this.block = 0;
        }
    }

    public double hit(Fighter enemy) {
        System.out.println(this.name + " ==> " + enemy.name + " " + this.damage + " damage struck.");

        if (enemy.isBlock()) {
            System.out.println(enemy.name + " dodge the incoming damage !");
            return enemy.health;
        }
        if (enemy.health - this.damage < 0) {
            return 0;
        }
        return enemy.health - this.damage;
    }

    public boolean isBlock() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.block;
    }
}
