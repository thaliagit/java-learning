package OOP.OOPSOLID;

public class InterfaceSegregationPrinciple {
    interface Worker {
        void work();
    }

    interface Living {
        void eat();

        void sleep();
    }

    class HumanWorker implements Worker, Living {
        public void work() {
            System.out.println("Working.");
        }

        public void eat() {
            System.out.println("Eating.");
        }

        public void sleep() {
            System.out.println("Sleeping.");
        }
    }

    class RobotWorker implements Worker {
        public void work() {
            System.out.println("Working.");
        }
    }
}