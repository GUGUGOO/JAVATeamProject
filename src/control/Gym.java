package control;
import java.util.ArrayList;
import java.util.Scanner;

import pokemons.Pokemon;

public class Gym {
	
	private String name;
	private ArrayList<Player> enemies;
	private int i=0;
	private int j=0;
	public Gym(ArrayList<Player> players, String name){
		this.enemies = players;
		this.name = name;
	}
	public ArrayList<Player> getEnemies() {
		return enemies;
	}
	public void setEnemies(ArrayList<Player> enemy) {
		this.enemies = enemy;
	}
	public boolean fight() {
		return false;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		
		return this.name;
	}
	public  boolean battle(Player player) {
		Player enemy = enemies.get(0);
		int playerLevel = player.getPokemons().get(0).getLevel();
		int enemyLevel = enemy.getPokemons().get(0).getLevel();	
		Scanner input = new Scanner(System.in);

		int turn = 0;
		//0과1을 반복하여, 플레이어가 차례를 넘김
		
		boolean t=true;
		//전체 배틀을 while로 실행시키기 위한 변수
		
		
		while (t) { //배틀 반복문
			
		
		if (turn==0) { //첫번째 플레이어의 메뉴. 두번째는 아직 안만듬
			System.out.println("======메뉴를 선택해주세요=====");
			System.out.println("1.도전한다.");
			System.out.println("2.포기한다.");
			System.out.println("무엇을 할까요?");
			System.out.print(":");
			int menu = input.nextInt();
			System.out.println();
			
			if (menu==1) {
				
				while(true) {
					
					Pokemon mine = player.getPokemons().get(i);
					Pokemon yours = enemy.getPokemons().get(j);
					
					if(mine.getHP()<=0) {
						System.out.println("****"+player.getName()+"의"+mine.getName()+"이(가) 졌습니다.");
						
						//player.getPokemons().remove(i);
						//System.out.println(player.getPokemons().size());
						if(i < player.getPokemons().size()-1) {
							i++;
							continue;
						}
						else {
							System.out.println("◈◈◈해당 GYM에서 패배하였습니다. 나중에 다시 도전하세요");
							i=0;
							j=0;
							break;
						}
							
					}else if(yours.getHP()<=0){
						System.out.println("****"+enemy.getName()+"의"+yours.getName()+"이(가) 졌습니다.");
						for(int k=0;k<enemy.getPokemons().size();k++) {
							enemy.getPokemons().get(k).setHP(enemy.getPokemons().get(k).getFullHP());
						}
						
						//enemy.getPokemons().remove(j);
						if(j < enemy.getPokemons().size()-1) {
							j++;
							continue;
						}
						else {
							System.out.println("◈◈◈해당 GYM에서 승리하였습니다.");
							System.out.println("$$"+player.getName()+"에게 gold +50이 주어집니다");
							player.setGold(player.getGold() + 50);
							System.out.println("체육관의 뱃지를 얻었습니다!!");
							player.setBadge(this.name);
							//System.out.println();
							System.out.println("▶▶"+player.getName()+"이 보유한 포켓몬의 exp가"+"+30만큼 올라갑니다");
							for(int i=0;i<player.getPokemons().size();i++) {
								player.getPokemons().get(i).setExp(player.getPokemons().get(i).getExp()+30);
								if(player.getPokemons().get(i).getExp()>=130) {
									String beforeName=player.getPokemons().get(i).getName();
									player.getPokemons().get(i).changeName();
									System.out.println("★★"+beforeName+"(이)가"+player.getPokemons().get(i).getName()+"(으)로 진화했습니다");
								}
							}
							i=0;
							j=0;
							
							break;
						}
							
					}
					else if(player.getPokemons().isEmpty() || enemy.getPokemons().isEmpty())
						break;
					System.out.println("<"+yours.getName()+"(와)과 배틀을 시작합니다>");
					System.out.print(mine.getName()+"의 현재HP: "+mine.getHP()+"  ");
					System.out.println(yours.getName()+"의 현재HP: "+yours.getHP());
					System.out.println("*"+player.getName()+"의 차례");
					System.out.println("0번:아이템");
					mine.printSkills();
					
					System.out.print("몇번 스킬을 사용할까요??\n:");
					
					int sk = input.nextInt();
					if(sk == 1) {
						mine.skill1(yours);	
					}else if(sk == 2) {
						mine.skill2(yours);
					} else if(sk == 3) {
						mine.skill3(yours);
					} else if(sk == 4) {
						mine.skill4(yours);
					}
					else if(sk==0) {
						if(player.getItems().size()==0) {
							System.out.println("*현재 보유한 아이템이 없습니다");
						}else {
						player.getItems().get(0).useItem(yours);
						}
					}
					System.out.println("*"+enemy.getName()+"의 차례");
					int random = (int)(Math.random()*4+1);
					if(random==1) {
						yours.skill1(mine);
					}else if(random==2) {
						yours.skill2(mine);
					}else if(random==3) {
						yours.skill3(mine);
					}else {
						yours.skill4(mine);
					}
				}
				
			} else if (menu==2) {
				System.out.println("싸움에서 도망쳤다!");
				t=false;
				//while을 종료시켜 배틀 종료
			} else {
				System.out.println("잘못된 메뉴입니다.");
				break;
			} // 메뉴를 다시 고르게 함
			
		}//turn을 조건으로 하는 if의 닫음괄호
		
			break;
		}//while닫음 괄호
				
			
			return false; //아직 정해지지 않음
			
		}//메소드 닫음 괄호
		
		
		
	}//클래스닫음괄호
