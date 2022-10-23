public class Personnage {
    protected String name;
    protected int hp;
    protected int mana;
    protected int attack;
    protected int defense;
    protected int xp = 0;

    protected Personnage(String name, int hp, int mana, int attack, int defense){
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return this.mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getXp() {
		return this.xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}



}
