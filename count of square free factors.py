import math
def isPirme(x):
    if x % 2 == 0  and x != 2:
        return False
    for j in range(3,int(math.sqrt(x)+1),2):
        if x % j == 0:
            return False
    return True

def count_of_squarefree_factors(n):
    count = 0
    for i in range(2,int(math.sqrt(n)+1)):
        if isPirme(i):
            if n % i == 0:
                count += 1
                if isPirme(n/i) and i != n:
                    count += 1
    return count
n = int(input("Enter a number : "))
count = count_of_squarefree_factors(n)
print("Number of square free factor : ",2**count -1) 

