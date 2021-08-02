package by.guzypaul.branchingandloop.service.loop;

import java.util.ArrayList;

/**
 * @author Guzy Paul
 * Task27 (loop): find all dividers for all natural numbers on slice [m, n] (instead of 1 and the number itself);
 */

public class DividerCalc {

    /**
     * @param startPoint, finishPoint;
     * @return list of dividers;
     */
    public ArrayList<Integer> findAllDividers (int startPoint, int finishPoint){
        ArrayList<Integer> dividerList = new ArrayList<Integer>();
        for (int i = startPoint; i <= finishPoint; i++) {
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    dividerList.add(j);
                    //System.out.println("Divider of " + i + " is " + j);
                }
            }
        }
        return dividerList;
    }
}
