import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class dia2complet {
    public static void main(String[] args) {

ArrayList<String> ArrayAmbDadesDelInput = new ArrayList<String>();
ArrayList<String> primeraJugada = new ArrayList<String>();
ArrayList<String> segundaJugada = new ArrayList<String>();
int globalResult = 0;

try{
    File input = new File("C:\\Users\\Ivan\\Desktop\\Asignatures 3r carrera\\UUActivitatsICredits\\AdventOfCode\\dia2\\inputdia2.txt");
    Scanner fileScanner = new Scanner(input);

    while(fileScanner.hasNextLine()) {
        ArrayAmbDadesDelInput.add(fileScanner.nextLine());
    }

    for(int x=0;x<ArrayAmbDadesDelInput.size();x++){
        String aux = ArrayAmbDadesDelInput.get(x);
        String aux2= aux.substring(0,1);
        String aux3= aux.substring(2, 3);
        primeraJugada.add(x,aux2);
        segundaJugada.add(x,aux3);
    }
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
    















/*
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