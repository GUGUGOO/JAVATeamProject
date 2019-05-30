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
		String skillNames = "1��:����\n2��:���¢��\n";
		if(this.getLevel() == 2) {
			skillNames += "3��:�Ҳɼ���\n4��:��������\n";
		}
		System.out.print(skillNames);
	}
	
	public void changeName() {
		this.setName("����");
		this.setLevel(2);
	}
	@Override
	public void skill1(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(��)�� ���⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 10);
		System.out.println("��"+pokemon.getName()+"�� HP�� -10��ŭ ���������ϴ�");
	
	}
	
	@Override
	public void skill2(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(��)�� ���¢�⸦ "+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 20);
		System.out.println("��"+pokemon.getName()+"�� HP-20��ŭ ���������ϴ�");
		
	}
	@Override
	public void skill3(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(��)�� �Ҳɼ��ʸ�"+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 30);
		System.out.println("��"+pokemon.getName()+"�� HP-30��ŭ ���������ϴ�");
		
	}
	@Override
	public void skill4(Pokemon pokemon) {
		System.out.println("*"+this.getName()+"(��)�� �������⸦"+pokemon.getName()+"���� ����߽��ϴ� ");
		pokemon.setHP(pokemon.getHP() - 40);
		System.out.println("��"+pokemon.getName()+"�� HP-40��ŭ ���������ϴ�");
		
	}


	
	
	
	
}