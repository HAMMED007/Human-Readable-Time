

public class Main {
    public static void main(String[] args) {


        System.out.println(HumanReadableTime.makeReadable(359999));



    }
    public class HumanReadableTime{
        public static String makeReadable(int seconds){
            int min = 0 ;
            int hour = 0 ;
            int secs = 0;




            for (int i = 0; i <= seconds; i++) {

                if (i==60){
                    seconds = seconds - i ;
                    i = 0;

                    min++;


                }
                secs = i ;

                if(min == 60){
                    hour++;
                    min = 0;
                }





            }


            return String.format("%02d:%02d:%02d",hour,min,secs);
        }




    }
}