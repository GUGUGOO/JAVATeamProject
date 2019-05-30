import java.util.ArrayList;
import java.util.Scanner;

import control.*;
import pokemons.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String arrow;
		Map map = new Map(6, 6);
		Player player = new Player("형쭈니", 100, 5, map.getX() - 1, map.getY() - 1);
		player.selectInitialPokemon();
		Player boss_1 = new Player("지우", 0, 0, 0, 0);	
		boss_1.addPokemon(new Squirtle("꼬부기", 100, 0, 100, 100, 1));
		boss_1.addPokemon(new Pikachu("피카츄", 100, 0, 100, 100, 1));
		boss_1.addPokemon(new Bulbasaur("이상해씨", 100, 0, 100, 100, 1));
		
		Player boss_2 = new Player("휘웅", 0, 0, 0, 0);	
		boss_2.addPokemon(new Meowth("나옹", 100, 0, 100, 100, 1));
		boss_2.addPokemon(new Psyduck("고라파덕", 100, 0, 100, 100, 1));
		boss_2.addPokemon(new Growlithe("가디", 100, 0, 100, 100, 1));
		
		Player boss_3 = new Player("크리스", 0, 0, 0, 0);	
		boss_3.addPokemon(new Machop("알통몬", 100, 0, 100, 100, 1));
		boss_3.addPokemon(new Bellsprout("또가스", 100, 0, 100, 100, 1));
		boss_3.addPokemon(new Geodude("꼬마돌", 100, 0, 100, 100, 1));
		
		
		Player enemy1 = new Player("부하1", 0, 0, 0, 0);
		enemy1.addPokemon(new Squirtle("꼬부기", 100, 0, 100, 100, 1));
		enemy1.addPokemon(new Charmander("파이리", 100, 0, 100, 100, 1));
		
		ArrayList<Player> enemies_1 = new ArrayList();
		ArrayList<Player> enemies_2 = new ArrayList();
		ArrayList<Player> enemies_3= new ArrayList();
	
		//enemies.add(enemy1);
		enemies_1.add(boss_1);
		enemies_2.add(boss_2);
		enemies_3.add(boss_3);
		
		
		
		map.getGround()[map.getX() - 1][map.getY() - 1] = player;
		map.getGround()[1][1] = new Gym(enemies_1,"Bronze");
		map.getGround()[5][2] = new Gym(enemies_2,"Silver");
		map.getGround()[2][5] = new Gym(enemies_3,"Gold");
		
		map.getGround()[0][0] = new Eevee("이브이", 100, 0, 100, 100, 1);
		map.getGround()[3][1] = new Squirtle("꼬부기", 100, 0, 100, 100, 1);
		map.getGround()[2][4]= new Charmander("파이리",100,0,100,100,1);
		map.getGround()[5][3]= new Ekans("아보",100,0,100,100,1);
		map.getGround()[4][5]= new Ekans("디그다",100,0,100,100,1);
		
		ArrayList<Item> items = new ArrayList();
		items.add(new Item("초급 물약", 40, 20));
		items.add(new Item("중급 물약", 80, 40));
		items.add(new Item("고급 물약", 120, 80));
		map.getGround()[0][3] = new Shop(items);
		map.menu(player);

	}

}
