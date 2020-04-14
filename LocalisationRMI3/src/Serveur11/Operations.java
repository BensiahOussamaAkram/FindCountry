package Serveur11;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Client11.ClientGui;
import Client11.ClientOpiration;

public interface Operations extends Remote{
	
	public double distanceBetweenTwoPoints (double  x1, double x2, double y1, double y2 )throws RemoteException;
	

}
