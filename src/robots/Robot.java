package robots;

public class Robot {
	
	private String nombre;
	protected int ataque;
	protected int defensa;
	protected int vida;
	
	
	
	public Robot(String nombre) {
		
		this.nombre = nombre;
		vida = 100;
		ataque = 1+(int)(Math.random()*20);
		defensa = (int)(Math.random()*101);
	}
	
	

	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", vida=" + vida + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	

}
