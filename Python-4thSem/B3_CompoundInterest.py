from tkinter import *

def calculate():
    try:
        p = float(principal_entry.get())
        r = float(interest_entry.get())
        t = float(years_entry.get())

        a = p * (1 + r/100) ** t

        compound_entry_value = a - p
        compound_entry.delete(0,END)
        compound_entry.insert(0,f"{compound_entry_value:.2f}")
    except:
        compound_entry.delete(0,END)
        compound_entry.insert(0,f"INVALID INPUT")

def clear_all():
    principal_entry.delete(0, END)
    interest_entry.delete(0, END)
    years_entry.delete(0, END)
    compound_entry.delete(0, END)

root = Tk()
root.title("Interest Calculator")
root.geometry("400x300")

##create a frame to build the gui 
f = Frame(root) ##, height=500, width=500)
##f.propagat(0)
f.pack()

fs = 10
font_color = "black"
bg_color = "#fffff0"

##4 labels and 4 entry elements
##first for principal amount
principal = Label(f, text="Principal Amount", width = 20, font = ('consolas', fs), fg = font_color, bg= bg_color)
principal_entry = Entry(f, width = 20, font = ('consolas', fs))

principal.grid(row=0, column=0, padx=10, pady=10)
principal_entry.grid(row=0, column=1, padx=10, pady=10)

##2nd for interest rate
interest = Label(f, text="Rate of interest (%)", width = 20, font = ('consolas', fs), fg = font_color, bg= bg_color)
interest_entry = Entry(f, width = 20, font = ('consolas', fs))

interest.grid(row=1, column=0)
interest_entry.grid(row=1, column=1)

##3rd for years
years = Label(f, text="Number of years", width = 20, font = ('consolas', fs), fg = font_color, bg= bg_color)
years_entry = Entry(f, width = 20, font = ('consolas', fs))

years.grid(row=2, column=0, padx=10, pady=10)
years_entry.grid(row=2, column=1, padx=10, pady=10)

##4th for output
compound = Label(f, text="Compound Interest", width = 20, font = ('consolas', fs), fg = font_color, bg= bg_color)
compound_entry = Entry(f, width = 20, font = ('consolas', fs))

compound.grid(row=3, column=0, padx=10, pady=10)
compound_entry.grid(row=3, column=1, padx=10, pady=10)

##two buttons sumbit and clear
submit = Button(f, text="Submit", width=20, height=2, bg = 'grey', fg = font_color, command = calculate)
clear = Button(f, text="Clear", width=20, height=2, bg = 'grey', fg = font_color, command = clear_all)

submit.grid(row=5, column=0, padx=10, pady=10)
clear.grid(row=5, column=1, padx=10, pady=10)
root.mainloop()


