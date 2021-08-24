package by.guzypaul.arraymatrix.service.factory;

import by.guzypaul.arraymatrix.service.array.ArrayService;
import by.guzypaul.arraymatrix.service.array.impl.ArrayServiceImpl;
import by.guzypaul.arraymatrix.service.matrix.MatrixService;
import by.guzypaul.arraymatrix.service.matrix.impl.MatrixServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ArrayService arrayService = new ArrayServiceImpl();
    private final MatrixService matrixService = new MatrixServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }
    public ArrayService getArrayService(){
        return arrayService;
    }
    public MatrixService getMatrixService (){
        return matrixService;
    }

    //TODO ServiceFactory
}
