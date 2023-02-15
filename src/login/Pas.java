/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pas
{

    public static boolean validarContrasena (String contrasena)
    {
        // Comprueba si la contraseña tiene al menos 8 caracteres
        if (contrasena.length () < 8)
        {
            return false;
        }

        // Comprueba si la contraseña tiene al menos 2 letras en mayúsculas y 2 en
        // minúsculas
        int mayusculas = 0, minusculas = 0;
        for (int i = 0; i < contrasena.length (); i ++)
        {
            char c = contrasena.charAt (i);
            if (Character.isUpperCase (c))
            {
                mayusculas ++;
            } else if (Character.isLowerCase (c))
            {
                minusculas ++;
            }
        }
        if (mayusculas < 2 || minusculas < 2)
        {
            return false;
        }

        // Comprueba si la contraseña tiene al menos 1 caracter especial
        Pattern p = Pattern.compile ("[^a-zA-Z0-9]");
        Matcher m = p.matcher (contrasena);
        if ( ! m.find ())
        {
            return false;
        }

        // Si llegamos aquí, la contraseña es válida
        return true;
    }

    public static void main (String[] args)
    {
        Scanner leer = new Scanner (System.in);
        System.out.println ("Ingrese contrasena: \n");
        String contrasena = leer.nextLine ();

        // MiC0ntras3n@
        if (Pas.validarContrasena (contrasena))
        {
            System.out.println ("La contrasena es valida");
        } else
        {
            System.out.println ("La contrasena no es valida");
        }
    }
}
