public class Ajuste {
    double salario;
    double salarioajustado;
    double porcentagem;
    double valorajuste;
   
    
    public double reajuste(){
         
 if(salario <= 280){
    porcentagem = 20;
    valorajuste = salario * 0.2;
    salarioajustado = salario + salario * 0.2;
    System.out.println(" Salário antes reajuste: R$" + salario + "\n Percentual de aumento aplicado: "+ porcentagem +"% \n Valor do aumento: R$" + valorajuste +"\n Salário após aumento: R$"+ salarioajustado);
 }
 if(salario > 280 && salario < 700){
    porcentagem = 15;
    valorajuste = salario * 0.15;
    salarioajustado = salario + salario * 0.15;
    System.out.println(" Salário antes reajuste: R$" + salario + "\n Percentual de aumento aplicado: "+ porcentagem +"% \n Valor do aumento: R$" + valorajuste +"\n Salário após aumento: R$"+ salarioajustado);
 }
 if(salario >= 700 && salario < 1500){
    porcentagem = 10;
    valorajuste = salario * 0.10;
    salarioajustado = salario + salario * 0.10;
    System.out.println(" Salário antes reajuste: R$" + salario + "\n Percentual de aumento aplicado: "+ porcentagem +"% \n Valor do aumento: R$" + valorajuste +"\n Salário após aumento: R$"+ salarioajustado);
 }
 if(salario >= 1500){
    porcentagem = 5;
    valorajuste = salario * 0.05;
    salarioajustado = salario + salario * 0.05;
    System.out.println(" Salário antes reajuste: R$" + salario + "\n Percentual de aumento aplicado: "+ porcentagem +"% \n Valor do aumento: R$" + valorajuste +"\n Salário após aumento: R$"+ salarioajustado);
 }
return(salarioajustado);
    }

}
