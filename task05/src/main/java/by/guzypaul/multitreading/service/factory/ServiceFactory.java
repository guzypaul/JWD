package by.guzypaul.multitreading.service.factory;

import by.guzypaul.multitreading.service.MatrixService;
import by.guzypaul.multitreading.service.impl.MatrixServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final MatrixService matrixService = new MatrixServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public MatrixService getMatrixService() {
        return matrixService;
    }
}
