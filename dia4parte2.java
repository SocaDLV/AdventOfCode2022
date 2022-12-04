import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class dia4parte2 {
    private static int comprobar(String x, String y){
        int OneLow,OneHigh,TwoLow,TwoHigh;
        String[] partirX, partirY;
        partirX = x.split("-");
        partirY = y.split("-");
        OneLow = Integer.parseInt(partirX[0]);
        OneHigh = Integer.parseInt(partirX[1]);
        TwoLow = Integer.parseInt(partirY[0]);
        TwoHigh = Integer.parseInt(partirY[1]);

        if (((OneLow <= TwoLow) && (TwoLow <= OneHigh)) || ((TwoLow <= OneLow) && (OneLow <= TwoHigh))){
            return 1;
        }
        else{
            return 0;
        }  
    }

    public static void main(String[] args) throws IOException{
        File input = new File("C:\\Users\\Ivan\\Desktop\\Asignatures 3r carrera\\UUActivitatsICredits\\AdventOfCode\\dia4\\inputdia4.txt");
        BufferedReader inputBuffer = new BufferedReader(new FileReader(input));
        String cadena, x, y;
        ArrayList<String> assignmentList = new ArrayList<>();
        String[] split;

        while ((cadena = inputBuffer.readLine()) != null){
            assignmentList.add(cadena);
        }
        inputBuffer.close();
        int pares = 0;
        for (String i: assignmentList){
            split = i.split(",");
            x = split[0];
            y = split[1];
            pares = pares + comprobar(x,y);
        }
        System.out.println(pairs);
    }
}