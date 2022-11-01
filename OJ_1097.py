card_a = list(map(int,input().split()))
card_b = list(map(int,input().split()))
winner = []
for i in range(len(card_a)):
    if card_a[i] > card_b[i]:
        winner.append('A')
    elif card_a[i] < card_b[i]:
        winner.append('B')
    else:
        winner.append('D')
if winner.count('A') > winner.count('B'):
    print('A')
elif winner.count('A') < winner.count('B'):
    print('B')
else:
    print('D')
