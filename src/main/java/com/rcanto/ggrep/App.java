	/*1. Programa Grep. Ejemplo:

	java ej1 patro fitxer */
package com.rcanto.ggrep;

import java.io.*;
public class App
{
	public static void main(String[] args)
	{
		String linea;
		File f = null;
		FileReader fr = null;
		if(args.length < 2)
		{
			System.out.println("Debes especificar el patrón y el nombre del fichero");
			System.exit(0);
		}

		f = new File(args[1]);
		try
		{
			fr = new FileReader(f);
		}
		catch(FileNotFoundException FNE)
		{
			System.out.println("Se ha liado parda");
		}
		BufferedReader br = new BufferedReader(fr);
		try
		{
			while((linea = br.readLine()) != null)
				if(linea.contains(args[0]))	// args[0] és el patró de búsqueda
				    System.out.println(linea);
	        if (br != null) { br.close(); fr.close(); }
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}
