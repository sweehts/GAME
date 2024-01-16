
package game.pak.son;


public class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang(){
        energi--;
        if (energi > 10){
            ketinggian++;
            System.out.println("Drone terbang...");
        } else{
            System.out.println("Energi lemah: Drone nggak bisa terbang");
        }
    }
    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else{
            System.out.println("Mesin dimatikan...");
        }
    }
    void turun(){
        ketinggian = 0;
        energi--;
        System.out.println("Drone turun");
    }
    void belok(){
        energi--;
        System.out.println("Drone belok");
    }
    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }
    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
