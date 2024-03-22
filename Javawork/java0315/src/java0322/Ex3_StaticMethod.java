package java0322;


class Cat{
	private String sanpum;
	private int su,dan;
	private static String msg;
	public static final String SHOP="24Hrs";
	
	

	public String getSanpum() {
		return sanpum;
	}
	public void setSanpum(String sanpum) {
		this.sanpum = sanpum;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}	
	
	public void setDat(String sangpum,int su,int dan)
	{
		this.setSanpum(sangpum);
		this.setDan(dan);
		this.setSu(su);
		//인스턴스메서드에서 static 매서드는 호출이 가능할까요?
	}
	
	public void writeData() {
		System.out.println("상품명" + sanpum);
		System.out.println("수량" + su +", 단가: "+dan);
		System.out.println("송금액: " + su*dan);

	}
	
}

public class Ex3_StaticMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c= new Cat();
		c.setDat("메로나",3,5000);
		System.out.printf("%S는 하나당 %d원이고 총 %d 개 고르셨습니다. 총 가격은 %d입니다 ",
				c.getSanpum(),c.getDan(),c.getSu(),c.getDan()*c.getSu());
		c.writeData();
		
		c.setDat("딸기", 3, 4000);
		c.writeData();
	}
}


