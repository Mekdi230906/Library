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

    public Boolean addSorcerer(String id, String name, String home){
        for(int i = 0; i < sorcerer.size(); i++){
            if(sorcerer.get(i).getId().toLowerCase().equals(id.toLowerCase())){
                return false;
            }
        }
        sorcerer.add(new Sorcerer(id, name, home));
        return true;
    }

    //---------------------------------- 2

    public Boolean addTome(String vcn, String name, String author_name){
        for(int i = 0; i < tomes.size(); i++){
            if(tomes.get(i).getVcnNumber().toLowerCase().equals(vcn.toLowerCase())){
                return false;
            }
        }
        tomes.add(new Tomes(vcn, name, author_name));
        return true;
    }

    //--------------------------------- 3

    public void printTomes(){
        for(int i = 0; i < tomes.size(); i++){
            System.out.println(tomes.get(i).printTomes());
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

    public void printSearchTomes(String vcn) throws Exception {
        Tomes toString = searchTomes(vcn);
        System.out.println(toString.printTomes());
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
    public Boolean checkIfBorrowed(String tome_input) throws Exception{
        Tomes src = searchTomes(tome_input);
        return src.borrowed();
    }
    // Commment:
    // I can use void instead of Boolean in here,
    public Boolean lendATome(String vcn, String id) throws Exception{
        Tomes src = searchTomes(vcn);
        Sorcerer src2 = searchSorcerer(id);
        Boolean checking = checkIfBorrowed(vcn);
        if(src == null){
            throw new Exception("Tome is not found.");
        }
        if(src2 == null){
            throw new Exception("ID is not found.");
        }
        if(checking == true){
            System.out.println("This tome is unavailable!");
            return null;
        }

        src.borrowedby(src2);
        System.out.println("Success!");
        return true;
    }

    //---------------------------------- 6
    public void returnTome( String vcn) throws Exception{
        Tomes src = searchTomes(vcn);
        //Sorcerer src2 = searchSorcerer(id);
        Boolean checking = checkIfBorrowed(vcn);
        if(src == null){
            throw new Exception("Tome is not found.");
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
    public void whichBooksBorrowed(){
        System.out.println("Unavailable books: \n");
        String check;
        /* 
        for(int i = 0; i < tomes.size(); i++){
            check = tomes.get(i).getVcnNumber();
            if(checkIfBorrowed(tomes.get(i)) == true){
                System.out.println(tomes.get(i));
            }
        }*/
        for(int i = 0; i < tomes.size(); i++){
            if(tomes.get(i).borrowed()){
                System.out.println(tomes.get(i).printTomes());
            }
        }
    }
}
