package by.guzypaul.arraymatrix.service.factory;

import by.guzypaul.arraymatrix.service.array.*;
import by.guzypaul.arraymatrix.service.array.impl.*;
import by.guzypaul.arraymatrix.service.matrix.MatrixMultiplicator;
import by.guzypaul.arraymatrix.service.matrix.MatrixSubtraction;
import by.guzypaul.arraymatrix.service.matrix.MatrixSum;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixMultiplicatorImpl;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSubtractionImpl;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixSumImpl;


public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final BubbleSort bubbleSort = new BubbleSortImpl();
    private final InsertionSort insertionSort = new InsertionSortImpl();
    private final SelectionSort selectionSort = new SelectionSortImpl();
    private final ShakerSort shakerSort = new ShakerSortImpl();
    private final ShellSort shellSort = new ShellSortImpl();

    private final MatrixMultiplicator matrixMultiplicator = new MatrixMultiplicatorImpl();
    private final MatrixSubtraction matrixSubtractor = new MatrixSubtractionImpl();
    private final MatrixSum matrixSum = new MatrixSumImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public BubbleSort getBubbleSort(){
        return bubbleSort;
    }
    public InsertionSort getInsertionSort(){
        return  insertionSort;
    }
    public SelectionSort getSelectionSort(){
        return selectionSort;
    }
    public ShakerSort getShakerSort(){
        return shakerSort;
    }
    public ShellSort getShellSort(){
        return shellSort;
    }

    public MatrixMultiplicator getMatrixMultiplicator(){
        return matrixMultiplicator;
    }
    public MatrixSubtraction getMatrixSubtraction(){
        return matrixSubtractor;
    }
    public MatrixSum getMatrixSum(){
        return matrixSum;
    }

}
