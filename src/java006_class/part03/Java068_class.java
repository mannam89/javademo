package java006_class.part03;

//[사각형 도형]
//가로		세로		색상		넓이		둘레
//5		3		레드		15	    16
//7		4		블루		28		22
//
//[객체 모델링 과정]
//객체의 특징: 가로, 세로, 색상
//객체의 기능: 넓이를 구한다. 둘레를 구한다.

public class Java068_class {

	public static void main(String[] args) {
		Rect rt = new Rect();
		rt.width=5;
		rt.height=3;
		rt.color="레드";
		System.out.printf("%d %d %s %d %d\n",rt.width,rt.height,rt.color,rt.area(),rt.grith());
		rt.display();
		
		Rect rc=new Rect();
		rc.width=8;
		rc.height=5;
		rc.color="블루";
		System.out.printf("%d %d %s %d %d\n",rc.width,rc.height,rc.color,rc.area(),rc.grith());
		rc.display();

	}

}
