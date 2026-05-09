import pandas as np

data1 = {
    'RollNo':[101,102,103],
    'Name':['Asha','Ravi','Kiran'],
    'TotalMarks':[85,90,78]
    }

data2 = {
    'RollNo':[104,105],
    'Name':['Neha','Arun'],
    'TotalMarks':[88,76]
    }

df1 = np.DataFrame(data1)
df2 = np.DataFrame(data2)

print("Given Sample Data")
print("_"*40)
print(df1)
print("_"*40)
print(df2)
print("_"*40)

result = np.concat([df1,df2],ignore_index=True)
print(f"\nCombined DataFrame\n {result} ")
