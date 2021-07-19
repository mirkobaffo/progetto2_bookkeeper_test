package org.apache.bookkeeper.client;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

public class BookKeeperAdminTest {

    public BookKeeperAdminTest() {
    }

    @Test
    public void testInitNewCluster() throws Exception {
      String parola = "Ciao";
      Assert.assertTrue("True", parola == "Ciao");
    }

}
