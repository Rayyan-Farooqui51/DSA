def count(s,d,oc):
    for i in s:
        if i not in d:
            d[i] = 1
        else:
            d[i] += 1
    for i in d:
        if d[i] % 2 != 0:
            oc += 1
    return oc
def check(s,d,oc):
    oc = count(s,d,oc)
    if oc > 1:
        return False
    return True

d={}
s=input("Enter a letter : ")

if check(s,d,0):
    print("YES")
else:
    print("NO")
