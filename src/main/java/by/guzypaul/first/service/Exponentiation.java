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
}
