from tkinter import *
def createBtn(ch, r, c):
    if ch == '=':
        btn = Button(root, text=ch, width=30, command= btnEqual)
        btn.grid(row=r,column=0,columnspan=4,pady=5)
    else:
        btn = Button(root, text=ch, width=5, command= lambda: btnClick(ch))
        btn.grid(row=r,column=c,pady=0, padx=2)

def btnClick(ch):
    if ch == 'C': txt.delete(0, END)
    else: txt.insert(END, ch)

def btnEqual():
    try:
        r = eval(txt.get())
        txt.delete(0, END)
        txt.insert(0, r)
    except:
        txt.delete(0, END)
        txt.insert(0, "Error")
        
        
root = Tk()
root.title("Simple Calculator")
##root.geometry("400x300")

txt = Entry(root, width=10, font=('Arial', 20), justify="right")
txt.grid(row=0,column=0, columnspan=4, padx=10, pady=10)

lst = ['7','8','9','/','4','5','6','*','1','2','3','-','0','.','+','C','=']

r,c = 1, 0

for ch in lst:
    createBtn(ch, r, c)
    c += 1
    if (c > 3):
        c = 0
        r += 1

root.mainloop()
    
