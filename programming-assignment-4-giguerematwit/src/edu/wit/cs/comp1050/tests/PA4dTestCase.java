
package edu.wit.cs.comp1050.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;

import org.junit.Assert;

import edu.wit.cs.comp1050.PA4d;
import edu.wit.cs.comp1050.TriangleObject;
import junit.framework.TestCase;

public class PA4dTestCase extends TestCase {

   @SuppressWarnings("serial")
   private static class ExitException extends SecurityException {}

   private static class NoExitSecurityManager extends SecurityManager 
   {
      @Override
      public void checkPermission(Permission perm) {}

      @Override
      public void checkPermission(Permission perm, Object context) {}

      @Override
      public void checkExit(int status) { super.checkExit(status); throw new ExitException(); }
   }

   @Override
   protected void setUp() throws Exception 
   {
      super.setUp();
      System.setSecurityManager(new NoExitSecurityManager());
   }

   @Override
   protected void tearDown() throws Exception 
   {
      System.setSecurityManager(null);
      super.tearDown();
   }

   
   private void _test(String f1, String f2, String f3, String t) {
      final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

      final String input = String.format("%s%n%s%n%s%n", f1, f2, f3);

      final String expected = TestSuite.stringOutput(new String[] {
            "Enter three sides: ",
            "Enter the color: ",
            "Enter a boolean value for filled: ",
            t + "%n"
      }, new Object[] {});

      System.setIn(new ByteArrayInputStream(input.getBytes()));
      System.setOut(new PrintStream(outContent));
      try {
         PA4d.main(new String[] { "foo" });
      } catch (ExitException e) {}

      assertEquals(expected, outContent.toString());

      System.setIn(null);
      System.setOut(null);
   }


   

   private void _testSide1(double side , double expected) {
      double getSide=-1.;
      TriangleObject tri = null;
      try {
         tri = new TriangleObject();
         tri.setSide1(side);
         getSide = tri.getSide1();
      } catch (ExitException e) {}

      assertEquals(expected, getSide);
   }

   private void _testSide2(double side , double expected) {
      double getSide=-1.;
      TriangleObject tri = null;
      try {
         tri = new TriangleObject();
         tri.setSide2(side);
         getSide = tri.getSide2();
      } catch (ExitException e) {}

      assertEquals(expected, getSide);
   }

   private void _testSide3(double side , double expected) {
      double getSide=-1.;
      TriangleObject tri = null;
      try {
         tri = new TriangleObject();
         tri.setSide3(side);
         getSide = tri.getSide3();
      } catch (ExitException e) {}

      assertEquals(expected, getSide);
   }

   private void _testPerimeter(double side1, double side2, double side3 , double expected) {
      double getPerimeter=-1.;
      TriangleObject tri = null;
      try {
         tri = new TriangleObject(side1, side2, side3);
         getPerimeter = tri.getPerimeter();
      } catch (ExitException e) {}

      assertEquals(expected, getPerimeter);
   }

   private void _testArea(double side1, double side2, double side3 , double expected) {
      double getArea=-1.;
      TriangleObject tri = null;
      try {
         tri = new TriangleObject(side1, side2, side3);
         getArea = tri.getArea();
      } catch (ExitException e) {}

      assertEquals(expected, getArea);
   }

   private void _testSide1() {
      _testSide1(1.0, 1.0);
      _testSide1(2.0, 2.0);
      _testSide1(3.14, 3.14);
      _testSide1(-1.0, 1.0);
      _testSide1(0.0, 1.0);
   }

   private void _testSide2() {
      _testSide2(1.0, 1.0);
      _testSide2(2.0, 2.0);
      _testSide2(3.14, 3.14);
      _testSide2(-1.0, 1.0);
      _testSide2(0.0, 1.0);
   }

   private void _testSide3() {
      _testSide3(1.0, 1.0);
      _testSide3(2.0, 2.0);
      _testSide3(3.14, 3.14);
      _testSide3(-1.0, 1.0);
      _testSide3(0.0, 1.0);
   }

   public void testSide() {
      _testSide1();
      _testSide2();
      _testSide3();

   }

   public void testGetPerimeter() {
      _testPerimeter(1.0, 1.0, 1.0, 3.0);
      _testPerimeter(2.1, 3.2, 4.1, 9.4);
      _testPerimeter(2., 0., 4., 7.);
   }

   public void testGetArea() {
      _testArea(1.0, 1.0, 1.0, 0.4330127018922193);
      _testArea(2.1, 3.2, 4.1, 3.3163232653045163);
      _testArea(1.0, 0.0, -11.0, 0.4330127018922193);
   }

   public void testIsFilled() {
      boolean isFilled = false;
      TriangleObject tri = null;
      try {
         tri = new TriangleObject();
         isFilled = tri.isFilled();
      } catch (ExitException e) {}

      boolean expected = true; 
      assertEquals(expected, isFilled);
   }

   public void testColor() {
      String color = "white";
      TriangleObject tri = null;
      try {
         tri = new TriangleObject();
         color = tri.getColor();
      } catch (ExitException e) {}

      String expected = "red"; 
      assertEquals(expected, color);
   }
   
   public void testProgram() {
      double a1, p1, s1, s2, s3;

      
      a1=3.32;
      p1=9.4;
      s1=2.1; s2=3.2; s3=4.1;
      String r = String.format("The area is %.2f%nThe perimeter is %.2f%nTriangle: side1 = %.2f, side2 = %.2f, side3 = %.2f%n", a1,p1,s1, s2, s3);
      _test("2.1 3.2 4.1", "blue", "true", r);
      
      a1=0.43;
      p1=3.;
      s1=1.; s2=1.; s3=1.;
      r = String.format("The area is %.2f%nThe perimeter is %.2f%nTriangle: side1 = %.2f, side2 = %.2f, side3 = %.2f%n", a1,p1,s1, s2, s3);
      _test("1.0 1.0 1.0", "green", "false", r);
      
      a1=0.50;
      p1=3.5;
      s1=1.; s2=1.5; s3=1.;
      r = String.format("The area is %.2f%nThe perimeter is %.2f%nTriangle: side1 = %.2f, side2 = %.2f, side3 = %.2f%n", a1,p1,s1, s2, s3);
      _test("-2.0 1.5 1.0", "yellow", "false", r);
      
   }
}
