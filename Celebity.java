import java.lang.reflect.Array;
import java.util.ArrayList;

public class Celebity   {
    
            
             
            
            
          
            String gender;
            int age;
            String height;
            int weight;
            String Profession;
            String Initials;
            String haircolor;
            String skincolor;
            
            


            public Celebity( String gender, int age, String height, int weight, String Profession,  String Initials, String haircolor, String skincolor){
                String [] array = {"Zion","Lebron" ,"Ja_Morant" ,"Micheal_B.Jordan" ,"Lil Uzi Vert" ,"Chris Pratt" ,"Dr.Phil", "SpongeBob","Taylor Swift","Frank_Sinatra" }; 
           
            Celebity Lebron = new Celebity(gender("male"), age(38), height("6foot8inches"), weight(250), Profession("Basketballplayer"), Initials("LBJ"), haircolor("black"), skincolor("Black") );
            Celebity Zion = new Celebity(gender("male"), age(22), height("6foot6inches"), weight(270), Profession("Basketballplayer"), Initials("ZW"), haircolor("black"), skincolor("Black") );
            Celebity Ja_Morant = new Celebity(gender("male"), age(23), height("6foot2inches"), weight(183), Profession("Basketballplayer"), Initials("JM"), haircolor("black"), skincolor("Black") );
            Celebity Micheal_B_Jordan = new Celebity(gender("male"), age(35), height("5foot11inches"), weight(175), Profession("Actor"), Initials("MJ"), haircolor("black"), skincolor("Black") );
            Celebity Lil_Uzi_Vert = new Celebity(gender("male"), age(38), height("5foot4inches"), weight(150), Profession("Rapper"), Initials("LUV"), haircolor("Red"), skincolor("Black") );
            Celebity Chris_Pratt = new Celebity(gender("male"), age(43), height("6foot2inches"), weight(185), Profession("Actor"), Initials("CP"), haircolor("blonde"), skincolor("White") );
            Celebity DrPhill = new Celebity(gender("male"), age(72), height("6foot3inches"), weight(173), Profession("Media_Personality"), Initials("DP"), haircolor("grey"), skincolor("White") );
            Celebity Taylor_Swift = new Celebity(gender("Female"), age(33), height("5foot11inches"), weight(119), Profession("Actor"), Initials("TS"), haircolor("blonde"), skincolor("White") );
        }
         


        
        private String skincolor(String string) {
                return null;
        }




        private String haircolor(String string) {
                return null;
        }




        private String Initials(String string) {
                return null;
        }




        private String Profession(String string) {
                return null;
        }




        private int weight(int i) {
                return 0;
        }




        private String height(String string) {
                return null;
        }




        private int age(int i) {
                return 0;
        }




        private String gender(String string) {
                return null;
        }
            
           

        
    }
