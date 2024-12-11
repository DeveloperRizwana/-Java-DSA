public class square {
    int side ;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4*side;
    }

    public static void main(String[] args) {
        square sq = new square();
        sq.side = 5;
        // area of square
        System.out.println("Area of square : " + sq.area());

        // permeter of square
        System.out.println("Permeter of square : " + sq.perimeter());
    }
    
}
