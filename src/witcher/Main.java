/**
 * 
 */
package witcher;

/**
 * @author juanm
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Witcher brujo = new Witcher();
		
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		
			if (brujo.isDeath()) {
				System.out.println(brujo.getName() + " está muerto.");
			}
			else {
				System.out.println(brujo.getName() + " está vivo.");
			}
	}

}
