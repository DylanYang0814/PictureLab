/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {
    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    public static void testKeepOnlyBlue() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.keepOnlyBlue();
        temple.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    public static void testNegate() {
        Picture swan = new Picture("swan.jpg");
        swan.explore();
        swan.negate();
        swan.explore();
    }

    public static void testGrayscale() {
        Picture pool = new Picture("pool.jpg");
        pool.explore();
        pool.grayscale();
        pool.explore();
    }

    public static void testMirrorVerticalRightToLeft() {
        Picture wall = new Picture("wall.jpg");
        wall.explore();
        wall.mirrorVerticalRightToLeft();
        wall.explore();
    }

    public static void testMirrorHorizontal() {
        Picture jenny = new Picture("jenny-red.jpg");
        jenny.explore();
        jenny.mirrorHorizontal();
        jenny.explore();
    }

    public static void testFixUnderwater() {
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    public static void testMirrorHorizontalBotToTop() {
        Picture jenny = new Picture("jenny-red.jpg");
        jenny.explore();
        jenny.mirrorHorizontalBotToTop();
        jenny.explore();
    }

    public static void testMirrorGull() {
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.mirrorSeagull();
        seagull.explore();
    }

    public static void testCopy() {
        Picture msg = new Picture("msg.jpg");
        msg.explore();
        msg.createCollage();
        msg.explore();
    }


    /**
     * Main method for testing.  Every class can have a main
     * method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run

        //testMirrorHorizontalBotToTop();
        //testFixUnderwater();
        //testMirrorHorizontal();
        //testMirrorVerticalRightToLeft();
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}