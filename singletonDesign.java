import javax.smartcardio.CommandAPDU;

class Company{
    private static Company department;
    private Company()
    {

    }
    public static Company getDepartment()
{
    if(department==null)
    {
        department=new Company();
    }
    return department;
}
public void hrDepartment()
{
    System.out.println("The HR Department is a crucial part of company that every company has");
}
public void itDepartment()
{
    System.out.println("This comapany has IT department that handles all admin request ");
}
public void qmsDepartment()
{
    System.out.println("Manages the quality of the product that is going to be delivered");
}
public void financeDepartment()
{
    System.out.println("Manages the company finaces");
}
}






public class singletonDesign {
    public static void main(String[] args) {
        Company company=Company.getDepartment();
        company.financeDepartment();
        company.hrDepartment();
        company.itDepartment();
        company.qmsDepartment();
    }
    
}
