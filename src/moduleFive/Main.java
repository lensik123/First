package moduleFive;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args) {

//		Machine stanok = new Machine();
//
//		stanok.makeDetail(101);
//
//		stanok.fillOil();
//
//		stanok.makeDetail(20);

//		Tank justTank = new Tank();
//// At (10;10) fuel=100
//		Tank anywareTank = new Tank(10, 10);
//// At (20;30) fuel=200
//		Tank customTank = new Tank(20, 30, 200);
//
//		justTank.goForward(200);
//		justTank.printPosition();
//		anywareTank.goBackward(-200);
//		anywareTank.printPosition();
//		customTank.goForward(201);
//		customTank.printPosition();

//
//		Airplane plane = new Airplane();
//
//		plane.flyStraight(50);
//		plane.flyUp(80,90);
//		plane.turnRight();
//		plane.flyStraight(30);
//		plane.dropFlowers();
//		plane.flyStraight(40);
//		plane.flyDown(100,10);
//		plane.fillFuel();
//		plane.flyDown(100,10);
//		plane.fillFuel();
//		Motorbike motorbike = new Motorbike(2020, "Honda", "Black");
//		System.out.println(motorbike.getModel() + "\n" +
//				motorbike.getYear() + "\n" +
//				motorbike.getColour());
//		String text = "SW Eltex MES1124 УД АТС-66 388-22-66-СОШ №1 MES-1124 (172.16.16.93):03 /nSW D-Link DES-1210-28/ME УД АТС-45 МБОУ DES-1210-28 (172.16.252.170) /nSW D-Link DES-1210-28/ME 385-4 Бийск ПСЭ-32/2 32/2-106/5(ОКН) DES-1210-28(ОКН) (10.50.140.206):02 /nкрс 2036 35 (1) штк СТШ2036-001 d2036-3(10.54.20.124) 0/0";
//		Pattern pattern = Pattern.compile("\\b(\\d{1,3}\\.){3}\\d{1,3}\\b");
//		Matcher matcher = pattern.matcher(text);
//
//		while(matcher.find()){
//			System.out.println(matcher.group());
//		}
//		String text = "Рекс Лорд Лом Шарик Бобик Шалун ливан Ларук луковица";
//		Pattern pattern = Pattern.compile("\\b[Лл][а-я]+\\b");
//		Matcher matcher = pattern.matcher(text);
//
//		while (matcher.find()) {
//			System.out.println(matcher.group());
//		}

//		Bell bell = new Bell();
//		bell.sound();
//		bell.sound();
//		bell.sound();
//		bell.sound();
//		LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}, {-10, -30}});
//
//		System.out.println(r.getWidth() + " " + r.getHeight());
//		System.out.println(r.getBorders());

//		ToTable array = new ToTable(new int [] {1, 2, 3, 4, 5, 6},3, 2);
//		array.resize();
//
//		ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
//		int[] arr = a.resize();

		Mage mage1 = new Mage("Mage1", 5, 25, "fire");

		Mage mage2 = new Mage("Mage2", 5, 28, "fire");
		System.out.println(mage1.fight(mage2));
		System.out.println(mage1.getInfo());

	}
}
