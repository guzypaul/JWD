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

    private final ArraySorter bubbleSort = new BubbleSortImpl();
    private final ArraySorter insertionSort = new InsertionSortImpl();
    private final ArraySorter selectionSort = new SelectionSortImpl();
    private final ArraySorter shakerSort = new ShakerSortImpl();
    private final ArraySorter shellSort = new ShellSortImpl();

    private final MatrixMultiplicator matrixMultiplicator = new MatrixMultiplicatorImpl();
    private final MatrixSubtraction matrixSubtractor = new MatrixSubtractionImpl();
    private final MatrixSum matrixSum = new MatrixSumImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public ArraySorter getBubbleSort(){
        return bubbleSort;
    }
    public ArraySorter getInsertionSort(){
        return  insertionSort;
    }
    public ArraySorter getSelectionSort(){
        return selectionSort;
    }
    public ArraySorter getShakerSort(){
        return shakerSort;
    }
    public ArraySorter getShellSort(){
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
