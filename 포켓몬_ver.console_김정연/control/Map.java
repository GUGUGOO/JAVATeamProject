package control;
import java.util.Scanner;
import pokemons.*;
public class Map {
	private int x = 6;
	private int y = 6;
	private Object [][] ground;
	private String eventMessage;
	public Map(int x, int y){
		this.x = x;
		this.y = y;
		ground = new Object[x][y];
	}
	public Object[][] getGround(){
		return ground;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setGround(Object[][] ground) {
		this.ground = ground;
	}
	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}
	public String getEventMessage() {
		return this.eventMessage;
	}
	public void clearScreen() {
		for (int i = 0; i < 3; i++)
	    	System.out.println();
	}

	public boolean is_right(int nx, int ny) {
		if(nx >= x || nx < 0 || ny >= y || ny < 0) return false;
		return true;
	}
	public void printMap(Player player) {
		if(eventMessage != null) {
			System.out.print(eventMessage + "\n");
			eventMessage = null;
		}
		for(int i = 0; i < ground.length; i++) {
			for(int j = 0; j < ground[0].length; j++) {
				if(ground[i][j] == null) {
					System.out.print("□  ");
				} else if(ground[i][j] instanceof Gym) {
					System.out.print("G  ");
				} else if(ground[i][j] instanceof Pokemon) {
					System.out.print("P  ");
				} else if(ground[i][j] instanceof Shop) {
					System.out.print("S  ");
				}
				else {
					System.out.print(player.getName().charAt(0) + "     ");
				}
			}
			System.out.println();
		}
	}
	public void nextPlace(int curr_x, int curr_y, int nx, int ny) {
		if(ground[nx][ny] != null) {
			if(ground[nx][ny] instanceof Pokemon) {
				Pokemon wildPokemon = (Pokemon) ground[nx][ny];
				System.out.println("\n\n\n"+wildPokemon.getName() + "이(가) 있습니다!!");
				if (((Player) ground[curr_x][curr_y]).ballThrow(wildPokemon)) {
					eventMessage = wildPokemon.getName() + "을(를) 잡았습니다!";
					ground[nx][ny] = null;
				}
			}
			else if(ground[nx][ny] instanceof Gym) {
				System.out.println("체육관이 있습니다!!");
				Gym currentGym = (Gym) ground[nx][ny];
				Player player = (Player) ground[curr_x][curr_y];
				if(currentGym.battle(player)) {
					player.setGold(player.getGold() + 100);
				}
				for(int i = 0; i < player.getPokemons().size(); i++) {
					Pokemon pokemon = player.getPokemons().get(i);
					pokemon.setHP(pokemon.getFullHP());
				}
			}
			else if(ground[nx][ny] instanceof Shop) {
				System.out.println("상점이 있습니다!!");
				Shop currentShop = (Shop) ground[nx][ny];
				Player player = (Player) ground[curr_x][curr_y];
				currentShop.showItems(player);
			}
			return;
			
		}
		ground[nx][ny] = ground[curr_x][curr_y];
		ground[curr_x][curr_y] = null;
		((Player) ground[nx][ny]).getPoint().x = nx;
		((Player) ground[nx][ny]).getPoint().y = ny;
	}
	public void move(String arrow, Player player) {
		int curr_x = player.getPoint().x;
		int curr_y = player.getPoint().y;
		int nx, ny;
		if(arrow.equals("w")) {
			if(is_right(curr_x - 1, curr_y)) {
				nx = curr_x - 1;
				ny = curr_y;
				nextPlace(curr_x, curr_y, nx, ny);
			}
		} else if(arrow.equals("a")) {
			if(is_right(curr_x, curr_y - 1)) {
				nx = curr_x;
				ny = curr_y - 1;
				nextPlace(curr_x, curr_y, nx, ny);
			}
		} else if(arrow.equals("s")) {
			if(is_right(curr_x + 1, curr_y)) {
				nx = curr_x + 1;
				ny = curr_y;
				nextPlace(curr_x, curr_y, nx, ny);
			}
		} else if(arrow.equals("d")){
			if(is_right(curr_x, curr_y + 1)) {
				nx = curr_x;
				ny = curr_y + 1;
				nextPlace(curr_x, curr_y, nx, ny);
			}
		}
	}
	public void menu(Player player) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			printMap(player);
			System.out.println("다음 행동을 골라주세요(-1 입력 시 퇴장)");
			System.out.println("1. 자신의 상태 확인");
			System.out.println("2. 현재 보유 포켓몬 확인");
			System.out.println("3. 현재 보유 아이템 확인");
			System.out.println("4. 이동");
			System.out.print("Input: ");
			int select = Integer.parseInt(scanner.nextLine());
			clearScreen();

			if(select == 1) {
				player.showPlayer();
			}
			else if(select == 2) {
				player.showPokemons();
			}
			else if(select == 3) {
				player.showItems();
			}
			else if(select == 4) {
				System.out.print("   w\na  s  d\nInput: ");
				String arrow = scanner.nextLine();
				move(arrow, player);
			} else {
				break;
			}
		}
		
	}
}
