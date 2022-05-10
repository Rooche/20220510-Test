package Ex1;

public class Restaurant implements Store{
	double restaurantRatio;
	
	public Restaurant(double restaurantRatio) {
		super();
		this.restaurantRatio = restaurantRatio;
		
	}

	@Override
	public int card(int price) {
		return (int)(price - price *(restaurantRatio + CARD_PAYMENT_RATIO));
	}

	@Override
	public int cash(int price) {
		return (int)(price - price *(restaurantRatio + CASH_PAYMENT_RATIO));
	}

	@Override
	public void showInfo() {
		double storeOn = restaurantRatio + CARD_PAYMENT_RATIO;
		double storeOff = restaurantRatio + CASH_PAYMENT_RATIO;
		System.out.println("###식당입니다." + "\n 카드 결제 할인율 :" + storeOn + "\n 현금 결제 할인율 :" + storeOff);
	}

}
