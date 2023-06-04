public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;       //bloklama

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {           //foe rakip
        System.out.println("------------");


        System.out.println(this.name + " kişisi " + foe.name + " kişisine " + this.damage + " hasar vurdu!");
        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100; //0.0 to 99.9
        return randomValue <= this.dodge;
    }

}
