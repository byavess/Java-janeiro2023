package OrientadaObjeto.Exercicios;

public class DepositoBancario {
    //    public String name;
//    public double price;
//    public int quantity;

    private String name;
    private double numeroConta;
    private int valorDeposito;

    private boolean iniciar;


    //Construtor
    public DepositoBancario() {

    }

    public DepositoBancario(String name, double numeroConta, int valorDeposito, boolean iniciar) {
        //this.name ->referencia ao atributo do objeto
        this.name = name;
        this.numeroConta = numeroConta;// referencia ao parametro
        this.valorDeposito = valorDeposito;
        this.iniciar = iniciar;
    }
    //Aula sobrecarga Cosntrutores

    public DepositoBancario(String name, double numeroConta) {
        //this.name ->referencia ao atributo do objeto
        this.name = name;
        this.numeroConta = numeroConta;// referencia ao parametro
        //ou quantity pode receber zero
    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public double getnumeroConta(){
        return numeroConta;
    }

    public  int getvalorDeposito(){
        return valorDeposito;
    }
    public double setnumeroConta(double numeroConta){
        return numeroConta * valorDeposito;
    }

    public double totalValueInStock() {
        return numeroConta * valorDeposito;
    }

    public void addProducts(int valorDeposito) {
        this.valorDeposito += valorDeposito;
    }

    public void removeProducts(int valorDeposito) {
        this.valorDeposito -= valorDeposito;
    }
    public  void setIniciar(boolean y ){
        if(iniciar == y){
            this.iniciar = y;
            System.out.println("");
        }
        else{
            System.out.println("operação cancelada");
        }

    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", numeroConta)
                + ", "
                + valorDeposito
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
