package by.guzypaul.branchingandloop.service.loop;

/**
 * @author Guzy Paul
 * Task17 (loop): given real (double a) and natural (int n) numbers;
 * find a*(a+1)...(a + n -1);
 */
public class SequenceCalc {
    /**
     * @param number, finishPoint;
     * @return result multiplication members of sequence;
     */
    public double findMultiplicationMembersOfSequence (double number, int finishPoint){
        double result = number;
        for(int i = 1; i < finishPoint; i++){
            result *= (number + i);
        }
        return result;
    }
}
