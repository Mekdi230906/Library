package Library;

public class Tomes {
    private String vcnNumber;
    private String title;
    private String author;
    private Boolean isBorrowed = false;
    private String borrowedBy;

    public Tomes(String slingId, String addName, String sanctum){
            this.vcnNumber = slingId;
            this.title = addName;
            this.author = sanctum;
            //throw exception if there is already book with a same vcn
    }

    public String getVcnNumber(){
        return vcnNumber;
    }


    public String getTitle(){
        return title;
    }


    public String getAuthor(){
        return author;
    }

    public Boolean borrowed(){
        return isBorrowed;
    }

    public String borrowedby(String name){
        borrowedBy = name;
        return borrowedBy;
    }
    
}
