package entities;

public class OutsourcedEmployee extends Employee{
    private  Double additinoalCharge;
    public OutsourcedEmployee(){

    }


    public Double getAdditinoalCharge() {
        return additinoalCharge;
    }

    public void setAdditinoalCharge(Double additinoalCharge) {
        this.additinoalCharge = additinoalCharge;
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additinoalCharge) {
        super(name, hours, valuePerHour);
        this.additinoalCharge = additinoalCharge;
    }


}
