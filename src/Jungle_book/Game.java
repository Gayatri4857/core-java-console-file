package Jungle_book;

public class Game {
	public static void main(String args[]) {
		Human h= new Human();
		   h.name="Mogli";
		   h.address="Address";
		   h.rollno=4;
		   h.eat();
		   h.yes();
		   h.roll();	
		Bear b=new Bear();
		   b.name="Ballo";
		   b.eat();
		   b.sleep();
	    Snake s=new Snake();
	       s.name="Kaa";
	       s.sleep();
	       s.eat();
	    Tiger t=new Tiger();
	       t.name="Sher_khan";
	       t.hunt();
	       t.sleep();
	       t.eat();
	    Wolf w=new Wolf();
	       w.name="Tabaki";
	       w.run();
	       w.eat();
	       w.sleep();
	}
	

}
