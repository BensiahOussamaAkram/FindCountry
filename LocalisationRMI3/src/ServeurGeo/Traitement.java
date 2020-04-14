package ServeurGeo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class Traitement extends UnicastRemoteObject implements Opiration {


	public Traitement() throws RemoteException {
		super();
	}

	public String[] Map(String Country) {
		String  anserw[]= new String [3];
		int i=0; 
		int ii=0;
		String des="";
		if (Country.equalsIgnoreCase("algeria") ) {
			 i =481;
			 ii=314;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'>Country: ALGERIA</br>"
		  	            + "<br>Capital: Alger</br>"
		  	            + "<br>Surface: 2 381 741 km²</br>"
		  	            + "<br>Calling Code: +213</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("usa") ) {
			 i =190;
			 ii=287;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'>Country: United States of America</br>"
		  	            + "<br>Capital: Washington</br>"
		  	            + "<br>Surface: 327 200 000  km²</br>"
		  	            + "<br>Calling Code: +1</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("canada") ) {
			 i =190;
			
			 ii= 195;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'>Country: CANADA</br>"
		  	            + "<br>Capital: Ottawa</br>"
		  	            + "<br>Surfa ce: 9 984 670  km²</br>"
		  	            + "<br>Calling Code: +1</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("england") ) {
			 i =467;
			 ii=247;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'>Country: ENGLAND</br>"
		  	            + "<br>Capital: London</br>"
		  	            + "<br>Surface: 130 279 km²</br>"
		  	            + "<br>Calling Code: +44</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("france") ) {
			 i =477;
			 ii=273;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'>Country: FRANCE</br>"
		  	            + "<br>Capital:  Paris</br>"
		  	            + "<br>Surface:  643 801 km²</br>"
		  	            + "<br>Calling Code: +33</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("ksa") ) {
			 i =590;
			 ii=337;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'>Country: Kingdom of Saudi Arabia</br>"
		  	            + "<br>Capital: Riyadh</br>"
		  	            + "<br>Surface: 2 149 690 km²</br>"
		  	            + "<br>Calling Code: +966</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("iran") ) {
			 i =618;
			 ii=313;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'> Country:République islamique of Iran</br>"
		  	            + "<br>Capital: Téhéran</br>"
		  	            + "<br>Surface: 1 648 195 km²</br>"
		  	            + "<br>Calling Code: +98</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		if (Country.equalsIgnoreCase("iraq") ) {
			 i =586;
			 ii=316;
			 des= "<html><body width='%1s'>"
		  	            + "<p ><b rwidth='%5s'> Country:Iraq</br>"
		  	            + "<br>Capital: Bagdad</br>"
		  	            + "<br>Surface: 435 052 km²</br>"
		  	            + "<br>Calling Code: +9</br></p>";
			 anserw[0]= Integer.toString(i);
			 anserw[1]= Integer.toString(ii);
			 anserw[2]= des;
		}
		return  new String[] {Integer.toString(i),Integer.toString(ii),des};
		
	}
}
