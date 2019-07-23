package com.main.birst;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author amruta.kajrekar on 2/28/19.
 */
public class TestCodingChallenge{

  @Test
  public void testValidatePairForValidCase() {
    CodingChallenge test1 = new CodingChallenge();

    String[] pair = new String[]{"food","apple"};
    assertEquals(test1.validatePair(pair), true,"Invalid pair");
  }

  @Test
  public void testValidatePairForInvalidCase() {
    CodingChallenge test1 = new CodingChallenge();

    String[] pair = new String[]{"food",""};
    assertEquals(test1.validatePair(pair), false,"Invalid pair");
  }

  @Test
  public void testValidatePairForEmptyPair() {
    CodingChallenge test1 = new CodingChallenge();

    String[] pair = new String[]{};
    assertEquals(test1.validatePair(pair), false,"Empty pair");
  }

  @Test
  public void testValidatePairForNullPair() {
    CodingChallenge test1 = new CodingChallenge();

    String[] pair = null;
    assertEquals(test1.validatePair(pair), false,"Null pair");
  }


  @Test
  public void testValidCreateAction() {
    CodingChallenge test1 = new CodingChallenge();


    try {
      assertEquals(test1.getSizeOfTable(), 0 ,"Invalid size of table. Needs to be 0");
      test1.create("food=apple");
      assertEquals(test1.getSizeOfTable(), 1 ,"Invalid size of table. Needs to be 1");
    } catch (Exception e) {
      fail();
    }

  }


  @Test
  public void testInvalidCreateAction() {
    CodingChallenge test1 = new CodingChallenge();

    try{
    assertEquals(test1.getSizeOfTable(), 0 ,"Invalid size of table. Needs to be 0");
    test1.create("food=");
    assertEquals(test1.getSizeOfTable(), 0 ,"Invalid size of table. Needs to be 0");
    } catch (Exception e) {
      fail();
    }
  }


  @Test
  public void testValidUpdateAction(){
    CodingChallenge test1 = new CodingChallenge();

    try {
      assertEquals(test1.getSizeOfTable(), 0, "Invalid size of table. Needs to be 0");
      test1.create("food=apple");
      assertEquals(test1.getSizeOfTable(), 1, "Invalid size of table. Needs to be 0");
      test1.update("food=banana");
      assertEquals(test1.getSizeOfTable(), 1, "Invalid size of table. Needs to be 0");

    }catch (Exception e) {
      fail();
    }
  }


  @Test(expectedExceptions=Exception.class)
  public void testInvalidUpdateAction() throws Exception {
    CodingChallenge test1 = new CodingChallenge();

    assertEquals(test1.getSizeOfTable(), 0 ,"Invalid size of table. Needs to be 0");
    test1.update("food=apple");

  }


  @Test
  public void testValidGetAction(){
    CodingChallenge test1 = new CodingChallenge();

    try {
      assertEquals(test1.getSizeOfTable(), 0, "Invalid size of table. Needs to be 0");
      test1.create("food=apple");
      assertEquals(test1.getSizeOfTable(), 1, "Invalid size of table. Needs to be 0");
      test1.get("food");

    }catch (Exception e) {
      fail();
    }
  }

  @Test(expectedExceptions=Exception.class)
  public void testInvalidGetAction() throws Exception {
    CodingChallenge test1 = new CodingChallenge();

    assertEquals(test1.getSizeOfTable(), 0, "Invalid size of table. Needs to be 0");
    test1.get("food");

  }


  @Test
  public void testValidDeleteAction(){
    CodingChallenge test1 = new CodingChallenge();

    try {
      assertEquals(test1.getSizeOfTable(), 0, "Invalid size of table. Needs to be 0");
      test1.create("food=apple");
      assertEquals(test1.getSizeOfTable(), 1, "Invalid size of table. Needs to be 0");
      test1.delete("food");
      assertEquals(test1.getSizeOfTable(), 0, "Invalid size of table. Needs to be 0");
    }catch (Exception e) {
      fail();
    }
  }

  @Test(expectedExceptions=Exception.class)
  public void testInvalidDeleteAction() throws Exception {
    CodingChallenge test1 = new CodingChallenge();

    assertEquals(test1.getSizeOfTable(), 0, "Invalid size of table. Needs to be 0");
    test1.delete("food");

  }




}
