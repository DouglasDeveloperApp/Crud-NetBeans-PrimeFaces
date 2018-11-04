package br.com.mouseweb.sistema.beans;

import br.com.mouseweb.sistema.dao.CarroDAO;
import br.com.mouseweb.sistema.entidades.Carro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

// Scopo = gera uma sessão, define o tempo de sessão no WEB-INF -> web.xml.
@SessionScoped
// Gerenciador Bean = Intermédia o HTML para o Java
@ManagedBean
public class CarroBean extends CrudBean<Carro, CarroDAO> {

    private CarroDAO carroDAO;
    
    @Override
    public CarroDAO getDao() {
        if(carroDAO == null){
            carroDAO = new CarroDAO();
        }
        return carroDAO;
    }

    @Override
    public Carro criarNovaEntidade() {
        return new Carro();
    }

}
