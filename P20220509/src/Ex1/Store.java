package Ex1;

public interface Store {
	static final double CARD_PAYMENT_RATIO = 0.01;
	static final double CASH_PAYMENT_RATIO = 0.03;
	
	public int card(int price);
	
	public int cash(int price);
	
	public void showInfo();
}
