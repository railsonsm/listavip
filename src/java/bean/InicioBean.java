package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InicioBean {
    private String teste;
    private String output;
       
    
    public String retorneiUmValorProInput(){
        System.out.println("bean.InicioBean.retorneiUmValorProInput()");
        String novoValor = this.teste = "Novo Valor";   
        return novoValor;
    }
    
    public void mudeiUmValorProInput(){
        System.out.println("bean.InicioBean.retorneiUmValorProInput()");
        this.output = this.teste;   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
    
    
}
