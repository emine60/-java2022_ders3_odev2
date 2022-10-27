package polymorphismDemo2;


public class Main {
	public static void main() {
		//EmailLogger logger = new EmailLogger();
	    //logger.log("Log mesajı");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger() } ;
//		for (BaseLogger logger:loggers) {
//			logger.log("log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}
	

}
