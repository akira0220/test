
public class Test {
	public static void main (String[]args){
	Person taro = new Person();
	taro.name="山田太郎";
	taro.age=20;
	System.out.println(taro.name);
	System.out.println(taro.age);


   Person jiroukimura = new Person();
	jiroukimura.name="木村次郎";
		jiroukimura.age=18;
		System.out.println(jiroukimura.name);
	    System.out.println(jiroukimura.age);


	    Person hanakosuzuki= new Person();
	    hanakosuzuki.name="鈴木花子";
	    hanakosuzuki.age=16;
	    System.out.println(hanakosuzuki.name);
	    System.out.println(hanakosuzuki.age);


	    taro.talk();
	    jiroukimura.walk();
	    hanakosuzuki.run();


	}
}



