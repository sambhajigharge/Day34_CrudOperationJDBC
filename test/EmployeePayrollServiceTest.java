package JDBC.test;

import java.util.List;

import JDBC.main.EmployeePayrollData;
import JDBC.main.EmployeePayrollService;
import org.junit.Assert;
import org.junit.Test;

import static JDBC.main.EmployeePayrollService.IOSevice.DB_IO;

public class EmployeePayrollServiceTest {
    @Test
    public void givenEmployeePayrollInDB_WhenRetrived_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
        Assert.assertEquals(3, employeePayrollData.size());
    }

}
