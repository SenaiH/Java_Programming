package day_08_ternary_and_switch;

public class Elevator_WarmUpTask1 {
    public static void main(String[] args) {
        int floorNumber = 0;
        String result = "";
     if(floorNumber>=1&&floorNumber<=3){
         if(floorNumber==1){
             result = " Floor 1 selected.Companies:Lobby,Verizon,Starbucks";
         }else if(floorNumber==2){
             result = "Floor 2 selected.Companies: Cybertek,NASA,Intelsat";
         }else{
             result = "Floor 3 selected.Companies: Lyft,Bofa,Stake house";
         }
     }else{
         result = "Invalid floor";
     }
        System.out.println(result);

        System.out.println("----------------------------------------------------------");

        String result1 = "Invalid Result";


        if(floorNumber>=1&&floorNumber<=3) {
            result1 = "Floor " + floorNumber + " is selected. Companies: ";
            if (floorNumber == 1) {
                result1 += "Lobby,Verizon,Starbucks";
            } else if (floorNumber == 2) {
                result1 += "Cydeo,NASA,Starbucks";
            } else {
                result1 += "Lyft,Bofa,Stake house";
            }
        }
        System.out.println(result1);


        }

}
