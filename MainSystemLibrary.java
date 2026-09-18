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

    public Tomes searchTomes (String  vcn) throws Exception{
        for(int i = 0; i < tomes.size(); i++){
            if(vcn.equals(tomes.get(i).getVcnNumber())){
                return tomes.get(i);
            }
        }
        throw new Exception("Not Found");
    }

    public Sorcerer searchSorcerer(String input) throws Exception{
        for(int i = 0; i < sorcerer.size(); i++){
            if(input.equals(sorcerer.get(i).getId())){
                return sorcerer.get(i);
            }
        }
        throw new Exception("Not Found");
    }


    //--------------------------------- 5
    public Boolean checkIfBorrowed(Tomes tome){
        return tome.borrowed(tome);
    }
    // Commment:
    // I can use void instead of Boolean in here,
    public Boolean lendATome(String vcn, String id) throws Exception{
        Tomes src = searchTomes(vcn);
        Sorcerer src2 = searchSorcerer(id);
        if(src == null){
            throw new Exception("Tome is not found.");
        }
        if(src2 == null){
            throw new Exception("ID is not found.");
        }
        if(src.borrowed(src)){
            System.out.println("This tome is unavailable!");
            return null;
        }

        src.borrowedby(src2);
        return true;
    }

    //---------------------------------- 6
    public void retrunTome(String id, String vcn) throws Exception{
        Tomes src = searchTomes(vcn);
        Sorcerer src2 = searchSorcerer(id);
        Boolean checking = checkIfBorrowed(src);
        if(src == null){
            throw new Exception("Tome is not found.");
        }
        else if(src2 == null){
            throw new Exception("ID is not found.");
        }
        else if(checking == false){
            throw new Exception("Tome is not rented.");
        }
        else{
            src.returnTome(src);
            System.out.println("Tome returned successfully!");
        }
    }

    //---------------------------------- 7
    public void whichBooksBorrowed(Tomes tome){
        System.out.println("Unavailable books: \n");
        for(int i = 0; i < tomes.size(); i++){
            if(checkIfBorrowed(tomes.get(i)) == true){
                System.out.println(tomes.get(i));
            }
        }
    }
}
