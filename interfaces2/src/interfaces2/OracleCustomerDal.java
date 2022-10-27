package interfaces2;



public class OracleCustomerDal  implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("Oracle eklendi");
		
	}

}