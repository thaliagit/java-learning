package OOP.OOPSOLID;

import OOP.OOPSOLID.OpenclosedPrinciple2.Attack;

public class OpenclosedPrinciple2 {
    interface Attack {
        void attack();
    }

    class AttackSword implements Attack {
        public void attack() {
            System.out.println("Sword attack!");
        }
    }

    class AttackMagic implements Attack {
        public void attack() {
            System.out.println("Magic attack!");

        }
    }

    class AttackBow implements Attack {
        public void attack() {
            System.out.println("Bow attack!");

        }
    }

    class AttackFireball implements Attack {
        public void attack() {
            System.out.println("Fireball attack!");

        }
    }

    class AttackPoison implements Attack {
        public void attack() {
            System.out.println("Poison attack!");

        }
    }
}
