package com.example.jstldemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Creating an ArrayList of EmployeeBean objects to simulate
        // database operation of getting information about employees
        ArrayList<EmployeeBean> employees = new ArrayList<>();
        EmployeeBean emp1 = new EmployeeBean();
        emp1.setId(1);
        emp1.setName("Anas");
        emp1.setRole("Lecturer");
        EmployeeBean emp2 = new EmployeeBean();
        emp2.setId(2);
        emp2.setName("Saidul");
        emp2.setRole("Lecturer");
        EmployeeBean emp3 = new EmployeeBean();
        emp3.setId(3);
        emp3.setName("ARMK");
        emp3.setRole("Department Head");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        //Setting the ArrayList object as an attribute inside the
        // request object so that it can be accessed from other
        // resources (i.e. servlets, jsps etc.)
        request.setAttribute("employeeList", employees);
        //forwarding the client to Employees.jsp page which will show
        // the list of employees
        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/Employees.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
