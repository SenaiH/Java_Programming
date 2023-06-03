package day_18_JavaMemory_GarbageCollection;

public class Task_3_Offer {
public String location,companyName,jobTitle;
public int salary;
public boolean hasBenefit,hasPTO,isWFH,isFulltime;

    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFulltime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFulltime = isFulltime;
    }

    @Override
    public String toString() {
        return "Task_3_Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFulltime=" + isFulltime +
                '}';
    }

    public static void main(String[] args) {
        Task_3_Offer offer1 = new Task_3_Offer();
    offer1.setInfo("Asmara","Melotti","Truck Driver",100_000,true,true,false,false);

        System.out.println(offer1);

        Task_3_Offer offer2 = new Task_3_Offer();
        offer2.setInfo("San Jose","Zoom","Engineer",150_000,true,true,false,true);

        System.out.println(offer2);

    }


}
/*
Create a custom class named Offer
        Attributes:
                location
                companyName
                jobTitle
                salary
                hasBenefit
                hasPTO
                isWFH
                isFullTime

        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object
 */