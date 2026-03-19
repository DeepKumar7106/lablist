# Write a program create list with N elements.  find all unique elements in the list. If an element is
# found only once in the list, then add that element to the unique list.

n = int(input("Enter the size of list: "))
num = []
for i in range(n):
    num.append(int(input(f"Enter the element for {i+1} : ")))
unique = []
for i in num:
    if num.count(i) == 1:
        unique.append(i)
print(f"Original list: {num}")
if len(unique) != 0:
    print(f"Unique list: {unique}")
else:
    print(f"Unique list is empty!")

#       OUTPUT
# Enter the size of list: 5
# Enter the element for 1 : 1
# Enter the element for 2 : 2
# Enter the element for 3 : 3
# Enter the element for 4 : 3
# Enter the element for 5 : 4
# Original list: [1, 2, 3, 3, 4]
# Unique list: [1, 2, 4]