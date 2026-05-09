
import mysql.connector

con = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    charset="utf8"
)

cur = con.cursor()

cur.execute("CREATE DATABASE IF NOT EXISTS studentdbNew")
cur.execute("USE studentdbNew")
cur.execute("""
    CREATE TABLE IF NOT EXISTS student (
        regno INT PRIMARY KEY,
        name VARCHAR(50),
        m1 INT,
        m2 INT,
        m3 INT
    )
""")
##
while True:
    print("-------MENU DRIVEN--------\n1) Insert student\n2) Display all student\n3) Delete a student\n4) Exit")
    choice = int(input("Enter the choice: "))
    if choice == 1:
        regno = int(input("Enter regno: "))
        cur.execute("SELECT * FROM student WHERE regno=%s", (regno,))
        row = cur.fetchone()
        if row:
            print("Student with this regno already exists ")
        else:
            name = input("Enter the name: ")
            m1 = int(input("Enter marks 1: "))
            m2 = int(input("Enter marks 2: "))
            m3 = int(input("Enter marks 3: "))
            cur.execute("INSERT INTO student VALUES (%s,%s,%s,%s,%s)",(regno,name,m1,m2,m3))
            con.commit()
            print("Record insert....")
    elif choice == 2:
        cur.execute("SELECT * FROM student")
        rows = cur.fetchall()
        print("Regno\tName\tM1\tM2\tM3")
        if rows :
            for row in rows:
                print(row[0],"\t",row[1],"\t",row[2],"\t",row[3],"\t",row[4])
        else:
            print("No record found!")
    elif choice == 3:
        regno = input("Enter the regno to delete: ")
        cur.execute("SELECT * FROM student WHERE regno = %s", (regno,))
        row = cur.fetchone()
        if row:
            cur.execute("DELETE FROM student WHERE regno=%s", (regno,))
##            con.commit()
            print("Record Deleted successfully")
        else:
            print("Student does not exist")
    elif choice == 4:
        print("Exiting......")
        break
    else:
        print("Invalid  choice!")
con.close()
