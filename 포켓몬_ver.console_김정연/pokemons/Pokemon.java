package pokemons;

public class Pokemon implements Skill{
	private String name;
	private int HP,exp,intimacy,fullHP,level;
	
	public Pokemon() {
		
	}
	
	
	public Pokemon(String name, int hp, int exp, int intimacy, int fullHP, int level) {
		this.name = name;
		this.HP = hp;
		this.exp = exp;
		this.intimacy = intimacy;
		this.fullHP = fullHP;
		this.level = level;
		
	}
	
	
	public void changeName() {
		
	}
	
	public void initialMon( ) {
	
	}
	
	public void showMon() {
		System.out.println("*"+this.name+"의 정보를 보여줍니다");
		System.out.println("HP:"+this.HP+"  fullHP: "+this.fullHP);
		System.out.println("intimacy:"+this.intimacy+" exp:"+this.exp+" Level:"+this.level);
	}
	
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp=exp;
	}
	
	public int getIntimacy() {
		return intimacy;
		
	}
	
	public void setIntimacy(int intimacy) {
		this.intimacy=intimacy;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name=name;
		}

	public int getHP() {
		return HP;
	}
	
	public void setHP(int HP) {
		this.HP=HP;
	}
	
	public int getFullHP() {
		return fullHP;
	}

	public void setFullHP(int fullHP) {
		this.fullHP = fullHP;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void upgrade(int exp) {
		if(exp>100) {
			System.out.print("*"+this.name+"의 Level이 level"+this.level+"에서 level");
			this.level++;
			this.fullHP=300;
			this.HP=300;
			this.exp=0;
			System.out.println(this.level+"로 올랐습니다");	
		}
	}
	@Override
	public void printSkills() {

	}


	@Override
	public void skill1(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void skill2(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void skill3(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void skill4(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}
	
}


