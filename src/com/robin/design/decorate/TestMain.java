package com.robin.design.decorate;

<<<<<<< HEAD

=======
>>>>>>> c321984b959a31c7402d21673c775a017d397aa5
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Noodle e = new EggNoodle();
		System.out.println(e.noodle());
		
		Noodle eAdd1 = new EggAdd(e);
		System.out.println(eAdd1.noodle());
		
		Noodle eAdd2 = new EggAdd(eAdd1);
		System.out.println(eAdd2.noodle());
		
		Noodle m = new MeetNoodle();
		System.out.println(m.noodle());
		
		Noodle mAdd1 = new MeetAdd(m);
		System.out.println(mAdd1.noodle());
		
		Noodle mAdd2 = new MeetAdd(mAdd1);
		System.out.println(mAdd2.noodle());
		
		Noodle eAdd2Meet = new MeetAdd(eAdd2);
		System.out.println(eAdd2Meet.noodle());
		
		Noodle eAdd2Meet2 = new MeetAdd(eAdd2Meet);
		System.out.println(eAdd2Meet2.noodle());
		
	}

}
