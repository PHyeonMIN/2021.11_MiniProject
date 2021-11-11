package View;

import java.util.Scanner;

import Controller.Mbti;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String mbti_query ="";
		
		
		
		for(int j=0; j<4;j++) {
			if(j==0) {
			mbti_query = "EI";		
			}if(j==1) {
				mbti_query = "NS";
			}if(j==2) {
				mbti_query = "FT";
			}if(j==3) {
				mbti_query = "PJ";
			}	
			Mbti mbti = new Mbti(mbti_query);
		}
		
		
	}

}
