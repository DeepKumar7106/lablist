# Consider a tuple t1= (1,2,5,7,9,2,4,6,8,10). Write a program to perform following operations:
# a) Print half the values of tuple in one line and the other half in the next line.
# b) Print another tuple whose values are even numbers in the given tuple.
# c) Concatenate a tuple t2= (11,13,15) with t1.
# d) Return maximum and minimum value from this tuple.

t1 =  (1,2,5,7,9,2,4,6,8,10)
print(f"Tuple: {t1}")

mid = len(t1) // 2
print(f"First half: {t1[:mid]} \nSecond half: {t1[mid:]}")

even = ()
for i in t1:
    if i%2 == 0:
        even += (i,)
print(f"Even tuple: {even}")

t2 = (11,13,15)
t3 = t1 + t2
print(f"Concatenated Tuple: {t3}")

print(f"Maximum: {max(t3)}\nMinimum: {min(t3)}")

#       OUTPUT
# Tuple: (1, 2, 5, 7, 9, 2, 4, 6, 8, 10)
# First half: (1, 2, 5, 7, 9)
# Second half: (2, 4, 6, 8, 10)
# Even tuple: (2, 2, 4, 6, 8, 10)
# Concatenated Tuple: (1, 2, 5, 7, 9, 2, 4, 6, 8, 10, 11, 13, 15)
# Maximum: 15
# Minimum: 1