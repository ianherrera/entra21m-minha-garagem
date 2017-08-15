
package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class CarroDAOJUnitTest {
    
    @Test
    public void inserir(){
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017,8,14));
        gol.setAnoFabricacao((short)2017);
        gol.setAnoLancamento((short)2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("idiuasfibaaisbfibsaifbsdbf bsdfabkbsdf kbsdaflkb ksjdfb");
        gol.setEstaFuncional(true);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte)0);
        gol.setQuantidadePortas((byte)4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short)17);
        gol.setRenavam(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        assertEquals(codigo, 1);
        gol.setId(codigo);
        
        Carro carroBuscado = dao.buscarPorId(codigo);
        validarIgualdadeCarro(gol, carroBuscado);
    }
    
    @Test
    public void excluir(){
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017,8,14));
        gol.setAnoFabricacao((short)2017);
        gol.setAnoLancamento((short)2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("idiuasfibaaisbfibsaifbsdbf bsdfabkbsdf kbsdaflkb ksjdfb");
        gol.setEstaFuncional(true);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte)0);
        gol.setQuantidadePortas((byte)4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short)17);
        gol.setRenavam(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        dao.excluir(codigo);
        
        Carro carroBuscado = dao.buscarPorId(codigo);
        assertNull(carroBuscado);
        
        
    }
    
    @Test
    public void alterar(){
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017,8,14));
        gol.setAnoFabricacao((short)2017);
        gol.setAnoLancamento((short)2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("idiuasfibaaisbfibsaifbsdbf bsdfabkbsdf kbsdaflkb ksjdfb");
        gol.setEstaFuncional(true);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte)0);
        gol.setQuantidadePortas((byte)4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short)17);
        gol.setRenavam(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        gol.setId(codigo);
        
        gol.setDataCompra(new Date(2016,8,15));
        gol.setAnoFabricacao((short)2016);
        gol.setAnoLancamento((short)2016);
        gol.setChassi("515754");
        gol.setCor("Azul");
        gol.setDescricao("7123y913498y198y1yduaghgka");
        gol.setEstaFuncional(false);
        gol.setFabricante("Ford");
        gol.setNome("Focus");
        gol.setPlaca("FLA-2018");
        gol.setPotencia(150f);
        gol.setPermitidaCirculacao(false);
        gol.setQuantidadeBatidas((byte)1);
        gol.setQuantidadePortas((byte)2);
        gol.setQuilometragem(15845f);
        gol.setTipoPneu((short)19);
        gol.setRenavam(198845);
        dao.alterar(gol);
        
        Carro carromodificado = dao.buscarPorId(gol.getId());
        validarIgualdadeCarro(gol, carromodificado);
    }
    
    public void validarIgualdadeCarro(Carro carro, Carro outroCarro){
        assertEquals(carro.getId(), outroCarro.getId());
        assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
        assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
        assertEquals(carro.getChassi(), outroCarro.getChassi());
        assertEquals(carro.getCor(), outroCarro.getCor());
        assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
        assertEquals(carro.getDescricao(), outroCarro.getDescricao());
        assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
        assertEquals(carro.getQuantidadePortas(), outroCarro.getQuantidadePortas());
        assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(),0);
        assertEquals(carro.getNome(), outroCarro.getNome());
        assertEquals(carro.getFabricante(), outroCarro.getFabricante());
        assertEquals(carro.getPlaca(), outroCarro.getPlaca());
        assertEquals(carro.getPotencia(), outroCarro.getPotencia(),0);
        assertEquals(carro.getRenavam(), outroCarro.getRenavam());
        assertEquals(carro.getTipoPneu(), outroCarro.getTipoPneu());
        assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
        assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());
        
        
    }
}
