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
		MbtiQuery_EI.add("�ݷ������� ��� ������ ������ �ϰ��������?\r\n" + "1. ��å�ϱ�    2. ������ ���� �峭ġ��");
		MbtiQuery_EI.add("����� ��� ������ �޾ҽ��ϴ�. ������ �ٷ� �������� ���� �� ��� �Ͻó���?\r\n" + "1. �ϴ� �������� �κ��� ���ϰ� ���� �κ��� �����Ѵ�\r\n"
				+ "2. ������ �����ϰ� �����ؼ� �ѹ��� ���Ѵ�.");
		MbtiQuery_EI.add("� ��ȭ�� ���� �� ��鿡�� ������ �޾ҽ��ϴ�. ����� ��� �ϳ���?\r\n" + "1. �� ���������� ȥ�� �����غ���.\r\n"
				+ "2. ģ�������� �������� �κ��� �����Ѵ�.");
		MbtiQuery_EI.add("�����߰�1");
		MbtiQuery_EI.add("�����߰�2");
		
		RandomQuery(Query);
		
	}

	public void Mbti_NS(String Query) {
		MbtiQuery_NS.add("��� ������ �ذ��ϱ� ���� �ذ� å�� ���ٸ�?\r\n" + "1. ���ſ��� ������ �ذ� å\r\n" + "2. �� ���� ���� �ذ�å ");
		MbtiQuery_NS.add("������ �ڽſ��� �ƹ� �������� ����� ���Ѵٸ�? \r\n" + "1. �� �ƹ� ������ ���Ұ� ����\r\n" + "2. �ƹ� �������� �����? �ϴ� �������� �׷����� ");
		MbtiQuery_NS.add("�����ϱ� ���� �� ���� ������ ��°�?\r\n" + "1. �̹��� ���� �� �޾ƾ��ϴµ� ������ �پ����� ���ڴ� \r\n"
				+ "2. ������ ����ü �� ���°���? ������ ������ ���������? ");
		MbtiQuery_NS.add("����� ���Ի���̶�� � ������ ��ȣ�ϴ°�?\r\n" + "1. �� ���� ��ü������ ���������Ѵ� \r\n" + "2. ���⸸ �������ְ� �� �ڽſ��� �ð�����Ѵ� ");
		MbtiQuery_NS.add(
				"�Ҽ��̳� ���ø����� �� ��,\r\n" + "1. ���, �ι�, ���丮�� ��� ����! ������ �ѹ��� ���� \r\n" + "2. �������̰ų� �ڱ����� ����� ��� �ǵ����� �ٽ� ����");
		RandomQuery(Query);
	}

	public void Mbti_FT(String Query) {
		MbtiQuery_FT.add("�� �Ӹ��߶���\r\n" + "1. �󸶳�? ������	 2. ������ �־���?");
		MbtiQuery_FT.add("���� ������ ��Ƽ� ��Ʈ���� ���.\r\n" + "1. �� ��¥? ���?  2. ��� �� �������� ����߰ڳפ�");
		MbtiQuery_FT.add("�̷��� �ƹ��� �� ��������\r\n" + "1. ��x������    2. (����, ���, ����)");
		MbtiQuery_FT.add("�� ��� ��\r\n" + "1. ���� �����?  2. ������? ��ģ���� ����?");
		MbtiQuery_FT.add("�� �������� ���� �� ��Ծ�\r\n" + "1. ����(���� ����� ������?)  2. ���� �����̾ߤФФ�");
		RandomQuery(Query);
	}

	public void Mbti_PJ(String Query) {
		MbtiQuery_PJ.add("��� ���� ������ �ܰ� / å�������ߴ�?\r\n" + "1. å���� ���������� ���� ����ϰ� ����\r\n"
				+ "		���־��� ������ ã�� ������� �ΰ�, �����鿡 ���� ���������� ���������� �ߵǾ� �ִ�\r\n" + "2. å������ x / �پ��� ������ �ϵ��� �ڽ��� ��ӿ� �׳� �д�");
		MbtiQuery_PJ.add("����� ��Ҵ�. ������ ��������� �����\r\n" + "1. ���Ѵ�� ���� / ���������� ��� ������\r\n" + "2. ����Ǵ� �� �� ���鼭���� / �� ������");
		MbtiQuery_PJ.add("������ �� �ȳ��Ҵ�. ������ ���� �����ϴ� ���̵� ������ ���տ��� �Ѵ�. ���� ������?\r\n" + "1. ���� ���ϰ� ���߿� �ð��� ������ ���\r\n"
				+ "2. ���縦 ���� ���� ���߿� �������Ѵ�.");
		MbtiQuery_PJ.add("PJ1");
		MbtiQuery_PJ.add("PJ2");
		RandomQuery(Query);
	}

	public int getCnt() {
		return cnt;
	}

}
