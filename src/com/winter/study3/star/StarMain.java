package com.winter.study3.star;

public class StarMain {

	public static void main(String[] args) {
		//fied
		
		Marine marine = new Marine();
		//marine.hp;
		marine.gun=new Gun();
		marine.gun.damage=50;
		
		System.out.println(marine.gun.damage);
		
		
		Marine [] marines = new Marine[8];
		
		for(int i=0;i<marines.length;i++) {
//			Marine m = new Marine();
//			m.hp=50;
			marines[i]=new Marine();
			marines[i].hp=40;
		}
		

	}

}
