package pokemons;

public class Snorlax extends Pokemon{
	public Snorlax() {
		super();
	}
	
	public Snorlax(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}
	
	public void changeName() {
		this.setName("잠만보");
		this.setLevel(2);
	}
	
	@Override
	public void printSkills() {
		String skillNames = "1번:몸통박치기\n2번:누르기\n";
		if(this.getLevel() == 2) {
			skillNames += "3번:구르기\n4:파괴광선\n";
		}
		System.out.print(skillNames);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 몸통박치기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println(pokemon.getName()+"의 HP-10");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 누르기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println(pokemon.getName()+"의 HP-20");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 구르기를 "+pokemon.getName()+"에게 사용했습니다 ");
		
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println(pokemon.getName()+"의 HP-30");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 파괴광선을 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println(pokemon.getName()+"의 HP-40");
		
	}


}
