package PlatformTransactionManager002;

public interface TransactionDefinition {
	
	public int getPropagationBehavior();//返回事务的传播行为
	int  getIsolationLevel();//返回事务的隔离级别,事务管理器根据它来控制另外一个事务可以看到本事务内的哪些数据
	int getTimeout();//返回事务必须在多少秒内完成
	boolean isReadOnly();//事务是否只读，事务管理器能够根据这个返回值进行优化，确保事务是只读的
	
	
	//我们可以用TransactionDefinition来定义事务属性
	
	/**
	 * 事务的第一个方面是传播行为（propagation behavior）。当事务方法被另一个事务方法调用时，必须指定事务应该如何传播。
	 * 例如：方法可能继续在现有事务中运行，也可能开启一个新事务，并在自己的事务中运行。Spring定义了七种传播行为：
	 * PROPAGATION_REQUIRED:表示当前方法必须运行在事务中。如果当前事务存在，方法将会在该事务中运行。否则，会启动一个新的事务
	 * PROPAGATION_SUPPORTS:表示当前方法不需要事务上下文，但是如果存在当前事务的话，那么该方法会在这个事务中运行
	 * PROPAGATION_MANDATORY:表示该方法必须在事务中运行，如果当前事务不存在，则会抛出一个异常
	 * PROPAGATION_REQUIRED_NEW:表示当前方法必须运行在它自己的事务中。一个新的事务将被启动。如果存在当前事务，在该方法执行期间，当前事务会被挂起。
	 *                          如果使用JTATransactionManager的话，则需要访问TransactionManager
	 * PROPAGATION_NOT_SUPPORTED:表示该方法不应该运行在事务中。如果存在当前事务，在该方法运行期间，当前事务将被挂起。
	 *                           如果使用JTATransactionManager的话，则需要访问TransactionManager
	 * PROPAGATION_NEVER:表示当前方法不应该运行在事务上下文中。如果当前正有一个事务在运行，则会抛出异常
	 * PROPAGATION_NESTED:表示如果当前已经存在一个事务，那么该方法将会在嵌套事务中运行。嵌套的事务可以独立于当前事务进行单独地提交或回滚。
	 *                    如果当前事务不存在，那么其行为与PROPAGATION_REQUIRED一样。
	 *                    注意各厂商对这种传播行为的支持是有所差异的。
	 *                    可以参考资源管理器的文档来确认它们是否支持嵌套事务
	 * */
	//(1)PROPAGATION_REQUIRED如果存在一个事务,则支持当前事务.如果没有,则开启一个新的事务
	//PROPAGATION_REQUIRED
	 /**methodA{
	  * 
	  * metodB();
	  * 
	  * 
	  * }
	  * */
	//使用springAop声明式事务管理,会根据事务属性,自动选择在方法调用之前选择是否开启一个事务或者在方法执行之后是否回滚或者提交事务
	
	//单独调用methodB();
	
	/**
	 * main{
	 * 	method();
	 * 
	 * }
	 * */
	//等同于
	/***
	 * 
	 * Main{
	 * 	Connection conn = null;
	 * 	try{
	 * 	conn = getConnection();
	 * 	conn.setAutoCommit(false);
	 * }
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * /
	
	//(2)PROPAGATION_SUPPORTS表示当前方法不需要事务上下文,但是如果存在当前事务,该方法还是会在事务中运行
	/**
	 * 
	 * */

}
