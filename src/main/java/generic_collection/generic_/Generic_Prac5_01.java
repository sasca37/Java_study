package generic_collection.generic_;


public class Generic_Prac5_01 {

	public static void main(String[] args) {
		//내 지갑
		Wallet myWallet = new Wallet();
		
		//Pockey Money
		Money<Integer> m1 = new Money<>();
		m1.getMoney(10000);
		
		//Part time job
		Money<Integer> m2 = new Money<>();
		m1.getMoney(500000);
		
		myWallet.insertMoney(m1);
		myWallet.insertMoney(m2);
		
		System.out.println(myWallet.checkWalletMoney());
	}

}

class Wallet {
	double totalMoney = 0;
	
	public void insertMoney(Money<?> myMoney ) {
		totalMoney += myMoney.getMyMoney();
	}
	
	public double checkWalletMoney() {
		return totalMoney;
	}
}

class Money<E extends Number> {
	double myMoney;
	
	public void getMoney(E info) {
		this.myMoney += info.doubleValue();
	}
	
	public double getMyMoney() {
		return myMoney;
	}
} 