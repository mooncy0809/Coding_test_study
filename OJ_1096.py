li = []
for i in range(5):
    li.append(list(input()))
# print(li)
result = []
for i in range(15):
    for j in li:
        try:
            result.append(j[i])
        except:
            pass

print(*result,sep='')