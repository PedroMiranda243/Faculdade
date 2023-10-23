

public class precos {
double precoG = 5.89;
double precoA = 3.80;
    
    
public double alcool(double litro){
if(litro <= 20.0){
precoA = precoA - (precoA*0.03);  
}else{
precoA = precoA - (precoA*0.05);    
}
System.out.println("O valor a ser pago é de: R$"+precoA*litro);

return precoA;    
}    
 

public double gasolina(double litro){
if(litro <= 20.0){
precoG = precoG - (precoG*0.04);  
}else{
precoG = precoG - (precoG*0.06);    
}
System.out.println("O valor a ser pago é de: R$"+precoG*litro);
  
return precoG;    
}    

}

