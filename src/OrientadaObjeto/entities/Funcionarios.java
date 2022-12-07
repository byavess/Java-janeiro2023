package OrientadaObjeto.entities;

public class Funcionarios {
    public String nome;
    public double salarioBruto;
    public double imposto;


    public double salarioLiquido(){
       return   salarioBruto - imposto;
    }



    public double aumentoSalario (double porcentagem ) {


       return salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public  String toString() {
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }



}
//ctrl + alt + l organizar codigo