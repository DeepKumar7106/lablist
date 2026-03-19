# Program, using user-defined functions to find the area of rectangle, square, circle and triangle by
# accepting suitable input parameters from user.

def rect(l,b): return  l * b
def circle(r): return  3.14 * r * r
def square(a): return  a**2
def triangle(b,h): return  b * h * 0.5

while True:
    choice = int(input("\n\n 1) Rectangle\n 2) Circle\n 3) Square\n 4) Triangle\n 5) Exit\n Enter your choice "))
    if choice == 1:
        l = float(input("Enter values for Rectangle\nLength: "))
        b = float(input("Breadth: "))
        print(f"Area of Rectangle = {rect(l,b)}")
    elif choice == 2:
        r = float(input("Enter values for Circle\n Radius: "))
        print(f"Area of Circle = {circle(r)}")
    elif choice == 3:
        l = float(input("Enter values for Square \nLength: "))
        print(f"Area of Square = {square(l)}")
    elif choice == 4:
        b = float(input("Enter values for Triangle\nBase: "))
        h = float(input("Height: "))
        print(f"Area of Triangle = {triangle(b,h)}")
    elif choice == 5:
        print("Exiting.......       ")
        break
    else:
        print("Invalid choice")

#       OUTPUT
#  1) Rectangle
#  2) Circle
#  3) Square
#  4) Triangle
#  5) Exit
#  Enter your choice 1
# Enter values for Rectangle
# Length: 10
# Breadth: 20
# Area of Rectangle = 200.0
#
#
#  1) Rectangle
#  2) Circle
#  3) Square
#  4) Triangle
#  5) Exit
#  Enter your choice 2
# Enter values for Circle
#  Radius: 10
# Area of Circle = 314.0
#
#
#  1) Rectangle
#  2) Circle
#  3) Square
#  4) Triangle
#  5) Exit
#  Enter your choice 3
# Enter values for Square
# Length: 10
# Area of Square = 100.0
#
#
#  1) Rectangle
#  2) Circle
#  3) Square
#  4) Triangle
#  5) Exit
#  Enter your choice 4
# Enter values for Triangle
# Base: 10
# 0Height: 20
# Area of Triangle = 100.0
#
#
#  1) Rectangle
#  2) Circle
#  3) Square
#  4) Triangle
#  5) Exit
#  Enter your choice 5
# Exiting.......   