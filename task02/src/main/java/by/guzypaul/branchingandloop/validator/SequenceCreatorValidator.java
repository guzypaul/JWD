package by.guzypaul.branchingandloop.validator;

public class SequenceCreatorValidator {
    public boolean checkFinishPoint(int startPoint, int finishPoint) {
        return finishPoint < startPoint;
    }
}
