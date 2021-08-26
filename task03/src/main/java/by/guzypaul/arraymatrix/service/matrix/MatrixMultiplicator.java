package by.guzypaul.arraymatrix.service.matrix;

import by.guzypaul.arraymatrix.entity.MatrixEntity;
import by.guzypaul.arraymatrix.entity.exception.MatrixException;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

public interface MatrixMultiplicator {
    MatrixEntity multiply() throws ServiceException, MatrixException;
}
