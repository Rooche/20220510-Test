package Ex1;

public class Clothes implements Store {
	double storeRatio;
	
	public Clothes(double storeRatio) {
		super();
		this.storeRatio = storeRatio;
		
	}

	@Override
	public int card(int price) {
		return (int)(price - price *(storeRatio + CARD_PAYMENT_RATIO));
	}

	@Override
	public int cash(int price) {
		return (int)(price - price *(storeRatio + CASH_PAYMENT_RATIO));
	}

	@Override
	public void showInfo() {
		double storeOn = storeRatio + CARD_PAYMENT_RATIO;
		double storeOff = storeRatio + CASH_PAYMENT_RATIO;
		System.out.println("###의류매장입니다." + "\n 카드 결제 할인율 :" + storeOn + "\n 현금 결제 할인율 :" + storeOff);
	}
	
}
