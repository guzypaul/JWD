package by.guzypaul.branchingandloop.service.loop;

import java.util.ArrayList;

/**
 * @author Guzy Paul
 * Task17 (loop): given real (double a) and natural (int n) numbers;
 * find a*(a+1)...(a + n -1);
 */
public class SequenceCalc {
    /**
     * @param dataList - contain number and finishPoint;
     * @return result multiplication members of sequence;
     */
    public double findMultiplicationMembersOfSequence (double[] dataList){
        double a = dataList[0];
        int n = (int)dataList[1];
        double result = a;
        for(int i = 1; i < n; i++){
            result *= (a + i);
        }
        return result;
    }
}
