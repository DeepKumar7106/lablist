# Write a function nearly equal to test whether two strings are nearly equal. two strings a and b are
# nearly equal if one character change in b results in string a.

def nearly_equal(a,b):
    count = 0
    if a == b:
        return "String are equal"
    if len(a) != len(b):
        return "Strings are not equal"
    for c1,c2 in zip(a,b):
        if c1 != c2:
            count +=1
            if count > 1:
                return "String are not nearly equal"
    return "Strings are nearly equal"

str1 = input("Enter the first string: ")
str2 = input("Enter the second string: ")
result = nearly_equal(str1,str2)
print(result)

#           OUTPUT
# Enter the first string: play
# Enter the second string: play
# String are equal

# Enter the first string: Money
# Enter the second string: More
# Strings are not equal

# Enter the first string: here
# Enter the second string: fear
# String are not nearly equal

# Enter the first string: sell
# Enter the second string: bell
# Strings are nearly equal