import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Account smith = new Account("Smith", 46f, 2000);
        Account kathy = new Account("Kathy", 30f, 3000);
        smith.deposit(2000);
        kathy.withdraw(2000);
        System.out.println("Balance in Simth Account:"+smith.getBalance());
        System.out.println("Balance in Kathy Account:"+kathy.getBalance());

    }
}

class Person {
    String name;
    float age;

    String getName() {
        return this.name;
    }

    float getAge() {
        return this.age;
    }

    void setter(String name, float age) {
        this.age = age;
        this.name = name;
    }
}

class Account extends Person {
    long accNum;
    double balance;
    Person accHolder;
    Random r = new Random();

    public Account(String name, float age, double balance) {
        this.accNum = r.nextLong();
        super.setter(name, age);
        if (balance < 500) {
            System.out.println("Deposit of more than 500 is required for initial deposit");
        } else {
            this.balance += balance;
        }

    }

    void deposit(double amt) {
        this.balance += amt;
    }

    void withdraw(double amt) {
        if (this.balance - amt < 500) {
            System.out.println("Minimum balance reached");
        } else {
            this.balance -= amt;
        }

    }

    double getBalance() {
        return this.balance;
    }

    long getaccNo() {
        return this.accNum;
    }

    double getbalance() {
        return this.balance;
    }

    Person getaccHolder() {
        return this.accHolder;
    }

    void setter(String name, float age) {
        this.age = age;
        this.name = name;
    }
}

class SavingsAcc extends Account {
    final float minBalance = 500;

    public SavingsAcc(String name, float age, double balance) {
        super(name, age, balance);

    }

    void withdraw(double amt) {
        if (this.balance - amt < this.minBalance) {
            System.out.println("Minimum balance reached");
        } else {
            this.balance -= amt;
        }

    }

}

class CurrentAcc extends Account {
    float overdraftLimit = 500;
    boolean overdraftreached;

    public CurrentAcc(String name, float age, double balance) {
        super(name, age, balance);

    }

    void withdraw(double amt) {
        if (this.balance - amt < this.overdraftLimit) {
            overdraftreached = true;
        } else {
            this.balance -= amt;
            overdraftreached = false;
        }

    }

}