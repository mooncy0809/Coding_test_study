n = list()
q = list()
for i in range(8):
    n.append(int(input()))
n2 = n.copy()
n2.sort(reverse=True)
print(sum(n2[0:5]))

for i in n2[0:5]:
    q.append(n.index(i)+1)
q.sort()
for i in q:
    print(i,end=' ')