package PlatformTransactionManager;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

/**
 * 
 * 
 * */

public class PlatformTransactionManagerImpl implements PlatformTransactionManager {

	@Override
	public void commit(TransactionStatus arg0) throws TransactionException {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * PlatformTransactionManager接口实现类通过getTransaction方法获取TransactionDefinition的参数 
	 * 
	 * */
	public TransactionStatus getTransaction(TransactionDefinition arg0)
			throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rollback(TransactionStatus arg0) throws TransactionException {
		// TODO Auto-generated method stub

	}

}
