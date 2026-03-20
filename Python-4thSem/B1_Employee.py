# Program to create a class Employee with empno, name, depname, designation, age and salary and
# perform    the following function.
# i) Accept details of N employees
# ii) Search given employee using empno
# iii) Display employee details in neat format

class Employee:
    def __init__(self, empno, name, depname, designation, age, salary):
        self.empno = empno
        self.name = name
        self.depname = depname
        self.designation = designation
        self.age = age
        self.salary = salary

    def display(self):
        print(f"{self.empno}\t{self.name}\t{self.depname}\t\t\t{self.designation}\t\t{self.age}\t{self.salary}")

n = int(input("Enter the number of employees: "))
emp = []

for i in range(n):
    print(f"Enter the details of employee #{i + 1}")
    empno = int(input("Emp No: "))
    name = input("Name: ")
    depname = input("Department: ")
    designation = input("Designation: ")
    age = int(input("Age: "))
    salary = float(input("Salary: "))

    e = Employee(empno, name, depname, designation, age, salary)
    emp.append(e)

searchEmp = int(input("Enter the employee no to be searched: "))
found = False

for e in emp:
    if e.empno == searchEmp:
        print(f"Employee found \n\n Employee Details")
        print("Emp No\tName\tDepartment\tDesignation\tAge\tSalary")
        e.display()
        found = True
        break

if not found:
    print("Employee not found!!")

print("Employee Details".center(100, "-"))
print("Emp No\tName\tDepartment\tDesignation\tAge\tSalary")
for e in emp:
    e.display()

#           OUTPUT
# Enter the number of employees: 4
# Enter the details of employee #1
# Emp No: 1001
# Name: Jamie
# Department: CS
# Designation: Manager
# Age: 45
# Salary: 56000
# Enter the details of employee #2
# Emp No: 1002
# Name: Eric
# Department: CS
# Designation: Supervisor
# Age: 43
# Salary: 50700
# Enter the details of employee #3
# Emp No: 1003
# Name: Jhono
# Department: Product
# Designation: Manager
# Age: 51
# Salary: 45900
# Enter the details of employee #4
# Emp No: 1004
# Name: Jason
# Department: Sales
# Designation: Senior
# Age: 46
# Salary: 56800
# Enter the employee no to be searched: 1003
# Employee found
#
#  Employee Details
# Emp No	Name	Department	Designation	Age	Salary
# 1003	    Jhono	Product		Manager	51	45900.0
#
# -----------------------Employee Details-----------------------
# Emp No	Name	Department	Designation	Age	Salary
# 1001	    Jamie	CS			Manager		45	56000.0
# 1002	    Eric	CS			Supervisor	43	50700.0
# 1003	    Jhono	Product		Manager		51	45900.0
# 1004	    Jason	Sales	    Senior		46	56800.0

