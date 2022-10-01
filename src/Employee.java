public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee( String name,int salary,int workHours,int hireYear){
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
    this.hireYear=hireYear;
    tax();


    }

        double tax(){
        if(this.salary>1000){
            return salary*0.03;
        }else {
            return 0;
        }}

        double bonus(){
            if (this.workHours>40){
                return (this.workHours-40)*30;
            }else {
            return 0;
            }
    }

        double raiseSalary(){
            if(2021-this.hireYear<10){
                return this.salary*0.05;
            } else if (2021-this.hireYear>10 && 2021-this.hireYear<20) {
                return this.salary*0.10;
            }
            else if (2021-this.hireYear>20){
                return this.salary*0.15;
            }
            return 0;
            }

            public String toString(){
                double totalSalary=salary+ tax() + bonus() +raiseSalary();
                System.out.println("Name : " + this.name);
                System.out.println("Salary : " + this.salary);
                System.out.println("WorkHour : " + this.workHours);
                System.out.println("HireYear : " + this.hireYear);
                System.out.println("Tax : " + tax());
                System.out.println("Bonus : " + bonus());
                System.out.println("Raise Salary : " + raiseSalary());
                System.out.println("Total Salary : " + totalSalary);

                return null;
            }

}




