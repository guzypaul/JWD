package by.guzypaul.branchingandloop.validator;

public class ComplexFunctionCalcValidator {
    public boolean checkFinishPoint(double startPoint, double finishPoint) {
        return startPoint < finishPoint;
    }

    public boolean checkStep(double startPoint, double finishPoint, double step) {
        if(step > 0 && step <= (finishPoint - startPoint)){
            return true;
        } else {
            return false;
        }
    }
}
