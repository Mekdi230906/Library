package Library;

import java.util.ArrayList;
import java.util.List;

public class MainSystemLibrary {
    public ArraylList<Sorecerer> sorcerer = new ArrayList<>();
    public ArrayList<Tomes> tomes = new ArrayList<>();

    public void registerSorcerer(String sling_id, String name, String sanctum)
    {
        for(int i = 0; i < sorcerer.size(); i++){
            if(sling_id.equals(sorcerer.get(i).getId())){
                System.out.println("Sling ID existed!");
            }
            else{
                sorcerer.add(new Sorcerer(sling_id, name, sanctum));
            }
        }
        
    }


    public void registerTomes(String vcn, String title, String author_name)
    {
        for(int i = 0; i < tomes.size(); i++){
            if(vcn.equals(tomes.get(i).getVcnNumber())){
                System.out.println("A tome is already exist!");
            }
            else{
                tomes.add(new Sorcerer(vcn, title, author_name));
            }
        }
        
    }

    public void printTomes(){
        for(int i = 0; i < tomes.size(); i++){
            tomes.get(i).printTomes();
        }
    }

    public String searchTomes throws Exception(String vcn){
        for(int i = 0; i < tomes.size(); i++){
            if(vcn.equals(tomes.get(i).getVcnNumber())){
                return tomes.get(i).getVcnNumber();
            }
            else throws new Exception(){
                System.out.println("Tome is not found.");
            }
        }
    }

    public Boolean lendATome(String vcn){
        Tomes src = searchTomes(vcn);
        //not done, still thinking about it
    }


}

