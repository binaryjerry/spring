package PlatformTransactionManager;

import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

public class TransactionStatusImpl implements TransactionStatus {

	@Override
	public Object createSavepoint() throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void releaseSavepoint(Object arg0) throws TransactionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollbackToSavepoint(Object arg0) throws TransactionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasSavepoint() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCompleted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNewTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRollbackOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRollbackOnly() {
		// TODO Auto-generated method stub

	}

}
