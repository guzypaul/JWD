package by.guzypaul.first.service;

/**
 * Task27
 * Дано значение a. Используя только умножение, получить a^8 за три операции и
 * a^10 за четыре операции.
 */

public class Exponentiation {

    private double numInEightPower;
    private double numInTenPower;

    public void raisingNumberToPower(double arg) {
        double ArgInTwoPower = arg * arg;
        double ArgInFourPower = ArgInTwoPower * ArgInTwoPower;
        numInEightPower = ArgInTwoPower * ArgInFourPower;
        numInTenPower = ArgInTwoPower * numInEightPower;
    }

    public double getNumInEightPower() {
        return numInEightPower;
    }

    public double getNumInTenPower() {
        return numInTenPower;
    }

    public void setNumInEightPower(double numInEightPower) {
        this.numInEightPower = numInEightPower;
    }

    public void setNumInTenPower(double numInTenPower) {
        this.numInTenPower = numInTenPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exponentiation)) return false;

        Exponentiation that = (Exponentiation) o;

        if (Double.compare(that.getNumInEightPower(), getNumInEightPower()) != 0) return false;
        return Double.compare(that.getNumInTenPower(), getNumInTenPower()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getNumInEightPower());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getNumInTenPower());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
