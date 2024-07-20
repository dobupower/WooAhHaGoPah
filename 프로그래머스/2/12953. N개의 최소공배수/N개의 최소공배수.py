def solution(arr):
    if len(arr) == 1:
        return arr[0]
    
    def gcd(a, b):
        A, B = a, b
        if b > a:
            a, b = b, a
        while b > 0:
            a, b = b, a % b
        return A * B // a
    
    answer = arr[0]
    for i in range(1, len(arr)):
        answer = gcd(answer, arr[i])
    
    return answer