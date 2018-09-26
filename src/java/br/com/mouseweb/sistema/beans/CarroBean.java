package br.com.mouseweb.sistema.beans;

import br.com.mouseweb.sistema.dao.CarroDAO;
import br.com.mouseweb.sistema.entidades.Carro;
import br.com.mouseweb.sistema.util.exception.ErroSistema;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

// Scopo = gera uma sessão, define o tempo de sessão no WEB-INF -> web.xml.
@SessionScoped
// Gerenciador Bean = Intermédia o HTML para o Java
@ManagedBean
public class CarroBean {
    
    private Carro carro = new Carro();
    private List<Carro> carros = new ArrayList<>();
    
    public void adicionar(){
        carros.add(carro);
        carro = new Carro();
        
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    
}
