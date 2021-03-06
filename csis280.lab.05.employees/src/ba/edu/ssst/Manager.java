package ba.edu.ssst;

public class Manager implements IEmployee {
    private final double salary;

    private final int freeDays;

    private final int yearsOfExp;

    public Manager(double salary, int freeDays, int yearsOfExp) {
        this.salary = salary;
        this.freeDays = freeDays;
        this.yearsOfExp = yearsOfExp;
    }

    private double getBonus() {
        return this.yearsOfExp * 300;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.getSalary() + this.getBonus();
    }

    @Override
    public int numberOfFreeDays() {
        return this.freeDays;
    }
}
