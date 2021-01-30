public class SingletonTest {
    public static void main(String[] args) {
        Rector rector = Rector.getInstance(1,"Viorel Bostan","31-08-1972",
                "viorel.bostan@adm.utm.md");
        Rector exRector = Rector.getInstance(2,"Ion Bostan","31-07-1949",
                "ionbostan1@gmail.com");
        if(rector.fullNameOfRector == exRector.fullNameOfRector){
            System.out.println("Test is passed.The use of the singleton was successful!");
        } else{
            System.out.println("Something went wrong");
        }
        System.out.println(rector);
        System.out.println(exRector);



    }
}
