package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.SurveyDAO;
import Model.SurveyDTO;

public class Mbti {
	SurveyDAO sdao = new SurveyDAO();
	SurveyDTO sdto;
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);

	String[] Mbti = new String[4];

	public void PlayQuery(String id) {
		int G_life = sdao.Bring_G_life(id);
		int cnt = sdao.BringCnt(id);
		int EI = sdao.Bring_EI(id);
		int SN = sdao.Bring_SN(id);
		int TF = sdao.Bring_TF(id);
		int JP = sdao.Bring_JP(id);
		int select = 0;
		if (G_life > 0 && cnt <= 20) {

			sdao.BringQuery(id);
			select = sc.nextInt();
			G_life--;
			sdao.Update_G_life(id, G_life);
			if (select == 1) {
				switch (cnt) {
				case 1:
				case 5:
				case 9:
				case 13:
				case 17:
					EI++;
					break;
				case 2:
				case 6:
				case 10:
				case 14:
				case 18:
					SN++;
					break;
				case 3:
				case 7:
				case 11:
				case 15:
				case 19:
					TF++;
					break;
				case 4:
				case 8:
				case 12:
				case 16:
				case 20:
					JP++;
					break;

				}
			} else if (select == 2) {
				switch (cnt) {
				case 1:
				case 5:
				case 9:
				case 13:
				case 17:
					EI--;
					break;
				case 2:
				case 6:
				case 10:
				case 14:
				case 18:
					SN--;
					break;
				case 3:
				case 7:
				case 11:
				case 15:
				case 19:
					TF--;
					break;
				case 4:
				case 8:
				case 12:
				case 16:
				case 20:
					JP--;
					break;
				}
			}

			sdao.Update_EI(id, EI);
			sdao.Update_SN(id, SN);
			sdao.Update_TF(id, TF);
			sdao.Update_JP(id, JP);

			cnt++;
			sdao.UpdateCnt(cnt, id);
			if (cnt == 21) {
				String EI1;
				String SN1;
				String TF1;
				String JP1;
				int a = sdao.Bring_EI(id);
				int b = sdao.Bring_SN(id);
				int c = sdao.Bring_TF(id);
				int d = sdao.Bring_JP(id);
				if (a > 0) {
					EI1 = "E";
				} else {
					EI1 = "I";
				}
				if (b > 0) {
					SN1 = "S";
				} else {
					SN1 = "N";
				}
				if (c > 0) {
					TF1 = "T";
				} else {
					TF1 = "F";
				}
				if (d > 0) {
					JP1 = "J";
				} else {
					JP1 = "P";
				}

				String last = EI1 + SN1 + TF1 + JP1;
				sdao.Update_mbti(id, last);
				String inf = "";
				if(last.equals("ISTJ")) {
					inf="책임감이 강하며, 현실적이다. 매사에 철저하고 보수적이다.";
				}
				else if(last.equals("ISFJ")) {
					inf="차분하고 헌신적이며, 인내심이 강하다. 타인의 감정변화에 주의를 기울인다";
				}
				else if(last.equals("INFJ")) {
					inf="높은 통찰력으로 사람들에게 영감을 준다. 공동체의 이익을 중요시한다.";
				}
				else if(last.equals("INTJ")) {
					inf="의지가 강하고, 독립적이다. 분석력이 뛰어나다.";
				}
				else if(last.equals("ISTP")) {
					inf="과묵하고 분석적이며, 적응력이 강하다.";
				}
				else if(last.equals("ISFP")) {
					inf="온화하고 겸손하다. 삶의 여유를 만끽한다.";
				}
				else if(last.equals("INFP")) {
					inf="성실하고 이해심 많으며, 개방적이다. 잘 표현하지 않으나, 내적 신념이 강하다.";
				}
				else if(last.equals("INTP")) {
					inf="지적 호기심이 높으며, 잠재력과 가능성을 중요시한다.";
				}
				else if(last.equals("ESTP")) {
					inf="느긋하고, 관용적이며, 타협을 잘한다. 현실적 문제 해결에 능숙하다.";
				}
				else if(last.equals("ESFP")) {
					inf="호기심이 많으며, 개방적이다. 구체적인 사실을 중시한다.";
				}
				else if(last.equals("ENFP")) {
					inf="상상력이 풍부하고, 순발력이 뛰어나다. 일상적인 활동에 지루함을 느낀다.";
				}
				else if(last.equals("ENTP")) {
					inf="박학다식하고, 독창적이다. 끊임없이 새로운 시도를 한다";
				}
				else if(last.equals("ESTJ")) {
					inf="체계적으로 일하고, 규칙을 준수한다. 사실적 목표 설정에 능하다.";
				}
				else if(last.equals("ESFJ")) {
					inf="사람에 대한 관심이 많으며, 친절하다. 동정심이 많다.";
				}
				else if(last.equals("ENFJ")) {
					inf="사교적이고, 타인의 의견을 존중한다. 비판을 받으면 예민하게 반응한다.";
				}
				else if(last.equals("ENTJ")) {
					inf="철저한 준비를 하며, 활동적이다. 통솔력이 있으며, 단호하다.";
				}
				sdao.Update_mbtiInfor(inf, id);
//				System.out.println("graduate");
				System.out.println();
				System.out.println(" ██████  ██████   █████  ██████  ██    ██  █████  ████████ ███████ ██████   ██");
				System.out.println("██       ██   ██ ██   ██ ██   ██ ██    ██ ██   ██    ██    ██      ██   ██  ██");
				System.out.println("██   ███ ██████  ███████ ██   ██ ██    ██ ███████    ██    █████   ██   ██  ██");
				System.out.println("██    ██ ██   ██ ██   ██ ██   ██ ██    ██ ██   ██    ██    ██      ██   ██ ");
				System.out.println(" ██████  ██   ██ ██   ██ ██████   ██████  ██   ██    ██    ███████ ██████   ██");
				System.out.println();
				System.out.println("              ────── 이제 '나의 상태창'에서 자신의 MBTI를 확인할 수 있습니다. ──────");

			}
		}
		else if(cnt==21) {
//			System.out.println("already graduate");
			
			System.out.println();
			System.out.println(" █████  ██      ██████  ███████  █████  ██████  ██    ██");
			System.out.println("██   ██ ██      ██   ██ ██      ██   ██ ██   ██  ██  ██  ");
			System.out.println("███████ ██      ██████  █████   ███████ ██   ██   ████   ");
			System.out.println("██   ██ ██      ██   ██ ██      ██   ██ ██   ██    ██    ");
			System.out.println("██   ██ ███████ ██   ██ ███████ ██   ██ ██████     ██    ");
			System.out.println();
			System.out.println();
			System.out.println(" ██████  ██████   █████  ██████  ██    ██  █████  ████████ ███████ ██████   ██");
			System.out.println("██       ██   ██ ██   ██ ██   ██ ██    ██ ██   ██    ██    ██      ██   ██  ██");
			System.out.println("██   ███ ██████  ███████ ██   ██ ██    ██ ███████    ██    █████   ██   ██  ██");
			System.out.println("██    ██ ██   ██ ██   ██ ██   ██ ██    ██ ██   ██    ██    ██      ██   ██ ");
			System.out.println(" ██████  ██   ██ ██   ██ ██████   ██████  ██   ██    ██    ███████ ██████   ██");
			System.out.println();
			
		}
		else {
			System.out.println("성장 할 기회를 다 사용하였습니다. '키우기'를 통해 성장기회를 획득하세요.");

		}

	}

}
