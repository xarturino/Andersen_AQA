package lesson_4;

public class Park {

    // i think, i realize this task in previous class "Payment" much better
    Park(String parkName){
        System.out.println("Park name is " + parkName);
    }

    void info(AttractionInfo attractionInfo){
        AttractionInfo attractionInfo1 = new AttractionInfo("q","q",3);
        AttractionInfo attractionInfo2 = new AttractionInfo("w","w",2);
        AttractionInfo attractionInfo3 = new AttractionInfo("e","e",1);
        System.out.println("It is a list of attractions: \n" +
                attractionInfo1.attractionName + " " + attractionInfo1.attractionWorkingHours + " " + attractionInfo1.attractionCost +
                "\n " + attractionInfo2.attractionName + " " + attractionInfo2.attractionWorkingHours + " " + attractionInfo2.attractionCost + " \n" +
                attractionInfo3.attractionName + " " + attractionInfo3.attractionWorkingHours + " " + attractionInfo3.attractionCost);
    }

    static class AttractionInfo{
        String attractionName;
        String attractionWorkingHours;
        double attractionCost;

        AttractionInfo(){
        }
        AttractionInfo(String attractionName, String attractionWorkingHours, double attractionCost){
            this.attractionName = attractionName;
            this.attractionWorkingHours = attractionWorkingHours;
            this.attractionCost = attractionCost;
        }
    }
}


class ParkTest{
    public static void main(String[] args) {
        Park park = new Park("Disney");
        park.info( new Park.AttractionInfo());
    }
}