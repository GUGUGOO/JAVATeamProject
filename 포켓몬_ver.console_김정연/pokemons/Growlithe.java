package pokemons;

public class Growlithe extends Pokemon {
	
	public Growlithe() {
		super();
	}
	
	public Growlithe(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}

	
	@Override
	public void printSkills() {
		String skillNames = "1번:물기\n2번:울부짖기\n";
		if(this.getLevel() == 2) {
			skillNames += "3번:불꽃세례\n4번:쨰려보기\n";
		}
		System.out.print(skillNames);
	}
	
	public void changeName() {
		this.setName("윈디");
		this.setLevel(2);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(이)가 물기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println("※"+pokemon.getName()+"의 HP가 -10만큼 떨어졌습니다");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(이)가 울부짖기를 "+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println("※"+pokemon.getName()+"의 HP-20만큼 떨어졌습니다");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(이)가 불꽃세례를"+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println("※"+pokemon.getName()+"의 HP-30만큼 떨어졌습니다");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(이)가 쨰려보기를"+pokemon.getName()+"에게 사용했습니다 ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println("※"+pokemon.getName()+"의 HP-40만큼 떨어졌습니다");
		
	}


	
	
	
	
}