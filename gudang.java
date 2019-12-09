
package ukl;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class gudang {
 
    public void uhuy(){
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    int choice;
    boolean run = true;
    int NA;
 
    String nama [] = new String[6];
    int nilai [] = new int[5];
    try{
        while(run){
                for(int i = 0;i < nama.length; i++){
                System.out.println("-----=============-----");
                System.out.print("nama siswa : ");
                nama[0]=input2.nextLine();
                
                System.out.println("=========================================");
                System.out.println("===========I N P U T  N I L A I==========");
                System.out.print("\nNilai Harian 1 : ");
                nilai[0] = input.nextInt();
                System.out.print("\nNilai Harian 2 : ");
                nilai[1] = input.nextInt();
                System.out.print("\nNilai ulangan  : ");
                nilai[2] = input.nextInt();
                System.out.print("\nNilai UTS      : ");
                nilai[3] = input.nextInt();
                System.out.print("\nNilai UAS      : ");
                nilai[4] = input.nextInt();
                NA = (nilai[0]+nilai[1]+nilai[2]+nilai[3]+nilai[4])/5; 
                
               System.out.println("==========================");
               System.out.println("----<<<OUTPUT LAST>>>----");
               System.out.println("\nNama Siswa      : "+nama[0]);
               System.out.println("\nNilai H1        : "+nilai[0]);
               System.out.println("\nNilai H2        : "+nilai[1]);
               System.out.println("\nNilai ulangan   : "+nilai[2]);
               System.out.println("\nNilai UTS       : "+nilai[3]);
               System.out.println("\nNilai UAS       : "+nilai[4]);
               System.out.println("\nRata-Rata       : "+NA);
               if(NA>= 0 && NA<50)
                        System.out.println("PREDIKATMU = E");
               if(NA>=50 && NA<75)
                        System.out.println("PREDIKATMU = D ");
               if(NA>=75 && NA<82)
                        System.out.println("PREDIKATMU = C");
               if(NA>=82 && NA<94)
                        System.out.println("PREDIKATMU = B");
               if(NA>=94 && NA<=100)
                        System.out.println("PREDIKATMU = A");
                    }
        System.out.println("Apakah anda ingin melakukan rekap lagi? \n1.YA \n2.Tidak");
        choice = input.nextInt();
        if (choice == 2)
            run = false;
        }
           
    }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
    }
        
    }
    
}
