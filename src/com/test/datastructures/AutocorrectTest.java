/**
 * 
 */
package com.test.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.datastructures.Kata1;

public class AutocorrectTest {
  @Test
  public void testApply() {
    String[] inputs = new String[] {
      "u",
      "you",
      "Youuuuu",
      "youtube"
    };
    
    String[] outputs = new String[] {
      "your sister",
      "your sister",
      "your sister",
      "youtube"
    };
    
    for (int i = 0; i < inputs.length; i++) {
      assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i], Kata1.autocorrect(inputs[i]));
    }
  }
}