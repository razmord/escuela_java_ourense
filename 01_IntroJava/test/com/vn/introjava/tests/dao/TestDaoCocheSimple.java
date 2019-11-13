/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoCoche;
import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoCochesMap;
import com.vn.introjava.dao.DaoUsuario;
import com.vn.introjava.dao.DaoUsuarioList;
import com.vn.introjava.dao.Usuario;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 5
 */
public class TestDaoCocheSimple {
    
    public TestDaoCocheSimple() {
    }
    @Test
    public void testdao() throws Exception{
        DaoCoche concesionario=new DaoCocheList();
        testdaointerface(concesionario);
        
    }
     @Test
    public void testdaomap() throws Exception{
        DaoCoche concesionario=new DaoCochesMap();
        testdaointerface(concesionario);
    }
    public void testdaointerface(DaoCoche concesionario) throws Exception{
        concesionario.crear(FabricaCoches.crear("Honda"));
        concesionario.crear(FabricaCoches.crear("Toyota"));
        concesionario.crear(FabricaCoches.crear("Subaru"));
        concesionario.crear(FabricaCoches.crear("Mitshubishi"));
        concesionario.crear(FabricaCoches.crear("Mazda"));
        concesionario.crear(FabricaCoches.crear("Seat"));
        concesionario.modificar(FabricaCoches.crear("Nissan"), 5);
        assertEquals(concesionario.obtenerPorIndice(4).getMarca(), "Mazda");
        assertEquals(concesionario.obtenerPorMarca("Nissan").getMarca(), "Nissan");
        concesionario.eliminar(0);
        if(concesionario instanceof DaoCochesMap)
            assertEquals(((DaoCochesMap) concesionario).obtenerPorIndice(0), null);
        else
            assertEquals(concesionario.obtenerPorIndice(0).getMarca(), "Toyota");
        
    }
    @Test
    public void testUsuarioDao() throws Exception{
        DaoUsuario daoUsuario=new DaoUsuarioList();
        daoUsuario.crear(new Usuario("Hilda",19));
        daoUsuario.crear(new Usuario("Linne",200));
        daoUsuario.crear(new Usuario("Vatista",8));
        daoUsuario.modificar(new Usuario("Mika",16), 1);
        assertEquals("Vatista",daoUsuario.obtenerPorIndice(2).getNombre());
        assertEquals(19,daoUsuario.obtenerPorNombre("Hilda").getEdad());
        assertEquals("Mika",daoUsuario.obtenerPorIndice(1).getNombre());
        daoUsuario.eliminar(0);
        assertEquals("Mika",daoUsuario.obtenerPorIndice(0).getNombre());
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
