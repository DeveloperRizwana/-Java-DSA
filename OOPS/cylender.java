public class cylender {
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public static void main(String[] args) {
        cylender cl = new cylender();
        cl.setRadius(12);
        System.out.println("Radius of a cylender: " + cl.getRadius());

        cl.setHeight(5);
        System.out.println("Height of a cylender: " + cl.getHeight());
    }
    
    
}
