public class SwitchEmployeeWageuc3 {
	public static final int  isFullTime=1;
    public static final int isPartTime=0; 
	public static final int  employeeWagePerhr=20;
	public static void main(String[] args) {

      int emphrs=20;
      int empwage=0;
      double empCheck=Math.floor(Math.random()*10)%3;
    switch ((int)empCheck) 
    {
    case isFullTime:  System.out.println("fulltimeemployee wage");
               emphrs=8;

    case isPartTime: System.out.println("fulltimeemployee wage");
                    emphrs=4;


	default : System.out.println("fulltimeemployee wage");
             emphrs=0;

    empwage=emphrs*employeeWagePerhr;
    System.out.println(empwage);
    }
}

}