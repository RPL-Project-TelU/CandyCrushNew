/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controller.ControllerJasa;
import Models.Jasa;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ControllerJasaTest {
    
    public ControllerJasaTest() {
        
    }
    private ControllerJasa cj = new ControllerJasa();
    private List<Jasa> list = new ArrayList<Jasa>();
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testGetColumnCount(){
        int result = cj.getColumnCount();
        assertEquals(3,result);
    }
    @Test
    public void testGetRowCount(){
        int result = cj.getRowCount();
        assertEquals(list.size(), result);
    }
    
    @Test
    public void testGetColumnName0(){
        String result = cj.getColumnName(0);
        assertEquals("Nama Jasa",result);
    }
    @Test
    public void testGetColumnName1(){
        String result = cj.getColumnName(1);
        assertEquals("Deskripsi",result);
    }
    @Test
    public void testGetColumnName2(){
        String result = cj.getColumnName(2);
        assertEquals("Harga",result);
    }

    @Test
    public void testGetValueAt0(){
        Object result = cj.getValueAt(1, 1);
        Object expect = list.get(1).getDeskripsiJasa();
        assertEquals("Harga",result);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
