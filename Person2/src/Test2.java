
public class Test2 {

	public static void main(String[] args) {
	Robot aibo = new Robot();
	aibo.name= "アイボ";
	System.out.println(aibo.name);


	Robot asimo = new Robot();
	asimo.name  =  "アシモ";
	System.out.println(asimo.name);

	Robot pepper = new Robot();
	pepper.name = "pepper";
	System.out.println(pepper.name);

	Robot doraemon = new Robot();
	doraemon.name ="ドラえもん";
	System.out.println(doraemon.name);


     doraemon.eat();
     asimo.walk();
     aibo.run();
     pepper.talk();





	}
}
