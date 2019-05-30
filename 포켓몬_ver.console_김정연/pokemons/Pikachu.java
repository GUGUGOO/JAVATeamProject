package pokemons;

public class Pikachu extends Pokemon {
	
	public Pikachu() {
		super();
	}
	
	public Pikachu(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}

	
	public void changeName() {
			this.setName("라이츄");
			this.setLevel(2);
	}
	
	@Override
	public void printSkills() {
		String skillNames = "1번:전광석화\n2번:전기쇼크\n";
		if(this.getLevel() == 2) {
			skillNames += "3번:10만볼트\n4번:100만볼트\n";
		}
		System.out.print(skillNames);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 전광석화를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println("※"+pokemon.getName()+"의 HP가 -10만큼 떨어졌습니다");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 전기쇼크를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println("※"+pokemon.getName()+"의 HP-20만큼 떨어졌습니다");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 10만볼트를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println("※"+pokemon.getName()+"의 HP-30만큼 떨어졌습니다");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 백만볼트를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println("※"+pokemon.getName()+"의 HP-40만큼 떨어졌습니다");
		
	}


	
	
	
	
}
