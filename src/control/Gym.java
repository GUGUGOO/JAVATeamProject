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
		//0��1�� �ݺ��Ͽ�, �÷��̾ ���ʸ� �ѱ�
		
		boolean t=true;
		//��ü ��Ʋ�� while�� �����Ű�� ���� ����
		
		
		while (t) { //��Ʋ �ݺ���
			
		
		if (turn==0) { //ù��° �÷��̾��� �޴�. �ι�°�� ���� �ȸ���
			System.out.println("======�޴��� �������ּ���=====");
			System.out.println("1.�����Ѵ�.");
			System.out.println("2.�����Ѵ�.");
			System.out.println("������ �ұ��?");
			System.out.print(":");
			int menu = input.nextInt();
			System.out.println();
			
			if (menu==1) {
				
				while(true) {
					
					Pokemon mine = player.getPokemons().get(i);
					Pokemon yours = enemy.getPokemons().get(j);
					
					if(mine.getHP()<=0) {
						System.out.println("****"+player.getName()+"��"+mine.getName()+"��(��) �����ϴ�.");
						
						//player.getPokemons().remove(i);
						//System.out.println(player.getPokemons().size());
						if(i < player.getPokemons().size()-1) {
							i++;
							continue;
						}
						else {
							System.out.println("�¢¢��ش� GYM���� �й��Ͽ����ϴ�. ���߿� �ٽ� �����ϼ���");
							i=0;
							j=0;
							break;
						}
							
					}else if(yours.getHP()<=0){
						System.out.println("****"+enemy.getName()+"��"+yours.getName()+"��(��) �����ϴ�.");
						for(int k=0;k<enemy.getPokemons().size();k++) {
							enemy.getPokemons().get(k).setHP(enemy.getPokemons().get(k).getFullHP());
						}
						
						//enemy.getPokemons().remove(j);
						if(j < enemy.getPokemons().size()-1) {
							j++;
							continue;
						}
						else {
							System.out.println("�¢¢��ش� GYM���� �¸��Ͽ����ϴ�.");
							System.out.println("$$"+player.getName()+"���� gold +50�� �־����ϴ�");
							player.setGold(player.getGold() + 50);
							System.out.println("ü������ ������ ������ϴ�!!");
							player.setBadge(this.name);
							//System.out.println();
							System.out.println("����"+player.getName()+"�� ������ ���ϸ��� exp��"+"+30��ŭ �ö󰩴ϴ�");
							for(int i=0;i<player.getPokemons().size();i++) {
								player.getPokemons().get(i).setExp(player.getPokemons().get(i).getExp()+30);
								if(player.getPokemons().get(i).getExp()>=130) {
									String beforeName=player.getPokemons().get(i).getName();
									player.getPokemons().get(i).changeName();
									System.out.println("�ڡ�"+beforeName+"(��)��"+player.getPokemons().get(i).getName()+"(��)�� ��ȭ�߽��ϴ�");
								}
							}
							i=0;
							j=0;
							
							break;
						}
							
					}
					else if(player.getPokemons().isEmpty() || enemy.getPokemons().isEmpty())
						break;
					System.out.println("<"+yours.getName()+"(��)�� ��Ʋ�� �����մϴ�>");
					System.out.print(mine.getName()+"�� ����HP: "+mine.getHP()+"  ");
					System.out.println(yours.getName()+"�� ����HP: "+yours.getHP());
					System.out.println("*"+player.getName()+"�� ����");
					System.out.println("0��:������");
					mine.printSkills();
					
					System.out.print("��� ��ų�� ����ұ��??\n:");
					
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
							System.out.println("*���� ������ �������� �����ϴ�");
						}else {
						player.getItems().get(0).useItem(yours);
						}
					}
					System.out.println("*"+enemy.getName()+"�� ����");
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
				System.out.println("�ο򿡼� �����ƴ�!");
				t=false;
				//while�� ������� ��Ʋ ����
			} else {
				System.out.println("�߸��� �޴��Դϴ�.");
				break;
			} // �޴��� �ٽ� ���� ��
			
		}//turn�� �������� �ϴ� if�� ������ȣ
		
			break;
		}//while���� ��ȣ
				
			
			return false; //���� �������� ����
			
		}//�޼ҵ� ���� ��ȣ
		
		
		
	}//Ŭ����������ȣ
