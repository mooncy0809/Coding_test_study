for i in range(3):
    a, cnt, mcnt = [], 0, 0
    a[:] = list(input())

    for i in range(8):
        if a[i - 1] == a[i]:
            cnt += 1
            if mcnt < cnt:
                mcnt = cnt
        if a[i - 1] != a[i]:
            cnt = 1
    if mcnt == 0:
        print(1)
    else:
        print(mcnt)