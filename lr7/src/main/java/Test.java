public class Test {
    private int test;
    static String testName = "Java";
    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        if (test > 0) {
            this.test = test;
        }
    }
    public Test(int test){
        this.test = test;
    }
    /* Test test1 = new Test(10); */
    static void print(Test t){
        System.out.println("Print");
        System.out.println("Результат теста = "+t.test + "Название теста = "+ testName);
    }
    /* Test.print(test1);*/
    //test1.setTest();
}