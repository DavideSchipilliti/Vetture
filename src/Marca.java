import java.util.Random;

public enum Marca {
	FIAT(),
	ALFA_ROMEO(),
	TOYOTA(),
	FERRARI(),
	FORD(),
	BMW();
	
	//metodo per recuperare una marca a caso
	public static Marca getRandom() {
		Random r=new Random();
		int rand=r.nextInt(5);
		return Marca.values()[rand];	//values restituisce una lista dei valori di enum
	}
}
