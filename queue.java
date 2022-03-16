package TugasQueue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        int menu;
        String masukan;
        Scanner input =new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        Queue<String> name= new LinkedList<>();
        
        System.out.println("\n\t\t====================================================================");
        System.out.println("\t\t\t\t\t    PROGRAM QUEUE");
        System.out.println("\t\t====================================================================");
        
        do{
            System.out.println("\n\t|PILIH MENU|  ");
            System.out.println("\t1. Enqueue");
            System.out.println("\t2. Dequeue");
            System.out.println("\t3. Cek Queue");
            System.out.println("\t4. Tutup");
            System.out.println("\t________________________________");
            System.out.print("\tPilihan Anda : ");
            menu=input.nextInt();
            if(menu==1){
                System.out.println("\t==============================");
                System.out.print("\tMasukan Nama Pengantri     : ");
                masukan = str.nextLine();
                name.add(masukan);
                System.out.print("\n\n");

            }else if(menu==2){
                if(name.isEmpty()){
                    System.out.println("\tANTRIAN SUDAH KOSONG!!");
                }else{
                System.out.println("\tAntrian : "+name.poll()+", Dikeluarkan");
                }
                System.out.print("\n\n");
            }else if(menu==3){
                if(name.isEmpty()){
                    System.out.println("\tTIdak Ada Yang Sedang Mengantri!!");
                }else{
                    System.out.print("\n\n");
                    System.out.println("\t==============================");
                    System.out.println("\t         DATA ANTRIAN");
                    System.out.println("\t==============================");
                    System.out.println("\t|| "+name+"||");
                    System.out.println("\t==============================");
                    System.out.println("\t|| ANTRIAN PERTAMA  : "+name.peek());
                    System.out.println("\t|| TOTAL PENGANTRI    : "+name.size());
                    System.out.print("\n\n");
                }
            }else if(menu==4){
                System.out.println("\n\t\t\t\t**** Terima Kasih ****");
            }else{
                System.out.println("\n\t\t\t\tTidak tersedia!!");
            }
        }while(menu!=4);
    }
    
}
