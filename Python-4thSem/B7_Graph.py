import matplotlib.pyplot as plt
import pandas as pd
import numpy as np

df = pd.read_csv("B7.csv")

batsmen = df["Batsman "]
runs17 = df["2017"]
runs18 = df["2018"]
runs19 = df["2019"]
runs20 = df["2020"]

x = np.arange(len(batsmen))
width = 0.2

plt.bar(x - 1.5 * width, runs17, width, label="2017")
plt.bar(x - 0.5 * width, runs18, width, label="2018")
plt.bar(x + 0.5 * width, runs19, width, label="2019")
plt.bar(x + 1.5 * width, runs20, width, label="2020")

plt.xlabel("Batsmen")
plt.ylabel("Runs scored")
plt.title("Runs scored by Batsmen (2017 - 2020)")
plt.xticks(x, batsmen, rotation = 450)
plt.legend()
plt.show()
