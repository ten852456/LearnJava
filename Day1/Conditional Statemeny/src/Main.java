public class Main {
    public static boolean testScore(int interviewScore,int englishScore){
        boolean isOK;
        if (interviewScore > 70 || englishScore > 50) isOK = true;
        else isOK = false ;
        return isOK;
    }
    public static void main(String[] args) {
	// write your code here
//        int score = 50;
//        if (score >=50){
//            System.out.println("PASS");
//        }
//        else System.out.println("WRONG");
        System.out.println(testScore(75,40));
        System.out.println(testScore(75,60));
    }
}
