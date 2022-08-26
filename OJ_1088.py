s = ['D', 'E', 'F', 'G' ,'H' ,'I' ,'J', 'K' ,'L' ,'M', 'N' ,'O' ,'P', 'Q', 'R' ,'S', 'T', 'U' ,'V', 'W' ,'X' ,'Y' ,'Z' ,'A', 'B', 'C']
pws = ['A' ,'B' ,'C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N' ,'O' ,'P' ,'Q' ,'R' ,'S', 'T' ,'U' ,'V', 'W', 'X' ,'Y' ,'Z']
result=[]
str = list(input())
for i in str:
    if i in s:
        index = s.index(i)
        result.append(pws[index])
for str in result:
    print(str,end='')