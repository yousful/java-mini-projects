public class LottertTicket {
    public static void main(String [] args){

        //2Dimentinal Array method 1.
        int lotteryCard[][] = {{20, 23, 30},
                                {15, 25, 45},
                                {23, 34, 56}
    };
    //2Dimentional array method 2
    int [][] lotteryCard2 = new int [3][3];
    lotteryCard2[0][0] = 20;
    lotteryCard2[0][1] = 23;
    lotteryCard2[0][2] = 15;
    lotteryCard2[1][0] = 25;
    lotteryCard2[1][1] = 45;
    lotteryCard2[1][2] = 67;
    lotteryCard2[2][0] = 23;
    lotteryCard2[2][1] = 30;
    lotteryCard2[2][2] = 56;

    //[row] and [column]

    System.out.println(lotteryCard[0][0]);
    System.out.println("---------------");

    int i = 3;
    int j = 3;
    for(i = 0; i < 3; i++){
        System.out.println(lotteryCard[i][i]);
    }
    System.out.println("--------------");

    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++){
            System.out.println(lotteryCard[i][j]);
        }
    }
    System.out.println("-------------");
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++){
            System.out.println(lotteryCard2[i][j]);
        }
    }
    
    
    }
}
