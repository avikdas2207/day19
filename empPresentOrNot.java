public class EmployeeAbsentOrPresent
{
  public static void main(String[] args)
   {
   int fullTime=1;
   double empcheck=Math.floor(Math.random()*10)%2;
   if (empcheck == fullTime) 
     {
       System.out.println("employee is present");
     }
     else
      {
       System.out.println("employeee is absent");
      }
   }


}