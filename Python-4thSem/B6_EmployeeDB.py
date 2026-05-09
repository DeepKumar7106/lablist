import mysql.connector

con = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    charset="utf8"
)

cur = con.cursor()

cur.execute("CREATE DATABASE IF NOT EXISTS employeedb")
cur.execute("USE employeedb")
cur.execute("""
    CREATE TABLE IF NOT EXISTS employee01 (
        empno INT PRIMARY KEY,
        name VARCHAR(50),
        salary FLOAT
    )
""")

while True:
    print("-------MENU DRIVEN--------\n1) Insert Employee\n2) Display Specific Employee\n3) Display Employee by Salary Range\n4) Exit")
    choice = int(input("Enter the choice: "))
    if choice == 1:
        empno = int(input("Enter Emp No: "))
        cur.execute("SELECT * FROM employee01 WHERE empno=%s", (empno,))
        row = cur.fetchone()
        if row:
            print("Employee with this EmpNo already exists ")
        else:
            name = input("Enter the name: ")
            sal = float(input("Enter salary: "))
            cur.execute("INSERT INTO employee01 VALUES (%s,%s,%s)",(empno,name,sal))
            con.commit()
            print("Employee inserted...")
    elif choice == 2:
        empno = int(input("Enter Emp No: "))
        cur.execute("SELECT * FROM employee01 WHERE empno=%s", (empno,))
        row = cur.fetchone()
        if row:
            print("\nEmpNo\tName\tSalary")
            print(f"{row[0]}\t{row[1]}\t{row[2]}")
        else:
            print("Employee not found")

    elif choice == 3:
        low = float(input("Enter minimum salary: "))
        high = float(input("Enter maximum salary: "))
        
        cur.execute("SELECT * FROM employee01 WHERE salary BETWEEN %s AND %s", (low, high))
        rows = cur.fetchall()
        if rows:
            print("\nEmpNo\tName\tSalary")
            for row in rows:
                print(f"{row[0]}\t{row[1]}\t{row[2]}")
        else:
            print("No employees in this salary range")
    elif choice == 4:
        print("Exiting......")
        break
    else:
        print("Invalid  choice!")
con.close()
