/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Config.Conn;
import java.sql.ResultSet;
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
public class ConnTest {
    
    public ConnTest() {
        
    }
    Conn koneksi = new Conn();
    
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
    public void testGetData() {
        System.out.println("getData");
        String SQLString = "";
        ResultSet expected = null;
        ResultSet result = koneksi.getData(SQLString);
        assertEquals(expected, result);
    }

    @Test
    public void testQuery() {
        System.out.println("Query");
        String SQLString = "Select * from pengguna";
        koneksi.query(SQLString);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}