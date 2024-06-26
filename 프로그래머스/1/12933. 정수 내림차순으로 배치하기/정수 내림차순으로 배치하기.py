def solution(n):
    num = []
    answer = 0
    while n > 0: # 배열에 한자리씩 추가
        num.append(n % 10)
        n //= 10
        
    for i in range(1, len(num)):  # 삽입정렬로 내림차순 정렬
        j = i
        while j > 0 and num[j - 1] < num[j]:
            num[j - 1], num[j] = num[j], num[j - 1]
            j -= 1
    
    k = 1   # 정렬된 배열을 answer에 각 자리수에 맞게 할당
    for i in range(len(num)-1, -1, -1):
        answer += num[i] * k
        k *= 10
    return answer