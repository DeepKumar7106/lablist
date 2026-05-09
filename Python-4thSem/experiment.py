# from tkinter import *
#
# def create_button(char, row, col):
#     if char == '=':
#         btn = Button(root, width=15, text = char, command = btn_equal)
#         btn.grid(row = row, column = col, columnspan = 4, pady = 5)
#     else:
#         btn = Button(root, width=5, text = char, command = lambda : btn_click(char))
#         btn.grid(row = row, column = col, pady = 5)
#
#
# def btn_click(chr):
#     if chr == 'C':
#         txt.delete(0, END)
#     else:
#         txt.insert(END, chr)
#
#
# def btn_equal():
#     try:
#         res = eval(txt.get())
#         txt.delete(0,END)
#         txt.insert(END, res)
#     except:
#         txt.delete(0,END)
#         txt.insert(END, "Error")
#
#
# root = Tk()
# root.title("Simple Calculator")
# root.geometry("350x300")
#
# txt = Entry(root, width = 20, font =("Arial", 20), justify = "right")
# txt.grid(row = 0, column = 0, columnspan = 4,padx = 10, pady = 5)
#
# r,c = 1, 0
# for ch in ['7','8','9','/','4','5','6','*','1','2','3','-','0','.','+','C','=']:
#     create_button(ch, r, c)
#     c += 1
#     if c > 3: c, r = 0, r + 1
#
# root.mainloop()

# freq = {}
# for c in input().replace(" ", "").lower(): freq[c] = 1 if not c in freq else freq[c] + 1
# for i,v in freq.items(): print(f"{i}:{v}")


s = input().replace(" ", "").lower()
for i, v in {c: s.count(c) for c in s}.items(): print(f"{i}:{v}")