package by.guzypaul.branchingandloop.validator;

public class DividerCalcValidator {
    public boolean checkStartPoint(int startPoint){
        return startPoint > 0;
    }

    public boolean checkFinishPoint(int startPoint, int finishPoint){
        return finishPoint > startPoint;
    }
}
