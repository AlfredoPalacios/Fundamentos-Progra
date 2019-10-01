public class DegreesToRadians{
	/* Author: Alfredo Palacios Olagaray
	   Date: 22 August 2018
	   Description: First lab class */
public static void main(String[]args){
	int degrees = 30;
	double rad = degrees * Math.PI/180, sinx = Math.sin(rad), cosx = Math.cos(rad), sum = ((sinx*sinx)+(cosx*cosx));
	System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum);
}//here ends main method
}// here ends exercise 2