package by.guzypaul.branchingandloop.service.loop;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Guzy Paul
 * Task27 (loop): find all dividers for all natural numbers on slice [m, n] (instead of 1 and the number itself);
 */
public class DividerCalc {
    /**
     * @param arrayOfPoints that contains startPoint & finishPoint;
     * @return list of dividers;
     */
    public HashMap<Integer, ArrayList> findAllDividers(int[] arrayOfPoints) {
        int startPoint = arrayOfPoints[0];
        int finishPoint = arrayOfPoints[1];
        HashMap<Integer, ArrayList> numberAndDividerMap = new HashMap<>();
        for (int i = startPoint; i <= finishPoint; i++) {
            ArrayList<Integer> dividerList = new ArrayList<>();
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    dividerList.add(j);
                }
            }
            numberAndDividerMap.put(i, dividerList);
        }
        return numberAndDividerMap;
    }
}
