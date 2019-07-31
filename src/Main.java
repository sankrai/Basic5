public class Main {
    public static boolean testscore (int interviewScore,int englishScore){
        boolean isok;
        if (interviewScore>70||englishScore>50){
            isok=true;
        }else{
            isok = false;
        }
        return  isok;
    }

    public static void main(String[] args) {
        System.out.println(testscore(75,40));
        System.out.println(testscore(75,60));


    }
}
