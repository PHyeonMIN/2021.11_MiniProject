package View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controller.CharacterCON;
import Controller.InterfaceCON;
import Controller.Mbti;
import Controller.SoundCON;
import Model.CharacterDAO;
import Model.CharacterDTO;
import Model.MBTI_DAO;
import Model.MBTI_DTO;
import Model.MemberDAO;
import Model.MemberDTO;
import Model.SurveyDAO;
import Model.SurveyDTO;
import TestThread.Task;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		CharacterDAO C_dao = new CharacterDAO();
		CharacterDTO C_dto = null;
		CharacterCON lm = new CharacterCON();

		MemberDAO M_dao = new MemberDAO();
		MemberDTO M_dto = null;

		MBTI_DAO mbti_dao = new MBTI_DAO();
		MBTI_DTO mbti_dto;

		SurveyDAO sdao = new SurveyDAO();
		SurveyDTO sdto;
		Mbti mbti = new Mbti();
		InterfaceCON ic = new InterfaceCON();

		int end = 0;
		int end2 = 0;
		int end3 = 0;

		String id = "";
//		System.out.println("다마고치 실행");
		ic.mainInterface();
		while (end == 0) {
//			SoundCON test = new SoundCON();
//			try {
//				test.abc("maple.wav");
//				Thread.sleep(148000); // 148000초에 한번씩 재생하도록 설정
//			} catch (Exception e) {
//
//			}
			Runnable task = new Task();
			Thread subThread = new Thread(task);
			subThread.start();
//			System.out.print("[1]로그인 [2]회원가입");
			ic.selectLoginJoin();
			System.out.println();
			System.out.println();
			System.out.println("                              ────────── MBTI다마고치게임에 오신 것을 환영합니다. ────────── ");
			System.out.println();
			System.out.println("[ 게 임 규 칙 ]");
//			System.out.println();
			System.out.println("본 게임을 통해 캐릭터를 성장시켜 최종적으로 당신의 MBTI를 알수 있게 됩니다.");
			System.out.println("'성장하기'를 통해 MBTI 검사를 할 수 있습니다. 총 문항 수는 20문항입니다.");
			System.out.println("'성장하기'를 하다가 기회가 모두 소진될 시, '키우기'를 통해서 성장 기회를 획득할 수 있습니다.");
			System.out.println("키우기에서 잘못된 답을 선택할 시, 라이프가 깎여 0이 되면 캐릭터는 사망하게 됩니다. 그러니 신중하게 문제에 임해주세요><");
			System.out.println("내 상태장에서 현재 당신의 캐릭터 MBTI 진행 상태, 나이(10살~20살), 성장기회, 체력 등을 확인할 수 있습니다.");
			System.out.println("최대 체력은 100, 최대 성장 기회는 3이며 이 이상으로는 증가되지 않습니다.");
			System.out.println();
			System.out.println();

			int menu1 = sc.nextInt();
			if (menu1 == 1) {
				boolean check = false;
				while (check == false) {
//					System.out.print("아이디 입력 : ");
					ic.enterId();
					String main_id = sc.next();
//					System.out.print("비밀번호 입력 : ");
					ic.enterPw();
					String main_pw = sc.next();
					M_dao.Login(main_id, main_pw);
					check = M_dao.Login(main_id, main_pw);
					if (check == true) {
						System.out.println();
						System.out.println();
						System.out.println("            ˚✧₊⁎⁺˳✧  로 그 인   성 공  ˚✧₊⁎⁺˳✧");
						System.out.println();
						System.out.println();
						id = main_id;
						while (end2 == 0) {
//							System.out.print("[1]내 캐릭터 [2]캐릭터 생성 [3]로그아웃 [4]다른 사람들의 mbti결과 보기");
							ic.menu1();
							int menu2 = sc.nextInt();
							if (menu2 == 1) {
								// 내 캐릭터

								String check_C = C_dao.My_Character(id);

								if (check_C == null) {
									System.out.println("         ────── 아직 캐릭터생성을 하지 않았습니다 ──────");
								} else {
									String type = C_dao.BringType(id);
									if (type.equals("1")) {
										ic.cat();
									} else if (type.equals("2")) {
										ic.bunny();
									} else if (type.equals("3")) {
										ic.dog();
									}
									while (end3 == 0) {

//										System.out.print("[1]성장하기 [2]놀아주기 등 잡것 [3]나의 상태창 [4]나가기");
										ic.menu2();
										int menu3 = sc.nextInt();
										if (menu3 == 1) {

											// 성장하기 파트, mbti 검사 - 정재성
											mbti.PlayQuery(id);

											int Q_cnt = sdao.BringCnt(id);
											int c_age = sdao.Bring_age(id);

											if (Q_cnt % 2 == 1) {
												C_dao.c_age(id, c_age, Q_cnt);
											}
										} else if (menu3 == 2) {
											// 놀아주기 등 잡것
											int g_chance = sdao.Bring_G_life(id);
											int d_hp = sdao.Bring_hp(id);
											System.out.println("[1]놀아주기 [2]씻겨주기");
											int menu4 = sc.nextInt();
											if (menu4 == 1) {
												System.out.println("╭──────────╮");
												System.out.println("        놀아주기    ");
												System.out.println("╰──────────╯");
//												g_chance = 2;
//												d_hp = 10;

												String[] hangOut = { " [ 공놀이 ] ", " [ 산책가기 ] " };
												String[] mix = new String[hangOut.length];

												System.arraycopy(hangOut, 0, mix, 0, hangOut.length);

												for (int i = mix.length - 1; i > 0; i--) {
													int randIdx = rd.nextInt(i + 1);
													String temp = mix[randIdx];
													mix[randIdx] = mix[i];
													mix[i] = temp;
													System.out.println(mix[i]);
													if (mix[i] == hangOut[0]) {
														type = C_dao.BringType(id);
														if (type.equals("1")) {
															ic.cat2();
														} else if (type.equals("2")) {
															ic.bunny2();
														} else if (type.equals("3")) {
															ic.dog2();
														}
														System.out.println("다마고치 : 공놀이하자 주인사마");
														System.out.println("[1] 가까이 던진다  [2] 멀리 던진다");
														int ans = sc.nextInt();
														if (ans == 1) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_happy();
															} else if (type.equals("2")) {
																ic.bunny_happy();
															} else if (type.equals("3")) {
																ic.dog_happy();
															}
															System.out.println("다마고치 : 신 ! 난  ! 당 !!! ");
															if (g_chance < 3) {
																g_chance++;
																C_dao.hangout_chance(id, g_chance);
															}
															if (d_hp < 100) {
																d_hp += 10;
																C_dao.hangout_hp(id, d_hp);
															}
															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
														} else if (ans == 2) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_angry();
															} else if (type.equals("2")) {
																ic.bunny_angry();
															} else if (type.equals("3")) {
																ic.dog_angry();
															}
															System.out.println("다마고치 : 어디까지 던지는거야 찌발 !!  ");
															if (d_hp >= 20) {
																d_hp -= 20;
																C_dao.hangout_hp(id, d_hp);
																if (d_hp == 0) {
																	System.out.println("[SYSTEM] 다마고치가 사망하였습니다.");
																}
															}
//															else {
//																d_hp = 0;
//																
//															}
															System.out.println("체력 : " + d_hp);
														}
													} else if (mix[i] == hangOut[1]) {
														type = C_dao.BringType(id);
														if (type.equals("1")) {
															ic.cat3();
														} else if (type.equals("2")) {
															ic.bunny3();
														} else if (type.equals("3")) {
															ic.dog3();
														}
														System.out.println("다마고치 : 게으른 주인넘아 산책이라도 나가자능 ");
														System.out.println("[1] 차타고 드라이브  [2] 근처 공원으로 간다");
														int ans = sc.nextInt();
														if (ans == 1) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_angry2();
															} else if (type.equals("2")) {
																ic.bunny_angry2();
															} else if (type.equals("3")) {
																ic.dog_angry2();
															}
															System.out.println("다마고치 : 차멀미 우욱-;; ");
															if (d_hp >= 20) {
																d_hp -= 20;
																C_dao.hangout_hp(id, d_hp);
																if (d_hp == 0) {
																	System.out.println("[SYSTEM] 다마고치가 사망하였습니다.");
																}
															}
//															else {
//																d_hp = 0;
//																System.out.println("[SYSTEM] 다마고치가 사망하였습니다.");
//															}
															System.out.println("체력 : " + d_hp);
														} else if (ans == 2) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_happy2();
															} else if (type.equals("2")) {
																ic.bunny_happy2();
															} else if (type.equals("3")) {
																ic.dog_happy2();
															}
															System.out.println("다마고치 : 넘 신난다능 주인넘아 빨리 따라오라능 ~!");
															if (g_chance < 3) {
																g_chance++;
																C_dao.hangout_chance(id, g_chance);
															}
															if (d_hp < 100) {
																d_hp += 10;
																C_dao.hangout_hp(id, d_hp);
															}
															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
														}
													}

												}
											} else if (menu4 == 2) {
												String[] wash = { "치카치카 양치하기 @.@", "빗질 빗질 털 다듬기 @.@",
														"뽀드득 뽀드득 샴푸시키기 @.@" };
												String[] mix = new String[wash.length];

												System.arraycopy(wash, 0, mix, 0, wash.length);
												System.out.println("╭──────────╮");
												System.out.println("        씻겨주기    ");
												System.out.println("╰──────────╯");
												type = C_dao.BringType(id);
												if (type.equals("1")) {
													ic.cat3();
												} else if (type.equals("2")) {
													ic.bunny3();
												} else if (type.equals("3")) {
													ic.dog3();
												}
//												System.out.println("다마고치 : 주인님 제가 너무 Dirty한데 아래 나오는 행동을 진행해줘용~ <>.<>");

												for (int i = mix.length - 1; i > 1; i--) {
													int randIdx = rd.nextInt(i + 1);
													String temp = mix[randIdx];
													mix[randIdx] = mix[i];
													mix[i] = temp;
													System.out.println(mix[i]);

													int brush = 0;

													if (mix[i] == "치카치카 양치하기 @.@") {
														type = C_dao.BringType(id);
														if (type.equals("1")) {
															ic.cat4();
														} else if (type.equals("2")) {
															ic.bunny4();
														} else if (type.equals("3")) {
															ic.dog4();
														}
														System.out.print(
																"[1]구석구석 양치시키고 가글시켜주까? [2] 마!!! 제대로 양치안시키나! 물어쁜다잉!");
														brush = sc.nextInt();
														if (brush == 1) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_happy();
															} else if (type.equals("2")) {
																ic.bunny_happy();
															} else if (type.equals("3")) {
																ic.dog_happy();
															}
															System.out.println("다마고치 : 아잉~ 개운해요 주인님 뿌잉  >.<");
															if (g_chance < 3) {
																g_chance++;
																C_dao.hangout_chance(id, g_chance);
															}
															if (d_hp < 100) {
																d_hp += 10;
																C_dao.hangout_hp(id, d_hp);
															}

															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
//															System.out.println("※일상체력은 최대 100점, 성장기회는 최대 3회로 제한※");
														}

														else if (brush == 2) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_angry();
															} else if (type.equals("2")) {
																ic.bunny_angry();
															} else if (type.equals("3")) {
																ic.dog_angry();
															}
															System.out.println("다마고치 : 충치 생겨서 스케일링 받으러 가야하자나용! 크르릉!");
															if (d_hp >= 20) {
																d_hp -= 20;
																C_dao.hangout_hp(id, d_hp);
																if (d_hp == 0) {
																	System.out.println("[SYSTEM] 다마고치가 사망하였습니다.");
																}
															}
//															else {
//																d_hp = 0;
															//
//															}
															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
														}
													}
													if (mix[i] == "빗질 빗질 털 다듬기 @.@") {
														type = C_dao.BringType(id);
														if (type.equals("1")) {
															ic.cat5();
														} else if (type.equals("2")) {
															ic.bunny5();
														} else if (type.equals("3")) {
															ic.dog5();
														}
														System.out.print(
																"[1]털이 많이 자랐구나~ 이쁘게 손질해줘야겠다아^^ [2] 털이 자라니까 털털하니 좋구만?");
														brush = sc.nextInt();
														if (brush == 1) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_happy2();
															} else if (type.equals("2")) {
																ic.bunny_happy2();
															} else if (type.equals("3")) {
																ic.dog_happy2();
															}
															System.out.println("다마고치 : 덥수룩하지 않아서 깔끔해요옹 너무 좋아용 주인님 ><");

															if (g_chance < 3) {
																g_chance++;
																C_dao.hangout_chance(id, g_chance);
															}
															if (d_hp < 100) {
																d_hp += 10;
																C_dao.hangout_hp(id, d_hp);
															}

															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
//															System.out.println("※일상체력은 최대 100점, 성장기회는 최대 3회로 제한");
														}

														else if (brush == 2) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_angry2();
															} else if (type.equals("2")) {
																ic.bunny_angry2();
															} else if (type.equals("3")) {
																ic.dog_angry2();
															}
															System.out.println("다마고치 : 장난하나? 사자가 되어 널 잡아먹으리라...");
															if (d_hp >= 20) {
																d_hp -= 20;
																C_dao.hangout_hp(id, d_hp);
																if (d_hp == 0) {
																	System.out.println("[SYSTEM] 다마고치가 사망하였습니다.");
																}
															}
//															else {
//																d_hp = 0;
															//
//															}
															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
														}
													}
													if (mix[i] == "뽀드득 뽀드득 샴푸시키기 @.@") {
														type = C_dao.BringType(id);
														if (type.equals("1")) {
															ic.cat2();
														} else if (type.equals("2")) {
															ic.bunny2();
														} else if (type.equals("3")) {
															ic.dog2();
														}
														System.out.print(
																"[1]엘라스틴을 써서 전지현 펫으로 만들어주어야겠다! [2]기름지니까 느끼해보이고 섹시해질 것 같은데?");
														brush = sc.nextInt();
														if (brush == 1) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_happy3();
															} else if (type.equals("2")) {
																ic.bunny_happy3();
															} else if (type.equals("3")) {
																ic.dog_happy3();
															}
															System.out.println("다마고치 : 나 엘라스틴했어용 상쾌해용 ^*^");
															if (g_chance < 3) {
																g_chance++;
																C_dao.hangout_chance(id, g_chance);
															}
															if (d_hp < 100) {
																d_hp += 10;
																C_dao.hangout_hp(id, d_hp);
															}
															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
//															System.out.println("※일상체력은 최대 100점, 성장기회는 최대 3회로 제한");
														}

														else if (brush == 2) {
															type = C_dao.BringType(id);
															if (type.equals("1")) {
																ic.cat_angry3();
															} else if (type.equals("2")) {
																ic.bunny_angry3();
															} else if (type.equals("3")) {
																ic.dog_angry3();
															}
															System.out.println(
																	"다마고치 : 당신 때문에 몸이 하도 미끌거려서 안걸어다녀도 될 것 같애용 ~*~");
															if (d_hp >= 20) {
																d_hp -= 20;
																C_dao.hangout_hp(id, d_hp);
																if (d_hp == 0) {
																	System.out.println("[SYSTEM] 다마고치가 사망하였습니다.");
																}
															}
//															else {
//																d_hp = 0;
															//
//															}

															System.out.println("일상체력 : " + d_hp + "점");
															System.out.println("성장기회 : " + g_chance + "회");
														}
													}

												}

											} else {
												System.out.println("         ────── 잘 못 입력했습니다 ──────");
											}
										} else if (menu3 == 3) {

											// 나의 상태창 - 정재훈
											String type2 = C_dao.BringType(id);
											if (type2.equals("1")) {
												ic.cat();
											} else if (type2.equals("2")) {
												ic.bunny();
											} else if (type2.equals("3")) {
												ic.dog();
											}
											System.out.println("•.¸¸.•*´¨`*﻿ •.¸ 캐 릭 터     상 태 확 인¸.•*´¨`*•.¸¸.•");
											// System.out.print("아이디 입력 >> ");
											// String id = sc.next();

											lm.select_Con(id);

										} else if (menu3 == 4) {
											// 나가기
											end3++;
										} else {
											System.out.println("         ────── 잘 못 입력했습니다 ──────");
										}
									}
								}
							} else if (menu2 == 2) {
								// 캐릭터 생성 - 장슬기
								System.out.println();
								System.out.println("╭──────────╮");
								System.out.println("      캐릭터 생성    ");
								System.out.println("╰──────────╯");
								System.out.println();
								// System.out.print("아이디 입력 >> ");
								// String id = sc.next();
								System.out.print("    *ଘ(੭*•ᴗ•)੭* ੈ✩‧₊˚  닉네임 입력 >> ");
								String nick = sc.next();
								System.out.println();
								System.out.println();
								System.out.println("1. 고양이");
								ic.cat();

								System.out.println("2. 토끼");
								ic.bunny();
								System.out.println();

								System.out.println("3. 강아지");
								ic.dog();

								System.out.print("    *ଘ(੭*•ᴗ•)੭* ੈ✩‧₊˚  캐릭터 선택 >> ");
								String type = sc.next();
								C_dto = new CharacterDTO(id, nick, type);
								lm.addNewC_CON(C_dto);
							} else if (menu2 == 3) {
								System.out.println("         ────── 로그아웃 하셨습니다 ──────");
								end2++;
								end++;
							} else if (menu2 == 4) {
								// 다른 사람 mbti보기
								System.out.println("[id]\t[mbti]\t");
								ArrayList<MBTI_DTO> info = mbti_dao.MBTI_selectAll();
								for (int i = 0; i < info.size(); i++) {
									System.out.print(info.get(i).getId() + "\t");
									System.out.print(info.get(i).getMbti() + "\t\n");
									System.out.println(info.get(i).getMbtiinf() + "\t\n");
								}

							} else {
								System.out.println("         ────── 잘 못 입력했습니다 ──────");
							}
						}
					} else {
						System.out.println();
						System.out.println();
						System.out.println("             ────── 로 그 인   실 패 ────── ");
						System.out.println();
						System.out.println();
					}

				}

			} else if (menu1 == 2) {
				// 회원가입 - 정재성
//				System.out.print("아이디 입력 : ");
				ic.enterId();
				String id2 = sc.next();
//				System.out.print("비밀번호 입력 : ");
				ic.enterPw();
				String pw = sc.next();
				System.out.print(" *ଘ(੭*ˊᵕˋ)੭* ੈ✩‧₊˚     이름  입력  >> ");
				String name = sc.next();

				M_dto = new MemberDTO(id2, pw, name);
				int cnt = M_dao.Insert(M_dto);

				if (cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}
			} else {
				System.out.println("         ────── 잘 못 입력했습니다 ──────");
			}

		}
	}
}