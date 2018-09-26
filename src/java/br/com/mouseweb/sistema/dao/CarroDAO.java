package br.com.mouseweb.sistema.dao;

import br.com.mouseweb.sistema.entidades.Carro;
import br.com.mouseweb.sistema.util.FabricaConexao;
import br.com.mouseweb.sistema.util.exception.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CarroDAO{
    
    public void salvar(Carro carro) throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
           
                ps = conexao.prepareStatement("INSERT INTO `sistema_carros` (`modelo`,`fabricante`,`cor`,`ano`) VALUES (?,?,?,?)");
          
            ps.setString(1, carro.getModelo());
            ps.setString(2, carro.getFabricante());
            ps.setString(3, carro.getCor());
            ps.setDate(4, (java.sql.Date) new Date(carro.getAno().getTime()));
            ps.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar!", ex);
        }
    }
    
}
