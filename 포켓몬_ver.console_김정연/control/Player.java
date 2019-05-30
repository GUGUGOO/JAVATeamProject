package control;
import java.util.ArrayList;
import java.util.Scanner;
import pokemons.*;

class Point {
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Player {
	private String name;
	private int gold;
	private int ball;
	private Point point;
	private ArrayList<Item> items;
	private ArrayList<Pokemon> pokemons;
	private ArrayList badge;

	
	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public Player(String name, int gold, int ball, int x, int y) {
		this.name = name;
		this.gold = gold;
		this.ball = ball;
		this.pokemons = new ArrayList<>();
		point = new Point(x, y);
		this.items = new ArrayList<>();
		this.badge = new ArrayList();
		
	}
	

	public void showPokemons() {
		for(int i = 0; i < pokemons.size(); i++) {
		System.out.print("*"+(i+1)+" �� ° ���ϸ� : ");
		System.out.println(pokemons.get(i).getName());
		}
		
	}
	
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public void showGold() {
		System.out.println(this.getGold() + "��");
	}
	public void showItems() {
			
		if(this.items.size() == 0) {
			System.out.println("*�������� �����ϰ� ���� �ʽ��ϴ�.");
		}
		else {
			for(int i = 0; i < items.size(); i++) {
				System.out.print("*"+(i+1)+" �� ° ������ : ");
				System.out.println(items.get(i).getName()+" "+items.get(i).showItemInfo());
			}
		}
	}
	
	public void showBadge() {
		if(this.badge.size() == 0) {
			System.out.print("*�������� ������ �����ϴ٤Ф�\n");
		}
		else {
			for(int i=0;i<this.badge.size();i++) {
				System.out.printf("%s ",this.badge.get(i));
				if(i == this.badge.size()-1)
					System.out.println();
			}
		}
	}
	
	public void showBallCount() {
		System.out.println(this.getBall() + "��");
	}
	
	public void showPlayer() {
		System.out.println("*�÷��̾��� ������ ǥ���մϴ�.");
		System.out.println("�̸� : "+this.name);
		System.out.print("���� ���ϸ� : \n");
		showPokemons();
		System.out.println("���� ������ : ");
		showItems();
		System.out.println("�������� ���� : ");
		showBadge();
		System.out.print("�������� ���ͺ� ���� :");
		showBallCount();
		System.out.println("�������� ��� : ");
		showGold();
	}
	
	public void setName(String name) {
		System.out.println("*�÷��̾��� �̸��� �����մϴ�.");
		this.name = name;
		
	}
	
	public ArrayList<Pokemon> addPokemon(Pokemon pokemon) {
		this.pokemons.add(pokemon);
		return pokemons;
	}

	
	public void setItems(ArrayList<Item> items,int index) {
		this.items.remove(index);
		this.items = items;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Item> getItems() {
			return items;
	}
	
	public void setBadge(String badge) {
		this.badge.add(badge);
	}
	public ArrayList getBadge() {
		return this.badge;
	}
		
		
	
	public void feed(Pokemon pokemon) {
		System.out.println("*"+pokemon.getName()+"�� HP�� 20 ������ŵ�ϴ�.");
		pokemon.setHP(pokemon.getHP()+20);
	}
	
	public void training(Pokemon pokemon) {
		System.out.println("*"+pokemon.getName()+"�� exp�� 20 ������ŵ�ϴ�.");
		pokemon.setHP(pokemon.getHP()+20);
	}
	
	public void playwithpoke (Pokemon pokemon) {
		System.out.println("*"+pokemon.getName()+"�� ģ�е��� 20 ������ŵ�ϴ�.");
		pokemon.setHP(pokemon.getHP()+20);
		
	}
	
	public boolean ballThrow(Pokemon pokemon) {

		boolean result;
		
		while(ball > 0) {
			int random = (int)(Math.random()*10);
			System.out.println("*���Ϻ��� �����ϴ�(���纸���� ���Ϻ�"+this.ball+"���� 1���� ���Ϻ��� ����մϴ�) ");
			if(random > 2) {
				//System.out.println("*"+pokemon.getClass().toString().split(" ")[1]+"�� ��ҽ��ϴ�.");
				//System.out.println("*"+ pokemon.getName() + "��(��) ��ҽ��ϴ�.");
				pokemons.add(pokemon);
				this.ball--;
				//System.out.println("*���纸���� ���Ϻ�"+this.ball+"��");
				result=true;
				break;
			}else {
				System.out.println("*"+pokemon.getName()+"��⿡ �����߽��ϴ�.");
				System.out.println("*�ٽ������ðڽ��ϱ�??(���ڸ� �Է����ּ���)\n1.��� 2.�����ϱ�");
				Scanner sc = new Scanner(System.in);
				this.ball--;
				int select = sc.nextInt();
				if(select == 1) {
					continue;
				}else {
					result= false;
				}
			}
			
		}
		if(result=true) {
			return true;
		}else {
			return false;
		}
	}

	public void selectInitialPokemon() {
		
		Scanner scanner = new Scanner(System.in);
		boolean pic = true;
				
		while(pic) {
				System.out.println("*ó���� ������ ���ϸ��� ������");
				System.out.println("1.��ī��");
				System.out.println("2.���α�");
				System.out.println("3.���̸�");
				System.out.println("4.�̻��ؾ�");
				System.out.println("5.�Ḹ��");
				System.out.print(": ");
				int pick = scanner.nextInt();
				
				if (pick==1) {
					Pikachu pikachu = new Pikachu("��ī��",100,100,100,100,1);
					this.pokemons.add(pikachu);
					System.out.println("��ī��� ���� ����� ��Ʈ�� �Դϴ�!");
					pic=false;
				} else if (pick==2) {
					Squirtle squirtle = new Squirtle("���α�",100,100,100,100,1);
					this.pokemons.add(squirtle);
					System.out.println("���α�� ���� ����� ��Ʈ�� �Դϴ�!");
					pic=false;
				} else if (pick==3) {
					Charmander charmander = new Charmander("���̸�",100,100,100,100,1);
					this.pokemons.add(charmander);
					System.out.println("���̸��� ���� ����� ��Ʈ�� �Դϴ�!");
					pic=false;
				}  else if (pick==4) {
					Bulbasaur bulbasaur = new Bulbasaur("�̻��ؾ�",100,100,100,100,1);
					this.pokemons.add(bulbasaur);
					System.out.println("�̻��ؾ��� ���� ����� ��Ʈ�� �Դϴ�!");
					pic=false;
				} else if (pick==5) {
					Snorlax snorlax = new Snorlax("�԰���",100,100,100,100,1);
					this.pokemons.add(snorlax);
					System.out.println("�԰��ڴ� ���� ����� ��Ʈ�� �Դϴ�!");
					pic=false;
				}  else {
					System.out.println("�ٽ� ����ּ���.");
					
				}
		}
	}
	
	
}
