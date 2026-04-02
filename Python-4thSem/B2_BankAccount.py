# Write a program menu driven to create a BankAccount class. class should support the following
# methods for
# i) Deposit
# ii) Withdraw
# iii) GetBalanace  .
# Create a  subclass  SavingsAccount class that behaves just like a BankAccount, but also has an
# interest rate and a method that increases the balance by the appropriate amount of interest.

class BankAccount:
    def __init__(self):
        self.balance = 0.0
    def deposit(self, amount):
        self.balance += amount
        print(f" {amount} deposited successfully!! ")
    def withdraw(self, amount):
        if amount >= self.balance:
            print("Insufficient Balance....")
        else:
            self.balance -= amount
            print(f"{amount} withdrawn.....")
    def get_balance(self):
        print(f"Current Balance: {self.balance}")

class SavingsAccount(BankAccount):
    def __init__(self):
        super().__init__()
    def add_interest(self,rate):
        interest = (self.balance * rate) / 100
        self.balance += interest
        print(f"Interest {interest} added successfully....")

acc = SavingsAccount()
while True:
    print("BANK MENU".center(20, "-") + "\n1)Deposit\n2)Withdraw\n3)Get Balance\n4)Add Interest\n5)Exit")
    ch = int(input("Enter the choice: "))
    if ch == 1:
        acc.deposit(float(input("Enter the amount to deposit: ")))
    elif ch == 2:
        acc.withdraw(float(input("Enter the amount to withdraw: ")))
    elif ch == 3:
        acc.get_balance()
    elif ch == 4:
        acc.add_interest(float(input("Enter the new interest rate: ")))
    elif ch == 5:
        print("Exiting.....")
        break
    else:
        print("Invalid choice...")

#           OUTPUT
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 1
# Enter the amount to deposit: 1000
#  1000.0 deposited successfully!!
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 2
# Enter the amount to withdraw: 2000
# Insufficient Balance....
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 2
# Enter the amount to withdraw: 200
# 200.0 withdrawn.....
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 3
# Current Balance: 800.0
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 4
# Enter the new interest rate: 5
# Interest 40.0 added successfully....
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 6
# Invalid choice...
# -----BANK MENU------
# 1)Deposit
# 2)Withdraw
# 3)Get Balance
# 4)Add Interest
# 5)Exit
# Enter the choice: 5
# Exiting.....