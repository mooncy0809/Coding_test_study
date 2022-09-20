num_li=[]
for i in range(3):
    num_li.append(input())

for n in range(len(num_li)):
    cnt,mcnt = 0,0
    a = list(num_li[n])

    for i in range(1,9):
        if a[i-1] == a[i]:
            cnt += 1
            if mcnt < cnt:
                mcnt = cnt
        if a[i-1] != a[i]:
            cnt = 1
    if mcnt == 0:
        print(1)
    else:
        print(mcnt)