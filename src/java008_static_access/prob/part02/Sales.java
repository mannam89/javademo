package java008_static_access.prob.part02;
//-(private)    + (public)    #(protected)     X : default

/*   클래스명 : Sales
*   -item:String  
*   -qty:int
*   -cost:int
*   
*   +setItem(item :String):void
*   +setQty(qty :int):void
*   +setCost(cost :int):void
*   +getItem():String
*   +getQty():int
*   +getCost():int
*   +toString():String         ==> 출력
*   +getPrice():int             ==> 수량 * 단가를 리턴
*/

public class Sales {
	String item;
	int qty;
	int cost;
	
	int price;
	
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "품목 : " + item + " 수량 : " + qty + " 단가 : " + cost + "원 금액 : " + qty*cost + "원\n";
	}
	

	public int getPrice() {
		
		int price = this.qty*this.cost;
		return price;
	}
		
	

}
