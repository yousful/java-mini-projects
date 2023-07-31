public class MaizeRunner{

    public static void main(String [] args){
        
        int maizCount = 0;
        boolean maizCrossed = true;
        boolean maizUncrossed = false;
        boolean allMaizCrossed = false;
    
        if(maizCrossed){
            System.out.println("you crossed the first maiz");
            maizCount = maizCount + 1;
        }
        if(maizCrossed){
            System.out.println("you crossed the second maiz");
            maizCount = maizCount + 1;
        }
        if(maizUncrossed){
            System.out.println("you crossed the third maiz");
            maizCount = maizCount + 1;
        }
        if(maizUncrossed){
            System.out.println("you successfully cross all maiz");
            maizCount = maizCount + 1;
        }

        if(maizCount == 4){
            allMaizCrossed = true;
        }

        if(allMaizCrossed){
            System.out.println("Congratulation!!! you are a great maiz runner");
        }
    }
 
}
