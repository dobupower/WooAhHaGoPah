a, b = map(int, input().strip().split())

for col in range(b):
    for row in range(a):
        print("*", end="")
    print()