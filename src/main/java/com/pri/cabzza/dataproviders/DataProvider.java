package com.pri.cabzza.dataproviders;

import com.pri.cabzza.dataproviders.exceptions.DataProviderPersistanceException;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Mikolaj Manski
 * @param <T>
 */
public interface DataProvider<T extends List<?>> {

	T getData(String symbol, String market, Date startDate, Date endDate) throws DataProviderPersistanceException;

}
