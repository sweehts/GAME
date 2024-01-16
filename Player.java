
package game.pak.son;


public class Player {
String name;
int speed;
int damage;
int armor;
int healthPoin;
int skin;

void run(){
    System.out.println(name +" is running...");
    System.out.println("Speed: "+ speed);
}
boolean isDead(){
    if(healthPoin <= 0) return true;
    return false;
}
void attack(String enemy){
    System.out.println(name + " is attacking "+ enemy);
    System.out.println("Damage: "+ damage);
}
void defence(){
    System.out.println(name + " is defend");
    System.out.println("Armor: "+ armor);
}

}
