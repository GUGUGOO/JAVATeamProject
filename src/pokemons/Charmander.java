package pokemons;

public class Charmander extends Pokemon {
	
	public Charmander() {
		super();
	}
	
	public Charmander(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}
	@Override
	public void printSkills() {
		String skillNames = "1번:꼬리치기\n2번:날개치기\n";
		if(this.getLevel() == 2) {
			skillNames += "3번:회오리 불꽃\n";
		}
		System.out.print(skillNames);
	}
	
	public void changeName() {
		this.setName("리자드");
		this.setLevel(2);
	}
	
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 꼬리치기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println(pokemon.getName()+"의 HP-10");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 날개치기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println(pokemon.getName()+"의 HP-20");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 회오리불꽃을 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println(pokemon.getName()+"의 HP-30");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 불대문자를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println(pokemon.getName()+"의 HP-40");
		
	}


}

