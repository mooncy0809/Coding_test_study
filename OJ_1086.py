n1 = int(input())
l1 = list(map(int,input().split()))
n2 = int(input())
l2 = []
result = []
for i in range(n2):
    li = list(map(int,input().split()))
    l2.append(li)

for li in l2:
    if li[0] == 1:
        result.append(min(l1[li[1]-1:li[2]]))
    elif li[0] == 2:
        result.append(max(l1[li[1]-1:li[2]]))
    elif li[0] == 3:
        result.append(sum(l1[li[1]-1:li[2]]))

print(*result, sep='\n')