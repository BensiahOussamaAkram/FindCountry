package ServeurGeo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Opiration extends Remote{
	
	public String [] Map  (String Country  )throws RemoteException;
	

}
