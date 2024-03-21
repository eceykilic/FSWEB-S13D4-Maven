package org.example;

public class Player {
    private String name;
    private int healthPercentage;
   private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        setFinalHealth(healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void setFinalHealth(int healthPercentage) {
        this.healthPercentage = healthPercentage < 0 ? 0 : Math.min(healthPercentage, 100);
    }

    public void loseHealth(int damage) {
        if (healthPercentage - damage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        setFinalHealth(healthPercentage - damage);
    }

    public void restoreHealth(int healthPotion){
        int newHealth = healthPercentage + healthPotion;
        if (newHealth > 100) {
            healthPercentage = 100; // Sağlık 100'den büyük olamaz
        } else {
            healthPercentage = newHealth; // Yeni sağlık değeri
        }
    }

}
