package model;

import java.util.Scanner;

public class pacman {

	pacman pac = new pacman();
	public static void main(String[] args) {
	
		
		
	//char a = 124, b = 47, c = 92 ,d = 111, e = 201, f = 187, g = 238, h = 124, z = 179,v = 200,k=95,l=188;
	//System.out.println(a+"a"+"a"+a+b+c+a );
	//System.out.println(a+"a"+"a"+a+b+c+a );
	//System.out.println(a+"a"+"a"+a+b+c+a );
	//System.out.println(a+"a"+"a"+a+b+c+a );
	

	
	 Scanner teclado=new Scanner(System.in);
     int n=0, m=0, i, j;
     
     System.out.println("ingrese las Filas que tendrá la matriz.");
     n=teclado.nextInt();
     
     System.out.println("ingrese las Columnas que tendrá la matriz.");
     m=teclado.nextInt();
     
     int [][] mxn = new int[n][m];
     
         introMatriz(mxn, n, m);
         muestraMatriz(mxn, n, m);
 }
 
 public static void introMatriz(int [][]mxn, int n, int m){
     int i, j;
         for (i = 0; i < n; i++) {
         for (j = 0; j < m; j++) {
             mxn[i][j] = (int)(Math.random()*9 + 1);
             }
         }
 }
 
 public static void muestraMatriz(int [][]mxn, int n, int m){
     int i, j;        
     for(i=0;i<mxn.length;i++) {
         System.out.print("\n");
         for(j=0;j<mxn[i].length;j++){
             System.out.print(mxn[i][j]+" ");
         }
     }
 }
 
}