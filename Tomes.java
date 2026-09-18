package Library;

public class Tomes {
    private String vcnNumber;
    private String title;
    private String author;
    private Boolean isBorrowed = false;
    private Sorcerer borrowedBy;

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

    public Sorcerer borrowedby(Sorcerer name){
        borrowedBy = name;
        isBorrowed = true;
        return borrowedBy;
    }

    public Boolean borrowed(Tomes tome){
        return isBorrowed;
    }

    public Boolean returnTome(Tomes tome){
        isBorrowed = false;
        return isBorrowed;
    }

    public String printTomes(){
        return "VCN: " + vcnNumber + ", Title:  " + title + ", Author " + author;
    }
    
}
