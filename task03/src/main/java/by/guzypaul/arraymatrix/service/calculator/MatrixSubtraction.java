package by.guzypaul.arraymatrix.service.calculator;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

public interface MatrixSubtraction {
    MatrixEntity substract() throws MatrixException, ServiceException;
}
