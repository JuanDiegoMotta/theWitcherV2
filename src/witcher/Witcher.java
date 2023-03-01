/**
 * 
 */
package witcher;

/**
 * Clase que representa un brujo con tres atributos, name, health y hasSoul.
 * Esta clase se usará para un videojuego RPG.
 * @author juanm
 *
 */
public class Witcher {

	/**
	 * Atributo name, es el nombre del brujo
	 */
	private String name;
	/**
	 * Atributo health, es la vida del brujo
	 */
	private int health;
	/**
	 * Atributo hasSoul, si el brujo tiene o no alma
	 */
	private boolean hasSoul;
	
	/**
	 * Getter para obtener el nombre del brujo
	 * @return Devuelve el nombre del grupo
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter para dar valor al nombre del brujo
	 * @param name Nombre del brujo
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método para obtener la cantidad de vida del brujo
	 * @return Devuelve el número de vidas que le quedan al brujo
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Setter para establecer la vida del brujo
	 * @param health Cantidad de vida del brujo
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Función para saber si el brujo tiene alma
	 * @return hasSoul Devuelve si el brujo tiene alma o no
	 */
	public boolean isHasSoul() {
		return hasSoul;
	}

	/**
	 * Setter para establecer el alma del brujo
	 * @param hasSoul valor booleano si el brujo tiene o no alma
	 */
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	/**
	 * Nos dice si el brujo está o no muerto:
	 * <ul>
	 * <li>Si no tiene vida </li>
	 * <li>Si tiene vida pero no tiene alma</li>
	 * </ul>
	 * @return si está muerto o no.
	 */
	public boolean isDeath() {
		
		if (health == 0) {
			return true;
		}
		
		else if (!hasSoul) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
