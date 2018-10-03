/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reverside
 */
public class ReplaceUnderscoreTest {
    
    public ReplaceUnderscoreTest() {
    }

    @Test
    public void strip() throws Exception {
        assertEquals(" ", ReplaceUnderscore.replace("_"));
        assertEquals("a b c", ReplaceUnderscore.replace("a_b_c"));
        assertEquals("a b c", ReplaceUnderscore.replace("a__b__c"));
        assertEquals("a b c", ReplaceUnderscore.replace("a___b___c"));
    }
    
}
