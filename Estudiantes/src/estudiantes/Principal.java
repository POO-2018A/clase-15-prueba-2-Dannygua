
package estudiantes;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        Estudiantes estu []= new Estudiantes [5];
        Materias mate [] = new Materias [10];
        int estudiantesiguales [] = new int [100];
        
        int materiasiguales [] = new int [100];

        int contador =0;
        int contador2 =0;
        int contador3 =0;
        
        boolean estuigual =true;
        boolean materiaigual =true;
        
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("#####ESTUDIANTES#####");
            scan.nextLine();
            System.out.println("Nombre: ");
            String nombre = scan.nextLine();
            System.out.println("Edad: ");
            int edad = scan.nextInt();
            
            for (int j = 0; j < 2; j++) {
                
                System.out.println("#####MATERIAS#####");
                
                scan.nextLine();
                System.out.println("Nombre:");
                String nombremate = scan.nextLine();
                System.out.println("Nivel:");
                int nivel= scan.nextInt();
                
                mate [contador] = new Materias (nombremate,nivel);
                
                
                contador++;
                
            }
            
            estu [i]= new Estudiantes (nombre,edad);
            
            System.out.println("#####INFORMACION DE LOS ESTUDIANTES INGRESADOR#####");
            
            System.out.println(estu [i]); 
            
            for (int j = 0; j < 2; j++) {
                
                 System.out.println(mate[contador2]);
                 
                 contador2++;
            }
    
        }
        
        for (int i = 0; i < 5; i++) {
            
            

            for (int j = 0; j < i; j++) {
                
                if(estu[j].equals(estu[i])){

                    
                     estudiantesiguales [contador3]= i;

                    
                    }
                
                        
                }
   
                         
            }
        
        System.out.println("La posicion de los alumnos repetidos son: ");
        System.out.print("Posiciones: ");
        
        for (int i = 0; i < 5; i++) {
            
             System.out.print(estudiantesiguales [i]+1);

             System.out.print(" , ");

        }
       
        
        
        contador3=0;
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < i; j++) {
                
                if(mate[j].equals(mate[i])){

                    
                    materiasiguales [contador3]= i;
                    
                    }
                
            }
            
            contador3++;

            
        }
        
        System.out.println("\n");
        System.out.println("La posicion de las materias repetidas son: ");
        System.out.print("Posiciones: ");
        
        for (int i = 0; i < 5; i++) {
            
             System.out.print(materiasiguales [i]+1);
             System.out.print(" , ");
        }
        
        
        
             
            
        }
            
            
        
        
    }
    

