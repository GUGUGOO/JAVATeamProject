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


	//아이템의 volume
	public String showItemInfo() {
		String info="(HP를 "+this.volume+"만큼 회복시키는 "+this.name+"이 있습니다)";
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
		System.out.println("*"+this.name+"을 사용합니다");
		pokemon.setHP(pokemon.getHP() - this.volume);
		System.out.println("*"+pokemon.getName()+"의 HP가 "+this.volume+"만큼 줄었습니다.");
	}

}
