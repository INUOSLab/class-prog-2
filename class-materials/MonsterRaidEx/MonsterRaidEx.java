/* 
 * INU ITE Programming(2) class
 * Sample code
 * by ypkim at inu ac kr
 */

interface Caster {
  void cast();
  int cooldown=5;
}

interface Defender {
  void defend(int damage);
  double damageReductionRatio=0.5;
}

interface Attacker {
  void attack();
}

interface Shooter {
  void shoot();
}

class Creature {
  protected int HP;
  protected String name; 
}

abstract class Warrior extends Creature implements Defender, Attacker {
  protected double aggro; 
}

abstract class Wizard extends Creature implements Caster {
  protected int MP;
  protected double cooltime;
  protected int cost; 
}

abstract class Healer extends Wizard {
  abstract void resurrect(); 
}

abstract class Monster extends Wizard implements Attacker {
  protected int gem; 
}

/* 
 * From here, write your own code under the direction.
 */
