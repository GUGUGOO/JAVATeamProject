package pokemons;

public class Snorlax extends Pokemon{
	public Snorlax() {
		super();
	}
	
	public Snorlax(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}
	
	public void changeName() {
		this.setName("�Ḹ��");
		this.setLevel(2);
	}
	
	@Override
	public void printSkills() {
		String skillNames = "1��:�����ġ��\n2��:������\n";
		if(this.getLevel() == 2) {
			skillNames += "3��:������\n4:�ı�����\n";
		}
		System.out.print(skillNames);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �����ġ�⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println(pokemon.getName()+"�� HP-10");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �����⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println(pokemon.getName()+"�� HP-20");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �����⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println(pokemon.getName()+"�� HP-30");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �ı������� "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println(pokemon.getName()+"�� HP-40");
		
	}


}
