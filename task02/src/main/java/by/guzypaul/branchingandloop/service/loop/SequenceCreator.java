package by.guzypaul.branchingandloop.service.loop;

/**
 * @author Guzy Paul
 * Task02 (loop): print all numbers from 5 to 1;
 */

public class SequenceCreator {
    /**
     * @param arrayOfNum contains startNumber & endNumber for descending sequence;
     * @return simple array of sequence of number;
     */
    public int[] createDescendingSequence(int[] arrayOfNum){
        int startNumber = arrayOfNum[0];
        int endNumber = arrayOfNum[1];
        int numberOfCell = Math.abs(startNumber - endNumber) + 1;
        int[] simpleArray = new int[numberOfCell];
        for (int i = 0, j = startNumber; i < simpleArray.length; i++, j--){
            simpleArray[i] = j;
        }
        return simpleArray;
    }
}