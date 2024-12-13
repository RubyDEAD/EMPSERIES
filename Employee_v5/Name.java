
public class Name {

    private String fName;
    private String mName;
    private String lName;

    public Name() {
    }

    public Name(String fname, String mname, String lname) {
        this.fName = fname;
        this.mName = mname;
        this.lName = lname;
    }

    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getFname() {
        return fName;
    }

    public void setFname(String fname) {
        this.fName = fname;
    }

    public String getMname() {
        return mName;
    }

    public void setMname(String mname) {
        this.mName = mname;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    public void display() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {

        if (mName != null) {
            return fName + ", " + mName.charAt(0) + ".," + lName;
        } else {
            return fName + "," + lName;
        }
    }

    public static void main(String[] args) {
        Name x = new Name("Reitz", "Laure", "Andriano");
        x.display();
        Name y = new Name();
        y.display();
    }

}