import main.algorithms.LRUCache;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LRUCacheTest {

    LRUCache lruCache;

    @Before
    public void setUp(){
        lruCache = new LRUCache();
    }


    @Test
    public void testLRUCache(){

        lruCache.addData(5);
        lruCache.addData(6);
        lruCache.addData(7);
        lruCache.addData(8);
        lruCache.addData(9);

        int[] data  = new int[] {5, 6, 7, 8, 9};
        Assert.assertArrayEquals(data, lruCache.getDataFromLRUCache());

        lruCache.addData(10);
        lruCache.addData(11);

        data  = new int[] {7, 8, 9, 10, 11};
        Assert.assertArrayEquals(data, lruCache.getDataFromLRUCache());
    }

}
