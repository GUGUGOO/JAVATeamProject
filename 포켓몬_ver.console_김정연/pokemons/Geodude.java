package pokemons;

public class Geodude extends Pokemon {
	
	public Geodude() {
		super();
	}
	
	public Geodude(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}

	public void changeName() {
		this.setName("데구리");
		this.setLevel(2);
	}
	
	@Override
	public void printSkills() {
		String skillNames = "1번:몸통박치기\n2번:모래뿌리기\n";
		if(this.getLevel() == 2) {
			skillNames += "3번:돌떨구기\n4번:스텔스록\n";
		}
		System.out.print(skillNames);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 몸통박치기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println("※"+pokemon.getName()+"의 HP가 -10만큼 떨어졌습니다");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 모래뿌리기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println("※"+pokemon.getName()+"의 HP-20만큼 떨어졌습니다");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 돌떨구기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println("※"+pokemon.getName()+"의 HP-30만큼 떨어졌습니다");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 스텔스록를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println("※"+pokemon.getName()+"의 HP-40만큼 떨어졌습니다");
		
	}


	
	
	
	
}