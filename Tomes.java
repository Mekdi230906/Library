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

    public Boolean borrowed(String src){
        isBorrowed = True;
        return isBorrowed;
    }

    public String borrowedby(String name){
        borrowedBy = name;
        return borrowedBy;
    }

    public void printTomes(){
        System.out.println(vcnNumber + " " + title + " " + author);
    }
    
}
