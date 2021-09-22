package by.guzypaul.arraymatrix.service.factory;

import by.guzypaul.arraymatrix.service.ArrayService;
import by.guzypaul.arraymatrix.service.impl.ArrayServiceImpl;
import by.guzypaul.arraymatrix.service.sorter.*;
import by.guzypaul.arraymatrix.service.sorter.impl.*;
import by.guzypaul.arraymatrix.service.calculator.MatrixMultiplicator;
import by.guzypaul.arraymatrix.service.calculator.MatrixSubtraction;
import by.guzypaul.arraymatrix.service.calculator.MatrixSum;
import by.guzypaul.arraymatrix.service.calculator.impl.MatrixMultiplicatorImpl;
import by.guzypaul.arraymatrix.service.calculator.impl.MatrixSubtractionImpl;
import by.guzypaul.arraymatrix.service.calculator.impl.MatrixSumImpl;


public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ArrayService arrayService = new ArrayServiceImpl();

//    private final ArraySorter bubbleSort = new BubbleSortImpl();
//    private final ArraySorter insertionSort = new InsertionSortImpl();
//    private final ArraySorter selectionSort = new SelectionSortImpl();
//    private final ArraySorter shakerSort = new ShakerSortImpl();
//    private final ArraySorter shellSort = new ShellSortImpl();
//
//    private final MatrixMultiplicator matrixMultiplicator = new MatrixMultiplicatorImpl();
//    private final MatrixSubtraction matrixSubtractor = new MatrixSubtractionImpl();
//    private final MatrixSum matrixSum = new MatrixSumImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public ArrayService getArrayService(){
        return arrayService;
    }
//    public ArraySorter getInsertionSort(){
//        return  insertionSort;
//    }
//    public ArraySorter getSelectionSort(){
//        return selectionSort;
//    }
//    public ArraySorter getShakerSort(){
//        return shakerSort;
//    }
//    public ArraySorter getShellSort(){
//        return shellSort;
//    }
//
//    public MatrixMultiplicator getMatrixMultiplicator(){
//        return matrixMultiplicator;
//    }
//    public MatrixSubtraction getMatrixSubtraction(){
//        return matrixSubtractor;
//    }
//    public MatrixSum getMatrixSum(){
//        return matrixSum;
//    }

}
