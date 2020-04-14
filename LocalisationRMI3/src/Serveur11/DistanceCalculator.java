package Serveur11;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DistanceCalculator extends UnicastRemoteObject implements Operations{

	public DistanceCalculator() throws RemoteException {
		super();
	}

	public double distanceBetweenTwoPoints (double  x1, double x2, double y1, double y2 ) {
		    x1 = Math.toRadians(x1); 
	        x2 = Math.toRadians(x2); 
	        y1 = Math.toRadians(y1); 
	        y2 = Math.toRadians(y2); 
	  
	        // Haversine formula  
	        double dlon = x2 - x1;  
	        double dlat = y2 - y1; 
	        double a = Math.pow(Math.sin(dlat / 2), 2) 
	                 + Math.cos(y1) * Math.cos(y2) 
	                 * Math.pow(Math.sin(dlon / 2),2); 
	              
	        double c = 2 * Math.asin(Math.sqrt(a)); 
	  
	        // Radius of earth in kilometers. Use 3956  
	        // for miles 
	        double r = 6371; 
	  
	        // calculate the result 
	        return(c * r); 
		
	}
}
