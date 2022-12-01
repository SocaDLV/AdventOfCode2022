import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class dia1complet {
    public static void main(String[] args) {

ArrayList<Integer> SumesDeNumeros = new ArrayList<Integer>();
ArrayList<String> ArrayAmbDadesDelInput = new ArrayList<String>();
try{
    File input = new File("C:\\Users\\Ivan\\Desktop\\Asignatures 3r carrera\\UUActivitatsICredits\\AdventOfCode\\dia1\\inputplata.txt");
    Scanner fileScanner = new Scanner(input);

    while(fileScanner.hasNextLine()) {
        ArrayAmbDadesDelInput.add(fileScanner.nextLine());
    }
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

    } catch(FileNotFoundException e){
    System.out.println("Un error ha ocorregut");
    e.printStackTrace();
    }
}
}