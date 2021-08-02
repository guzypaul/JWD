package by.guzypaul.branchingandloop.service.loop;

/**
 * @author Guzy Paul
 * Task02 (loop): print all numbers from 5 to 1;
 */

public class SequenceCreator {
    /**
     * @param startNumber, endNumber for sequence;
     * @return simple array of sequence of number;
     */
    public int[] createDescendingSequence(int startNumber, int endNumber){
        int numberOfCell = Math.abs(startNumber - endNumber);
        int[] simpleArray = new int[numberOfCell];
        for (int i = 0, j = startNumber; i < simpleArray.length; i++, j--){
            simpleArray[0] = j;
        }
        return simpleArray;
    }
}