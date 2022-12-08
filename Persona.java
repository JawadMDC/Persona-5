/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author Jawad.Mohammed001
 */
import java.util.*;

public class Persona {

    public static void main(String[] args) {
       Random rando = new Random();
       Scanner scanner = new Scanner(System.in);               
       
      //Shadow Stats:
       String[] shadows = {"Jack O’Lantern","Pixie","Incubus","Mandrake","Bicorn","Agathion","Berith","Silky","Kelpie","Succubus","Andras","Eligor","Cait Sith","Angel"};
       String[] attributes = {"Crazy","Mad","Magical","Evil"};
       int healthEnemy = 90, shadowReceived = 35;
      
      //Joker Stats:
       int health = 100, jokerGiven = 40, gun = 25, instaKill = 90, instaNum = 1, potionsNum = 3, superPotionNum = 1, potionHeal = 15, superPotionHeal = 40, instaDrop = 5, potionDrop = 35, superPotionDrop = 10;   
     
       boolean game = true;
       System.out.println("\n\tTraveling to Kamoshida's Palace");

      //Start:
       GAME:
       while(game){

        //Setup:
           int shadowHP = rando.nextInt(healthEnemy);
           String shadow = shadows[rando.nextInt(shadows.length)];
           String title = attributes[rando.nextInt(attributes.length)];
           System.out.println("\n\tA " + title + " " + shadow + " has appeared!\n");

        //Menu Options:
           while(shadowHP > 0){
               System.out.println("\tJokers Health: " + health);
               System.out.println("\t" + shadow + "'s Health: " + shadowHP);
               System.out.println("\n\tWhat's your move, Joker?");
               System.out.println("\t1. Physically attack the " + title + " " + shadow);
               System.out.println("\t2. Shoot the " + title + " " + shadow);
               System.out.println("\t3. Have Ryuji attack the " + title + " " + shadow + " with his Persona");
               System.out.println("\t4. Use a Health Potion");
               System.out.println("\t5. Use a Super Health Potion");
               System.out.println("\t6. Ask Morgana for advice");
               System.out.println("\t7. Flee from the shadow");

        //Attacking:
            String input = scanner.nextLine();
               if(input.equals("1"))
               {
                   int given = rando.nextInt(jokerGiven);
                   int received = rando.nextInt(shadowReceived);
                   
                   shadowHP -= given;
                   health -= received;
                   
                   System.out.println("\t- You dealt " + given + " damage to the " + shadow);
                   System.out.println("\t- Enemy hit you back with " + received + " damage\n");
                   
                   if(health < 1)
                   {
                      System.out.println("\n\t- You're too weak!");
                      break;
                   }
               }
                 
         //Shooting:
                else if(input.equals("2"))
                {
                   int given = rando.nextInt(gun);
                   int received = rando.nextInt(shadowReceived);
                   
                   shadowHP -= given;
                   health -= received;
                   
                   System.out.println("\t- You shot the " + title + " " + shadow + " for " + given + " health");
                   System.out.println("\t- Enemy hit you back with " + received + " damage\n");
                   
                   if(health < 1)
                   {
                      System.out.println("\n\t- You're too weak!");
                      break;
                   }
               }
                  
        //Ryuji Persona:
                else if(input.equals("3"))
                {
                   if(instaNum > 0)
                   {
                    int given = instaKill;
                    shadowHP -= given;
                     
                    instaNum--;
                    
                    System.out.println("\t- Ryuji killed the " + title + " " + shadow + " for an unbeliveable amount with his mighty Persona\n");
                   }
                   else
                   {
                     System.out.println("\t- Ryuji isn't feeling it right now, pump him up so he can help you!\n");
                   }
                }
                    
         //Health Potion:
                else if(input.equals("4"))
                {
                   if(potionsNum > 0)
                   {
                      health += potionHeal;
                      potionsNum--;
                      System.out.println("\n\t- You recovered " + potionHeal + " health by driking the health potion" 
                            + "\n\t- You currently have " + health + " health remaining"
                            + "\n\t- You currently have " + potionsNum + " health potions remaining.\n");
                   }
                   else
                   {
                       System.out.println("\t- You're out of health potions! Defeat a shadow for a chance to steal a health potion!\n");
                   }
                }
                  
          //Super Health Potion:
                else if(input.equals("5"))
                {
                   if(superPotionNum > 0)
                   {
                      health += superPotionHeal;
                      superPotionNum--;
                      System.out.println("\n\t- You recovered " + superPotionHeal + " health by driking the super health potion" 
                              + "\n\t- You currently have " + health + " health remaining"
                              + "\n\t- You currently have " + superPotionNum + " health potions remaining.\n");
                   }
                   else
                   {
                       System.out.println("\t- You're out of super health potions! Defeat a shadow for a chance to steal a super health potion!\n");
                   }
                }
                  
          //Morgana:
                else if(input.equals("6"))
                {
                   System.out.println("\t- Morgana: What can I assist you with Joker?");
                   System.out.println("\n\t1. Info about Health Potions");
                   System.out.println("\t2. Info about Super Health Potions");
                   System.out.println("\t3. Info about Ryuji's Persona");
                   System.out.println("\t4. Progress so far");
                  
                   Scanner tips = new Scanner(System.in);

                   String choice = scanner.next();
                      
                      if(choice.equals("1"))
                      {
                          System.out.println("\t- You currently have " + potionsNum + " health potion(s) remaining\n\t  Each health potion can revive 15 health.\n");
                        
                      } else if(choice.equals("2")) 
                      {
                          System.out.println("\t- You currently have " + superPotionNum + " super health potion(s) remaining\n\t  Each health potion can revive 40 health.\n");
                        
                      } else if(choice.equals("3")) 
                      {
                          System.out.println("\t- Ryuji, he's your bestfriend who holds a Persona which seems to kill every shadow you encounter!\n");
                      } else if(choice.equals("4")) 
                      {
                          System.out.println("\t- I'm unsure how far you curretly are in the palace, but each shadow we take down means that were one step closer to Kamoshida's treasure!\n");
                      } 
                  }
                  
            //Flee Battle:
                else if(input.equals("7"))
           {
                   System.out.println("\t- You safely fled the battle from the " + shadow);
                   continue GAME;
               }
                  
            //Invalid Input:
                else
                {
                   System.out.println("\t- Invalid Button! Try again\n");
                }
              }
         
            //Player Dead:
               if(health < 1)
              {
                  System.out.println("\t- You'll get them next time pal, keep training in Mementos!");
               break;
           }
         
      //Enemy Defeat + Health Potion/Super Health Potion Drop + Ryuji Persona:
           System.out.println("\t- " + shadow + " was defeated! ");
           System.out.println("\t- You currently have " + health + " health left");
           if(rando.nextInt(100) < potionDrop)
           {
               potionsNum++;
               System.out.println("\n\t- You stole a health potion from the dead " + shadow);
               System.out.println("\t- You currently have " + potionsNum + " health potion(s) remaining");
           }
          if(rando.nextInt(100) < superPotionDrop)
           {
               superPotionNum++;
               System.out.println("\n\t- You stole a super health potion from the dead " + shadow);
               System.out.println("\t- You currently have " + superPotionNum + " super health potion(s) remaining");
           }
         if(rando.nextInt(100) < instaDrop)
           {
               instaDrop++;
               System.out.println("\n\t- Ryuji got pumped up by seeing you defeat " + shadow);
               System.out.println("\t- Ryuji currently has " + superPotionNum + " stock remaining for his Persona");
           }
         
      //User Input for after match:
           System.out.println("\n\tDo you wish to explore the Palace?");
           System.out.println("\t1. Continue exploring the Palace");
           System.out.println("\t2. Go back to the real world");
         
      //Invalid Input:     
           String input = scanner.nextLine();
           while(!input.equals("1") && !input.equals("2")){
               System.out.println("\t- Invalid Button! Try again");
               input=scanner.nextLine();
           }
         
      //Continue Game:
           if(input.equals("1")){
               System.out.println("\tLet's continue, hopefully we find the treasure!");
           }
             
      //Exit Game + Thank You Screen:
           else if(input.equals("2")){
               System.out.println("\tYou've safely left the Palace. Explore more when you're well rested!");
               break;
           }
       }
       System.out.println("\n\n\n\tThank you for playing, you're a great Phantom Thief!");
    }
}