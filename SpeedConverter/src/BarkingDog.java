public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking ){
            if((hourOfDay<8&&hourOfDay>=0)||(hourOfDay == 23)){
                System.out.println("wake up, dog is barking");
                return true;  }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
