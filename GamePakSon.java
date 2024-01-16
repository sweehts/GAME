
package game.pak.son;


public class GamePakSon {

    
    public static void main(String[] args) {
      //buat objek                     
        Player hero = new Player();
        Player enemy = new Player();
        hero.name = "kiming";
        hero.speed = 60;
        hero.damage = 68;
        hero.armor = 67;
        hero.healthPoin = 0;
        
        enemy.name = "hannie";
        enemy.speed = 20;
        enemy.damage = 10;
        enemy.armor = 5;
        enemy.healthPoin = 90;
        
        hero.run();
        hero.attack(enemy.name);
        hero.defence();
        
        
        if(hero.isDead()){
            System.out.println("Game Over:(");
        }
        Drone moon = new Drone();
        moon.energi = 50;
        moon.ketinggian = 80;
        moon.kecepatan = 110;
        moon.merek = "pi cheolin";
        
        moon.terbang();
        moon.turun();
        moon.matikanMesin();
        moon.belok();
        moon.maju();
        moon.mundur();
        
        motor josh = new motor();
        josh.kecepatan = 30;
        josh.energi = 90;
        josh.merek = "sunday morning";
        josh.warna = "hitam";
        
        josh.maju();
        josh.matiMesin();
        josh.mundur();
        josh.belok();
    }
    
    
}
        
          
        
    
    
  
   
    
    

