package dev.nhiph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoDataStructureHw3Application {

    private static int[] generateArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhhap so phan tu mang");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Nhap vao phan tu thu " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findSNT(int[] array){
        int snt = array[0];
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array[i]; j++){
                if((array[i]%j)!=0 &&){
                    System.out.print("SNT la " + array[i]);
                }
            }
        }
        return  snt;
    }

    public static void main(String[] args) {
        int[] result = generateArr();
        findSNT(result);
    }

}
