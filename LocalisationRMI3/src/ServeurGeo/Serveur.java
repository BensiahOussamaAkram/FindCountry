package ServeurGeo;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

//import Serveur1.DistanceCalculator;

public class Serveur {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1994);
			Traitement  T = new Traitement ();
		//System.out.println(T.toString());
			Naming.bind("rmi://localhost:1994/akram", T);
			System.out.println("Server is ready ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
