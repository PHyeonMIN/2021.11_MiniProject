package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mbti {

	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	private int cnt = 0;
	ArrayList<String> MbtiQuery_EI = new ArrayList<String>();
	ArrayList<String> MbtiQuery_NS = new ArrayList<String>();
	ArrayList<String> MbtiQuery_FT = new ArrayList<String>();
	ArrayList<String> MbtiQuery_PJ = new ArrayList<String>();
	String[] Mbti = new String[4];
	
	

	private void RandomQuery(String Query) {
		int random = 0;
		switch (Query) {
		case "EI":
			for (int i = 0; i < 5; i++) {
				random = rd.nextInt(MbtiQuery_EI.size()); 
				System.out.println(MbtiQuery_EI.get(random));
				int select = sc.nextInt();
				MbtiQuery_EI.remove(random);
				
		
			}
			break;
		case "NS":
			for (int i = 0; i < 5; i++) {
				random = rd.nextInt(MbtiQuery_NS.size());
			
				System.out.println(MbtiQuery_NS.get(random));
				int select = sc.nextInt();
				MbtiQuery_NS.remove(random);
			}
			break;
		case "FT":
			for (int i = 0; i < 5; i++) {
				random = rd.nextInt(MbtiQuery_FT.size());
				System.out.println(MbtiQuery_FT.get(random));
				int select = sc.nextInt();
				MbtiQuery_FT.remove(random);
			}
			break;
		case "PJ":
			for (int i = 0; i < 5; i++) {
				random = rd.nextInt(MbtiQuery_PJ.size());
				System.out.println(MbtiQuery_PJ.get(random));
				int select = sc.nextInt();
				MbtiQuery_PJ.remove(random);
			}
			break;
		}
	}

	public Mbti(int num) {
		this.cnt = num;

	}

	public Mbti(String Query) {
		if (Query.equals("EI"))
			Mbti_EI(Query);
		else if (Query.equals("NS"))
			Mbti_NS(Query);
		else if (Query.equals("FT"))
			Mbti_FT(Query);
		else if (Query.equals("PJ"))
			Mbti_PJ(Query);
	}

	public void Mbti_EI(String Query) {
		MbtiQuery_EI.add("반려동물과 놀고 싶을때 무엇을 하고싶은가요?\r\n" + "1. 산책하기    2. 집에서 같이 장난치기");
		MbtiQuery_EI.add("당신은 어떠한 질문을 받았습니다. 질문이 바로 떠오르지 않을 때 어떻게 하시나요?\r\n" + "1. 일단 떠오르는 부분을 말하고 다음 부분을 생각한다\r\n"
				+ "2. 곰곰히 생각하고 정리해서 한번에 말한다.");
		MbtiQuery_EI.add("어떤 영화를 보고 한 장면에서 감동을 받았습니다. 당신은 어떻게 하나요?\r\n" + "1. 왜 감동적인지 혼자 생각해본다.\r\n"
				+ "2. 친구들한테 감동적인 부분을 설명한다.");
		MbtiQuery_EI.add("질문추가1");
		MbtiQuery_EI.add("질문추가2");
		
		RandomQuery(Query);
		
	}

	public void Mbti_NS(String Query) {
		MbtiQuery_NS.add("어떠한 문제를 해결하기 위한 해결 책을 고른다면?\r\n" + "1. 과거에서 검증된 해결 책\r\n" + "2. 이 세상에 없던 해결책 ");
		MbtiQuery_NS.add("누군가 자신에게 아무 생각하지 말라고 말한다면? \r\n" + "1. 웅 아무 생각도 안할겡 ㅎㅎ\r\n" + "2. 아무 생각하지 말라고? 일단 백지부터 그려보자 ");
		MbtiQuery_NS.add("공부하기 싫을 때 무슨 생각이 드는가?\r\n" + "1. 이번에 점수 잘 받아야하는데 범위가 줄었으면 좋겠다 \r\n"
				+ "2. 시험을 도대체 왜 보는거지? 언젠간 시험이 사라지겠지? ");
		MbtiQuery_NS.add("당신이 신입사원이라면 어떤 팀장을 선호하는가?\r\n" + "1. 할 일을 구체적으로 명시해줘야한다 \r\n" + "2. 방향만 제시해주고 내 자신에게 맡겨줘야한다 ");
		MbtiQuery_NS.add(
				"소설이나 넷플릭스를 볼 때,\r\n" + "1. 배우, 인물, 스토리에 모두 집중! 끝까지 한번에 본다 \r\n" + "2. 감동적이거나 자극적인 장면인 경우 되돌려서 다시 본다");
		RandomQuery(Query);
	}

	public void Mbti_FT(String Query) {
		MbtiQuery_FT.add("나 머리잘랐어\r\n" + "1. 얼마나? 보여줘	 2. 무슨일 있었어?");
		MbtiQuery_FT.add("돈을 열심히 모아서 노트북을 샀다.\r\n" + "1. 아 진짜? 어디꺼?  2. 우와 돈 모으느라 고생했겠네ㅠ");
		MbtiQuery_FT.add("이러면 아무도 너 안좋아해\r\n" + "1. 지x하지마    2. (마상, 충격, 공포)");
		MbtiQuery_FT.add("차 사고가 남\r\n" + "1. 보험 들었어?  2. 괜찮아? 다친데는 없어?");
		MbtiQuery_FT.add("너 힘들어보여서 간식 좀 사왔어\r\n" + "1. 고마워(내가 힘들어 보였나?)  2. 고마워 감동이야ㅠㅠㅠ");
		RandomQuery(Query);
	}

	public void Mbti_PJ(String Query) {
		MbtiQuery_PJ.add("어떠한 일의 마무리 단계 / 책상정리했니?\r\n" + "1. 책상을 전형적으로 아주 깔끔하게 정돈\r\n"
				+ "		자주쓰는 물건을 찾기 쉬운곳에 두고, 업무들에 대한 정리정돈과 서랍정리가 잘되어 있다\r\n" + "2. 책상정리 x / 다양한 종류의 일들을 자신의 삶속에 그냥 둔다");
		MbtiQuery_PJ.add("약속을 잡았다. 하지만 변경사항이 생겼다\r\n" + "1. 정한대로 하자 / 언제만날래 어디서 만날래\r\n" + "2. 진행되는 거 봐 가면서하자 / 함 만나자");
		MbtiQuery_PJ.add("시험이 얼마 안남았다. 하지만 내가 좋아하는 아이돌 공연이 집앞에서 한다. 나의 선택은?\r\n" + "1. 먼저 일하고 나중에 시간에 남으면 논다\r\n"
				+ "2. 현재를 즐기고 일은 나중에 마무리한다.");
		MbtiQuery_PJ.add("PJ1");
		MbtiQuery_PJ.add("PJ2");
		RandomQuery(Query);
	}

	public int getCnt() {
		return cnt;
	}

}
