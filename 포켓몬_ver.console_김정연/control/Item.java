package control;
import java.util.ArrayList;
import pokemons.*;

public class Item {
	
	private String name;
	private int volume;
	private int price;
	private Player player;
	private Pokemon pokemon;
	
	
	public Item(String name, int volume, int price) {
		this.name = name;
		this.volume = volume;
		this.price = price;
	}
	
	
	public int getPrice() {
		return this.price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	//�������� volume
	public String showItemInfo() {
		String info="(HP�� "+this.volume+"��ŭ ȸ����Ű�� "+this.name+"�� �ֽ��ϴ�)";
		return info;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	public String getName() {
		return this.name;
	}

	public int getVolume(int volume) {
		return this.volume;
	}
	
	public void useItem(Pokemon pokemon) {
		System.out.println("*"+this.name+"�� ����մϴ�");
		pokemon.setHP(pokemon.getHP() - this.volume);
		System.out.println("*"+pokemon.getName()+"�� HP�� "+this.volume+"��ŭ �پ����ϴ�.");
	}

}
