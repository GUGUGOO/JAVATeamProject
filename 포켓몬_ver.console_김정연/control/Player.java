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
		System.out.print("*"+(i+1)+" 번 째 포켓몬 : ");
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
		System.out.println(this.getGold() + "원");
	}
	public void showItems() {
			
		if(this.items.size() == 0) {
			System.out.println("*아이템을 보유하고 있지 않습니다.");
		}
		else {
			for(int i = 0; i < items.size(); i++) {
				System.out.print("*"+(i+1)+" 번 째 아이템 : ");
				System.out.println(items.get(i).getName()+" "+items.get(i).showItemInfo());
			}
		}
	}
	
	public void showBadge() {
		if(this.badge.size() == 0) {
			System.out.print("*보유중인 뱃지가 없습니다ㅠㅠ\n");
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
		System.out.println(this.getBall() + "개");
	}
	
	public void showPlayer() {
		System.out.println("*플레이어의 정보를 표시합니다.");
		System.out.println("이름 : "+this.name);
		System.out.print("지닌 포켓몬 : \n");
		showPokemons();
		System.out.println("지닌 아이템 : ");
		showItems();
		System.out.println("보유중인 뱃지 : ");
		showBadge();
		System.out.print("보유중인 몬스터볼 갯수 :");
		showBallCount();
		System.out.println("보유중인 골드 : ");
		showGold();
	}
	
	public void setName(String name) {
		System.out.println("*플레이어의 이름을 변경합니다.");
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
		System.out.println("*"+pokemon.getName()+"의 HP를 20 증가시킵니다.");
		pokemon.setHP(pokemon.getHP()+20);
	}
	
	public void training(Pokemon pokemon) {
		System.out.println("*"+pokemon.getName()+"의 exp를 20 증가시킵니다.");
		pokemon.setHP(pokemon.getHP()+20);
	}
	
	public void playwithpoke (Pokemon pokemon) {
		System.out.println("*"+pokemon.getName()+"의 친밀도를 20 증가시킵니다.");
		pokemon.setHP(pokemon.getHP()+20);
		
	}
	
	public boolean ballThrow(Pokemon pokemon) {

		boolean result;
		
		while(ball > 0) {
			int random = (int)(Math.random()*10);
			System.out.println("*포켓볼을 던집니다(현재보유한 포켓볼"+this.ball+"개중 1개의 포켓볼을 사용합니다) ");
			if(random > 2) {
				//System.out.println("*"+pokemon.getClass().toString().split(" ")[1]+"을 잡았습니다.");
				//System.out.println("*"+ pokemon.getName() + "을(를) 잡았습니다.");
				pokemons.add(pokemon);
				this.ball--;
				//System.out.println("*현재보유한 포켓볼"+this.ball+"개");
				result=true;
				break;
			}else {
				System.out.println("*"+pokemon.getName()+"잡기에 실패했습니다.");
				System.out.println("*다시잡으시겠습니까??(숫자를 입력해주세요)\n1.잡기 2.포기하기");
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
				System.out.println("*처음을 같이할 포켓몬을 고르세요");
				System.out.println("1.피카츄");
				System.out.println("2.꼬부기");
				System.out.println("3.파이리");
				System.out.println("4.이상해씨");
				System.out.println("5.잠만보");
				System.out.print(": ");
				int pick = scanner.nextInt();
				
				if (pick==1) {
					Pikachu pikachu = new Pikachu("피카츄",100,100,100,100,1);
					this.pokemons.add(pikachu);
					System.out.println("피카츄는 이제 당신의 파트너 입니다!");
					pic=false;
				} else if (pick==2) {
					Squirtle squirtle = new Squirtle("꼬부기",100,100,100,100,1);
					this.pokemons.add(squirtle);
					System.out.println("꼬부기는 이제 당신의 파트너 입니다!");
					pic=false;
				} else if (pick==3) {
					Charmander charmander = new Charmander("파이리",100,100,100,100,1);
					this.pokemons.add(charmander);
					System.out.println("파이리는 이제 당신의 파트너 입니다!");
					pic=false;
				}  else if (pick==4) {
					Bulbasaur bulbasaur = new Bulbasaur("이상해씨",100,100,100,100,1);
					this.pokemons.add(bulbasaur);
					System.out.println("이상해씨는 이제 당신의 파트너 입니다!");
					pic=false;
				} else if (pick==5) {
					Snorlax snorlax = new Snorlax("먹고자",100,100,100,100,1);
					this.pokemons.add(snorlax);
					System.out.println("먹고자는 이제 당신의 파트너 입니다!");
					pic=false;
				}  else {
					System.out.println("다시 골라주세요.");
					
				}
		}
	}
	
	
}
