import java.util.*;
class employee{
  // complete the class as mentioned in the problem statement
  int employee_id;
  String name;
  int salary;
  boolean stock_options;
  int vesting_period;
  employee(int a,
  String b,
  int c,
  boolean d,
  int e){
      //System.out.println(this.salary);
      this.employee_id = a;
      this.name=b;
      this.salary=c;
      this.stock_options=d;
      this.vesting_period = e;
    //System.out.println(a+" "+e);
  }
  int employeeNumber(){
      return this.employee_id;
  }
  String name(){
      return this.name;
  }
  int salary(){
     return this.salary;
  }
  boolean stock_options(){
      return this.stock_options;
  }
  int vestingPeriod(){
      return this.vesting_period;
  }
}

class company{
  // complete the class as mentioned in the problem statement
  int n ;
  employee[] em;
  company(int n , employee[] em){
      this.n = n;
      this.em = em;
  }
  void sortEmployeeId(){
     // System.out.println("Id");
      Arrays.sort(em,(a,b)->a.employee_id-b.employee_id);
  }
  void sortSalary(){
      //System.out.println("sal");
      Arrays.sort(em,(a,b)->a.salary-b.salary);
  }
  
  void sortVestingPeriod(){
      //System.out.println("vs");
      Arrays.sort(em,(a,b)->b.vesting_period-a.vesting_period);
  }
  int size(){
      return this.n;
  }
  
  void stockOrNot(int id){
      for(int i=0;i<n;i++){
          if(id==em[i].employee_id){
              if(em[i].stock_options){
                  System.out.println("Stock Granted to "+em[i].name);
                  return;
              }else{
                  System.out.println("Stock not Granted to "+em[i].name);
                  return;
              }
          }
      }
      
      System.out.println("Invalid Employee ID");
  }
}

