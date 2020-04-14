
package Serveur1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class serveur  {
		public static void main(String[] args) {
			try {
				LocateRegistry.createRegistry(456);
				DistanceCalculator  D =new DistanceCalculator();
				System.out.println(D.toString());
				Naming.bind("rmi://localhost:456/ben", D);
				System.out.println("Server is ready");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
