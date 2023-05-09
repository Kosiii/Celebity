import java.lang.reflect.Array;
import java.util.ArrayList;

public class Celebrity   {
    
            
             
            
            
          
            String gender;
            int age;
            String height;
            int weight;
            String Profession;
            String Initials;
            String haircolor;
            String skincolor;
            
            


            public Celebrity( String gender, int age, String height, int weight, String Profession,  String Initials, String haircolor, String skincolor){
                this.gender = gender
                this.age = age
                this.height = height
                this.weight = weight
                this.Profession = Profession    
                this.Initals = Initals    
                this.haircolor = haircolor    
                this.skincolor = skincolor    
                    
                    
                String [] array = {"Zion","Lebron" ,"Ja_Morant" ,"Micheal_B.Jordan" ,"Lil Uzi Vert" ,"Chris Pratt" ,"Dr.Phil", "SpongeBob","Taylor Swift","Frank_Sinatra" }; 
           
            Celebrity Lebron = new Celebrity("male", 38,"6foot8inches", 250, "Basketballplayer", "LBJ", "black", "Black");
            Celebrity Zion = new Celebrity("male", 22, "6foot6inches", 270, "Basketballplayer", "ZW", "black", "Black");
            Celebrity Ja_Morant = new Celebrity("male",23,"6foot2inches", 183, "Basketballplayer", "JM","black", "Black");
            Celebrity Micheal_B_Jordan = new Celebrity("male",35, "5foot11inches", 175, "Actor", "MJ","black", "Black");
            Celebrity Lil_Uzi_Vert = new Celebrity("male", 38, "5foot4inches", 150, "Rapper", "LUV", "Red", "Black" );
            Celebrity Chris_Pratt = new Celebrity("male", 43, "6foot2inches", 185, "Actor", "CP", "blonde", "White");
            Celebrity DrPhill = new Celebrity("male",72, "6foot3inches", 173, "Media_Personality", "DP", "grey","White");
            Celebrity Taylor_Swift = new Celebrity("Female", 33, "5foot11inches", 119, "Actor", "TS", "blonde", "White");
        }
         

}
    
    public String getGender() {
        return gender;
    }
    
    public String getAge() {
        return age;
    }
    
    public String getHeight() {
        return height;
    }
    
    public String getWeight() {
        return weight;
    }
      public String getProfession() {
        return profession;
    } 
    public String getInitals() {
        return Initals;
    } 
    public String getHaircolor() {
        return haircolor;
    }        
    public String getSkincolor() {
        return skincolor;
    } 

    }

