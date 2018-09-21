package br.com.mouseweb.sistema.beans;

import br.com.mouseweb.sistema.dao.CarroDao;
import br.com.mouseweb.sistema.entidades.Carro;
import java.util.ArrayList;
import java.util.List;
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
        new CarroDao().salvar(carro);
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
