import junit.framework.TestCase;

public class ImageTest extends TestCase {
    Image img = new Image(1, 2, "src", "medium");
    Image img1 = new Image(4, 1, "src1", "medium1");
    Image img2 = new Image(4000000, 1, "src2", "medium2");


    public void testConstructor() {
        new Image(1, 2, "src", "medium");
    }

    public void testIsPortrait() {
        assertEquals(img.isPortrait(), true);
        assertEquals(img1.isPortrait(), false);
    }

    public void testSize() {
        assertEquals(img.size(), 2);
        assertEquals(img1.size(), 2);
    }

    public void testIsLarger() {
        assertEquals(img.isLarger(img1), false);
        assertEquals(img1.isLarger(img), true);
    }

    public void testSizeString() {
        assertEquals(img.sizeString(), "small");
        assertEquals(img2.sizeString(), "large");
    }
}
