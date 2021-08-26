package by.guzypaul.arraymatrix.service.array;

import by.guzypaul.arraymatrix.entity.ArrayEntity;
import by.guzypaul.arraymatrix.service.exception.ServiceException;

public interface ArraySorter {
    ArrayEntity sort() throws ServiceException;
}
