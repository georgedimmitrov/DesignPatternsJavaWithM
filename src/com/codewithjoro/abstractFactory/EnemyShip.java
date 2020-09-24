package com.codewithjoro.abstractFactory;

public abstract class EnemyShip {
   private String name;

   // Newly defined objects that represent weapon & engine
   // These can be changed easily by assigning new parts
   // in UFOEnemyShipFactory or UFOBossEnemyShipFactory
   ESWeapon weapon;
   ESEngine engine;

   abstract void makeShip();

   public void followHeroShip() {
      System.out.println(getName() + " is following the hero at " + engine);
   }

   public void displayEnemyShip() {
      System.out.println(getName() + " is on the screen");
   }

   public void enemyShipShoots() {
      System.out.println(getName() + " attacks and does " + weapon);
   }

   // If any EnemyShip object is printed to screen this shows up

   public String toString() {
      String infoOnShip = "The " + name + " has a top speed of " + engine +
              " and an attack power of " + weapon;
      return infoOnShip;
   }

   public String getName() {
      return name;
   }

   public void setName(String newName) {
      name = newName;
   }
}
