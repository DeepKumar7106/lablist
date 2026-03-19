# Write a function that takes a sentence as input from the user and calculates the frequency of each

def count_letter(sentence):
    freq = {}
    for c in sentence:
        if c.isalpha():
            if c.lower() in freq:
                freq[c] += 1
            else:
                freq[c] = 1
    for item,value in freq.items():
        print(f"{item} : {value}")
user_input = input("Enter a sentence: ")
count_letter(user_input)

#       OUTPUT
# Enter a sentence: hello 123 and good morning
# h : 1
# e : 1
# l : 2
# o : 4
# a : 1
# n : 3
# d : 2
# g : 2
# m : 1
# r : 1
# i : 1