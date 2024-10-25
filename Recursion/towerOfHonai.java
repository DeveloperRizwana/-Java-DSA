public class towerOfHonai {
    static void printTowerOfHonai(int n, char source, char auxiliary, char destination){
        if(n == 0) return;

        if(n == 1){
            System.out.println(source + "" + destination);
            return;
        }

        printTowerOfHonai(n-1, source, destination, auxiliary);
        System.out.println(source + "" + destination);
        printTowerOfHonai(n-1, auxiliary, source, destination);
    }
      public static void main(String[] args) {
        System.out.println("Tower of hanoi: ");
        int n = 1;
        printTowerOfHonai(n, 'a', 'b', 'c');
    }
    
}
