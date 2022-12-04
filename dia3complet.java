import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class dia3complet {
    public static void main(String[] args) {

ArrayList<String> ArrayAmbDadesDelInput = new ArrayList<String>();
ArrayList<String> primeraMitad = new ArrayList<String>();
ArrayList<String> segundaMitad = new ArrayList<String>();
ArrayList<String> matches = new ArrayList<String>();
ArrayList<String> group3matches = new ArrayList<String>();
int totalSum=0;

try{
    File input = new File("C:\\Users\\Ivan\\Desktop\\Asignatures 3r carrera\\UUActivitatsICredits\\AdventOfCode\\dia3\\inputdia3.txt");
    Scanner fileScanner = new Scanner(input);

    while(fileScanner.hasNextLine()) {
        ArrayAmbDadesDelInput.add(fileScanner.nextLine());
    }

    for(int x=0;x<ArrayAmbDadesDelInput.size();x++){
        String aux = ArrayAmbDadesDelInput.get(x);
        String aux2= aux.substring(0,(aux.length()/2));
        String aux3= aux.substring((aux.length()/2), aux.length());
        primeraMitad.add(x,aux2);
        segundaMitad.add(x,aux3);
    }
    for(int i =0; i<ArrayAmbDadesDelInput.size(); i++){//pa totes les paraules de la llista...
        String palabraPivote = ArrayAmbDadesDelInput.get(i);
        String primeraMitadDelPivote = primeraMitad.get(i);
        String segundaMitadDelPivote = segundaMitad.get(i);
        boolean found = false;

        for(int x=0;x<palabraPivote.length();x++){//pa totes les lletres de la paraula donada...
           String letraPivote= palabraPivote.substring(x,x+1);

           for(int y=0;y<primeraMitadDelPivote.length();y++){//pa comparar cada de primera mitad en cada de segona mitad...
            if(segundaMitadDelPivote.substring(y,y+1).equals(letraPivote) && found == false){
                matches.add(segundaMitadDelPivote.substring(y,y+1));
                found = true;
                }
           }
        }
    }
    //System.out.println(matches);
    //System.out.println(matches.size());
    //System.out.println(ArrayAmbDadesDelInput.size());
    
   for(int z = 0; z<matches.size(); z++){
    int v = (matches.get(z).charAt(0) - 'a' + 1);
    //System.out.println(v+ " " + matches.get(z));
    if(v<0){
        //v = v + ;
        char capsCase = matches.get(z).charAt(0);
        capsCase = Character.toLowerCase(capsCase);
        v = capsCase - 'a'+ 1 + 26;
    }
    //System.out.println(v+ " " + matches.get(z));
    totalSum+=v;
    }
    System.out.println("La suma total es "+totalSum); // HURRAAA

    ////////////////////PARTE 2/////////////////////////////////

    for(int i =0; i<ArrayAmbDadesDelInput.size(); i=i+3){//pa totes les paraules de la llista...
        String palabraPivote = ArrayAmbDadesDelInput.get(i);
        String palabraPivote2 = ArrayAmbDadesDelInput.get(i+1);
        String palabraPivote3 = ArrayAmbDadesDelInput.get(i+2);
        boolean found = false;

        for(int x=0;x<palabraPivote.length();x++){//pa totes les lletres de la paraula donada...
           String letraPivote= palabraPivote.substring(x,x+1);
        

           for(int y=0;y<palabraPivote2.length();y++){//pa comparar cada de primera mitad en cada de segona mitad...
            if(palabraPivote2.substring(y,y+1).equals(letraPivote) && found == false){

                for(int z =0;z<palabraPivote3.length();z++){
                    if(palabraPivote3.substring(z, z+1).equals(letraPivote) && found == false){
                        group3matches.add(letraPivote);
                        found = true;
                    }
                }
                }
           }
                             
                }
        }
        //System.out.println(group3matches);

        totalSum=0;
        for(int z = 0; z<group3matches.size(); z++){
            int v = (group3matches.get(z).charAt(0) - 'a' + 1);
            //System.out.println(v+ " " + matches.get(z));
            if(v<0){
                //v = v + ;
                char capsCase = group3matches.get(z).charAt(0);
                capsCase = Character.toLowerCase(capsCase);
                v = capsCase - 'a'+ 1 + 26;
            }
            //System.out.println(v+ " " + matches.get(z));
            totalSum+=v;
            }
            System.out.println("La suma total de grupos de 3 es "+totalSum); // WEEEEEEEEEEEEEE

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

 /*

    for(int y=0;y<ArrayAmbDadesDelInput.size();y++){
        if(primeraJugada.get(y).equals("A") && segundaJugada.get(y).equals("X")){
            //globalResult += 1+3;
            globalResult += 3+0;
        }
        else if(primeraJugada.get(y).equals("A") && segundaJugada.get(y).equals("Y")){
            //globalResult+= 2+6;
            globalResult += 1+3;
        }
        else if(primeraJugada.get(y).equals("A") && segundaJugada.get(y).equals("Z")){
            //globalResult+= 3+0;
            globalResult += 2+6;
        }
        else if(primeraJugada.get(y).equals("B") && segundaJugada.get(y).equals("X")){
            //globalResult+= 1+0;
            globalResult += 1+0;
        }
        else if(primeraJugada.get(y).equals("B") && segundaJugada.get(y).equals("Y")){
            //globalResult+= 2+3;
            globalResult += 2+3;
        }
        else if(primeraJugada.get(y).equals("B") && segundaJugada.get(y).equals("Z")){
            //globalResult+= 3+6;
            globalResult += 3+6;
        }
        else if(primeraJugada.get(y).equals("C") && segundaJugada.get(y).equals("X")){
            //globalResult+= 1+6;
            globalResult += 2+0;
        }
        else if(primeraJugada.get(y).equals("C") && segundaJugada.get(y).equals("Y")){
            //globalResult+= 2+0;
            globalResult += 3+3;
        }
        else if(primeraJugada.get(y).equals("C") && segundaJugada.get(y).equals("Z")){
            //globalResult+= 3+3;
            globalResult += 1+6;
        }

    }
    System.out.println("Has obtenido " + globalResult + " puntos");
    
    int suma = 0;
    for(int i = 0; i< ArrayAmbDadesDelInput.size();i++){
        if(ArrayAmbDadesDelInput.get(i) != ""){
            suma+= Integer.parseInt(ArrayAmbDadesDelInput.get(i));
        }else{
            SumesDeNumeros.add(suma);
            System.out.println(suma);
            suma = 0;
        }
    }
    int highCount = 0;
    int small;
    for(int i = 0; i < SumesDeNumeros.size()-1;i++){
        small = i;
        for(int j = 0; j< SumesDeNumeros.size();j++){
            if(SumesDeNumeros.get(j)< SumesDeNumeros.get(small)){
                small = j;
                int temp = SumesDeNumeros.get(i);
                SumesDeNumeros.set(i,SumesDeNumeros.get(small));
                SumesDeNumeros.set(small, temp);
            }
        }
    }
    highCount = SumesDeNumeros.get(0);
    System.out.println("El número més gran es: " + highCount);
    highCount = SumesDeNumeros.get(0) + SumesDeNumeros.get(1) + SumesDeNumeros.get(2);
    System.out.println("La suma dels tres millors ha sigut: " + highCount);
*/
    } catch(FileNotFoundException e){
    System.out.println("Un error ha ocorregut");
    e.printStackTrace();
    }


}
}