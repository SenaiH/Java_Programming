package day_17_CustomClass;

public class SalaryCalculator {

    public int hourlyRate;
    public int weeklyHours;
    public  double stateTaxRate;
    public double federalTaxRate;


    public void setInfo(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;

    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }

    public double Salary(){
        return weeklyHours*hourlyRate*52 ;
    }
   public double setStateTaxRate(){
       return Salary()*stateTaxRate;

   }
  public double setFederalTaxRate(){
      return Salary()*federalTaxRate;
  }
  public double setSalaryAfterTax(){
      return Salary()-(setStateTaxRate()+setFederalTaxRate());
  }
}
/*
Create a custom class named SalaryCalculator-
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */