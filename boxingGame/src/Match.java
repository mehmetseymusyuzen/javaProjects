public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        int round = 1;
        if (checkWeight()) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                System.out.println("======= " + round + ". Round =======");
                double whoIsStart = Math.random() * 100;
                if (whoIsStart <= 50) {
                    fighter2.health = fighter1.hit(fighter2);
                    if (isWin()) {
                        break;
                    }
                    fighter1.health = fighter2.hit(fighter1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    fighter1.health = fighter2.hit(fighter1);
                    if (isWin()) {
                        break;
                    }
                    fighter2.health = fighter1.hit(fighter2);
                    if (isWin()) {
                        break;
                    }
                }
                printHealty();
                round++;
            }
        } else {
            System.out.println("The weights of the athletes are not equal !");
        }
    }

    public boolean checkWeight() {
        return ((fighter1.weight >= minWeight && fighter1.weight <= maxWeight)
                && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight));
    }

    public boolean isWin() {
        if (fighter1.health == 0) {
            System.out.println(fighter2.name + " won the match !");
            return true;
        }
        if (fighter2.health == 0) {
            System.out.println(fighter1.name + " won the match !");
        }
        return false;
    }

    public void printHealty() {
        System.out.println(fighter1.name + " remaining health : " + fighter1.health);
        System.out.println(fighter2.name + " remaining health : " + fighter2.health);
        System.out.println();
    }
}
