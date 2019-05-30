import java.util.ArrayList;
import java.util.Scanner;

import control.*;
import pokemons.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String arrow;
		Map map = new Map(6, 6);
		Player player = new Player("���޴�", 100, 5, map.getX() - 1, map.getY() - 1);
		player.selectInitialPokemon();
		Player boss_1 = new Player("����", 0, 0, 0, 0);	
		boss_1.addPokemon(new Squirtle("���α�", 100, 0, 100, 100, 1));
		boss_1.addPokemon(new Pikachu("��ī��", 100, 0, 100, 100, 1));
		boss_1.addPokemon(new Bulbasaur("�̻��ؾ�", 100, 0, 100, 100, 1));
		
		Player boss_2 = new Player("�ֿ�", 0, 0, 0, 0);	
		boss_2.addPokemon(new Meowth("����", 100, 0, 100, 100, 1));
		boss_2.addPokemon(new Psyduck("����Ĵ�", 100, 0, 100, 100, 1));
		boss_2.addPokemon(new Growlithe("����", 100, 0, 100, 100, 1));
		
		Player boss_3 = new Player("ũ����", 0, 0, 0, 0);	
		boss_3.addPokemon(new Machop("�����", 100, 0, 100, 100, 1));
		boss_3.addPokemon(new Bellsprout("�ǰ���", 100, 0, 100, 100, 1));
		boss_3.addPokemon(new Geodude("������", 100, 0, 100, 100, 1));
		
		
		Player enemy1 = new Player("����1", 0, 0, 0, 0);
		enemy1.addPokemon(new Squirtle("���α�", 100, 0, 100, 100, 1));
		enemy1.addPokemon(new Charmander("���̸�", 100, 0, 100, 100, 1));
		
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
		
		map.getGround()[0][0] = new Eevee("�̺���", 100, 0, 100, 100, 1);
		map.getGround()[3][1] = new Squirtle("���α�", 100, 0, 100, 100, 1);
		map.getGround()[2][4]= new Charmander("���̸�",100,0,100,100,1);
		map.getGround()[5][3]= new Ekans("�ƺ�",100,0,100,100,1);
		map.getGround()[4][5]= new Ekans("��״�",100,0,100,100,1);
		
		ArrayList<Item> items = new ArrayList();
		items.add(new Item("�ʱ� ����", 40, 20));
		items.add(new Item("�߱� ����", 80, 40));
		items.add(new Item("��� ����", 120, 80));
		map.getGround()[0][3] = new Shop(items);
		map.menu(player);

	}

}
