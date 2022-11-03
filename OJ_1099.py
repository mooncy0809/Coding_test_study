card = list(range(1,21))
for i in range(10):
    a,b = map(int, input().split())
    temp = card[a-1:b]
    temp.reverse()
    del card[a-1:b]
    for i,n in enumerate(temp):
        card.insert(a-1+i,n)
print(*card[:10])
print(*card[10:])
