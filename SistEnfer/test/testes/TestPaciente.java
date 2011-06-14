/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;


import java.util.List;
import br.com.cet.sistenfer.dominio.Paciente;
import br.com.cet.sistenfer.persistence.DaoPaciente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bestoff
 */
public class TestPaciente {
    
    DaoPaciente dao = new DaoPaciente();
    
    public TestPaciente() {
    }
    
    @Test
    public void testSalvarPaciente(){
        
        
        Paciente paciente = new Paciente();
        
        dao.salvar(paciente);
        
        assertEquals(paciente.getId()!=null, true);
    }
    @Test
    public void testListaTodos(){
     
        List lista = dao.listTodos();
        
        assertEquals(!lista.isEmpty(), true);
    }
}
