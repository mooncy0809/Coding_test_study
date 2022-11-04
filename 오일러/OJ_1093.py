a,b = map(int, input().split())
ma = []
mb = []
v = []
for n in range(1,a+1):
    if a%n == 0:
        ma.append(n)

for n in range(1,b+1):
    if b%n == 0:
        mb.append(n)

for i in ma:
    if i in mb:
        v.append(i)
print(max(v))
print(int(a*b/max(v)))