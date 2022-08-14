import java.io.*;
import java.util.*;
public class simple {
    public static void main(String[] args) {
        Player1 p1 = new Player1("mani", "sword", 100);
        p1.damageByGun1();
        p1.damageByGun1();
        p1.damageByGun2();
        Player2 p2 =new Player2("B", "katana", 400, true);
        p2.damageByGun1();
        p2.damageByGun2();
        p2.damageByGun1();
        p2.damageByGun1();
    }
}
class Player2{
    private String name;
    private String weapon;
    private int health;
    private boolean armour;
    public Player2(String name,String weapon,int health,boolean armour){
      this.name = name;
      this.weapon = weapon;
      if(health > 100 || health < 0){
        health = 100;
      }
      this.health = health;
      this.armour = armour;
    }
    public void damageByGun1(){
        if(armour){
            this.health -= 20;
            if(this.health <= 0){
                this.health = 0;
            }
            System.out.println("Got hit by Gun1. Health is reduced by 20 "+" new Health is "+this.health);
        }
        else{
        this.health -= 30;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Gun1. Health is reduced by 30 "+" new Health is "+this.health);
       }
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }
    public void damageByGun2(){
        if(armour){
            this.health -= 40;
            if(this.health <= 0){
                this.health = 0;
            }
            System.out.println("Got hit by Gun2. Health is reduced by 40 "+" new Health is "+this.health);            
        }
        else{
        this.health -= 50;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Gun2. Health is reduced by 50 "+" new Health is "+this.health);
       }
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public String getWeapon() {
        return weapon;
    }
    public boolean getArmour(){
        return this.armour;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void setArmour(boolean armour) {
        this.armour = armour;
    }
}
class Player1{
    private String name;
    private String weapon;
    private int health;
    public Player1(String name,String weapon,int health){
      this.name = name;
      this.weapon = weapon;
      if(health > 100 || health < 0){
        health = 100;
      }
      this.health = health;
    }
    public void damageByGun1(){
        this.health -= 30;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Gun1. Health is reduced by 30 "+" new Health is "+this.health);
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }
    public void damageByGun2(){
        this.health -= 50;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Gun2. Health is reduced by 50 "+" new Health is "+this.health);
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}