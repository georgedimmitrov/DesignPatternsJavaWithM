package com.codewithjoro.abstractFactory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {
   public ESWeapon addESGun() {
      return new ESUFOBossGun(); // Specific to Boss UFO
   }

   public ESEngine addESEngine() {
      return new ESUFOBossEngine(); // Specific to Boss UFO
   }
}
