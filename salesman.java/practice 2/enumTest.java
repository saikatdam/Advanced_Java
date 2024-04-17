public class enumTest {

     enum Days{
        SUNDAY(1000),MONDAY(2000),TUESDAY(3000),WEDNEUSDAY(4000),TRUSDAY(5000) , FRIDAY(6000), SATURDAY(7150);
        int date;
         Days(int date){
         this.date=date;
     }
    }

    public static void main(String args[]){
//    Days day=Days.FRIDAY;
    System.out.print(Days.FRIDAY.date);
    }
}
