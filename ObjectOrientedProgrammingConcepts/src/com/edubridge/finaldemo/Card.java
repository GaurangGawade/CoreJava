package com.edubridge.finaldemo;

public class Card {
	
	
	private String cardName;
	private final String issuer="GOI";
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getIssuer() {
		return issuer;
	}
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + "]";
	}
	
	//Final variable inside method 
	final void accept(final int x) {
		
		System.out.println(x);
		
	}
	
	
	
	
	
}
