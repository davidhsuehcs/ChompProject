import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {

    ArrayList<Board> losingBoard = new ArrayList<>();

    public static void main(String[] args) {

        Board board = new Board(3,2,2);

        g3();

        System.out.println(board.boardDim[2]);

//        seePossibleMoves(2,0, 0);
//        seePossibleMoves(2,1, 1);
//        seePossibleMoves(3, 0, 0);
//        seePossibleMoves(2,2,2);
//        seePossibleMoves(3, 2, 2);



       // System.out.println(isLost(1,0,0));
       // System.out.println(isLost(3,2,2));


    }




    public static void g3(){
        for (int r = 1; r < 4; r++){
            for (int e = 0; e < 4; e++){
                for(int g = 0; g < 4; g++) {

                    if(g <= e && e <= r){

                        int[] board = new int[3];
                        board[0] = r;
                        board[1] = e;
                        board[2] = g;

                        System.out.println("(" +  board[0]+ "-" + board[1] + "-" + board[2] + ")");

                        //seePossibleMoves(r, e, g);

                    }

                }
            }
        }
    }

    public static void seePossibleMoves(int x, int y, int z){
        if (x == 1 && y == 0){

            System.out.println("No Possible Moves. Game Over");
            System.out.println("      ");

        } else {

            System.out.println("Possible boards are: ");
            if (x > 0){
                for (int w = 1; w < x; w++) {
                    int holderx = x;
                    holderx = holderx - w;
                    if (y >= holderx){
                        int affy = holderx;
                        int affz = holderx;
                        System.out.println("(" + holderx + "-" + affy + "-" + affz + ")");

                    } else {
                        System.out.println("(" + holderx + "-" + y + "-" + z + ")");
                    }

                }

                if (y > 0) {

                    if (z > 0) {
                        for (int e = 1; e <= z; e++) {
                            int holderz = z;
                            holderz = holderz - e;
                            System.out.println("(" + x + "-" + y + "-" + holderz + ")");
                        }
                    }
                    for (int e = 1; e <= y; e++) {
                        int holdery = y;
                        holdery = holdery - e;
                        z = holdery;
                        System.out.println("(" + x + "-" + holdery + "-" + z + ")");
                    }
                }


            }
            }
            System.out.println("   ");
        }






    public static boolean isLost (int g, int h, int i){
        if (g == 1 && h == 0){
            return true;
        } else {
            return false;
        }
    }


}
//    public static void generateBoard(int maxDimensionX, int maxDimensionY) {
//
//
//        for (int r = 0; r < maxDimensionX; r++) {
//
//            int[] board = new int[maxDimensionX];
//            for(int e = maxDimensionX; e > 0; e--) {
//
//                for (int o = maxDimensionY; o > 0; o--) {
//                    board[r] = e;
//
//
//                }
//            }
//
//
//        }
//
//
//
//    }

//        public static void generateBoard(int maxDimensionX, int maxDimensionY){
//            String finalOutput = "(";
//            for (int uu = 0; uu < maxDimensionX; uu++) {
//
//                if (uu < maxDimensionX - 1) {
//                    finalOutput += board[uu] + "-";
//                } else {
//                    finalOutput += board[uu];
//                }
//            }
//            finalOutput += ")";
//
//            System.out.println(finalOutput);
//        }

