package zoo;

public class Aviary {
    private int length;
    private int width;
    private int height;
    private String Location;
    private String type;
    private String birdsType;

//    constructor


    public Aviary(int length, int width, int height, String location, String type, String birdsType) {
        this.length = length;
        this.width = width;
        this.height = height;
        Location = location;
        this.type = type;
        this.birdsType = birdsType;
    }

    //    getters
public int getLength() {
    return length;
}

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getLocation() {
        return Location;
    }

    public String getType() {
        return type;
    }

    public String getBirdsType() {
        return birdsType;
    }

//    setters

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBirdsType(String birdsType) {
        this.birdsType = birdsType;
    }

    public void demoAviary(){
        System.out.println("Length: "+this.getLength());
        System.out.println("Width: "+this.getWidth());
        System.out.println("Height: "+this.getHeight());
        System.out.println("For Birds: "+this.getBirdsType());
        System.out.println("Aviary Type: "+this.getType());
    }
    public int aviarySize(){
        return this.getHeight()+this.getHeight()+this.getLength();
    }
}
