package pokemons;

public class Bulbasaur extends Pokemon{
	
	public Bulbasaur() {
		super();
	}
	
	public Bulbasaur(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}
	
	public void changeName() {
		this.setName("이상해풀");
		this.setLevel(2);
	}
	
	@Override
	public void printSkills() {
		String skillNames = "1번:몸통박치기\n2번:씨뿌리기\n";
		if(this.getLevel() == 2) {
			skillNames += "3번:잎날가르기\n";
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
		System.out.println("*"+this.getName()+"가 씨뿌리기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println(pokemon.getName()+"의 HP-20");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 잎날가르기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println(pokemon.getName()+"의 HP-30");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"가 리프스톰을 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println(pokemon.getName()+"의 HP-40");
		
	}


}
