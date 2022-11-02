import statistics
from scipy import stats

n=input()
list=list(map(int,input().split(" ")))

print(round(statistics.mean(list),1))
print(round(statistics.median(list),1))
print(str(stats.mode(list)[0]).strip('[').strip(']'))
