package com.winter.study3.ex;

import java.util.Scanner;

public class CardManager {
	
	private Scanner sc;
	
	public CardManager() {
		sc = new Scanner(System.in);
	}
	
	
	public Card [] addCard(Card [] cards) {
		Card card = new Card();
		System.out.println("번호 입력");
		card.setNum(sc.nextInt());
		
		System.out.println("회사명 입력");
		card.setCompany(sc.next());
		
		System.out.println("이름 입력");
		card.setName(sc.next());
		
		System.out.println("직책 입력");
		card.setJob(sc.next());
		
		System.out.println("전화번호 입력");
		card.setPhone(sc.next());
		
		System.out.println("이메일 입력");
		card.setEmail(sc.next());
		
		System.out.println("주소 입력");
		card.setAddress(sc.next());
		
		//새로운 배열 생성 후 값 복사
		Card [] newCards = new Card[cards.length+1];
		
		for(int i=0;i<cards.length;i++) {
			newCards[i]=cards[i];
		}
		
		//새로운 명함을 배열에 추가 후 리턴
		newCards[cards.length]=card;
		
		return newCards;
		
	}

}
