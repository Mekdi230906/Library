package Library;
import java.util.ArrayList;
import java.util.List;

public class Sorcerer {
    private String slingRingID;
    private String name;
    private ArrayList<String> homeSanctum = new ArrayList<> (List.of("kamar-taj", "new york", "tokyo", "hong kong"));
    private String sanctum;

    public Sorcerer(String slingId, String addName, String sanctum_input){
        if(homeSanctum.contains(sanctum_input)){
            this.slingRingID = slingId;
            this.name = addName;
            this.sanctum = sanctum_input;
        }
        else{
            System.out.println("Sanctum does not exist!\n");
        }

    }

    public String getId(){
        return slingRingID;
    }


    public String getName(){
        return name;
    }


    public String getSanctum(){
        return sanctum;
    }


}
