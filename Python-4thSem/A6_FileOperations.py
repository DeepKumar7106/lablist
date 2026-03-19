# Write a program to create a text file and compute the number of characters, words and lines in a file

filename = input("Enter the name for the file: ")

with open(filename, "w") as file:
    print("Enter the text('END' to stop): ")
    while True:
        line = input()
        if line == "END":
            break
        file.write(line + "\n")

char_count = 0
line_count = 0
word_count = 0

with open(filename, "r") as file:
    for line in file:
        line_count += 1
        char_count += len(line.strip("\n"))
        word_count += len(line.split())

print(f"Word count: {word_count} \nLine count: {line_count} \nCharacter count: {char_count} \n")

#       OUTPUT
# Enter the name for the file: test.txt
# Enter the text('END' to stop):
# this file will
# have six words
# END
# Word count: 6
# Line count: 2
# Character count: 28
