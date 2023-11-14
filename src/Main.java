public class Main
{
    public static void main(String[] args)
    {
        // Testing Part A
        System.out.println("--- Testing Part A: bookend ---");
        StrangeWord weird1 = new StrangeWord("BANANAS");
        weird1.bookend("C", 3);
        System.out.println(weird1.getWord());
        weird1.bookend("D", 4);
        System.out.println(weird1.getWord());
        StrangeWord weird2 = new StrangeWord("CSA");
        weird2.bookend("Z", 1);
        System.out.println(weird2.getWord());
        weird2.bookend("*", 5);
        System.out.println(weird2.getWord());
        weird2.bookend("D", 0);
        System.out.println(weird2.getWord());

        // Testing Part B
        System.out.println("\n--- Testing Part B: followedBy");
        StrangeWord weird3 = new StrangeWord("BANANAS");
        System.out.println(weird3.followedBy("B"));
        System.out.println(weird3.followedBy("A"));
        System.out.println(weird3.followedBy("N"));
        System.out.println(weird3.followedBy("S"));
        System.out.println(weird3.followedBy("Z"));
        System.out.println("----");
        StrangeWord weird9 = new StrangeWord("BANANANA");
        System.out.println(weird9.followedBy("B"));
        System.out.println(weird9.followedBy("A"));
        System.out.println(weird9.followedBy("N"));
        System.out.println(weird9.followedBy("S"));
        System.out.println("----");
        StrangeWord weird4 = new StrangeWord("BAAANNAANAAS");
        System.out.println(weird4.followedBy("B"));
        System.out.println(weird4.followedBy("A"));
        System.out.println(weird4.followedBy("N"));
        System.out.println(weird4.followedBy("S"));
        System.out.println("----");
        StrangeWord weird10 = new StrangeWord("BBBBAAAABBBB");
        System.out.println(weird10.followedBy("B"));
        System.out.println(weird10.followedBy("A"));
        System.out.println(weird10.followedBy("N"));
        System.out.println("----");
        StrangeWord weird11 = new StrangeWord("BBBBBBBBBBBB");
        System.out.println(weird11.followedBy("B"));
        System.out.println(weird11.followedBy("A"));
        System.out.println("-- word should NOT be changed: --");
        System.out.println(weird3.getWord()); // word unchanged
        System.out.println(weird9.getWord()); // word unchanged
        System.out.println(weird4.getWord()); // word unchanged

        // Testing Part C
        System.out.println("\n--- Testing Part C: everyOther ---");
        StrangeWord weird12 = new StrangeWord("BANANAS");
        System.out.println(weird12.everyOther(2));
        System.out.println(weird12.everyOther(3));
        System.out.println(weird12.everyOther(4));
        System.out.println(weird12.everyOther(10));
        System.out.println("----");
        StrangeWord weird5 = new StrangeWord("ABCEFGHIJKLMNOP");
        System.out.println(weird5.everyOther(1));
        System.out.println(weird5.everyOther(2));
        System.out.println(weird5.everyOther(3));
        System.out.println(weird5.everyOther(4));
        System.out.println(weird5.everyOther(5));
        System.out.println(weird5.everyOther(6));
        System.out.println(weird5.everyOther(7));
        System.out.println(weird5.everyOther(8));
        System.out.println(weird5.everyOther(9));
        System.out.println(weird5.everyOther(14));
        System.out.println(weird5.everyOther(15));
        System.out.println(weird5.everyOther(16));
        System.out.println("-- word should NOT be changed: --");
        System.out.println(weird12.getWord()); // word unchanged
        System.out.println(weird5.getWord()); // word unchanged

        // Testing Part D
        System.out.println("\n--- Testing Part D: wordPyramid ---");
        StrangeWord weird6 = new StrangeWord("ABCDEFGHIJKLMNOPQRSTUVWX");
        weird6.wordPyramid();
        System.out.println("-- next pyramid --");
        StrangeWord weird7 = new StrangeWord("APCOMPUTERSCIENCE");
        weird7.wordPyramid();
        System.out.println("-- next pyramid --");
        StrangeWord weird8 = new StrangeWord("APCOMP");
        weird8.wordPyramid();
        System.out.println("-- next pyramid --");
        StrangeWord weird13 = new StrangeWord("12345678912345678912345678912345678912345678912345");
        weird13.wordPyramid();
        System.out.println("-- word should NOT be changed: --");
        System.out.println(weird6.getWord()); // word unchanged
        System.out.println(weird8.getWord()); // word unchanged
    }
}