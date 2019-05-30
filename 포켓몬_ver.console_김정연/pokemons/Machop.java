package pokemons;

public class Machop extends Pokemon {
	
	public Machop() {
		super();
	}
	
	public Machop(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		super(name, hp, exp, intimacy, fullHP, level);
	}

	public void changeName() {
		this.setName("������");
		this.setLevel(2);
	}
	
	@Override
	public void printSkills() {
		String skillNames = "1��:�ȴٸ��ɱ�\n2��:����������\n";
		if(this.getLevel() == 2) {
			skillNames += "3��:�±Ǵ��\n4��:�����ǹ���\n";
		}
		System.out.print(skillNames);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �ȴٸ��ɱ⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println("��"+pokemon.getName()+"�� HP�� -10��ŭ ���������ϴ�");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� ���������⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println("��"+pokemon.getName()+"�� HP-20��ŭ ���������ϴ�");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �±Ǵ���� "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println("��"+pokemon.getName()+"�� HP-30��ŭ ���������ϴ�");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"�� �����ǹ����� "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println("��"+pokemon.getName()+"�� HP-40��ŭ ���������ϴ�");
		
	}


	
	
	
	
}
