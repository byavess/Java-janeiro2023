package OrientadaObjeto.entities;

public class Material {

//    public String name;
//    public double price;
//    public int quantity;

    private String name;
    private double price;
    private int quantity;


    //Construtor
    public Material() {

    }

    public Material(String name, double price, int quantity) {
        //this.name ->referencia ao atributo do objeto
        this.name = name;
        this.price = price;// referencia ao parametro
        this.quantity = quantity;
    }
    //Aula sobrecarga Cosntrutores

    public Material(String name, double price) {
        //this.name ->referencia ao atributo do objeto
        this.name = name;
        this.price = price;// referencia ao parametro
        //ou quantity pode receber zero
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
    public double setPrice(double price){
return price * quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
