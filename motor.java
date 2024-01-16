
package game.pak.son;


public class motor {
    int kecepatan;
    int energi;
    String merek;
    String warna;
    
    void maju(){
        energi--;
        if(energi > 20){
            System.out.println("motor melaju...");
        }else{
            System.out.println("Energi lemah: motor tidak bisa melaju");
        }
    }
    void mundur(){
        energi--;
        System.out.println("motor mundur");
        kecepatan++;
    }
    void belok(){
        energi--;
        System.out.println("motor belok");
    }
    void matiMesin(){
        if(kecepatan > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang melaju");
        }else{
            System.out.println("mesin dimatikan");
        }
    }
    
}
