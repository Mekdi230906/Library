package Library;

import java.util.ArrayList;

public class MainSystemLibrary {
    public ArrayList<Sorcerer> sorcerer;
    public ArrayList<Tomes> tomes;

    public MainSystemLibrary(){
        sorcerer = new ArrayList<>();
        tomes = new ArrayList<>();
    }

    //--------------------------------- 1 

    public Boolean addSorcerer(Sorcerer sorcerer_input){
        for(int i = 0; i < sorcerer.size(); i++){
            if(sorcerer.get(i).getId().toLowerCase().equals(sorcerer_input.getId().toLowerCase())){
                return false;
            }
        }
        sorcerer.add(sorcerer_input);
        return true;
    }

    //---------------------------------- 2

    public Boolean addTome(Tomes tome_input){
        for(int i = 0; i < tomes.size(); i++){
            if(tomes.get(i).getVcnNumber().toLowerCase().equals(tome_input.getVcnNumber().toLowerCase())){
                return false;
            }
        }
        tomes.add(tome_input);
        return true;
    }

    //--------------------------------- 3

    public void printTomes(){
        for(int i = 0; i < tomes.size(); i++){
            tomes.get(i).printTomes();
        }
    }

    //---------------------------------- 4 & 4+

    public String searchTomes (String vcn) throws Exception{
        for(int i = 0; i < tomes.size(); i++){
            if(vcn.equals(tomes.get(i).getVcnNumber())){
                return tomes.get(i).getVcnNumber();
            }
        }
        throw new Exception("Not Found");
    }

    public String searchSorcerer(String input) throws Exception{
        for(int i = 0; i < sorcerer.size(); i++){
            if(input.equals(sorcerer.get(i).getId())){
                return sorcerer.get(i).getId();
            }
        }
        throw new Exception("Not Found");
    }


    //--------------------------------- 5

    public Boolean lendATome(String vcn, String id) throws Exception{
        String src = searchTomes(vcn);
        String src2 = searchSorcerer(id);
        if(src == null){
            throw new Exception("Tome is not found.");
            if(src2 == null){
                throw new Exception("Sorcerer is not found.");
            }
        }
        else{
           tomes.getVcnNumber();
        }

        
        if(src2 == null){
            throw new Exception("Tome is not found.");
        }
        else{
           
        }

    }

    //---------------------------------- 6



}

