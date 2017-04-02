package pl.pcz;

import pl.pcz.client.petstoreTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class petstoreSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for petstore");
    suite.addTestSuite(petstoreTest.class);
    return suite;
  }
}
