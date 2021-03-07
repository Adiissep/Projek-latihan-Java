package fungsi_array;
/**
 *
 * @author ADVANG4C
 */
public class Tugas2_array_HotelAmaris {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String [][] ruangan ={
          {"1","2","3","4","X"},
          {"1","2","3","4","5"},
          {"1","2","3","4","5"},
          {"1","2","3","X","5"}
      };
      int kamarkosong =0;
      for (int i = 0; i < ruangan.length; i++) {
          for (int j = 0; j < ruangan[i].length; j++) {
              if (ruangan[i][j]=="X") {
                  System.out.println("Tamu berada dilantai : "+(i+1)+" Kamar "+(j+1));
              }else{
                  kamarkosong += 1;
              }
          }
      }System.out.println("Kamar yang tersedia ada = "+kamarkosong);
    }
    
}
