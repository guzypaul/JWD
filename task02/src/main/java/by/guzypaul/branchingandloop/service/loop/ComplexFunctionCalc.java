package by.guzypaul.branchingandloop.service.loop;

import java.util.ArrayList;

/**
 * @author Guzy Paul
 * Task07 (loop): find value of function on a slice [a,b] with step h
 * y = x, if x >2
 * y = -z, if x<=2;
 */
public class ComplexFunctionCalc {
    /**
     * @param startPoint, finishPoint, step;
     * @return value of function;
     */
    public ArrayList findFunctionValue(double startPoint, double finishPoint, int step) {
        ArrayList<Double> valueList = new ArrayList<Double>();
        double x = startPoint;
        double y;

        while (x <= finishPoint) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            valueList.add(y);
            x += step;
        }
        return valueList;
    }
}
